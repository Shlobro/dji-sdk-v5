/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TimeCodeRunMode
extends Enum<TimeCodeRunMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TimeCodeRunMode FREE = new TimeCodeRunMode(0);
    public static final /* enum */ TimeCodeRunMode RECORD = new TimeCodeRunMode(1);
    public static final /* enum */ TimeCodeRunMode UNKNOWN = new TimeCodeRunMode(65535);
    private int value;
    private static final TimeCodeRunMode[] allValues;
    private static final /* synthetic */ TimeCodeRunMode[] $VALUES;

    public static TimeCodeRunMode[] values() {
        return null;
    }

    public static TimeCodeRunMode valueOf(String string) {
        return null;
    }

    private TimeCodeRunMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TimeCodeRunMode find(int n) {
        return null;
    }

    private static /* synthetic */ TimeCodeRunMode[] $values() {
        return null;
    }

    static {
        $VALUES = TimeCodeRunMode.$values();
        allValues = TimeCodeRunMode.values();
    }
}

