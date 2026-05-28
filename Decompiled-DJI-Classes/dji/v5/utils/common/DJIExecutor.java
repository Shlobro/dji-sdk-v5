/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 *  android.os.Looper
 */
package dji.v5.utils.common;

import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.ExecutorService;

public class DJIExecutor {
    private static final int CPU_COUNT = Runtime.getRuntime().availableProcessors();
    private static final int CORE_POOL_SIZE = CPU_COUNT + 1;
    private static final int URGENT_MAXIMUM_POOL_SIZE = Math.min(Math.max(10, CORE_POOL_SIZE * 2), Math.max(5, CORE_POOL_SIZE));
    private static final int MAXIMUM_POOL_SIZE = URGENT_MAXIMUM_POOL_SIZE * 2;
    private static final int KEEP_ALIVE = 1;
    private static final Object LOCK = new Object();
    private static volatile ExecutorService sDefaultExecutor;
    private static volatile ExecutorService sIOExecutor;
    private static volatile ExecutorService sUrgentExecutor;
    static volatile HandlerThread sHandlerThread;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ExecutorService getDefaultExecutor() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ExecutorService getIOExecutor() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static ExecutorService getUrgentExecutor() {
        return null;
    }

    public static ExecutorService getExecutorFor(Purpose purpose) {
        return null;
    }

    public static ExecutorService getExecutor() {
        return null;
    }

    private static ExecutorService getAsyncTaskExecutor() {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static Looper getLooper() {
        return null;
    }

    public static final class Purpose
    extends Enum<Purpose> {
        public static final /* enum */ Purpose NORMAL = new Purpose();
        public static final /* enum */ Purpose URGENT = new Purpose();
        public static final /* enum */ Purpose IO = new Purpose();
        private static final /* synthetic */ Purpose[] $VALUES;

        public static Purpose[] values() {
            return null;
        }

        public static Purpose valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ Purpose[] $values() {
            return null;
        }

        static {
            $VALUES = Purpose.$values();
        }
    }
}

