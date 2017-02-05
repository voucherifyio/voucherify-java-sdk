package pl.rspective.voucherify.client.api;

import com.squareup.okhttp.Response;

import java.util.List;

import pl.rspective.voucherify.client.model.*;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;
import retrofit.http.Query;
import retrofit.http.QueryMap;

/**
 *  An interface used internally to create a Retrofit API.
 */
public interface VoucherifyApi {

    /**
     * List vouchers which meet provided filters.
     *
     * @param filter
     *          a set of conditions to narrow down the result
     *
     * @return a list of user vouchers
     */
    @GET("/vouchers/")
    List<Voucher> listVouchers(@QueryMap VouchersFilter filter);

    /**
     * Fetch details for a specific voucher.
     * @param code 
     *          code of the voucher
     * @return details of a the voucher identified by given code
     */
    @GET("/vouchers/{code}")
    Voucher fetch(@Path("code") String code);
    
    /**
     * Create a voucher with generated code.
     * 
     * @param voucher
     *          voucher to be created
     *          
     * @return created voucher 
     */
    @POST("/vouchers/")
    Voucher createVoucher(@Body Voucher voucher);
    
    /**
     * Create a voucher with specified code.
     * 
     * @param voucher
     *          voucher to be created
     *          
     * @return created voucher 
     */
    @POST("/vouchers/{code}")
    Voucher createVoucherWithCode(@Path("code") String code, @Body Voucher voucher);
    
    /**
     * Update voucher.
     * 
     * @param voucherUpdate
     *          voucher fields to be updated
     *          
     * @return updated voucher 
     */
    @PUT("/vouchers/{code}")
    Voucher updateVoucher(@Path("code") String code, @Body VoucherUpdate voucherUpdate);
    
    /**
     * Disable a voucher.
     * 
     * @param code
     *          code of a voucher that should be disabled
     */
    @POST("/vouchers/{code}/disable")
    Response disableVoucher(@Path("code") String code);
    
    /**
     * Enable a voucher.
     * 
     * @param code
     *          code of a voucher that should be enabled
     */
    @POST("/vouchers/{code}/enable")
    Response enableVoucher(@Path("code") String code);

    /**
     * Method used to redeem a voucher identified by code
     * @param code 
     *          code of the voucher
     * @param trackingId 
     *          an id enabling you to correlate who has redeemed the voucher
     * @return
     */
    @POST("/vouchers/{code}/redemption")
    VoucherRedemptionResult redeem(@Path("code") String code, @Query("tracking_id") String trackingId);
    
    /**
     * Method used to redeem a voucher and provide a context information.
     * 
     * @param code
     *          code of the voucher
     * @param redemptionContext
     *          a context in terms of which the voucher is being redeemed (e.g. customer profile)
     * @return redemption result (including redemption id)
     */
    @POST("/vouchers/{code}/redemption")
    VoucherRedemptionResult redeem(@Path("code") String code, @Body VoucherRedemptionContext redemptionContext);

    /**
     * Fetch information about voucher redemption details
     * @param code of the voucher
     * @return voucher redemption information
     */
    @GET("/vouchers/{code}/redemption")
    VoucherRedemption redemption(@Path("code") String code);

    /**
     * Validates given voucher code against the customer.
     *
     * @param code
     *          code of the voucher
     * @param validityContext
     *          a context in terms of which the voucher is being validated (e.g. customer profile)
     *
     * @return voucher validity information
     */
     @POST("/vouchers/{code}/validate")
     VoucherValidationResult validateVoucher(@Path("code") String code, @Body VoucherValidationContext validityContext);
    
    /**
     * List redemptions across all vouchers.
     * 
     * @param filter 
     *          a set of conditions to narrow down the result
     *           
     * @return a list of redemption details
     */
    @GET("/redemptions")
    RedemptionsList listRedemptions(@QueryMap RedemptionsFilter filter);

    /**
     * Redemption rollback reverts a redemption. 
     * 
     * @param redemptionId (required)
     *          id of a redemption
     * @param trackingId (optional)
     *          id of a customer
     * @param reason (optional)
     *           
     * @return rollback result (including rollback id, original redemption id, voucher after rollback)
     */
    @POST("/redemptions/{id}/rollback")
    VoucherRedemptionResult rollbackRedemption(@Path("id") String redemptionId, @Query("tracking_id") String trackingId, @Query("reason") String reason);

    /**
     * Create a customer using given Customer
     *
     * @param customer (required)
     *
     * @return created User
     */
    @POST("/customers")
    Customer createCustomer(@Body Customer customer);

    /**
     * Get a Customer using Customer ID
     *
     * @param customerId (required)
     *
     * @return customer with given ID
     */
    @GET("/customers/{id}")
    Customer getCustomer(@Path("id") String customerId);

    /**
     * Update a Customer by ID, using given Customer object
     *
     * @param customerId (required)
     * @param customer (optional)
     *
     * @return Updated Customer with given ID
     */
    @PUT("/customers/{id}")
    Customer updateCustomer(@Path("id") String customerId, @Body Customer customer);

    /**
     * Delete a Customer by ID
     *
     * @param customerId (required)
     *
     * @return Response without data
     */
    @DELETE("/customers/{id}")
    Response deleteCustomer(@Path("id") String customerId);

    // DISTRIBUTIONS
    /**
     * Publish voucher.
     *
     * @param publishParams
     *          voucher code or campaign name with publish details
     *
     * @return published voucher
     */
    @POST("/vouchers/publish")
    Voucher publishVoucher(@Body PublishParams publishParams);
}
