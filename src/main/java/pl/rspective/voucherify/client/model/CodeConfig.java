package pl.rspective.voucherify.client.model;

public class CodeConfig {
    
    public final static char PATTERN_PLACEHOLDER = '#';
    
    public static class Charset {
        public static final String ALPHABETIC   = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String ALPHANUMERIC = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        public static final String NUMBERS      = "0123456789";
    }
    
    private final Integer length;
    private final String charset;
    private final String prefix;
    private final String postfix;
    private final String pattern;

    public CodeConfig(Integer length, String charset, String prefix, String postfix, String pattern) {
        this.length = length;
        this.charset = charset;
        this.prefix = prefix;
        this.postfix = postfix;
        this.pattern = pattern;        
    }
    
    public static CodeConfig length(int length) {
        return new CodeConfig(length, null, null, null, null);
    }
    
    public static CodeConfig pattern(String pattern) {
        return new CodeConfig(null, null, null, null, pattern);
    }

    public Integer getLength() {
        return length;
    }

    public String getCharset() {
        return charset;
    }
    
    public CodeConfig withCharset(String charset) {
        return new CodeConfig(length, charset, prefix, postfix, pattern);
    }

    public String getPrefix() {
        return prefix;
    }
    
    public CodeConfig withPrefix(String prefix) {
        return new CodeConfig(length, charset, prefix, postfix, pattern);
    }

    public String getPostfix() {
        return postfix;
    }
    
    public CodeConfig withPostfix(String postfix) {
        return new CodeConfig(length, charset, prefix, postfix, pattern);
    }

    public String getPattern() {
        return pattern;
    }

}
