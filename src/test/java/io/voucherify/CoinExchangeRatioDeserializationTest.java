package io.voucherify;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.voucherify.client.JSON;
import io.voucherify.client.model.MemberActivityDataRedemptionRewardParametersCoin;
import io.voucherify.client.model.RedeemableLoyaltyCard;
import io.voucherify.client.model.RedemptionRewardResultParametersCoin;
import io.voucherify.client.model.RewardTypeCoin;
import io.voucherify.client.model.RewardsCreateRequestBodyParametersCoin;
import io.voucherify.client.model.RewardsUpdateRequestBodyParametersCoin;
import java.math.BigDecimal;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class CoinExchangeRatioDeserializationTest {

  private static final String COIN_JSON = "{\"exchange_ratio\":0.01,\"points_ratio\":1}";
  private static final BigDecimal EXCHANGE_RATIO = new BigDecimal("0.01");

  @BeforeAll
  static void initGson() {
    new JSON();
  }

  @Test
  void shouldDeserializeCoinExchangeRatioAsDecimal() throws Exception {
    RewardTypeCoin rewardTypeCoin = RewardTypeCoin.fromJson(COIN_JSON);
    RedemptionRewardResultParametersCoin redemptionCoin =
        RedemptionRewardResultParametersCoin.fromJson(COIN_JSON);
    RewardsCreateRequestBodyParametersCoin createCoin =
        RewardsCreateRequestBodyParametersCoin.fromJson(COIN_JSON);
    RewardsUpdateRequestBodyParametersCoin updateCoin =
        RewardsUpdateRequestBodyParametersCoin.fromJson(COIN_JSON);
    MemberActivityDataRedemptionRewardParametersCoin activityCoin =
        MemberActivityDataRedemptionRewardParametersCoin.fromJson(COIN_JSON);
    RedeemableLoyaltyCard loyaltyCard = RedeemableLoyaltyCard.fromJson(COIN_JSON);

    assertEquals(0, EXCHANGE_RATIO.compareTo(rewardTypeCoin.getExchangeRatio()));
    assertEquals(0, EXCHANGE_RATIO.compareTo(redemptionCoin.getExchangeRatio()));
    assertEquals(0, EXCHANGE_RATIO.compareTo(createCoin.getExchangeRatio()));
    assertEquals(0, EXCHANGE_RATIO.compareTo(updateCoin.getExchangeRatio()));
    assertEquals(0, EXCHANGE_RATIO.compareTo(activityCoin.getExchangeRatio()));
    assertEquals(0, EXCHANGE_RATIO.compareTo(loyaltyCard.getExchangeRatio()));
  }
}
