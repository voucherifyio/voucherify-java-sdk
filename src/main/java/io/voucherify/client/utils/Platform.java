package io.voucherify.client.utils;

import java.util.concurrent.Executor;

public abstract class Platform {

  private static final Platform PLATFORM = findPlatform();

  public static Platform get() {
    return PLATFORM;
  }

  private static Platform findPlatform() {
    return new Base();
  }

  public abstract Executor callbackExecutor();

  private static class Base extends Platform {

    @Override
    public Executor callbackExecutor() {
      return new SynchronousExecutor();
    }
  }

  static class SynchronousExecutor implements Executor {

    @Override
    public void execute(Runnable runnable) {
      runnable.run();
    }
  }
}
