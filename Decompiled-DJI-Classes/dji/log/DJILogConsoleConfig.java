/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.log;

import android.content.Context;
import dji.log.IConsoleFormat;

public class DJILogConsoleConfig {
    public boolean open;
    private int debuggablePriority;
    private int innerPriority;
    private int factoryPriority;
    private int releasePriority;
    public IConsoleFormat consoleFormat;

    public boolean isAllow(int n) {
        return false;
    }

    static /* synthetic */ int access$002(DJILogConsoleConfig dJILogConsoleConfig, int n) {
        return 0;
    }

    static /* synthetic */ int access$102(DJILogConsoleConfig dJILogConsoleConfig, int n) {
        return 0;
    }

    static /* synthetic */ int access$202(DJILogConsoleConfig dJILogConsoleConfig, int n) {
        return 0;
    }

    static /* synthetic */ int access$302(DJILogConsoleConfig dJILogConsoleConfig, int n) {
        return 0;
    }

    public static class Builder {
        DJILogConsoleConfig config;

        public Builder(Context context) {
        }

        public Builder setOpen(boolean bl) {
            return null;
        }

        public Builder setDebuggablePriority(int n) {
            return null;
        }

        public Builder setInnerPriority(int n) {
            return null;
        }

        public Builder setFactoryPriority(int n) {
            return null;
        }

        public Builder setReleasePriority(int n) {
            return null;
        }

        public Builder setConsoleFormat(IConsoleFormat iConsoleFormat) {
            return null;
        }

        public DJILogConsoleConfig build() {
            return null;
        }
    }
}

