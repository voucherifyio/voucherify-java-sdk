

# CodeConfig

Schema containing information about config used for voucher. Defines code's pattern (prefix, suffix, length, charset, etc).

## Properties

| Name | Type | Description |
|------------ | ------------- | ------------- |
|**length** | **BigDecimal** | Number of characters in a generated code (excluding prefix and postfix). |
|**charset** | **String** | Characters that can appear in the code.    Examples:  - Alphanumeric: &#x60;0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Alphabetic: &#x60;abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Alphabetic Lowercase: &#x60;abcdefghijklmnopqrstuvwxyz&#x60;  - Alphabetic Uppercase: &#x60;ABCDEFGHIJKLMNOPQRSTUVWXYZ&#x60;  - Numbers: &#x60;0123456789&#x60;   - Custom: a custom character set |
|**prefix** | **String** | A text appended before the code. |
|**postfix** | **String** | A text appended after the code. |
|**pattern** | **String** | A pattern for codes where hashes (#) will be replaced with random characters. Overrides &#x60;length&#x60;. |
|**initialCount** | **Integer** | The initial count |



