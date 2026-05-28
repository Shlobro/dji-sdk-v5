/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class LightStripActionType
extends Enum<LightStripActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ LightStripActionType LIGHT_STRIP_ACTION_TAKEOFF = new LightStripActionType(0);
    public static final /* enum */ LightStripActionType LIGHT_STRIP_ACTION_LANDING = new LightStripActionType(1);
    public static final /* enum */ LightStripActionType LIGHT_STRIP_ACTION_ANTITHEFT_ALARM = new LightStripActionType(2);
    public static final /* enum */ LightStripActionType LIGHT_STRIP_ACTION_BEACON = new LightStripActionType(3);
    public static final /* enum */ LightStripActionType UNKNOWN = new LightStripActionType(65535);
    private int value;
    private static final LightStripActionType[] allValues;
    private static final /* synthetic */ LightStripActionType[] $VALUES;

    public static LightStripActionType[] values() {
        return null;
    }

    public static LightStripActionType valueOf(String string) {
        return null;
    }

    private LightStripActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightStripActionType find(int n) {
        return null;
    }

    private static /* synthetic */ LightStripActionType[] $values() {
        return null;
    }

    static {
        $VALUES = LightStripActionType.$values();
        allValues = LightStripActionType.values();
    }
}

