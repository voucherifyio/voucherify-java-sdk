# Endpoints Coverage

## Table of Content

- [Publications](#publications)
- [Qualifications](#qualifications)
- [Validations](#validations)
- [Redemptions](#redemptions)
- [Vouchers](#vouchers)
- [Campaigns](#campaigns)
- [Promotions](#promotions)
- [Rewards](#rewards)
- [Loyalties](#loyalties)
- [Customers](#customers)
- [Orders](#orders)
- [Products](#products)
- [Product Collections](#product-collections)
- [Validation Rules](#validation-rules)
- [Segments](#segments)
- [Events](#events)
- [Async Actions](#async-actions)
- [Exports](#exports)
- [Categories](#categories)
- [Metadata Schemas](#metadata-schemas)
- [Locations](#locations)
- [Referrals](#referrals)
- [Bin](#bin)
- [Templates](#templates)
- [Management](#management)
- [Client-side](#client-side)
# Endpoints

## Publications
| endpoint                | method | summary            | is supported                         | is deprecated |
| ----------------------- | ------ | ------------------ | ------------------------------------ | ------------- |
| /v1/publications/create | get    | Create Publication | <font color='green'>supported</font> |               |
| /v1/publications        | get    | List Publications  | <font color='green'>supported</font> |               |
| /v1/publications        | post   | Create Publication | <font color='green'>supported</font> |               |
## Qualifications
| endpoint           | method | summary           | is supported                         | is deprecated |
| ------------------ | ------ | ----------------- | ------------------------------------ | ------------- |
| /v1/qualifications | post   | Check Eligibility | <font color='green'>supported</font> |               |
## Validations
| endpoint                                 | method | summary                              | is supported                         | is deprecated                        |
| ---------------------------------------- | ------ | ------------------------------------ | ------------------------------------ | ------------------------------------ |
| /v1/validations                          | post   | Validate Stackable Discounts         | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/validate             | post   | Validate Voucher [Deprecated]        |                                      |  <font color='red'>deprecated</font> |
| /v1/promotions/validation                | post   | Validate Promotions [Deprecated]     |                                      |  <font color='red'>deprecated</font> |
| /v1/promotions/tiers/{tierId}/validation | post   | Validate Promotion Tier [Deprecated] |                                      |  <font color='red'>deprecated</font> |
## Redemptions
| endpoint                                          | method | summary                        | is supported                         | is deprecated                        |
| ------------------------------------------------- | ------ | ------------------------------ | ------------------------------------ | ------------------------------------ |
| /v1/redemptions                                   | get    | List Redemptions               | <font color='green'>supported</font> |                                      |
| /v1/redemptions                                   | post   | Redeem Stackable Discounts     | <font color='green'>supported</font> |                                      |
| /v1/redemptions/{redemptionId}                    | get    | Get Redemption                 | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/redemption                    | get    | Get Voucher's Redemptions      | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/redemption                    | post   | Redeem Voucher [Deprecated]    |                                      |  <font color='red'>deprecated</font> |
| /v1/redemptions/{redemptionId}/rollback           | post   | Rollback Redemption            | <font color='green'>supported</font> |                                      |
| /v1/promotions/tiers/{promotionTierId}/redemption | post   | Redeem Promotion [Deprecated]  |                                      |  <font color='red'>deprecated</font> |
| /v1/redemptions/{parentRedemptionId}/rollbacks    | post   | Rollback Stackable Redemptions | <font color='green'>supported</font> |                                      |
## Vouchers
| endpoint                                  | method | summary                            | is supported                         | is deprecated                        |
| ----------------------------------------- | ------ | ---------------------------------- | ------------------------------------ | ------------------------------------ |
| /v1/vouchers                              | get    | List Vouchers                      | <font color='green'>supported</font> |                                      |
| /v1/vouchers                              | post   | Generate Random Code               | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}                       | get    | Get Voucher                        | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}                       | put    | Update Voucher                     | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}                       | delete | Delete Voucher                     | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}                       | post   | Create Voucher                     | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/enable                | post   | Enable Voucher                     | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/disable               | post   | Disable Voucher                    | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/balance               | post   | Add or Remove Voucher Balance      | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/transactions          | get    | List Voucher Transactions          | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/transactions/export   | post   | Export Voucher Transactions        | <font color='green'>supported</font> |                                      |
| /v1/vouchers/import                       | post   | Import Vouchers                    | <font color='green'>supported</font> |                                      |
| /v1/vouchers/importCSV                    | post   | Import Vouchers using CSV          | <font color='green'>supported</font> |                                      |
| /v1/vouchers/bulk/async                   | post   | Update Vouchers in Bulk            | <font color='green'>supported</font> |                                      |
| /v1/vouchers/metadata/async               | post   | Update Vouchers' Metadata in Bulk  | <font color='green'>supported</font> |                                      |
| /v1/vouchers/{code}/sessions/{sessionKey} | delete | Release Validation Session         | <font color='green'>supported</font> |                                      |
| /v1/vouchers/qualification                | post   | Examine Qualification [Deprecated] |                                      |  <font color='red'>deprecated</font> |
## Campaigns
| endpoint                                       | method | summary                                    | is supported                         | is deprecated                        |
| ---------------------------------------------- | ------ | ------------------------------------------ | ------------------------------------ | ------------------------------------ |
| /v1/campaigns                                  | post   | Create Campaign                            | <font color='green'>supported</font> |                                      |
| /v1/campaigns                                  | get    | List Campaigns                             | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}                     | get    | Get Campaign                               | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}                     | put    | Update Campaign                            | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}                     | delete | Delete Campaign                            | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}/vouchers            | post   | Add Vouchers to Campaign                   | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}/vouchers/{code}     | post   | Add Voucher with Specific Code to Campaign | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}/import              | post   | Import Vouchers to Campaign                | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}/importCSV           | post   | Import Vouchers to Campaign by CSV         | <font color='green'>supported</font> |                                      |
| /v1/campaigns/qualification                    | post   | Examine Qualification [Deprecated]         |                                      |  <font color='red'>deprecated</font> |
| /v1/campaigns/{campaignId}/enable              | post   | Enable Campaign                            | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}/disable             | post   | Disable Campaign                           | <font color='green'>supported</font> |                                      |
| /v1/campaigns/{campaignId}/transactions        | get    | List Campaign Transactions                 |                                      |                                      |
| /v1/campaigns/{campaignId}/transactions/export | post   | Export Campaign Transactions               |                                      |                                      |
## Promotions
| endpoint                                       | method | summary                            | is supported                         | is deprecated |
| ---------------------------------------------- | ------ | ---------------------------------- | ------------------------------------ | ------------- |
| /v1/promotions/tiers                           | get    | List Promotion Tiers               | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/tiers              | get    | List Promotion Tiers from Campaign | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/tiers              | post   | Add Promotion Tier to Campaign     | <font color='green'>supported</font> |               |
| /v1/promotions/tiers/{promotionTierId}         | get    | Get Promotion Tier                 | <font color='green'>supported</font> |               |
| /v1/promotions/tiers/{promotionTierId}         | put    | Update Promotion Tier              | <font color='green'>supported</font> |               |
| /v1/promotions/tiers/{promotionTierId}         | delete | Delete Promotion Tier              | <font color='green'>supported</font> |               |
| /v1/promotions/tiers/{promotionTierId}/enable  | post   | Enable Promotion Tier              | <font color='green'>supported</font> |               |
| /v1/promotions/tiers/{promotionTierId}/disable | post   | Disable Promotion Tier             | <font color='green'>supported</font> |               |
| /v1/promotions/stacks                          | get    | List Promotion Stacks              | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/stacks             | get    | List Promotion Stacks in Campaign  | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/stacks             | post   | Create Promotion Stack             | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/stacks/{stackId}   | get    | Get Promotion Stack                | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/stacks/{stackId}   | put    | Update Promotion Stack             | <font color='green'>supported</font> |               |
| /v1/promotions/{campaignId}/stacks/{stackId}   | delete | Delete Promotion Stack             | <font color='green'>supported</font> |               |
## Rewards
| endpoint                                          | method | summary                  | is supported                         | is deprecated |
| ------------------------------------------------- | ------ | ------------------------ | ------------------------------------ | ------------- |
| /v1/rewards                                       | get    | List Rewards             | <font color='green'>supported</font> |               |
| /v1/rewards                                       | post   | Create Reward            | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}                            | get    | Get Reward               | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}                            | put    | Update Reward            | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}                            | delete | Delete Reward            | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}/assignments                | get    | List Reward Assignments  | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}/assignments                | post   | Create Reward Assignment | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}/assignments/{assignmentId} | put    | Update Reward Assignment | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}/assignments/{assignmentId} | delete | Delete Reward Assignment | <font color='green'>supported</font> |               |
| /v1/rewards/{rewardId}/assignments/{assignmentId} | get    | Get Reward Assignment    | <font color='green'>supported</font> |               |
## Loyalties
| endpoint                                                            | method | summary                              | is supported                         | is deprecated |
| ------------------------------------------------------------------- | ------ | ------------------------------------ | ------------------------------------ | ------------- |
| /v1/loyalties                                                       | get    | List Loyalty Campaigns               | <font color='green'>supported</font> |               |
| /v1/loyalties                                                       | post   | Create Loyalty Campaign              | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}                                          | get    | Get Loyalty Campaign                 | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}                                          | put    | Update Loyalty Campaign              | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}                                          | delete | Delete Loyalty Campaign              | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members                                  | get    | List Members                         | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members                                  | post   | Add Member                           | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}                       | get    | Get Member                           | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}                                    | get    | Get Member                           | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}/activity              | get    | List Member Activity                 | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/activity                           | get    | List Member Activity                 | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}/balance               | post   | Add or Remove Loyalty Card Balance   | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/balance                            | post   | Add or Remove Loyalty Card Balance   | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}/transfers             | post   | Transfer Loyalty Points              | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/transactions                             | get    | List Loyalty Campaign Transactions   |                                      |               |
| /v1/loyalties/{campaignId}/transactions/export                      | post   | Export Loyalty Campaign Transactions |                                      |               |
| /v1/loyalties/{campaignId}/members/{memberId}/transactions          | get    | List Loyalty Card Transactions       | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/transactions                       | get    | List Loyalty Card Transactions       | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/transactions/export                | post   | Export Loyalty Card Transactions     | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}/transactions/export   | post   | Export Loyalty Card Transactions     | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}/points-expiration     | get    | Get Points Expiration                | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/points-expiration/export                 | post   | Create Points Expiration Export      | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules                            | get    | List Earning Rules                   | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules                            | post   | Create Earning Rule                  | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}            | get    | Get Earning Rule                     | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}            | put    | Update Earning Rule                  | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}            | delete | Delete Earning Rule                  | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}/enable     | post   | Enable Earning Rule                  | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/earning-rules/{earningRuleId}/disable    | post   | Disable Earning Rule                 | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/rewards                            | get    | List Member Rewards                  | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/reward-assignments/{assignmentId}/reward | get    | Get Reward Details                   | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/reward-assignments                       | get    | List Reward Assignments              | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/rewards                                  | get    | List Reward Assignments              | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/rewards                                  | post   | Create Reward Assignment             | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/reward-assignments/{assignmentId}        | get    | Get Reward Assignment                | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/rewards/{assignmentId}                   | get    | Get Reward Assignment                | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/rewards/{assignmentId}                   | put    | Update Reward Assignment             | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/rewards/{assignmentId}                   | delete | Delete Reward Assignment             | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/members/{memberId}/redemption            | post   | Redeem Reward                        | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/redemption                         | post   | Redeem Reward                        | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/tiers                                    | get    | List Loyalty Tiers                   | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/tiers                                    | post   | Create loyalty tiers                 | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}                    | get    | Get Loyalty Tier                     | <font color='green'>supported</font> |               |
| /v1/loyalties/members/{memberId}/tiers                              | get    | List Member's Loyalty Tiers          | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}/earning-rules      | get    | List Loyalty Tier Earning Rules      | <font color='green'>supported</font> |               |
| /v1/loyalties/{campaignId}/tiers/{loyaltyTierId}/rewards            | get    | List Loyalty Tier Rewards            | <font color='green'>supported</font> |               |
## Customers
| endpoint                                      | method | summary                               | is supported                         | is deprecated                        |
| --------------------------------------------- | ------ | ------------------------------------- | ------------------------------------ | ------------------------------------ |
| /v1/customers                                 | get    | List Customers                        | <font color='green'>supported</font> |                                      |
| /v1/customers                                 | post   | Create Customer                       | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}                    | get    | Get Customer                          | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}                    | delete | Delete Customer                       | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}                    | put    | Update Customer                       | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}/permanent-deletion | post   | Delete Customer Permanently           | <font color='green'>supported</font> |                                      |
| /v1/customers/importCSV                       | post   | Import and Update Customers using CSV | <font color='green'>supported</font> |                                      |
| /v1/customers/bulk/async                      | post   | Update Customers in Bulk              | <font color='green'>supported</font> |                                      |
| /v1/customers/metadata/async                  | post   | Update Customers' Metadata in Bulk    | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}/activity           | get    | List Customer Activity                | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}/activities         | get    | List Customer Activities [Deprecated] |                                      |  <font color='red'>deprecated</font> |
| /v1/customers/{customerId}/segments           | get    | List Customer's Segments              | <font color='green'>supported</font> |                                      |
| /v1/customers/{customerId}/redeemables        | get    | List Customer's Redeemables           | <font color='green'>supported</font> |                                      |
## Orders
| endpoint             | method | summary              | is supported                         | is deprecated |
| -------------------- | ------ | -------------------- | ------------------------------------ | ------------- |
| /v1/orders           | get    | List Orders          | <font color='green'>supported</font> |               |
| /v1/orders           | post   | Create Order         | <font color='green'>supported</font> |               |
| /v1/orders/{orderId} | get    | Get Order            | <font color='green'>supported</font> |               |
| /v1/orders/{orderId} | put    | Update Order         | <font color='green'>supported</font> |               |
| /v1/orders/import    | post   | Import Orders        | <font color='green'>supported</font> |               |
| /v1/orders/export    | post   | Create Orders Export | <font color='green'>supported</font> |               |
## Products
| endpoint                              | method | summary                           | is supported                         | is deprecated |
| ------------------------------------- | ------ | --------------------------------- | ------------------------------------ | ------------- |
| /v1/products                          | get    | List Products                     | <font color='green'>supported</font> |               |
| /v1/products                          | post   | Create Product                    | <font color='green'>supported</font> |               |
| /v1/products/{productId}              | get    | Get Product                       | <font color='green'>supported</font> |               |
| /v1/products/{productId}              | put    | Update Product                    | <font color='green'>supported</font> |               |
| /v1/products/{productId}              | delete | Delete Product                    | <font color='green'>supported</font> |               |
| /v1/products/bulk/async               | post   | Update Products in Bulk           | <font color='green'>supported</font> |               |
| /v1/products/metadata/async           | post   | Update Products' Metadata in Bulk | <font color='green'>supported</font> |               |
| /v1/skus/{skuId}                      | get    | Get SKU                           | <font color='green'>supported</font> |               |
| /v1/products/{productId}/skus         | get    | List SKUs in Product              | <font color='green'>supported</font> |               |
| /v1/products/{productId}/skus         | post   | Create SKU                        | <font color='green'>supported</font> |               |
| /v1/products/{productId}/skus/{skuId} | put    | Update SKU                        | <font color='green'>supported</font> |               |
| /v1/products/{productId}/skus/{skuId} | delete | Delete SKU                        | <font color='green'>supported</font> |               |
| /v1/products/importCSV                | post   | Import Products using CSV         | <font color='green'>supported</font> |               |
| /v1/skus/importCSV                    | post   | Import SKUs using CSV             | <font color='green'>supported</font> |               |
## Product Collections
| endpoint                                               | method | summary                     | is supported                         | is deprecated |
| ------------------------------------------------------ | ------ | --------------------------- | ------------------------------------ | ------------- |
| /v1/product-collections                                | get    | List Product Collections    | <font color='green'>supported</font> |               |
| /v1/product-collections                                | post   | Create Product Collection   | <font color='green'>supported</font> |               |
| /v1/product-collections/{productCollectionId}          | get    | Get Product Collection      | <font color='green'>supported</font> |               |
| /v1/product-collections/{productCollectionId}          | delete | Delete Product Collection   | <font color='green'>supported</font> |               |
| /v1/product-collections/{productCollectionId}/products | get    | List Products in Collection | <font color='green'>supported</font> |               |
## Validation Rules
| endpoint                                                           | method | summary                              | is supported                         | is deprecated |
| ------------------------------------------------------------------ | ------ | ------------------------------------ | ------------------------------------ | ------------- |
| /v1/validation-rules                                               | get    | List Validation Rules                | <font color='green'>supported</font> |               |
| /v1/validation-rules                                               | post   | Create Validation Rules              | <font color='green'>supported</font> |               |
| /v1/validation-rules/{validationRuleId}                            | get    | Get Validation Rule                  | <font color='green'>supported</font> |               |
| /v1/validation-rules/{validationRuleId}                            | put    | Update Validation Rule               | <font color='green'>supported</font> |               |
| /v1/validation-rules/{validationRuleId}                            | delete | Delete Validation Rule               | <font color='green'>supported</font> |               |
| /v1/validation-rules-assignments                                   | get    | List Validation Rules' Assignment(s) | <font color='green'>supported</font> |               |
| /v1/validation-rules/{validationRuleId}/assignments                | get    | List Validation Rule Assignments     | <font color='green'>supported</font> |               |
| /v1/validation-rules/{validationRuleId}/assignments                | post   | Create Validation Rules Assignments  | <font color='green'>supported</font> |               |
| /v1/validation-rules/{validationRuleId}/assignments/{assignmentId} | delete | Delete Validation Rule Assignment    | <font color='green'>supported</font> |               |
## Segments
| endpoint                 | method | summary        | is supported                         | is deprecated |
| ------------------------ | ------ | -------------- | ------------------------------------ | ------------- |
| /v1/segments/{segmentId} | get    | Get Segment    | <font color='green'>supported</font> |               |
| /v1/segments/{segmentId} | delete | Delete Segment | <font color='green'>supported</font> |               |
| /v1/segments             | post   | Create Segment | <font color='green'>supported</font> |               |
## Events
| endpoint   | method | summary            | is supported                         | is deprecated |
| ---------- | ------ | ------------------ | ------------------------------------ | ------------- |
| /v1/events | post   | Track Custom Event | <font color='green'>supported</font> |               |
## Async Actions
| endpoint                          | method | summary            | is supported                         | is deprecated |
| --------------------------------- | ------ | ------------------ | ------------------------------------ | ------------- |
| /v1/async-actions                 | get    | List Async Actions | <font color='green'>supported</font> |               |
| /v1/async-actions/{asyncActionId} | get    | Get Async Action   | <font color='green'>supported</font> |               |
## Exports
| endpoint                | method | summary         | is supported                         | is deprecated |
| ----------------------- | ------ | --------------- | ------------------------------------ | ------------- |
| /v1/exports             | post   | Create Export   | <font color='green'>supported</font> |               |
| /v1/exports             | get    | List Exports    | <font color='green'>supported</font> |               |
| /v1/exports/{exportId}  | get    | Get Export      | <font color='green'>supported</font> |               |
| /v1/exports/{exportId}  | delete | Delete Export   | <font color='green'>supported</font> |               |
| /v1/exports/{export_Id} | get    | Download Export | <font color='green'>supported</font> |               |
## Categories
| endpoint                    | method | summary         | is supported                         | is deprecated |
| --------------------------- | ------ | --------------- | ------------------------------------ | ------------- |
| /v1/categories              | get    | List Categories | <font color='green'>supported</font> |               |
| /v1/categories              | post   | Create Category | <font color='green'>supported</font> |               |
| /v1/categories/{categoryId} | get    | Get Category    | <font color='green'>supported</font> |               |
| /v1/categories/{categoryId} | delete | Delete Category | <font color='green'>supported</font> |               |
| /v1/categories/{categoryId} | put    | Update Category | <font color='green'>supported</font> |               |
## Metadata Schemas
| endpoint                        | method | summary               | is supported                         | is deprecated |
| ------------------------------- | ------ | --------------------- | ------------------------------------ | ------------- |
| /v1/metadata-schemas            | get    | List Metadata Schemas | <font color='green'>supported</font> |               |
| /v1/metadata-schemas/{resource} | get    | Get Metadata Schema   | <font color='green'>supported</font> |               |
## Locations
| endpoint                   | method | summary        | is supported                         | is deprecated |
| -------------------------- | ------ | -------------- | ------------------------------------ | ------------- |
| /v1/locations              | get    | List Locations | <font color='green'>supported</font> |               |
| /v1/locations/{locationId} | get    | Get Location   | <font color='green'>supported</font> |               |
## Referrals
| endpoint                                                         | method | summary                     | is supported                         | is deprecated |
| ---------------------------------------------------------------- | ------ | --------------------------- | ------------------------------------ | ------------- |
| /v1/referrals/{campaignId}/members/{memberId}/holders            | post   | Add Referral Code Holders   | <font color='green'>supported</font> |               |
| /v1/referrals/{campaignId}/members/{memberId}/holders            | get    | List Referral Code Holders  | <font color='green'>supported</font> |               |
| /v1/referrals/{campaignId}/members/{memberId}/holders/{holderId} | delete | Remove Referral Card Holder | <font color='green'>supported</font> |               |
| /v1/referrals/members/{memberId}/holders                         | post   | Add Referral Code Holders   | <font color='green'>supported</font> |               |
| /v1/referrals/members/{memberId}/holders                         | get    | List Referral Code Holders  | <font color='green'>supported</font> |               |
| /v1/referrals/members/{memberId}/holders/{holderId}              | delete | Remove Referral Card Holder | <font color='green'>supported</font> |               |
## Bin
| endpoint                   | method | summary          | is supported                         | is deprecated |
| -------------------------- | ------ | ---------------- | ------------------------------------ | ------------- |
| /v1/trash-bin              | get    | List Bin Entries | <font color='green'>supported</font> |               |
| /v1/trash-bin/{binEntryId} | delete | Delete Bin Entry | <font color='green'>supported</font> |               |
## Templates
| endpoint                                                    | method | summary                          | is supported                         | is deprecated |
| ----------------------------------------------------------- | ------ | -------------------------------- | ------------------------------------ | ------------- |
| /v1/templates/campaigns                                     | get    | List Campaign Templates          | <font color='green'>supported</font> |               |
| /v1/templates/campaigns                                     | post   | Create Campaign Template         | <font color='green'>supported</font> |               |
| /v1/templates/campaigns/{campaignTemplateId}                | get    | Get Campaign Template            | <font color='green'>supported</font> |               |
| /v1/templates/campaigns/{campaignTemplateId}                | put    | Update Campaign Template         | <font color='green'>supported</font> |               |
| /v1/templates/campaigns/{campaignTemplateId}                | delete | Delete Campaign Template         | <font color='green'>supported</font> |               |
| /v1/templates/campaigns/{campaignTemplateId}/campaign-setup | post   | Create Campaign From Template    | <font color='green'>supported</font> |               |
| /v1/templates/campaigns/{campaignTemplateId}/tier-setup     | post   | Add Promotion Tier From Template | <font color='green'>supported</font> |               |
## Management
| endpoint                                                                          | method | summary                             | is supported                         | is deprecated |
| --------------------------------------------------------------------------------- | ------ | ----------------------------------- | ------------------------------------ | ------------- |
| /management/v1/projects                                                           | post   | Create Project                      | <font color='green'>supported</font> |               |
| /management/v1/projects                                                           | get    | List Projects                       | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}                                               | get    | Get Project                         | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}                                               | put    | Update Project                      | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}                                               | delete | Delete Project                      | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/users                                         | post   | Assign User                         | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/users                                         | get    | List Users                          | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/users/{userId}                                | get    | Get User                            | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/users/{userId}                                | put    | Update User                         | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/users/{userId}                                | delete | Unassign User                       | <font color='green'>supported</font> |               |
| /management/v1/projects/users/invite                                              | post   | Invite a New User                   | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/templates/campaigns                           | get    | List Campaign Templates             | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/templates/campaigns/{campaignTemplateId}/copy | post   | Copy Campaign Template to a Project | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/stacking-rules                                | post   | Create Stacking Rules               | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/stacking-rules                                | get    | List Stacking Rules                 | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId}              | get    | Get Stacking Rules                  | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId}              | put    | Update Stacking Rules               | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/stacking-rules/{stackingRulesId}              | delete | Delete Stacking Rules               | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/metadata-schemas                              | post   | Create Metadata Schema              | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/metadata-schemas                              | get    | List Metadata Schemas               | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId}           | get    | Get Metadata Schema                 | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId}           | put    | Update Metadata Schema              | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/metadata-schemas/{metadataSchemaId}           | delete | Delete Metadata Schema              | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/custom-event-schemas                          | post   | Create Custom Event Schema          | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/custom-event-schemas                          | get    | List Custom Event Schemas           | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId}    | get    | Get Custom Event Schema             | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId}    | put    | Update Custom Event Schema          | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/custom-event-schemas/{customEventSchemaId}    | delete | Delete Custom Event Schema          | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/webhooks                                      | post   | Create Webhook                      | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/webhooks                                      | get    | List Webhooks                       | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/webhooks/{webhookId}                          | get    | Get Webhook                         | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/webhooks/{webhookId}                          | put    | Update Webhook                      | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/webhooks/{webhookId}                          | delete | Delete Webhook                      | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/branding                                      | post   | Create Brand                        | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/branding                                      | get    | List Brands                         | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/branding/{brandingId}                         | get    | Get Brand                           | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/branding/{brandingId}                         | put    | Update Brand                        | <font color='green'>supported</font> |               |
| /management/v1/projects/{projectId}/branding/{brandingId}                         | delete | Delete Brand                        | <font color='green'>supported</font> |               |
## Client-side
| endpoint                    | method | summary                                     | is supported                         | is deprecated                        |
| --------------------------- | ------ | ------------------------------------------- | ------------------------------------ | ------------------------------------ |
| /client/v1/qualifications   | post   | Check Eligibility (client-side)             | <font color='green'>supported</font> |                                      |
| /client/v1/promotions/tiers | get    | List Promotion Tiers (client-side)          | <font color='green'>supported</font> |                                      |
| /client/v1/redemptions      | post   | Redeem Stackable Discounts (client-side)    | <font color='green'>supported</font> |                                      |
| /client/v1/validations      | post   | Validate Stackable Discounts (client-side)  | <font color='green'>supported</font> |                                      |
| /client/v1/events           | post   | Track Custom Event (client-side)            | <font color='green'>supported</font> |                                      |
| /client/v1/validate         | get    | Validate Voucher (client-side) [Deprecated] |                                      |  <font color='red'>deprecated</font> |
| /client/v1/redeem           | post   | Redeem Voucher (client-side) [Deprecated]   |                                      |  <font color='red'>deprecated</font> |
| /client/v1/publish          | post   | Create Publication (client-side)            |                                      |                                      |