package pl.rspective.voucherify.client.model;

import java.util.List;

/**
 * Represents voucher redemption
 */
public class VoucherRedemption {

	/**
	 * Value of voucher's quantity
	 */
	private int quantity;

	/**
	 * Value of redeemed voucher's quantity
	 */
	private int redeemedQuantity;

	/**
	 *
	 */
	private List<RedemptionEntry> redemptionEntries;

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