package pl.rspective.voucherify.client.api;

import com.squareup.okhttp.Response;

import java.util.List;

import pl.rspective.voucherify.client.model.*;
import pl.rspective.voucherify.client.model.Customer;
import pl.rspective.voucherify.client.model.RedemptionsFilter;
import pl.rspective.voucherify.client.model.RedemptionsList;
import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherRedemption;
import pl.rspective.voucherify.client.model.campaign.AddVoucherToCampaign;
import pl.rspective.voucherify.client.model.campaign.AddVoucherToCampaignResult;
import pl.rspective.voucherify.client.model.campaign.CreateCampaign;
import pl.rspective.voucherify.client.model.campaign.CreateCampaignResult;
import pl.rspective.voucherify.client.model.customer.*;
import pl.rspective.voucherify.client.model.publish.PublishVoucher;
import pl.rspective.voucherify.client.model.redemption.*;
import pl.rspective.voucherify.client.model.redemption.RedemptionEntry;
import pl.rspective.voucherify.client.model.voucher.*;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 * An interface used internally to create a Retrofit API.
 */
public interface VoucherifyApi {

  /**
   * List vouchers which meet provided filters.
   *
   * @param filter a set of conditions to narrow down the result
   * @return a list of user vouchers
   */
  @GET("/vouchers/")
  List<Voucher> listVouchers(@QueryMap VouchersFilter filter);

  /**
   * Fetch details for a specific voucher.
   *
   * @param code code of the voucher
   * @return details of a the voucher identified by given code
   */
  @GET("/vouchers/{code}")
  Voucher fetch(@Path("code") String code);

  /**
   * Create a voucher with generated code.
   *
   * @param voucher voucher to be created
   * @return created voucher
   */
  @POST("/vouchers/")
  Voucher createVoucher(@Body Voucher voucher);

  /**
   * Create a voucher with specified code.
   *
   * @param voucher voucher to be created
   * @return created voucher
   */
  @POST("/vouchers/{code}")
  Voucher createVoucherWithCode(@Path("code") String code, @Body Voucher voucher);

  /**
   * Update voucher.
   *
   * @param voucherUpdate voucher fields to be updated
   * @return updated voucher
   */
  @PUT("/vouchers/{code}")
  Voucher updateVoucher(@Path("code") String code, @Body VoucherUpdate voucherUpdate);

  /**
   * Disable a voucher.
   *
   * @param code code of a voucher that should be disabled
   */
  @POST("/vouchers/{code}/disable")
  Response disableVoucher(@Path("code") String code);

  /**
   * Enable a voucher.
   *
   * @param code code of a voucher that should be enabled
   */
  @POST("/vouchers/{code}/enable")
  Response enableVoucher(@Path("code") String code);

  /**
   * @param code       code of the voucher
   * @param trackingId an id enabling you to correlate who has redeemed the voucher
   * @deprecated use {@link VoucherifyApi#redeem(String, RedeemVoucher)} instead
   * Method used to redeem a voucher identified by code
   */
  @POST("/vouchers/{code}/redemption")
  VoucherRedemptionResult redeem(@Path("code") String code, @Query("tracking_id") String trackingId);

  /**
   * @param code              code of the voucher
   * @param redemptionContext a context in terms of which the voucher is being redeemed (e.g. customer profile)
   * @return redemption result (including redemption id)
   * Method used to redeem a voucher and provide a context information.
   * @deprecated use {@link VoucherifyApi#redeem(String, RedeemVoucher)} instead
   */
  @POST("/vouchers/{code}/redemption")
  VoucherRedemptionResult redeem(@Path("code") String code, @Body VoucherRedemptionContext redemptionContext);

  /**
   * Fetch information about voucher redemption details
   *
   * @param code of the voucher
   * @return voucher redemption information
   * @deprecated User {@link VoucherifyApi#getVoucherRedemptions(String)}} instead
   */
  @Deprecated
  @GET("/vouchers/{code}/redemption")
  VoucherRedemption redemption(@Path("code") String code);

  /**
   * Publish voucher.
   *
   * @param publishParams voucher code or campaign name with publish details
   * @return published voucher
   * @deprecated Use {@link VoucherifyApi#publishVoucher(PublishVoucher)} instead
   */
  @POST("/vouchers/publish")
  @Deprecated
  Voucher publishVoucher(@Body PublishParams publishParams);

  /**
   * Validates given voucher code against the customer.
   *
   * @param code            code of the voucher
   * @param validityContext a context in terms of which the voucher is being validated (e.g. customer profile)
   * @return voucher validity information
   */
  @POST("/vouchers/{code}/validate")
  VoucherValidationResult validateVoucher(@Path("code") String code, @Body VoucherValidationContext validityContext);

  /**
   * List redemption across all vouchers.
   *
   * @param filter a set of conditions to narrow down the result
   * @return a list of redemption details
   * @deprecated Use {@link VoucherifyApi#listRedemptions(pl.rspective.voucherify.client.model.redemption.RedemptionsFilter)} instead
   */
  @GET("/redemption")
  @Deprecated
  RedemptionsList listRedemptions(@QueryMap RedemptionsFilter filter);

  /**
   * Redemption rollback reverts a redemption.
   *
   * @param redemptionId (required)
   *                     id of a redemption
   * @param trackingId   (optional)
   *                     id of a customer
   * @param reason       (optional)
   * @return rollback result (including rollback id, original redemption id, voucher after rollback)
   */
  @POST("/redemption/{id}/rollback")
  @Deprecated
  VoucherRedemptionResult rollbackRedemption(@Path("id") String redemptionId, @Query("tracking_id") String trackingId, @Query("reason") String reason);

  /**
   * Create a customer using given Customer
   *
   * @param customer (required)
   * @return created User
   * @deprecated
   */
  @POST("/customers")
  Customer createCustomer(@Body Customer customer);

  /**
   * Get a Customer using Customer ID
   *
   * @param customerId (required)
   * @return customer with given ID
   * @deprecated
   */
  @GET("/customers/{id}")
  Customer getCustomer(@Path("id") String customerId);

  /**
   * Update a Customer by ID, using given Customer object
   *
   * @param customerId (required)
   * @param customer   (optional)
   * @return Updated Customer with given ID
   * @deprecated
   */
  @PUT("/customers/{id}")
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
  pl.rspective.voucherify.client.model.redemption.RedemptionsList listRedemptions(@QueryMap pl.rspective.voucherify.client.model.redemption.RedemptionsFilter redemptionsFilter);

  @GET("/vouchers/{code}/redemption")
  VoucherRedemptionsResult getVoucherRedemptions(@Path("code") String code);

  @POST("/redemption/{id}/rollback")
  RollbackRedemptionResult rollbackRedemption(@Path("id") String redemptionId, @Query("reason") String reason, @Body RollbackRedemption rollbackRedemption);

  @GET("/redemption/{id}")
  RedemptionEntry getRedemption(@Path("id") String redemptionId);

  // DISTRIBUTIONS

  @POST("/vouchers/publish")
  pl.rspective.voucherify.client.model.voucher.Voucher publishVoucher(@Body PublishVoucher publishVoucher);
}
