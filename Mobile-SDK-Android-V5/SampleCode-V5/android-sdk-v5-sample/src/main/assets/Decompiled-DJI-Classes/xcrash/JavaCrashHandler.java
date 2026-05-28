/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 */
package xcrash;

import android.annotation.SuppressLint;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;
import xcrash.ICrashCallback;

@SuppressLint(value={"StaticFieldLeak"})
class JavaCrashHandler
implements Thread.UncaughtExceptionHandler {
    private static final JavaCrashHandler instance = new JavaCrashHandler();
    private final Date startTime;
    private int pid;
    private String processName;
    private String appId;
    private String appVersion;
    private boolean rethrow;
    private String logDir;
    private int logcatSystemLines;
    private int logcatEventsLines;
    private int logcatMainLines;
    private boolean dumpFds;
    private boolean dumpNetworkInfo;
    private boolean dumpAllThreads;
    private int dumpAllThreadsCountMax;
    private String[] dumpAllThreadsWhiteList;
    private ICrashCallback callback;
    private Thread.UncaughtExceptionHandler defaultHandler;

    private JavaCrashHandler() {
    }

    static JavaCrashHandler getInstance() {
        return null;
    }

    void initialize(int n, String string, String string2, String string3, String string4, boolean bl, int n2, int n3, int n4, boolean bl2, boolean bl3, boolean bl4, int n5, String[] stringArray, ICrashCallback iCrashCallback) {
    }

    @Override
    public void uncaughtException(Thread thread, Throwable throwable) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void handleException(Thread thread, Throwable throwable) {
    }

    private String getLibInfo(List<String> list) {
        return null;
    }

    private String getBuildId(String string) {
        return null;
    }

    private String getEmergency(Date date, Thread thread, Throwable throwable) {
        return null;
    }

    private String getOtherThreadsInfo(Thread thread) {
        return null;
    }

    private boolean matchThreadName(ArrayList<Pattern> arrayList, String string) {
        return false;
    }
}

