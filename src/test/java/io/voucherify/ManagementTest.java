package io.voucherify;

import io.voucherify.data.VoucherifyStore;
import io.voucherify.helpers.JsonHelper;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

import io.voucherify.client.ApiClient;
import io.voucherify.client.api.ManagementApi;
import io.voucherify.client.model.*;
import io.voucherify.client.model.ManagementProjectsCustomEventSchemasCreateResponseBody.ObjectEnum;
import io.voucherify.client.model.ManagementProjectsMetadataSchemaDefinition.TypeEnum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@org.junit.jupiter.api.Order(14)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ManagementTest {
    public static ApiClient defaultClient = null;
    public static ManagementApi managementApi = null;
    public static String projectId = null;

    @BeforeAll
    public static void beforeAll() {
        defaultClient = Utils.getClient();
        managementApi = new ManagementApi(defaultClient);
    }

    @Test
    @Order(1)
    public void createProjectTest() {
        ManagementProjectsCreateRequestBody managementProject = new ManagementProjectsCreateRequestBody();
        managementProject.setCaseSensitiveCodes(false);
        managementProject.setName(Utils.getAlphaNumericString(10));
        managementProject.setTimezone("Europe/Warsaw");
        managementProject.setCurrency("EUR");

        try {
            ManagementProjectsCreateResponseBody responseBody = managementApi.createProject(managementProject);

            assertNotNull(responseBody);
            assertNotNull(responseBody.getId());

            VoucherifyStore.getInstance().getManagement().setProjectId(responseBody.getId());
            projectId = responseBody.getId();
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(2)
    public void listProjectsTest() {
        try {
            ManagementProjectsListResponseBody responseBody = managementApi.listProjects();

            assertNotNull(responseBody);
            assertNotNull(responseBody.getData());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(3)
    public void getProjectTest() {
        try {
            ManagementProjectsGetResponseBody responseBody = managementApi.getProject(projectId);

            assertNotNull(responseBody);
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(4)
    public void updateProjectTest() {
        ManagementProjectsUpdateRequestBody updatedProject = new ManagementProjectsUpdateRequestBody();
        updatedProject.setDialCode("+48");
        try {
            ManagementProjectsUpdateResponseBody responseBody = managementApi.updateProject(projectId, updatedProject);

            assertNotNull(responseBody);
            assertNotNull(responseBody.getDialCode());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(5)
    public void listUsersTest() {
        try {
            ManagementProjectsUsersListResponseBody responseBody = managementApi.listUsers(projectId);

            List<User> data = responseBody.getData();
            if (data != null && !data.isEmpty()) {
                VoucherifyStore.getInstance().getManagement().setProjectUserId(data.get(0).getId());
            }
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }
    }

    @Test
    @Order(6)
    public void getUserTest() {
        String userId = VoucherifyStore.getInstance().getManagement().getProjectUserId();
        try {
            if (userId != null) {
                ManagementProjectsUsersGetUserResponseBody responseBody = managementApi.getUser(projectId, userId);
                assertNotNull(responseBody);
            }
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(7)
    public void createMetadataSchemaTest() {
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

            assertNotNull(responseBody);
            assertEquals("metadata_schema", responseBody.getObject());

            VoucherifyStore.getInstance().getManagement().setMetadataSchemaId(responseBody.getId());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(8)
    public void listMetadataSchemasTest() {
        try {
            ManagementProjectsMetadataSchemasListResponseBody responseBody = managementApi
                    .listMetadataSchemas1(projectId);
            assertNotNull(responseBody);
            assertEquals(ManagementProjectsMetadataSchemasListResponseBody.ObjectEnum.LIST, responseBody.getObject());

        } catch (Exception e) {
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

            assertNotNull(responseBody);
            assertEquals("metadata_schema", responseBody.getObject());
            assertEquals("metadata_schema", responseBody.getObject());

        } catch (Exception e) {
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

            assertNotNull(responseBody);
            assertEquals("metadata_schema", responseBody.getObject());
        } catch (Exception e) {
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

            assertNotNull(responseBody);
            assertEquals(ManagementProjectsCustomEventSchemasCreateResponseBody.ObjectEnum.CUSTOM_EVENT_SCHEMA,
                    responseBody.getObject());

            VoucherifyStore.getInstance().getManagement().setCustomEventSchemaId(responseBody.getId());
        } catch (Exception e) {
            fail();
        }
    }

    @Test
    @Order(12)
    public void listCustomEventSchemasTest() {
        try {
            ManagementProjectsCustomEventSchemasListResponseBody responseBody = managementApi
                    .listCustomEventSchemas(projectId);

            assertNotNull(responseBody);
            assertEquals(ManagementProjectsCustomEventSchemasListResponseBody.ObjectEnum.LIST,
                    responseBody.getObject());
        } catch (Exception e) {
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

            assertNotNull(responseBody);
            assertEquals(ManagementProjectsCustomEventSchemasGetResponseBody.ObjectEnum.CUSTOM_EVENT_SCHEMA,
                    responseBody.getObject());
        } catch (Exception e) {
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

            assertNotNull(responseBody);
            assertEquals(ManagementProjectsCustomEventSchemasUpdateResponseBody.ObjectEnum.CUSTOM_EVENT_SCHEMA,
                    responseBody.getObject());
        } catch (Exception e) {
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

            assertNotNull(responseBody);
            VoucherifyStore.getInstance().getManagement().setBrandId(responseBody.getId());
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }

    }

    @Test
    @Order(16)
    public void getBrandTest() {
        String brandId = VoucherifyStore.getInstance().getManagement().getbrandId();
        try {
            ManagementProjectsBrandingGetResponseBody responseBody = managementApi.getBrand(projectId, brandId);
            assertNotNull(responseBody);

            VoucherifyStore.getInstance().getManagement().setBrandId(responseBody.getId());
        } catch (Exception e) {
            System.out.println(e);
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

            assertNotNull(responseBody);
            VoucherifyStore.getInstance().getManagement().setBrandId(responseBody.getId());
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }

    }

    @Test
    @Order(18)
    public void listCampaignTemplates() {
        try {
            ManagementProjectsTemplatesCampaignsListResponseBody responseBody = managementApi
                    .managementListCampaignTemplates(projectId, null, projectId, null, null, null);

            assertNotNull(responseBody);
            assertEquals(ManagementProjectsTemplatesCampaignsListResponseBody.ObjectEnum.LIST,
                    responseBody.getObject());
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    @Order(19)
    public void deleteMetadataSchemaTest() {
        String metadataSchemaId = VoucherifyStore.getInstance().getManagement().getMetadataSchemaId();

        try {
            managementApi.deleteMetadataSchema(projectId, metadataSchemaId);
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    @Order(20)
    public void deleteCustomEventSchemaTest() {
        String customEventSchemaId = VoucherifyStore.getInstance().getManagement().getCustomEventSchemaId();

        try {
            managementApi.deleteCustomEventSchema(projectId, customEventSchemaId);
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    @Order(21)
    public void deleteBrand() {
        String brandId = VoucherifyStore.getInstance().getManagement().getbrandId();

        try {
            managementApi.deleteBrand(projectId, brandId);
        } catch (Exception e) {
            fail();
        }

    }

    @Test
    @Order(22)
    public void deleteProject() {
        try {
            managementApi.deleteProject(projectId);
        } catch (Exception e) {
            fail();
        }
    }
}