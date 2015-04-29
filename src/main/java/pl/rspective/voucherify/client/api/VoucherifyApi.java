package pl.rspective.voucherify.client.api;

import pl.rspective.voucherify.client.model.Voucher;
import pl.rspective.voucherify.client.model.VoucherUsage;

import java.util.List;

import retrofit.http.GET;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 *  An interface used internally to create a Retrofit API.
 */
public interface VoucherifyApi {

    /**
     * Method used to download all vouchers
     * @return list of vouchers
     */
    @GET("/vouchers")
    List<Voucher> fetchAllVouchers();

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
    @PUT("/vouchers/{code}/usage")
    VoucherUsage useVoucher(@Path("code") String code);

}
