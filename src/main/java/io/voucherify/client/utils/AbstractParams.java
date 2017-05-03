package io.voucherify.client.utils;

import java.util.Map;

public abstract class AbstractParams<K, V> {

    public abstract Map<K, V> asMap();
}
