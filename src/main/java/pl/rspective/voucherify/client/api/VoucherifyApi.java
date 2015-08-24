package pl.rspective.voucherify.client.api;

import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherUsage;

import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 *  An interface used internally to create a Retrofit API.
 */
public interface VoucherifyApi {

    /**
     * Fetch details for specific voucher
     * @param code of the voucher
     * @return voucher based on his code
     */
    @GET("/vouchers/{code}")
    Voucher fetch(@Path("code") String code);

    /**
     * Method used to consume the voucher based on his code
     * @param code of the voucher
     * @return
     */
    @POST("/vouchers/{code}/usage")
    Voucher use(@Path("code") String code, @Query("tracking_id") String trackingId);

    /**
     * Fetch information about voucher usage details
     * @param code of the voucher
     * @return voucher usage information
     */
    @GET("/vouchers/{code}/usage")
    VoucherUsage usage(@Path("code") String code);

}
