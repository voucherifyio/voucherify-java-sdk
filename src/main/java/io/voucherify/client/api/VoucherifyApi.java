package io.voucherify.client.api;

import io.voucherify.client.model.QualificationContext;
import io.voucherify.client.model.QualificationList;
import io.voucherify.client.model.async_actions.AsyncActionResponse;
import io.voucherify.client.model.async_actions.AsyncActionsResponse;
import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.UpdateCampaign;
import io.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.model.consents.response.ListConsentsResponse;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.response.CustomerBulkUpdateResponse;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.customer.response.CustomersResponse;
import io.voucherify.client.model.distribution.CreateExport;
import io.voucherify.client.model.distribution.PublishVoucher;
import io.voucherify.client.model.distribution.response.ExportResponse;
import io.voucherify.client.model.distribution.response.ListPublicationsResponse;
import io.voucherify.client.model.distribution.response.PublishVoucherResponse;
import io.voucherify.client.model.event.CustomEvent;
import io.voucherify.client.model.event.response.CustomEventResponse;
import io.voucherify.client.model.loyalties.AddMember;
import io.voucherify.client.model.loyalties.CreateEarningRule;
import io.voucherify.client.model.loyalties.RedeemReward;
import io.voucherify.client.model.loyalties.UpdateEarningRule;
import io.voucherify.client.model.loyalties.response.EarningRuleResponse;
import io.voucherify.client.model.loyalties.response.ListEarningRulesResponse;
import io.voucherify.client.model.loyalties.MembersLoyaltyTier;
import io.voucherify.client.model.loyalties.response.MembersLoyaltyTierResponse;
import io.voucherify.client.model.order.CreateOrder;
import io.voucherify.client.model.order.UpdateOrder;
import io.voucherify.client.model.order.response.CreateOrderResponse;
import io.voucherify.client.model.order.response.GetOrderResponse;
import io.voucherify.client.model.order.response.ListOrdersResponse;
import io.voucherify.client.model.product.Product;
import io.voucherify.client.model.product.SKU;
import io.voucherify.client.model.product.response.ProductResponse;
import io.voucherify.client.model.product.response.ProductsResponse;
import io.voucherify.client.model.product.response.SKUResponse;
import io.voucherify.client.model.product.response.SKUsResponse;
import io.voucherify.client.model.promotion.CreatePromotionCampaign;
import io.voucherify.client.model.promotion.Tier;
import io.voucherify.client.model.promotion.response.CreatePromotionCampaignResponse;
import io.voucherify.client.model.promotion.response.ListPromotionTiersResponse;
import io.voucherify.client.model.promotion.response.TierResponse;
import io.voucherify.client.model.redemption.RedeemPromotion;
import io.voucherify.client.model.redemption.RedeemVoucher;
import io.voucherify.client.model.redemption.RollbackRedemption;
import io.voucherify.client.model.redemption.response.RedeemPromotionResponse;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.redemption.response.RedemptionEntryResponse;
import io.voucherify.client.model.redemption.response.RedemptionsResponse;
import io.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import io.voucherify.client.model.redemption.response.VoucherRedemptionsResponse;
import io.voucherify.client.model.rewards.CreateReward;
import io.voucherify.client.model.rewards.CreateRewardAssignment;
import io.voucherify.client.model.rewards.UpdateReward;
import io.voucherify.client.model.rewards.UpdateRewardAssignment;
import io.voucherify.client.model.rewards.response.ListRewardAssignmentsResponse;
import io.voucherify.client.model.rewards.response.ListRewardsResponse;
import io.voucherify.client.model.rewards.response.RewardAssignmentResponse;
import io.voucherify.client.model.rewards.response.RewardResponse;
import io.voucherify.client.model.segment.Segment;
import io.voucherify.client.model.segment.response.SegmentResponse;
import io.voucherify.client.model.validation.PromotionValidation;
import io.voucherify.client.model.validation.VoucherValidation;
import io.voucherify.client.model.validation.response.PromotionValidationResponse;
import io.voucherify.client.model.validation.response.VoucherValidationResponse;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRule;
import io.voucherify.client.model.validationRules.CreateBusinessValidationRuleAssignment;
import io.voucherify.client.model.validationRules.UpdateBusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRule;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignment;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleAssignmentList;
import io.voucherify.client.model.validationRules.response.BusinessValidationRuleList;
import io.voucherify.client.model.voucher.AddBalance;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.ImportVouchers;
import io.voucherify.client.model.voucher.VoucherUpdate;
import io.voucherify.client.model.voucher.response.AddBalanceResponse;
import io.voucherify.client.model.voucher.response.ImportVouchersResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.DELETE;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface VoucherifyApi {

  // ASYNC ACTIONS

  @GET("async-actions/{id}")
  Call<AsyncActionResponse> getAsyncAction(@Path("id") String id);

  @GET("async-actions")
  Call<AsyncActionsResponse> listAsyncActions(@QueryMap Map<String, Object> filter);

  // CAMPAIGNS

  @POST("campaigns")
  Call<CampaignResponse> createCampaign(@Body CreateCampaign createCampaign);

  @POST("campaigns/{name}/vouchers")
  Call<AddVoucherToCampaignResponse> addVoucherToCampaign(
      @Path("name") String campaignName, @Body AddVoucherToCampaign addVoucherToCampaign);

  @GET("campaigns/{name}")
  Call<CampaignResponse> getCampaign(@Path("name") String campaignName);

  @GET("campaigns")
  Call<CampaignsResponse> listCampaigns(@QueryMap Map<String, Object> filter);

  @PUT("campaigns/{name}")
  Call<CampaignResponse> updateCampaign(
      @Path("name") String campaignName, @Body UpdateCampaign updateCampaign);

  @POST("campaigns/{name}/vouchers/{code}")
  Call<AddVoucherToCampaignResponse> addVoucherToCampaignWithCode(
      @Path("name") String campaignName,
      @Path("code") String voucherCode,
      @Body AddVoucherToCampaign addVoucherToCampaign);

  @DELETE("campaigns/{name}")
  Call<Void> deleteCampaign(
      @Path("name") String campaignName, @QueryMap Map<String, Object> params);

  @POST("campaigns/{name}/import")
  Call<ImportVouchersResponse> importVouchersToCampaign(
      @Path("name") String campaignName, @Body CampaignImportVouchers importVouchers);

  @POST("campaigns/qualification")
  Call<QualificationList<CampaignResponse>> getQualifiedCampaigns(
      @Body QualificationContext validationContext, @QueryMap Map<String, Object> params);

  // CUSTOMERS

  @POST("customers")
  Call<CustomerResponse> createCustomer(@Body Customer customer);

  @GET("customers/{id}")
  Call<CustomerResponse> getCustomerById(@Path("id") String customerId);

  @PUT("customers/{id}")
  Call<CustomerResponse> updateCustomer(@Path("id") String customerId, @Body Customer customer);

  @POST("customers/bulk/async")
  Call<CustomerBulkUpdateResponse> bulkUpdateCustomer(@Body List<Customer> customers);

  @DELETE("customers/{id}")
  Call<Void> deleteCustomer(@Path("id") String customerId);

  @GET("customers")
  Call<CustomersResponse> listCustomers(@QueryMap Map<String, Object> filter);

  // REDEMPTIONS

  @POST("vouchers/{code}/redemption")
  Call<RedeemVoucherResponse> redeem(@Path("code") String code, @Body RedeemVoucher redeemVoucher);

  @POST("promotions/tiers/{id}/redemption")
  Call<RedeemPromotionResponse> redeem(
      @Path("id") String id, @Body RedeemPromotion redeemPromotion);

  @GET("redemptions")
  Call<RedemptionsResponse> listRedemptions(@QueryMap Map<String, Object> filter);

  @GET("vouchers/{code}/redemption")
  Call<VoucherRedemptionsResponse> getVoucherRedemptions(@Path("code") String code);

  @POST("redemptions/{id}/rollback")
  Call<RollbackRedemptionResponse> rollbackRedemption(
      @Path("id") String redemptionId,
      @Query("reason") String reason,
      @Body RollbackRedemption rollbackRedemption);

  @GET("redemptions/{id}")
  Call<RedemptionEntryResponse> getRedemption(@Path("id") String redemptionId);

  // DISTRIBUTIONS

  @POST("vouchers/publish")
  Call<PublishVoucherResponse> publishVoucher(@Body PublishVoucher publishVoucher);

  @POST("exports")
  Call<ExportResponse> createExport(@Body CreateExport createExport);

  @GET("exports/{id}")
  Call<ExportResponse> getExport(@Path("id") String id);

  @DELETE("exports/{id}")
  Call<Void> deleteExport(@Path("id") String id);

  @GET("publications")
  Call<ListPublicationsResponse> list(@QueryMap Map<String, Object> filter);

  // VOUCHERS

  @POST("vouchers")
  Call<VoucherResponse> createVoucher(@Body CreateVoucher createVoucher);

  @POST("vouchers/{code}")
  Call<VoucherResponse> createVoucher(@Path("code") String code, @Body CreateVoucher createVoucher);

  @GET("vouchers/{code}")
  Call<VoucherResponse> getVoucher(@Path("code") String code);

  @PUT("vouchers/{code}")
  Call<VoucherResponse> updateVoucher(@Path("code") String code, @Body VoucherUpdate voucherUpdate);

  @DELETE("vouchers/{code}")
  Call<Void> deleteVoucher(@Path("code") String code, @Query("force") Boolean force);

  @GET("vouchers")
  Call<VouchersResponse> listVouchers(@QueryMap Map<String, Object> filter);

  @POST("vouchers/{code}/enable")
  Call<VoucherResponse> enable(@Path("code") String code);

  @POST("vouchers/{code}/disable")
  Call<VoucherResponse> disable(@Path("code") String code);

  @POST("vouchers/{code}/balance")
  Call<AddBalanceResponse> addBalance(@Path("code") String code, @Body AddBalance addBalance);

  @POST("vouchers/import")
  Call<ImportVouchersResponse> importVouchers(@Body ImportVouchers vouchers);

  @POST("vouchers/qualification")
  Call<QualificationList<VoucherResponse>> getQualifiedVouchers(
      @Body QualificationContext validationContext, @QueryMap Map<String, Object> params);

  @DELETE("vouchers/{code}/sessions/{session_key}")
  Call<Void> releaseSession(@Path("code") String code, @Path("session_key") String sessionKey);

  // VALIDATIONS

  @POST("vouchers/{code}/validate")
  Call<VoucherValidationResponse> validateVoucher(
      @Path("code") String code, @Body VoucherValidation voucherValidation);

  @POST("promotions/validation")
  Call<PromotionValidationResponse> validatePromotion(
      @Body PromotionValidation promotionValidation);

  // PRODUCTS

  @POST("products")
  Call<ProductResponse> createProduct(@Body Product product);

  @GET("products/{id}")
  Call<ProductResponse> getProduct(@Path("id") String id);

  @PUT("products/{id}")
  Call<ProductResponse> updateProduct(@Path("id") String id, @Body Product product);

  @GET("products")
  Call<ProductsResponse> getProducts(@QueryMap Map<String, Object> filter);

  @DELETE("products/{id}")
  Call<Void> deleteProduct(@Path("id") String id, @QueryMap Map<String, Object> params);

  // SKU

  @POST("products/{id}/skus")
  Call<SKUResponse> createSKU(@Path("id") String productId, @Body SKU sku);

  @GET("products/{id}/skus/{skuId}")
  Call<SKUResponse> getSKU(@Path("id") String productId, @Path("skuId") String skuId);

  @PUT("products/{id}/skus/{skuId}")
  Call<SKUResponse> updateSKU(
      @Path("id") String productId, @Path("skuId") String skuId, @Body SKU sku);

  @GET("products/{id}/skus")
  Call<SKUsResponse> getSKUs(@Path("id") String productId);

  @DELETE("products/{id}/skus/{skuId}")
  Call<Void> deleteSKU(
      @Path("id") String productId,
      @Path("skuId") String skuId,
      @QueryMap Map<String, Object> params);

  // SEGMENTS

  @POST("segments")
  Call<SegmentResponse> createSegment(@Body Segment segment);

  @GET("segments/{id}")
  Call<SegmentResponse> getSegment(@Path("id") String id);

  @DELETE("segments/{id}")
  Call<Void> deleteSegment(@Path("id") String id);

  // VALIDATION RULES

  @POST("validation-rules")
  Call<BusinessValidationRule> createValidationRules(
      @Body CreateBusinessValidationRule validationRule);

  @GET("validation-rules/{id}")
  Call<BusinessValidationRule> getValidationRules(@Path("id") String id);

  @GET("validation-rules")
  Call<BusinessValidationRuleList> listValidationRules(@QueryMap Map<String, Object> filter);

  @PUT("validation-rules/{id}")
  Call<BusinessValidationRule> updateValidationRules(
      @Path("id") String id, @Body UpdateBusinessValidationRule validationRule);

  @DELETE("validation-rules/{id}")
  Call<Void> deleteValidationRules(@Path("id") String id);

  @POST("validation-rules/{id}/assignments")
  Call<BusinessValidationRuleAssignment> createValidationRuleAssignment(
      @Path("id") String id, @Body CreateBusinessValidationRuleAssignment assignment);

  @DELETE("validation-rules/{validationRuleId}/assignments/{assignmentId}")
  Call<Void> deleteValidationRuleAssignment(
      @Path("validationRuleId") String validationRuleId, @Path("assignmentId") String assignmentId);

  @GET("validation-rules/{id}/assignments")
  Call<BusinessValidationRuleAssignmentList> listValidationRuleAssignments(
      @Path("id") String id, @QueryMap Map<String, Object> filter);

  // PROMOTIONS

  @POST("campaigns")
  Call<CreatePromotionCampaignResponse> createPromotionCampaign(
      @Body CreatePromotionCampaign createPromotionCampaign);

  @GET("promotions/{id}/tiers")
  Call<ListPromotionTiersResponse> listPromotionTiers(@Path("id") String id);

  @POST("promotions/{id}/tiers")
  Call<TierResponse> addPromotionTier(@Path("id") String id, @Body Tier tier);

  @PUT("promotions/tiers/{id}")
  Call<TierResponse> updatePromotionTier(@Path("id") String id, @Body Tier tier);

  @DELETE("promotions/tiers/{id}")
  Call<Void> deletePromotionTier(@Path("id") String id);

  @GET("/promotions/tiers")
  Call<ListPromotionTiersResponse> listPromotionTiers(@QueryMap Map<String, Object> filter);

  // ORDERS
  @POST("orders")
  Call<CreateOrderResponse> createOrder(@Body CreateOrder createOrder);

  @GET("orders/{id}")
  Call<GetOrderResponse> getOrder(@Path("id") String id);

  @PUT("orders/{id}")
  Call<GetOrderResponse> updateOrder(@Path("id") String id, @Body UpdateOrder updateOrder);

  @GET("orders")
  Call<ListOrdersResponse> listOrders(@QueryMap Map<String, Object> filter);

  // EVENTS
  @POST("events")
  Call<CustomEventResponse> createCustomEvent(@Body CustomEvent event);

  // REWARDS
  @GET("rewards")
  Call<ListRewardsResponse> listRewards(@QueryMap Map<String, Object> filter);

  @POST("rewards")
  Call<RewardResponse> createReward(@Body CreateReward createReward);

  @PUT("rewards/{id}")
  Call<RewardResponse> updateReward(@Path("id") String id, @Body UpdateReward updateReward);

  @GET("rewards/{id}")
  Call<RewardResponse> getReward(@Path("id") String id);

  @DELETE("rewards/{id}")
  Call<Void> deleteReward(@Path("id") String id);

  // REWARDS ASSIGNMENTS
  @GET("rewards/{id}/assignments")
  Call<ListRewardAssignmentsResponse> listRewardAssignments(
      @Path("id") String id, @QueryMap Map<String, Object> filter);

  @POST("rewards/{id}/assignments")
  Call<RewardAssignmentResponse> createRewardAssignment(
      @Path("id") String id, @Body CreateRewardAssignment createRewardAssignment);

  @PUT("rewards/{id}/assignments/{assignmentId}")
  Call<RewardAssignmentResponse> updateRewardAssignment(
      @Path("id") String id,
      @Path("assignmentId") String assignmentId,
      @Body UpdateRewardAssignment updateRewardAssignment);

  @DELETE("rewards/{id}/assignments/{assignmentId}")
  Call<Void> deleteRewardAssignment(
      @Path("id") String id, @Path("assignmentId") String assignmentId);

  // LOYALTIES

  @GET("loyalties")
  Call<CampaignsResponse> listLoyaltyCampaigns(@QueryMap Map<String, Object> filter);

  @POST("loyalties")
  Call<CampaignResponse> createLoyaltyCampaign(@Body CreateCampaign createCampaign);

  @PUT("loyalties/{id}")
  Call<CampaignResponse> updateLoyaltyCampaign(
      @Path("id") String id, @Body UpdateCampaign updateCampaign);

  @GET("loyalties/{id}")
  Call<CampaignResponse> getLoyaltyCampaign(@Path("id") String id);

  @DELETE("loyalties/{id}")
  Call<Void> deleteLoyaltyCampaign(@Path("id") String id, @QueryMap Map<String, Object> params);

  @GET("loyalties/{id}/rewards")
  Call<ListRewardAssignmentsResponse> listLoyaltyRewardAssignments(
      @Path("id") String id, @QueryMap Map<String, Object> filter);

  @POST("loyalties/{id}/rewards")
  Call<RewardAssignmentResponse> createLoyaltyRewardAssignment(
      @Path("id") String id, @Body List<CreateRewardAssignment> createRewardAssignment);

  @PUT("loyalties/{id}/assignments/{assignmentId}")
  Call<RewardAssignmentResponse> updateLoyaltyRewardAssignment(
      @Path("id") String id,
      @Path("assignmentId") String assignmentId,
      @Body UpdateRewardAssignment updateRewardAssignment);

  @DELETE("loyalties/{id}/rewards/{assignmentId}")
  Call<Void> deleteLoyaltyRewardAssignment(
      @Path("id") String id, @Path("assignmentId") String assignmentId);

  @GET("loyalties/{id}/earning-rules")
  Call<ListEarningRulesResponse> listLoyaltyEarningRules(
      @Path("id") String id, @QueryMap Map<String, Object> filter);

  @POST("loyalties/{id}/earning-rules")
  Call<EarningRuleResponse> createLoyaltyEarningRule(
      @Path("id") String id, @Body List<CreateEarningRule> create);

  @PUT("loyalties/{id}/earning-rules/{ruleId}")
  Call<EarningRuleResponse> updateLoyaltyEarningRule(
      @Path("id") String id, @Path("ruleId") String ruleId, @Body UpdateEarningRule update);

  @DELETE("loyalties/{id}/earning-rules/{ruleId}")
  Call<Void> deleteLoyaltyEarningRule(@Path("id") String id, @Path("ruleId") String ruleId);

  @GET("loyalties/{id}/members")
  Call<VouchersResponse> listLoyaltyMembers(
      @Path("id") String id, @QueryMap Map<String, Object> filter);

  @POST("loyalties/{id}/members")
  Call<VoucherResponse> addLoyaltyMember(@Path("id") String id, @Body AddMember addMember);

  @GET("loyalties/{id}/members/{memberId}")
  Call<VoucherResponse> getLoyaltyMember(@Path("id") String id, @Path("memberId") String memberId);

  @GET("loyalties/members/{memberId}")
  Call<VoucherResponse> getLoyaltyMember(@Path("memberId") String memberId);

  @POST("loyalties/{id}/members/{memberId}/balance")
  Call<io.voucherify.client.model.loyalties.response.AddBalanceResponse> addLoyaltyBalance(
      @Path("id") String id,
      @Path("memberId") String memberId,
      @Body io.voucherify.client.model.loyalties.AddBalance addBalance);

  @POST("loyalties/members/{memberId}/balance")
  Call<io.voucherify.client.model.loyalties.response.AddBalanceResponse> addLoyaltyBalance(
      @Path("memberId") String memberId,
      @Body io.voucherify.client.model.loyalties.AddBalance addBalance);

  @POST("loyalties/{id}/members/{memberId}/redemption")
  Call<RedeemVoucherResponse> redeemLoyaltyReward(
      @Path("id") String id, @Path("memberId") String memberId, @Body RedeemReward redeemReward);

  @GET("loyalties/members/{memberId}/tiers")
  Call<MembersLoyaltyTierResponse> getMembersLoyaltyTier(
          @Path("memberId") String memberId);

  // CONSENTS

  @GET("consents")
  Call<ListConsentsResponse> listConsents();
}
