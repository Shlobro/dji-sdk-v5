/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class AppRunningState
extends Enum<AppRunningState>
implements JNIProguardKeepTag {
    public static final /* enum */ AppRunningState FOREGROUND = new AppRunningState(0);
    public static final /* enum */ AppRunningState BACKGROUND = new AppRunningState(1);
    public static final /* enum */ AppRunningState UNKNOWN = new AppRunningState(65535);
    private int value;
    private static final AppRunningState[] allValues;
    private static final /* synthetic */ AppRunningState[] $VALUES;

    public static AppRunningState[] values() {
        return null;
    }

    public static AppRunningState valueOf(String string) {
        return null;
    }

    private AppRunningState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AppRunningState find(int n) {
        return null;
    }

    private static /* synthetic */ AppRunningState[] $values() {
        return null;
    }

    static {
        $VALUES = AppRunningState.$values();
        allValues = AppRunningState.values();
    }
}

