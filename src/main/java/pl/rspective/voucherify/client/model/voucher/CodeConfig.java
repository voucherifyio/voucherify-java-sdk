package pl.rspective.voucherify.client.model.voucher;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
@AllArgsConstructor(access = PRIVATE)
@Getter
@Builder
@ToString
public class CodeConfig {

  public final static char PATTERN_PLACEHOLDER = '#';
  public final static int DEFAULT_LENGTH = 8;

  public static class Charset {
    public static final String ALPHABETIC = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String ALPHANUMERIC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static final String NUMBERS = "0123456789";
  }

  private Integer length;

  private String charset;

  private String prefix;

  private String postfix;

  private String pattern;

}
