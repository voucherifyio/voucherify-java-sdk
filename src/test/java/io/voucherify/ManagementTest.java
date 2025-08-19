package io.voucherify;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import io.voucherify.data.VoucherifyStore;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;
import io.voucherify.client.ApiClient;
import io.voucherify.client.api.ManagementApi;
import io.voucherify.client.model.*;
import io.voucherify.client.model.ManagementProjectsMetadataSchemaDefinition.TypeEnum;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

@org.junit.jupiter.api.Order(14)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ManagementTest {
    public static ApiClient defaultClient = null;
    public static ManagementApi managementApi = null;
    public static String projectId = null;
    public static String clusterId = null;
    private static final Properties properties = new Properties();
    private static InputStream input = null;

    @BeforeAll
    public static void beforeAll() {
        try {
            // Load properties from .env file if it exists
            try {
                String dir = System.getProperty("user.dir");
                input = Files.newInputStream(Paths.get(dir + "/.env"));
                properties.load(input);
            } catch (IOException ex) {
                System.out.println("[INFO] No .env file found, using environment variables");
                ex.printStackTrace();
            } finally {
                if (input != null) {
                    try {
                        input.close();
                    } catch (IOException e) {
                        System.err.println("[WARN] Failed to close .env file: " + e.getMessage());
                    }
                }
            }

            defaultClient = Utils.getClient();
            managementApi = new ManagementApi(defaultClient);

            // Get VOUCHERIFY_HOST from environment variables or .env file
            String voucherifyHost = System.getenv("VOUCHERIFY_HOST");
            if (voucherifyHost == null || voucherifyHost.isEmpty()) {
                voucherifyHost = properties.getProperty("VOUCHERIFY_HOST");
            }

            if (voucherifyHost != null && !voucherifyHost.isEmpty()) {
                // Extract cluster ID from host (e.g., https://dev2.api.voucherify.io -> dev2)
                String[] parts = voucherifyHost.split("//");
                if (parts.length > 1) {
                    clusterId = parts[1].split("\\.")[0];
                }
            }

            // Default to 'eu1' if clusterId couldn't be determined or is too short
            if (clusterId == null || clusterId.equals("API") || clusterId.length() > 4) {
                clusterId = "eu1";
            }

            System.out.println("[INFO] Using cluster ID: " + clusterId);
        } catch (Exception e) {
            System.err.println("[ERROR] Failed to initialize test environment: " + e.getMessage());
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize test environment", e);
        }
    }

    @Test
    @Order(1)
    public void createProjectTest() {
        System.out.println("[TEST] Starting createProjectTest");
        ManagementProjectsCreateRequestBody managementProject = new ManagementProjectsCreateRequestBody();
        managementProject.setCaseSensitiveCodes(false);
        managementProject.setName(Utils.getAlphaNumericString(10));
        managementProject.setTimezone("Europe/Warsaw");
        managementProject.setCurrency("EUR");
        System.out.println("[INFO] clusterId: " + clusterId);
        managementProject.setClusterId(clusterId);

        try {
            ManagementProjectsCreateResponseBody responseBody = managementApi.createProject(managementProject);

            System.out.println("[DEBUG] Project creation response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertNotNull(responseBody.getId(), "Project ID should not be null");
            System.out.println("[INFO] Successfully created project with ID: " + responseBody.getId());
            VoucherifyStore.getInstance().getManagement().setProjectId(responseBody.getId());
            projectId = responseBody.getId();
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(2)
    public void listProjectsTest() {
        try {
            ManagementProjectsListResponseBody responseBody = managementApi.listProjects();

            System.out.println("[DEBUG] Project list response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertNotNull(responseBody.getData(), "Project data should not be null");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(3)
    public void getProjectTest() {
        System.out.println("[TEST] Starting getProjectTest for project ID: " + projectId);
        try {
            ManagementProjectsGetResponseBody responseBody = managementApi.getProject(projectId);

            System.out.println("[DEBUG] Get project response: " + responseBody);
            assertNotNull(responseBody, "Project details should not be null");
            System.out.println("[INFO] Successfully retrieved project details");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(4)
    public void updateProjectTest() {
        System.out.println("[TEST] Starting updateProjectTest for project ID: " + projectId);
        ManagementProjectsUpdateRequestBody updatedProject = new ManagementProjectsUpdateRequestBody();
        updatedProject.setDialCode("+48");
        try {
            ManagementProjectsUpdateResponseBody responseBody = managementApi.updateProject(projectId, updatedProject);

            System.out.println("[DEBUG] Update project response: " + responseBody);

            assertNotNull(responseBody, "Project details should not be null");
            System.out.println("[INFO] Successfully retrieved project details");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(5)
    public void listUsersTest() {
        System.out.println("[TEST] Starting listUsersTest for project ID: " + projectId);
        try {
            ManagementProjectsUsersListResponseBody responseBody = managementApi.listUsers(projectId);

            List<User> data = responseBody.getData();
            if (data != null && !data.isEmpty()) {
                VoucherifyStore.getInstance().getManagement().setProjectUserId(data.get(0).getId());
            }
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(6)
    public void getUserTest() {
        String userId = VoucherifyStore.getInstance().getManagement().getProjectUserId();
        System.out.println("[TEST] Starting getUserTest for user ID: " + userId);
        try {
            if (userId != null) {
                ManagementProjectsUsersGetUserResponseBody responseBody = managementApi.getUser(projectId, userId);
                System.out.println("[DEBUG] Get user response: " + responseBody);
                assertNotNull(responseBody, "User details should not be null");
                System.out.println("[INFO] Successfully retrieved user details");
            }
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(7)
    public void createMetadataSchemaTest() {
        System.out.println("[TEST] Starting createMetadataSchemaTest for project ID: " + projectId);
        System.out.println("[DEBUG] Creating metadata schema with test properties");
        ManagementProjectsMetadataSchemasCreateRequestBody createdMetadataSchema = new ManagementProjectsMetadataSchemasCreateRequestBody();
        ManagementProjectsMetadataSchemaDefinition schemaDefinition = new ManagementProjectsMetadataSchemaDefinition();
        schemaDefinition.setType(TypeEnum.STRING);
        schemaDefinition.setOptional(true);
        schemaDefinition.setArray(true);
        Map<String, ManagementProjectsMetadataSchemaDefinition> properties = new HashMap<>();
        properties.put("test", schemaDefinition);

        createdMetadataSchema.setRelatedObject("related_object");
        createdMetadataSchema.setProperties(properties);

        try {
            ManagementProjectsMetadataSchemasCreateResponseBody responseBody = managementApi
                    .createMetadataSchema(projectId, createdMetadataSchema);

            System.out.println("[DEBUG] Create metadata schema response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals("metadata_schema", responseBody.getObject(), "Object type should be 'metadata_schema'");
            System.out.println("[INFO] Successfully created metadata schema with ID: " + responseBody.getId());
            VoucherifyStore.getInstance().getManagement().setMetadataSchemaId(responseBody.getId());
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(8)
    public void listMetadataSchemasTest() {
        try {
            ManagementProjectsMetadataSchemasListResponseBody responseBody = managementApi
                    .listMetadataSchemas1(projectId);

            System.out.println("[DEBUG] List metadata schemas response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals(ManagementProjectsMetadataSchemasListResponseBody.ObjectEnum.LIST, responseBody.getObject(),
                    "Object type should be 'list'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(9)
    public void getMetadataSchemaTest() {
        String metadataSchemaId = VoucherifyStore.getInstance().getManagement().getMetadataSchemaId();
        try {
            ManagementProjectsMetadataSchemasGetResponseBody responseBody = managementApi.getMetadataSchema1(projectId,
                    metadataSchemaId);

            System.out.println("[DEBUG] Get metadata schema response: " + responseBody);
            assertNotNull(responseBody, "Metadata schema details should not be null");
            assertEquals("metadata_schema", responseBody.getObject(), "Object type should be 'metadata_schema'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(10)
    public void updateMetadataSchemaTest() {
        String metadataSchemaId = VoucherifyStore.getInstance().getManagement().getMetadataSchemaId();
        ManagementProjectsMetadataSchemasUpdateRequestBody updatedMetadataSchema = new ManagementProjectsMetadataSchemasUpdateRequestBody();
        ManagementProjectsMetadataSchemaDefinition schemaDefinition = new ManagementProjectsMetadataSchemaDefinition();
        schemaDefinition.setOptional(false);
        schemaDefinition.setType(TypeEnum.STRING);
        schemaDefinition.setArray(true);
        Map<String, ManagementProjectsMetadataSchemaDefinition> properties = new HashMap<>();
        properties.put("test", schemaDefinition);

        updatedMetadataSchema.setProperties(properties);

        try {
            ManagementProjectsMetadataSchemasUpdateResponseBody responseBody = managementApi
                    .updateMetadataSchema(projectId, metadataSchemaId, updatedMetadataSchema);

            System.out.println("[DEBUG] Update metadata schema response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals("metadata_schema", responseBody.getObject(), "Object type should be 'metadata_schema'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(11)
    public void createCustomEventSchemaTest() {
        ManagementProjectsCustomEventSchemasCreateRequestBody eventSchema = new ManagementProjectsCustomEventSchemasCreateRequestBody();
        ManagementProjectsCustomEventSchemasCreateRequestBodySchema schema = new ManagementProjectsCustomEventSchemasCreateRequestBodySchema();
        ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry properties = new ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry();
        Map<String, ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry> propertiesMap = new HashMap<>();

        properties.setType(
                io.voucherify.client.model.ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry.TypeEnum.NUMBER);
        properties.setOptional(true);
        propertiesMap.put("propertyName", properties);
        schema.setProperties(propertiesMap);
        eventSchema.setSchema(schema);
        eventSchema.setName("schema-test");
        try {
            ManagementProjectsCustomEventSchemasCreateResponseBody responseBody = managementApi
                    .createCustomEventSchema(projectId, eventSchema);

            System.out.println("[DEBUG] Create custom event schema response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals(ManagementProjectsCustomEventSchemasCreateResponseBody.ObjectEnum.CUSTOM_EVENT_SCHEMA,
                    responseBody.getObject(), "Object type should be 'custom_event_schema'");
            System.out.println("[INFO] Successfully created custom event schema with ID: " + responseBody.getId());
            VoucherifyStore.getInstance().getManagement().setCustomEventSchemaId(responseBody.getId());
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(12)
    public void listCustomEventSchemasTest() {
        try {
            ManagementProjectsCustomEventSchemasListResponseBody responseBody = managementApi
                    .listCustomEventSchemas(projectId);

            System.out.println("[DEBUG] List custom event schemas response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals(ManagementProjectsCustomEventSchemasListResponseBody.ObjectEnum.LIST,
                    responseBody.getObject(), "Object type should be 'list'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(13)
    public void getCustomEventSchemaTest() {
        String customSchemaId = VoucherifyStore.getInstance().getManagement().getCustomEventSchemaId();
        try {
            ManagementProjectsCustomEventSchemasGetResponseBody responseBody = managementApi
                    .getCustomEventSchema(projectId, customSchemaId);

            System.out.println("[DEBUG] Get custom event schema response: " + responseBody);
            assertNotNull(responseBody, "Custom event schema details should not be null");
            assertEquals(ManagementProjectsCustomEventSchemasGetResponseBody.ObjectEnum.CUSTOM_EVENT_SCHEMA,
                    responseBody.getObject(), "Object type should be 'custom_event_schema'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(14)
    public void updateCustomEventSchemaTest() {
        String customSchemaId = VoucherifyStore.getInstance().getManagement().getCustomEventSchemaId();
        ManagementProjectsCustomEventSchemasUpdateRequestBody eventSchema = new ManagementProjectsCustomEventSchemasUpdateRequestBody();
        ManagementProjectsCustomEventSchemasUpdateRequestBodySchema schema = new ManagementProjectsCustomEventSchemasUpdateRequestBodySchema();
        ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry properties = new ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry();
        Map<String, ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry> propertiesMap = new HashMap<>();

        properties.setType(
                io.voucherify.client.model.ManagementProjectsCustomEventSchemasCreateRequestBodySchemaPropertiesEntry.TypeEnum.NUMBER);
        properties.setOptional(false);
        propertiesMap.put("propertyName", properties);
        schema.setProperties(propertiesMap);
        eventSchema.setSchema(schema);

        try {
            ManagementProjectsCustomEventSchemasUpdateResponseBody responseBody = managementApi
                    .updateCustomEventSchema(projectId, customSchemaId, eventSchema);

            System.out.println("[DEBUG] Update custom event schema response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals(ManagementProjectsCustomEventSchemasUpdateResponseBody.ObjectEnum.CUSTOM_EVENT_SCHEMA,
                    responseBody.getObject(), "Object type should be 'custom_event_schema'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(15)
    public void createBrandTest() {
        ManagementProjectsBrandingCreateRequestBody createdBrandingRequestBody = new ManagementProjectsBrandingCreateRequestBody();
        ManagementProjectsBrandingCreateRequestBodyBrand brand = new ManagementProjectsBrandingCreateRequestBodyBrand();
        ManagementProjectsBrandingCreateRequestBodyAddress address = new ManagementProjectsBrandingCreateRequestBodyAddress();
        ManagementProjectsBrandingCreateRequestBodyContact contact = new ManagementProjectsBrandingCreateRequestBodyContact();

        brand.setName("Test Brand");
        address.setStreet("TestStreet");
        address.setCity("Katowice");
        address.setPostal("42-246");
        address.setCountry("Poland");
        contact.setEmail("test-email@test.pl");

        createdBrandingRequestBody.setBrand(brand);
        createdBrandingRequestBody.setAddress(address);
        createdBrandingRequestBody.setContact(contact);

        try {
            ManagementProjectsBrandingCreateResponseBody responseBody = managementApi.createBrand(projectId,
                    createdBrandingRequestBody);

            System.out.println("[DEBUG] Create brand response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            System.out.println("[INFO] Successfully created brand with ID: " + responseBody.getId());
            VoucherifyStore.getInstance().getManagement().setBrandId(responseBody.getId());
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }

    }

    @Test
    @Order(16)
    public void getBrandTest() {
        String brandId = VoucherifyStore.getInstance().getManagement().getbrandId();
        try {
            ManagementProjectsBrandingGetResponseBody responseBody = managementApi.getBrand(projectId, brandId);
            System.out.println("[DEBUG] Get brand response: " + responseBody);
            assertNotNull(responseBody, "Brand details should not be null");
            System.out.println("[INFO] Successfully retrieved brand details");
            VoucherifyStore.getInstance().getManagement().setBrandId(responseBody.getId());
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }

    @Test
    @Order(17)
    public void updateBrandTest() {
        String brandId = VoucherifyStore.getInstance().getManagement().getbrandId();
        ManagementProjectsBrandingUpdateRequestBody updatedBrandingRequestBody = new ManagementProjectsBrandingUpdateRequestBody();
        ManagementProjectsBrandingUpdateRequestBodyBrand brand = new ManagementProjectsBrandingUpdateRequestBodyBrand();
        ManagementProjectsBrandingUpdateRequestBodyAddress address = new ManagementProjectsBrandingUpdateRequestBodyAddress();
        ManagementProjectsBrandingUpdateRequestBodyContact contact = new ManagementProjectsBrandingUpdateRequestBodyContact();

        brand.setName("Test Brand2");
        address.setStreet("TestStreet");
        address.setCity("Paris");
        address.setPostal("42-246");
        address.setCountry("France");
        contact.setEmail("test-email2@test.pl");

        updatedBrandingRequestBody.setBrand(brand);
        updatedBrandingRequestBody.setAddress(address);
        updatedBrandingRequestBody.setContact(contact);

        try {
            ManagementProjectsBrandingUpdateResponseBody responseBody = managementApi.updateBrand(projectId, brandId,
                    updatedBrandingRequestBody);

            System.out.println("[DEBUG] Update brand response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            System.out.println("[INFO] Successfully updated brand with ID: " + responseBody.getId());
            VoucherifyStore.getInstance().getManagement().setBrandId(responseBody.getId());
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }

    }

    @Test
    @Order(18)
    public void listCampaignTemplates() {
        try {
            ManagementProjectsTemplatesCampaignsListResponseBody responseBody = managementApi
                    .managementListCampaignTemplates(projectId, null, projectId, null, null, null);

            System.out.println("[DEBUG] List campaign templates response: " + responseBody);
            assertNotNull(responseBody, "Response body should not be null");
            assertEquals(ManagementProjectsTemplatesCampaignsListResponseBody.ObjectEnum.LIST,
                    responseBody.getObject(), "Object type should be 'list'");
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }

    }

    @Test
    @Order(19)
    public void deleteMetadataSchemaTest() {
        String metadataSchemaId = VoucherifyStore.getInstance().getManagement().getMetadataSchemaId();

        try {
            managementApi.deleteMetadataSchema(projectId, metadataSchemaId);
            System.out.println("[INFO] Successfully deleted metadata schema with ID: " + metadataSchemaId);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }

    }

    @Test
    @Order(20)
    public void deleteCustomEventSchemaTest() {
        String customEventSchemaId = VoucherifyStore.getInstance().getManagement().getCustomEventSchemaId();

        try {
            managementApi.deleteCustomEventSchema(projectId, customEventSchemaId);
            System.out.println("[INFO] Successfully deleted custom event schema with ID: " + customEventSchemaId);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }

    }

    @Test
    @Order(21)
    public void deleteBrand() {
        String brandId = VoucherifyStore.getInstance().getManagement().getbrandId();

        try {
            managementApi.deleteBrand(projectId, brandId);
            System.out.println("[INFO] Successfully deleted brand with ID: " + brandId);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }

    }

    @Test
    @Order(22)
    public void deleteProject() {
        try {
            managementApi.deleteProject(projectId);
            System.out.println("[INFO] Successfully deleted project with ID: " + projectId);
        } catch (Exception e) {
            System.err.println("[ERROR] " + e.getMessage());
            fail();
        }
    }
}
