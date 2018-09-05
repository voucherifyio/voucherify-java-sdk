package io.voucherify.client;

import okhttp3.logging.HttpLoggingInterceptor.Level;

public enum LogLevel {
  NONE(Level.NONE),
  BASIC(Level.BASIC),
  HEADERS(Level.HEADERS),
  BODY(Level.BODY);

  private final Level level;

  LogLevel(Level level) {
    this.level = level;
  }

  Level getValue() {
    return level;
  }
}
