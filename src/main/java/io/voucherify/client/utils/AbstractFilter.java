package io.voucherify.client.utils;

import java.util.Map;
import java.util.Objects;

public abstract class AbstractFilter<K, V> {

  public Map<K, V> asMap() {
    return removeNulls(getMap());
  }

  protected Map<K, V> removeNulls(Map<K, V> map) {
    map.values().removeIf(Objects::isNull);
    return map;
  }

  protected abstract Map<K, V> getMap();
}
