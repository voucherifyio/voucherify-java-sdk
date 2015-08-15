package pl.rspective.voucherify.client.model;

import java.util.List;

/**
 * Represents voucher usage
 */
public class VoucherUsage {

	/**
	 * Value of voucher's quantity
	 */
	private int quantity;

	/**
	 * Value of used voucher's quantity
	 */
	private int usedQuantity;

	/**
	 *
	 */
	private List<UsageEntry> usageEntries;

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
	public int getUsedQuantity() {
		return usedQuantity;
	}

	/**
	 *
	 * @return
	 */
	public List<UsageEntry> getUsageEntries() {
		return usageEntries;
	}
}