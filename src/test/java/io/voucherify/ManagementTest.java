package io.voucherify;

import io.voucherify.data.VoucherifyStore;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Order;

import io.voucherify.client.ApiClient;
import io.voucherify.client.api.ManagementApi;
import io.voucherify.client.model.*;
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
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();
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
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();

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
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();
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
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();
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
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();

        ManagementProjectsMetadataSchemasCreateRequestBody createdMetadataSchema = new ManagementProjectsMetadataSchemasCreateRequestBody();
        ManagementProjectsMetadataSchemaDefinition schemaDefinition = new ManagementProjectsMetadataSchemaDefinition();
        schemaDefinition.setType(TypeEnum.STRING);
        schemaDefinition.setOptional(true);
        schemaDefinition.setArray(true);
        Map<String, ManagementProjectsMetadataSchemaDefinition> properties = new HashMap<>();
        properties.put("test", schemaDefinition);

        createdMetadataSchema.setRelatedObject("related_object");
        createdMetadataSchema.setProperties(properties);
        createdMetadataSchema.setProperties(properties);

        try {
            ManagementProjectsMetadataSchemasCreateResponseBody responseBody = managementApi
                    .createMetadataSchema(projectId, createdMetadataSchema);

            assertNotNull(responseBody);
            assertEquals("metadata_schema", responseBody.getObject());
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }
    }

    @Test
    @Order(8)
    public void createBreandTest() {
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();

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
        } catch (Exception e) {
            System.out.println(e);
            fail();
        }

    }

    @Test
    @Order(9)
    public void deleteProject() {
        String projectId = VoucherifyStore.getInstance().getManagement().getProjectId();

        try {
            managementApi.deleteProject(projectId);
        } catch (Exception e) {
            fail();
        }
    }
}
