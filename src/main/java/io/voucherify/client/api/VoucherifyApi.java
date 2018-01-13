package io.voucherify.client.api;

import io.voucherify.client.model.campaign.AddVoucherToCampaign;
import io.voucherify.client.model.campaign.CampaignImportVouchers;
import io.voucherify.client.model.campaign.CreateCampaign;
import io.voucherify.client.model.campaign.UpdateCampaign;
import io.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignResponse;
import io.voucherify.client.model.campaign.response.CampaignsResponse;
import io.voucherify.client.model.customer.Customer;
import io.voucherify.client.model.customer.response.CustomerResponse;
import io.voucherify.client.model.customer.response.CustomersResponse;
import io.voucherify.client.model.distribution.CreateExport;
import io.voucherify.client.model.distribution.PublishVoucher;
import io.voucherify.client.model.distribution.response.ExportResponse;
import io.voucherify.client.model.distribution.response.ListPublicationsResponse;
import io.voucherify.client.model.distribution.response.PublishVoucherResponse;
import io.voucherify.client.model.product.Product;
import io.voucherify.client.model.product.SKU;
import io.voucherify.client.model.product.response.ProductResponse;
import io.voucherify.client.model.product.response.ProductsResponse;
import io.voucherify.client.model.product.response.SKUResponse;
import io.voucherify.client.model.product.response.SKUsResponse;
import io.voucherify.client.model.promotion.CreatePromotionCampaign;
import io.voucherify.client.model.promotion.Tier;
import io.voucherify.client.model.promotion.reponse.CreatePromotionCampaignResponse;
import io.voucherify.client.model.promotion.reponse.ListPromotionTiersResponse;
import io.voucherify.client.model.promotion.reponse.TierResponse;
import io.voucherify.client.model.redemption.RedeemPromotion;
import io.voucherify.client.model.redemption.RedeemVoucher;
import io.voucherify.client.model.redemption.RollbackRedemption;
import io.voucherify.client.model.redemption.response.RedeemPromotionResponse;
import io.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import io.voucherify.client.model.redemption.response.RedemptionEntryResponse;
import io.voucherify.client.model.redemption.response.RedemptionsResponse;
import io.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import io.voucherify.client.model.redemption.response.VoucherRedemptionsResponse;
import io.voucherify.client.model.segment.Segment;
import io.voucherify.client.model.segment.response.SegmentResponse;
import io.voucherify.client.model.validation.PromotionValidation;
import io.voucherify.client.model.validation.VoucherValidation;
import io.voucherify.client.model.validation.VoucherValidationResponse;
import io.voucherify.client.model.validation.response.PromotionValidationResponse;
import io.voucherify.client.model.validationRules.ValidationRules;
import io.voucherify.client.model.validationRules.response.ValidationRulesResponse;
import io.voucherify.client.model.voucher.AddBalance;
import io.voucherify.client.model.voucher.CreateVoucher;
import io.voucherify.client.model.voucher.ImportVouchers;
import io.voucherify.client.model.voucher.VoucherUpdate;
import io.voucherify.client.model.voucher.response.AddBalanceResponse;
import io.voucherify.client.model.voucher.response.VoucherResponse;
import io.voucherify.client.model.voucher.response.VouchersResponse;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import java.util.Map;

public interface VoucherifyApi {

  // CAMPAIGNS

  @POST("/campaigns")
  CampaignResponse createCampaign(@Body CreateCampaign createCampaign);

  @POST("/campaigns/{name}/vouchers")
  AddVoucherToCampaignResponse addVoucherToCampaign(@Path("name") String campaignName, @Body AddVoucherToCampaign addVoucherToCampaign);

  @GET("/campaigns/{name}")
  CampaignResponse getCampaign(@Path("name") String campaignName);

  @GET("/campaigns")
  CampaignsResponse listCampaigns(@QueryMap Map<String, Object> filter);

  @PUT("/campaigns/{name}")
  CampaignResponse updateCampaign(@Path("name") String campaignName, @Body UpdateCampaign updateCampaign);

  @POST("/campaigns/{name}/vouchers/{code}")
  AddVoucherToCampaignResponse addVoucherToCampaignWithCode(@Path("name") String campaignName, @Path("code") String voucherCode, @Body AddVoucherToCampaign addVoucherToCampaign);

  @DELETE("/campaigns/{name}")
  Void deleteCampaign(@Path("name") String campaignName, @Query("force") Boolean force);

  @POST("/campaigns/{name}/import")
  Void importVouchersToCampaign(@Path("name") String campaignName, @Body CampaignImportVouchers importVouchers);

  // CUSTOMERS

  @POST("/customers")
  CustomerResponse createCustomer(@Body Customer customer);

  @GET("/customers/{id}")
  CustomerResponse getCustomerById(@Path("id") String customerId);

  @PUT("/customers/{id}")
  CustomerResponse updateCustomer(@Path("id") String customerId, @Body Customer customer);

  @DELETE("/customers/{id}")
  Void deleteCustomer(@Path("id") String customerId);

  @GET("/customers")
  CustomersResponse listCustomers(@QueryMap Map<String, Object> filter);

  // REDEMPTIONS

  @POST("/vouchers/{code}/redemption")
  RedeemVoucherResponse redeem(@Path("code") String code, @Body RedeemVoucher redeemVoucher);

  @POST("/promotions/tiers/{id}/redemption")
  RedeemPromotionResponse redeem(@Path("id") String id, @Body RedeemPromotion redeemPromotion);

