

# ManagementProjectsUsersInviteCreateRequestBody

Request body schema for **POST** `/management/v1/projects/users/invite`.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**email** | **String** | Email address to which the invitation will be sent. Must be a valid email address. |
|**firstName** | **String** | First name of the person who will receive the invitation. The name will be used in the user profile. |
|**lastName** | **String** | Last name of the person who will receive the invitation. The name will be used in the user profile. |
|**projects** | **Map&lt;String, String&gt;** | In the key, provide the project ID to which the new user will be assigned. In the value, provide the role which the user will have in the project. The predefined Voucherify roles are: &#x60;ADMIN&#x60;, &#x60;USER&#x60;, &#x60;VIEWER&#x60;, &#x60;MERCHANT&#x60;, &#x60;USER_RESTRICTED&#x60; (for the Areas and Stores, an Enterprise feature). Send a custom role ID (Enterprise feature) to assign a custom role. |



