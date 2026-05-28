/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MasterShotState
extends Enum<MasterShotState>
implements JNIProguardKeepTag {
    public static final /* enum */ MasterShotState Standby = new MasterShotState(0);
    public static final /* enum */ MasterShotState Watch = new MasterShotState(1);
    public static final /* enum */ MasterShotState Running = new MasterShotState(2);
    public static final /* enum */ MasterShotState Back = new MasterShotState(3);
    public static final /* enum */ MasterShotState UNKNOWN = new MasterShotState(65535);
    private int value;
    private static final MasterShotState[] allValues;
    private static final /* synthetic */ MasterShotState[] $VALUES;

    public static MasterShotState[] values() {
        return null;
    }

    public static MasterShotState valueOf(String string) {
        return null;
    }

    private MasterShotState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MasterShotState find(int n) {
        return null;
    }

    private static /* synthetic */ MasterShotState[] $values() {
        return null;
    }

    static {
        $VALUES = MasterShotState.$values();
        allValues = MasterShotState.values();
    }
}