  @GET("/redemptions")
  RedemptionsResponse listRedemptions(@QueryMap Map<String, Object> filter);

  @GET("/vouchers/{code}/redemption")
  VoucherRedemptionsResponse getVoucherRedemptions(@Path("code") String code);

  @POST("/redemptions/{id}/rollback")
  RollbackRedemptionResponse rollbackRedemption(@Path("id") String redemptionId, @Query("reason") String reason, @Body RollbackRedemption rollbackRedemption);

  @GET("/redemptions/{id}")
  RedemptionEntryResponse getRedemption(@Path("id") String redemptionId);

  // DISTRIBUTIONS

  @POST("/vouchers/publish")
  PublishVoucherResponse publishVoucher(@Body PublishVoucher publishVoucher);

  @POST("/exports")
  ExportResponse createExport(@Body CreateExport createExport);

  @GET("/exports/{id}")
  ExportResponse getExport(@Path("id") String id);

  @DELETE("/exports/{id}")
  Void deleteExport(@Path("id") String id);

  @GET("/publications")
  ListPublicationsResponse list(@QueryMap Map<String, Object> filter);

  // VOUCHERS

  @POST("/vouchers")
  VoucherResponse createVoucher(@Body CreateVoucher createVoucher);

  @POST("/vouchers/{code}")
  VoucherResponse createVoucher(@Path("code") String code, @Body CreateVoucher createVoucher);

  @GET("/vouchers/{code}")
  VoucherResponse getVoucher(@Path("code") String code);

  @PUT("/vouchers/{code}")
  VoucherResponse updateVoucher(@Path("code") String code, @Body VoucherUpdate voucherUpdate);

  @DELETE("/vouchers/{code}")
  Void deleteVoucher(@Path("code") String code, @Query("force") Boolean force);

  @GET("/vouchers")
  VouchersResponse listVouchers(@QueryMap Map<String, Object> filter);

  @POST("/vouchers/{code}/enable")
  VoucherResponse enable(@Path("code") String code);

  @POST("/vouchers/{code}/disable")
  VoucherResponse disable(@Path("code") String code);

  @POST("/vouchers/{code}/balance")
  AddBalanceResponse addBalance(@Path("code") String code, @Body AddBalance addBalance);

  @POST("/vouchers/import")
  Void importVouchers(@Body ImportVouchers vouchers);

  // VALIDATIONS

  @POST("/vouchers/{code}/validate")
  VoucherValidationResponse validateVoucher(@Path("code") String code, @Body VoucherValidation voucherValidation);

  @POST("/promotions/validation")
  PromotionValidationResponse validatePromotion(@Body PromotionValidation promotionValidation);

  // PRODUCTS

  @POST("/products")
  ProductResponse createProduct(@Body Product product);

  @GET("/products/{id}")
  ProductResponse getProduct(@Path("id") String id);

  @PUT("/products/{id}")
  ProductResponse updateProduct(@Path("id") String id, @Body Product product);

  @GET("/products")
  ProductsResponse getProducts(@QueryMap Map<String, Object> filter);

  @DELETE("/products/{id}")
  Void deleteProduct(@Path("id") String id, @QueryMap Map<String, Object> params);

  // SKU

  @POST("/products/{id}/skus")
  SKUResponse createSKU(@Path("id") String productId, @Body SKU sku);

  @GET("/products/{id}/skus/{skuId}")
  SKUResponse getSKU(@Path("id") String productId, @Path("skuId") String skuId);

  @PUT("/products/{id}/skus/{skuId}")
  SKUResponse updateSKU(@Path("id") String productId, @Path("skuId") String skuId, @Body SKU sku);

  @GET("/products/{id}/skus")
  SKUsResponse getSKUs(@Path("id") String productId);

  @DELETE("/products/{id}/skus/{skuId}")
  Void deleteSKU(@Path("id") String productId, @Path("skuId") String skuId, @QueryMap Map<String, Object> params);

  // SEGMENTS

  @POST("/segments")
  SegmentResponse createSegment(@Body Segment segment);

  @GET("/segments/{id}")
  SegmentResponse getSegment(@Path("id") String id);

  @DELETE("/segments/{id}")
  Void deleteSegment(@Path("id") String id);

  // VALIDATION RULES

  @POST("/validation-rules")
  ValidationRulesResponse createValidationRules(@Body ValidationRules validationRules);

  @GET("/validation-rules/{id}")
  ValidationRulesResponse getValidationRules(@Path("id") String id);

  @PUT("/validation-rules/{id}")
  ValidationRulesResponse updateValidationRules(@Path("id") String id, @Body ValidationRules validationRules);

  @DELETE("/validation-rules/{id}")
  Void deleteValidationRules(@Path("id") String id);

  // PROMOTIONS

  @POST("/campaigns")
  CreatePromotionCampaignResponse createPromotionCampaign(@Body CreatePromotionCampaign createPromotionCampaign);

  @GET("/promotions/{id}/tiers")
  ListPromotionTiersResponse listPromotionTiers(@Path("id") String id);

  @POST("/promotions/{id}/tiers")
  TierResponse addPromotionTier(@Path("id") String id, @Body Tier tier);

  @PUT("/promotions/tiers/{id}")
  TierResponse updatePromotionTier(@Path("id") String id, @Body Tier tier);

  @DELETE("/promotions/tiers/{id}")
  Void deletePromotionTier(@Path("id") String id);
}
