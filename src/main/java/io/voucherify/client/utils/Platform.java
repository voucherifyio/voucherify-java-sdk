package io.voucherify.client.utils;

import retrofit.android.MainThreadExecutor;

import java.util.concurrent.Executor;

public abstract class Platform {

  private static final Platform PLATFORM = findPlatform();

  public static Platform get() {
    return PLATFORM;
  }

  private static Platform findPlatform() {
    try {
      Class.forName("android.os.Build");
      return new Android();
    } catch (ClassNotFoundException ignored) {
    }

    return new Base();
  }

  public abstract Executor callbackExecutor();

  private static class Base extends Platform {

    @Override
    public Executor callbackExecutor() {
      return new SynchronousExecutor();
    }
  }

  private static class Android extends Platform {

    @Override
    public Executor callbackExecutor() {
      return new MainThreadExecutor();
    }
  }

  static class SynchronousExecutor implements Executor {

    @Override
    public void execute(Runnable runnable) {
      runnable.run();
    }
  }
}