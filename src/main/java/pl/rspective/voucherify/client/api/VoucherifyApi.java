package pl.rspective.voucherify.client.api;

import java.util.List;

import pl.rspective.voucherify.client.model.*;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
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
     * @return
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
     * List redemptions across all vouchers.
     * 
     * @param filter 
     *          a set of conditions to narrow down the result
     *           
     * @return a list of redemption details
     */
    @GET("/redemptions")
    List<RedemptionDetails> listRedemptions(@QueryMap RedemptionsFilter filter);

}
