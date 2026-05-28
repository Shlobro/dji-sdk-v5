/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TimeCodeCountMode
extends Enum<TimeCodeCountMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TimeCodeCountMode NO_DROP = new TimeCodeCountMode(0);
    public static final /* enum */ TimeCodeCountMode DROP = new TimeCodeCountMode(1);
    public static final /* enum */ TimeCodeCountMode UNKNOWN = new TimeCodeCountMode(65535);
    private int value;
    private static final TimeCodeCountMode[] allValues;
    private static final /* synthetic */ TimeCodeCountMode[] $VALUES;

    public static TimeCodeCountMode[] values() {
        return null;
    }

    public static TimeCodeCountMode valueOf(String string) {
        return null;
    }

    private TimeCodeCountMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimeCodeCountMode find(int n) {
        return null;
    }

    private static /* synthetic */ TimeCodeCountMode[] $values() {
        return null;
    }

    static {
        $VALUES = TimeCodeCountMode.$values();
        allValues = TimeCodeCountMode.values();
    }
}

