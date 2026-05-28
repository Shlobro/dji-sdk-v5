/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.FileObserver
 */
package xcrash;

import android.content.Context;
import android.os.FileObserver;
import java.util.Date;
import java.util.regex.Pattern;
import xcrash.ICrashCallback;

class AnrHandler {
    private static final AnrHandler instance = new AnrHandler();
    private final Date startTime;
    private final Pattern patPidTime;
    private final Pattern patProcessName;
    private final long anrTimeoutMs = 15000L;
    private Context ctx;
    private int pid;
    private String processName;
    private String appId;
    private String appVersion;
    private String logDir;
    private boolean checkProcessState;
    private int logcatSystemLines;
    private int logcatEventsLines;
    private int logcatMainLines;
    private boolean dumpFds;
    private boolean dumpNetworkInfo;
    private ICrashCallback callback;
    private ICrashCallback anrFastCallback;
    private long lastTime;
    private FileObserver fileObserver;

    private AnrHandler() {
    }

    static AnrHandler getInstance() {
        return null;
    }

    void initialize(Context context, int n, String string, String string2, String string3, String string4, boolean bl, int n2, int n3, int n4, boolean bl2, boolean bl3, ICrashCallback iCrashCallback, ICrashCallback iCrashCallback2) {
    }

    void notifyJavaCrashed() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void handleAnr(String string) {
    }

    private String getEmergency(Date date, String string) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private String getTrace(String string, long l2) {
        return null;
    }

    static /* synthetic */ void access$000(AnrHandler anrHandler, String string) {
    }
}

