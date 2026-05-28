/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TimeCodeGenerateMode
extends Enum<TimeCodeGenerateMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TimeCodeGenerateMode JAM_SYNC = new TimeCodeGenerateMode(0);
    public static final /* enum */ TimeCodeGenerateMode REGEN = new TimeCodeGenerateMode(1);
    public static final /* enum */ TimeCodeGenerateMode PRESET = new TimeCodeGenerateMode(2);
    public static final /* enum */ TimeCodeGenerateMode UNKNOWN = new TimeCodeGenerateMode(65535);
    private int value;
    private static final TimeCodeGenerateMode[] allValues;
    private static final /* synthetic */ TimeCodeGenerateMode[] $VALUES;

    public static TimeCodeGenerateMode[] values() {
        return null;
    }

    public static TimeCodeGenerateMode valueOf(String string) {
        return null;
    }

    private TimeCodeGenerateMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimeCodeGenerateMode find(int n) {
        return null;
    }

    private static /* synthetic */ TimeCodeGenerateMode[] $values() {
        return null;
    }

    static {
        $VALUES = TimeCodeGenerateMode.$values();
        allValues = TimeCodeGenerateMode.values();
    }
}

