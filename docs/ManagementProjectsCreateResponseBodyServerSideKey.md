

# ManagementProjectsCreateResponseBodyServerSideKey

Contains the `app_id` and `app_token` to authenticate server-side requests.

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**appId** | **String** | Application ID to be used as &#x60;X-App-Id&#x60; header in every HTTP request. |
|**appToken** | **String** | Application token to be used as &#x60;X-App-Token&#x60; header in every HTTP request.  The application token (secret key) for the server-side authentication is visible in the Project Settings for 14 days when it is first generated in a newly-created project. Write your application token down and keep it in a safe place. |



