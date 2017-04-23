package pl.rspective.voucherify.client.api;

import com.squareup.okhttp.Response;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.model.PublishParams;
import pl.rspective.voucherify.client.model.RedemptionsFilter;
import pl.rspective.voucherify.client.model.RedemptionsList;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherRedemption;
import pl.rspective.voucherify.client.model.VoucherRedemptionContext;
import pl.rspective.voucherify.client.model.VoucherRedemptionResult;
import pl.rspective.voucherify.client.model.VoucherUpdate;
import pl.rspective.voucherify.client.model.VoucherValidationContext;
import pl.rspective.voucherify.client.model.VoucherValidationResult;
import pl.rspective.voucherify.client.model.VouchersFilter;
import pl.rspective.voucherify.client.model.campaign.AddVoucherToCampaign;
import pl.rspective.voucherify.client.model.campaign.AddVoucherToCampaignResult;
import pl.rspective.voucherify.client.model.campaign.CreateCampaign;
import pl.rspective.voucherify.client.model.campaign.CreateCampaignResult;
import pl.rspective.voucherify.client.model.publish.PublishVoucher;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucher;
import pl.rspective.voucherify.client.model.redemption.RedeemVoucherResult;
import pl.rspective.voucherify.client.model.redemption.RedemptionEntry;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemption;
import pl.rspective.voucherify.client.model.redemption.RollbackRedemptionResult;
import pl.rspective.voucherify.client.model.redemption.VoucherRedemptionsResult;
import pl.rspective.voucherify.client.model.voucher.CreateVoucher;
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

  /**
   * @deprecated Use {@link VoucherifyApi#listVouchers(Map)} instead
   */
  @Deprecated
  @GET("/vouchers/")
  List<Voucher> listVouchers(@QueryMap VouchersFilter filter);

  /**
   * @deprecated Use {@link VoucherifyApi#getVoucher(String)} instead
   */
  @Deprecated
  @GET("/vouchers/{code}")
  Voucher fetch(@Path("code") String code);

  /**
   * @deprecated Use {@link VoucherifyApi#createVoucher(CreateVoucher)} instead
   */
  @POST("/vouchers/")
  @Deprecated
  Voucher createVoucher(@Body Voucher voucher);

  /**
   * @deprecated Use {@link VoucherifyApi#createVoucher(String, CreateVoucher)} instead
   */
  @POST("/vouchers/{code}")
  @Deprecated
  Voucher createVoucherWithCode(@Path("code") String code, @Body Voucher voucher);

  /**
   * @deprecated Use {@link VoucherifyApi#updateVoucher(String, pl.rspective.voucherify.client.model.voucher.VoucherUpdate)} instead
   */
  @PUT("/vouchers/{code}")
  @Deprecated
  Voucher updateVoucher(@Path("code") String code, @Body VoucherUpdate voucherUpdate);

  /**
   * @deprecated Use {@link VoucherifyApi#disable(String)} instead
   */
  @Deprecated
  @POST("/vouchers/{code}/disable")
  Response disableVoucher(@Path("code") String code);

  /**
   * @deprecated Use {@link VoucherifyApi#enable(String)} instead
   */
  @POST("/vouchers/{code}/enable")
  @Deprecated
  Response enableVoucher(@Path("code") String code);

  /**
   * @deprecated use {@link VoucherifyApi#redeem(String, RedeemVoucher)} instead
   */
  @POST("/vouchers/{code}/redemption")
  @Deprecated
  VoucherRedemptionResult redeem(@Path("code") String code, @Query("tracking_id") String trackingId);

  /**
   * @deprecated use {@link VoucherifyApi#redeem(String, RedeemVoucher)} instead
   */
  @Deprecated
  @POST("/vouchers/{code}/redemption")
  VoucherRedemptionResult redeem(@Path("code") String code, @Body VoucherRedemptionContext redemptionContext);

  /**
   * @deprecated User {@link VoucherifyApi#getVoucherRedemptions(String)}} instead
   */
  @Deprecated
  @GET("/vouchers/{code}/redemption")
  VoucherRedemption redemption(@Path("code") String code);

  /**
   * @deprecated Use {@link VoucherifyApi#publishVoucher(PublishVoucher)} instead
   */
  @POST("/vouchers/publish")
  @Deprecated
  Voucher publishVoucher(@Body PublishParams publishParams);

  /**
   * @deprecated Use {@link VoucherifyApi#listRedemptions(Map)} instead
   */
  @GET("/redemption")
  @Deprecated
  RedemptionsList listRedemptions(@QueryMap RedemptionsFilter filter);

  /**
   * @deprecated Use {@link VoucherifyApi#rollbackRedemption(String, String, RollbackRedemption)} instead
   */
  @POST("/redemption/{id}/rollback")
  @Deprecated
  VoucherRedemptionResult rollbackRedemption(@Path("id") String redemptionId, @Query("tracking_id") String trackingId, @Query("reason") String reason);

  /**
   * @deprecated Use {@link VoucherifyApi#createCustomer(pl.rspective.voucherify.client.model.customer.Customer)} instead
   */
  @POST("/customers")
  @Deprecated
  Customer createCustomer(@Body Customer customer);

  /**
   * @deprecated Use {@link VoucherifyApi#getCustomerById(String)} instead
   */
  @GET("/customers/{id}")
  @Deprecated
  Customer getCustomer(@Path("id") String customerId);

  /**
   * @deprecated Use {@link VoucherifyApi#updateCustomer(String, pl.rspective.voucherify.client.model.customer.Customer)} instead
   */
  @PUT("/customers/{id}")
  @Deprecated
  Customer updateCustomer(@Path("id") String customerId, @Body Customer customer);

  // CAMPAIGNS

  @POST("/campaigns")
  CreateCampaignResult createCampaign(@Body CreateCampaign createCampaign);

  @POST("/campaigns/{name}/vouchers")
  AddVoucherToCampaignResult addVoucherToCampaign(@Path("name") String campaignName, @Body AddVoucherToCampaign addVoucherToCampaign);

  @POST("/campaigns/{name}/vouchers/{code}")
  AddVoucherToCampaignResult addVoucherToCampaignWithCode(@Path("name") String campaignName, @Path("code") String voucherCode, @Body AddVoucherToCampaign addVoucherToCampaign);

  @DELETE("/campaigns/{name}")
  void deleteCampaign(@Path("name") String campaignName, @Query("force") Boolean force);

  // CUSTOMERS

  @POST("/customers")
  pl.rspective.voucherify.client.model.customer.Customer createCustomer(@Body pl.rspective.voucherify.client.model.customer.Customer customer);

  @GET("/customers/{id}")
  pl.rspective.voucherify.client.model.customer.Customer getCustomerById(@Path("id") String customerId);

  @PUT("/customers/{id}")
  pl.rspective.voucherify.client.model.customer.Customer updateCustomer(@Path("id") String customerId, @Body pl.rspective.voucherify.client.model.customer.Customer customer);

  @DELETE("/customers/{id}")
  Response deleteCustomer(@Path("id") String customerId);

  // REDEMPTIONS

  @POST("/vouchers/{code}/redemption")
  RedeemVoucherResult redeem(@Path("code") String code, @Body RedeemVoucher redeemVoucher);

  @GET("/redemptions")
  pl.rspective.voucherify.client.model.redemption.RedemptionsList listRedemptions(@QueryMap Map<String, Object> redemptionsFilter);

  @GET("/vouchers/{code}/redemption")
  VoucherRedemptionsResult getVoucherRedemptions(@Path("code") String code);

  @POST("/redemption/{id}/rollback")
  RollbackRedemptionResult rollbackRedemption(@Path("id") String redemptionId, @Query("reason") String reason, @Body RollbackRedemption rollbackRedemption);

  @GET("/redemption/{id}")
  RedemptionEntry getRedemption(@Path("id") String redemptionId);

  // DISTRIBUTIONS

  @POST("/vouchers/publish")
  pl.rspective.voucherify.client.model.voucher.Voucher publishVoucher(@Body PublishVoucher publishVoucher);

  // VOUCHERS

  @POST("/vouchers")
  pl.rspective.voucherify.client.model.voucher.Voucher createVoucher(@Body CreateVoucher createVoucher);

  @POST("/vouchers/{code}")
  pl.rspective.voucherify.client.model.voucher.Voucher createVoucher(@Path("code") String code, @Body CreateVoucher createVoucher);

  @GET("/vouchers/{code}")
  pl.rspective.voucherify.client.model.voucher.Voucher getVoucher(@Path("code") String code);

  @PUT("/vouchers/{code}")
  pl.rspective.voucherify.client.model.voucher.Voucher updateVoucher(@Path("code") String code, @Body pl.rspective.voucherify.client.model.voucher.VoucherUpdate voucherUpdate);

  @DELETE("/vouchers/{code}")
  void deleteVoucher(@Path("code") String code, @Query("force") Boolean force);

  @GET("/vouchers")
  List<pl.rspective.voucherify.client.model.voucher.Voucher> listVouchers(@QueryMap Map<String, Object> filter);

  @POST("/vouchers/{code}/enable")
  pl.rspective.voucherify.client.model.voucher.Voucher enable(@Path("code") String code);

  @POST("/vouchers/{code}/disable")
  pl.rspective.voucherify.client.model.voucher.Voucher disable(@Path("code") String code);

  // VALIDATIONS

  @POST("/vouchers/{code}/validate")
  VoucherValidationResult validateVoucher(@Path("code") String code, @Body VoucherValidationContext validityContext);
}
