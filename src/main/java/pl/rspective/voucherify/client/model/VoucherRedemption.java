package pl.rspective.voucherify.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Represents voucher redemption
 */
public class VoucherRedemption {

	/**
	 *  An identifier for redemption details
	 */
	private String id;

	/**
	 * Value of voucher's quantity
	 */
	private int quantity;

	/**
	 * Value of redeemed voucher's quantity
	 */
	@SerializedName("redeemed_quantity")
	private int redeemedQuantity;

	/**
	 *
	 */
	@SerializedName("redemption_entries")
	private List<RedemptionEntry> redemptionEntries;

	/**
	 *
	 * @return
	 */
	public String getId() {
		return id;
	}

	/**
	 *
	 * @return
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 *
	 * @return
	 */
	public int getRedeemedQuantity() {
		return redeemedQuantity;
	}

	/**
	 *
	 * @return
	 */
	public List<RedemptionEntry> getRedemptionEntries() {
		return redemptionEntries;
	}
}