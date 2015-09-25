package pl.rspective.voucherify.client.api;

import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherUsage;
import pl.rspective.voucherify.client.model.VoucherUsageContext;
import retrofit.http.Body;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 *  An interface used internally to create a Retrofit API.
 */
public interface VoucherifyApi {

    /**
     * Fetch details for a specific voucher.
     * @param code 
     *          code of the voucher
     * @return details of a the voucher identified by given code
     */
    @GET("/vouchers/{code}")
    Voucher fetch(@Path("code") String code);

    /**
     * Method used to consume a voucher identified by code
     * @param code 
     *          code of the voucher
     * @param trackingId 
     *          an id enabling you to correlate who has used the voucher
     * @return
     */
    @POST("/vouchers/{code}/usage")
    Voucher use(@Path("code") String code, @Query("tracking_id") String trackingId);
    
    /**
     * Method used to consume a voucher and provide a context information.
     * 
     * @param code
     *          code of the voucher
     * @param usageContext
     *          a context in terms of which the voucher is being used (e.g. customer profile)
     * @return
     */
    @POST("/vouchers/{code}/usage")
    Voucher use(@Path("code") String code, @Body VoucherUsageContext usageContext);

    /**
     * Fetch information about voucher usage details
     * @param code of the voucher
     * @return voucher usage information
     */
    @GET("/vouchers/{code}/usage")
    VoucherUsage usage(@Path("code") String code);

}
