/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCWheelMode
extends Enum<RCWheelMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RCWheelMode NONE = new RCWheelMode(0);
    public static final /* enum */ RCWheelMode MF_FOCUS = new RCWheelMode(6);
    public static final /* enum */ RCWheelMode UNKNOWN = new RCWheelMode(255);
    private int value;
    private static final RCWheelMode[] allValues;
    private static final /* synthetic */ RCWheelMode[] $VALUES;

    public static RCWheelMode[] values() {
        return null;
    }

    public static RCWheelMode valueOf(String string) {
        return null;
    }

    private RCWheelMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCWheelMode find(int n) {
        return null;
    }

    private static /* synthetic */ RCWheelMode[] $values() {
        return null;
    }

    static {
        $VALUES = RCWheelMode.$values();
        allValues = RCWheelMode.values();
    }
}

