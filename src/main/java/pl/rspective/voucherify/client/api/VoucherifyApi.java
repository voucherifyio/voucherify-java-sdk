package pl.rspective.voucherify.client.api;

import com.squareup.okhttp.Response;
import pl.rspective.voucherify.client.model.campaign.AddVoucherToCampaign;
import pl.rspective.voucherify.client.model.campaign.CreateCampaign;
import pl.rspective.voucherify.client.model.campaign.response.AddVoucherToCampaignResponse;
import pl.rspective.voucherify.client.model.campaign.response.CreateCampaignResponse;
import pl.rspective.voucherify.client.model.customer.Customer;
import pl.rspective.voucherify.client.model.customer.response.CustomerResponse;
import pl.rspective.voucherify.client.model.product.Product;
import pl.rspective.voucherify.client.model.product.SKU;
import pl.rspective.voucherify.client.model.product.response.ProductResponse;
import pl.rspective.voucherify.client.model.product.response.ProductsResponse;
import pl.rspective.voucherify.client.model.product.response.SKUResponse;
import pl.rspective.voucherify.client.model.product.response.SKUsResponse;
import pl.rspective.voucherify.client.model.publish.PublishVoucher;
import pl.rspective.voucherify.client.model.publish.response.PublishVoucherResponse;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucher;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemption;
import pl.rspective.voucherify.client.model.redemption.response.RedeemVoucherResponse;
import pl.rspective.voucherify.client.model.redemption.response.RedemptionEntryResponse;
import pl.rspective.voucherify.client.model.redemption.response.RedemptionsResponse;
import pl.rspective.voucherify.client.model.redemption.response.RollbackRedemptionResponse;
import pl.rspective.voucherify.client.model.redemption.response.VoucherRedemptionsResponse;
import pl.rspective.voucherify.client.model.segment.Segment;
import pl.rspective.voucherify.client.model.segment.response.SegmentResponse;
import pl.rspective.voucherify.client.model.validation.VoucherValidation;
import pl.rspective.voucherify.client.model.validation.VoucherValidationResponse;
import pl.rspective.voucherify.client.model.validationRules.ValidationRules;
import pl.rspective.voucherify.client.model.validationRules.response.ValidationRulesResponse;
import pl.rspective.voucherify.client.model.voucher.CreateVoucher;
import pl.rspective.voucherify.client.model.voucher.VoucherUpdate;
import pl.rspective.voucherify.client.model.voucher.response.VoucherResponse;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface VoucherifyApi {

  // CAMPAIGNS

  @POST("/campaigns")
  CreateCampaignResponse createCampaign(@Body CreateCampaign createCampaign);

  @POST("/campaigns/{name}/vouchers")
  AddVoucherToCampaignResponse addVoucherToCampaign(@Path("name") String campaignName, @Body AddVoucherToCampaign addVoucherToCampaign);

  @POST("/campaigns/{name}/vouchers/{code}")
  AddVoucherToCampaignResponse addVoucherToCampaignWithCode(@Path("name") String campaignName, @Path("code") String voucherCode, @Body AddVoucherToCampaign addVoucherToCampaign);

  @DELETE("/campaigns/{name}")
  Response deleteCampaign(@Path("name") String campaignName, @Query("force") Boolean force);

  // CUSTOMERS

  @POST("/customers")
  CustomerResponse createCustomer(@Body Customer customer);

  @GET("/customers/{id}")
  CustomerResponse getCustomerById(@Path("id") String customerId);

  @PUT("/customers/{id}")
  CustomerResponse updateCustomer(@Path("id") String customerId, @Body Customer customer);

  @DELETE("/customers/{id}")
  Response deleteCustomer(@Path("id") String customerId);

  // REDEMPTIONS

  @POST("/vouchers/{code}/redemption")
  RedeemVoucherResponse redeem(@Path("code") String code, @Body RedeemVoucher redeemVoucher);

  @GET("/redemptions")
  RedemptionsResponse listRedemptions(@QueryMap Map<String, Object> redemptionsFilter);

  @GET("/vouchers/{code}/redemption")
  VoucherRedemptionsResponse getVoucherRedemptions(@Path("code") String code);

  @POST("/redemption/{id}/rollback")
  RollbackRedemptionResponse rollbackRedemption(@Path("id") String redemptionId, @Query("reason") String reason, @Body RollbackRedemption rollbackRedemption);

  @GET("/redemption/{id}")
  RedemptionEntryResponse getRedemption(@Path("id") String redemptionId);

  // DISTRIBUTIONS

  @POST("/vouchers/publish")
  PublishVoucherResponse publishVoucher(@Body PublishVoucher publishVoucher);

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
  Response deleteVoucher(@Path("code") String code, @Query("force") Boolean force);

  @GET("/vouchers")
  List<VoucherResponse> listVouchers(@QueryMap Map<String, Object> filter);

  @POST("/vouchers/{code}/enable")
  VoucherResponse enable(@Path("code") String code);

  @POST("/vouchers/{code}/disable")
  VoucherResponse disable(@Path("code") String code);

  // VALIDATIONS

  @POST("/vouchers/{code}/validate")
  VoucherValidationResponse validateVoucher(@Path("code") String code, @Body VoucherValidation voucherValidation);

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
  Response deleteProduct(@Path("id") String id, @QueryMap Map<String, Object> params);

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
  Response deleteSKU(@Path("id") String productId, @Path("skuId") String skuId, @QueryMap Map<String, Object> params);

  // SEGMENTS

  @POST("/segments")
  SegmentResponse createSegment(@Body Segment segment);

  @GET("/segments/{id}")
  SegmentResponse getSegment(@Path("id") String id);

  @DELETE("/segments/{id}")
  Response deleteSegment(@Path("id") String id);

  // VALIDATION RULES

  @POST("/validation-rules")
  ValidationRulesResponse createValidationRules(@Body ValidationRules validationRules);

  @GET("/validation-rules/{id}")
  ValidationRulesResponse getValidationRules(@Path("id") String id);

  @PUT("/validation-rules/{id}")
  ValidationRulesResponse updateValidationRules(@Path("id") String id, @Body ValidationRules validationRules);

  @DELETE("/validation-rules/{id}")
  Response deleteValidationRules(@Path("id") String id);
}
