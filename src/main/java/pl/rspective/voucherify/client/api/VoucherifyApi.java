package pl.rspective.voucherify.client.api;

import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherUsage;

import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.Path;

/**
 *  An interface used internally to create a Retrofit API.
 */
public interface VoucherifyApi {

    /**
     *
     * @param code of the voucher
     * @return voucher based on his code
     */
    @GET("/vouchers/{code}")
    Voucher fetchVoucher(@Path("code") String code);

    /**
     * Method used to consume the voucher based on his code
     * @param code of the voucher
     * @return
     */
    @POST("/vouchers/{code}/usage")
    VoucherUsage useVoucher(@Path("code") String code);

}
