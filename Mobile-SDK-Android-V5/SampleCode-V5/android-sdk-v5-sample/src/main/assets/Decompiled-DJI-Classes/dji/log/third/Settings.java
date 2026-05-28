/*
 * Decompiled with CFR 0.152.
 */
package dji.log.third;

import dji.log.third.LogAdapter;
import dji.log.third.LogLevel;

public final class Settings {
    private int methodCount;
    private boolean showThreadInfo;
    private int methodOffset;
    private LogAdapter logAdapter;
    private LogLevel logLevel;

    public Settings hideThreadInfo() {
        return null;
    }

    public Settings methodCount(int n) {
        return null;
    }

    public Settings logLevel(LogLevel logLevel) {
        return null;
    }

    public Settings methodOffset(int n) {
        return null;
    }

    public Settings logAdapter(LogAdapter logAdapter) {
        return null;
    }

    public int getMethodCount() {
        return 0;
    }

    public boolean isShowThreadInfo() {
        return false;
    }

    public LogLevel getLogLevel() {
        return null;
    }

    public int getMethodOffset() {
        return 0;
    }

    public LogAdapter getLogAdapter() {
        return null;
    }

    public void reset() {
    }
}

