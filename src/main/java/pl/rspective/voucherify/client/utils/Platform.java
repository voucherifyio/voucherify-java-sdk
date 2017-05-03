package pl.rspective.voucherify.client.utils;

import retrofit.android.MainThreadExecutor;

import java.util.concurrent.Executor;

/**
 * Util class to get information about current system platform.
 */
public abstract class Platform {
    /**
     * Current system platfom on which client is running
     */
    private static final Platform PLATFORM = findPlatform();

    /**
     *
     * @return current system platform
     */
    public static Platform get() {
        return PLATFORM;
    }

    /**
     *
     * @return
     */
    private static Platform findPlatform() {
        try {
            Class.forName("android.os.Build");
            return new Android();
        } catch (ClassNotFoundException ignored) {
        }

        return new Base();
    }

    /**
     *
     * @return
     */
    public abstract Executor callbackExecutor();

    /**
     * Provides sane defaults for operation on the JVM.
     */
    private static class Base extends Platform {
        /**
         *
         * @return
         */
        @Override
        public Executor callbackExecutor() {
            return new SynchronousExecutor();
        }
    }

    /**
     * Provides sane defaults for operation on Android.
     */
    private static class Android extends Platform {
        /**
         *
         * @return
         */
        @Override
        public Executor callbackExecutor() {
            return new MainThreadExecutor();
        }
    }

    /**
     *
     */
    static class SynchronousExecutor implements Executor {
        /**
         *
         * @param runnable
         */
        @Override
        public void execute(Runnable runnable) {
            runnable.run();
        }
    }
}