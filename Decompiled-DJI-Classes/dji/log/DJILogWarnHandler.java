/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
package dji.log;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public class DJILogWarnHandler {
    private static final int STATISTICS_INIT = 1;
    private static final String INVALID_EMPTY_KEY = "Empty";
    private static final int WARN_KEY_LENGTH = 50;
    private static final int WARN_CONTENT_CUT_OUT_LENGTH = 20;
    private static final int WARN_BORDER = 100;
    private static final int WARN_TIME_MILLIS = 1000;
    private final ConcurrentHashMap<String, Integer> hashKeyStatistics;
    private final ConcurrentHashMap<String, Long> hashKeyTimeStatistics;
    public static final int WARN_TYPE_CONSOLE = 0;
    public static final int WARN_TYPE_FILE = 1;
    private int warnType;
    private Context context;
    private Handler handler;
    public AtomicLong v;
    public AtomicLong d;
    public AtomicLong i;
    public AtomicLong w;
    public AtomicLong e;

    DJILogWarnHandler(Context context) {
    }

    DJILogWarnHandler(Context context, Looper looper) {
    }

    DJILogWarnHandler(Context context, int n, Looper looper) {
    }

    void handleWarnKey(String string, String string2) {
    }

    private void emptyKeyWarn(String string, String string2) {
    }

    private void tooLongKeyWarn(String string, String string2) {
    }

    private void highFrequencyWarn(String string, String string2, float f2) {
    }

    private void dispatchWarn(String string, String string2, String string3) {
    }

    private void toastWarn(String string) {
    }

    private void consoleWarn(String string, String string2) {
    }

    static /* synthetic */ Context access$000(DJILogWarnHandler dJILogWarnHandler) {
        return null;
    }
}

