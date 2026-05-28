/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartEyeSpeedMode
extends Enum<SmartEyeSpeedMode>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartEyeSpeedMode NORMAL = new SmartEyeSpeedMode(0);
    public static final /* enum */ SmartEyeSpeedMode HIGH_SPEED = new SmartEyeSpeedMode(1);
    public static final /* enum */ SmartEyeSpeedMode LOW_SPEED = new SmartEyeSpeedMode(2);
    public static final /* enum */ SmartEyeSpeedMode UNKNOWN = new SmartEyeSpeedMode(255);
    private int value;
    private static final SmartEyeSpeedMode[] allValues;
    private static final /* synthetic */ SmartEyeSpeedMode[] $VALUES;

    public static SmartEyeSpeedMode[] values() {
        return null;
    }

    public static SmartEyeSpeedMode valueOf(String string) {
        return null;
    }

    private SmartEyeSpeedMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartEyeSpeedMode find(int n) {
        return null;
    }

    private static /* synthetic */ SmartEyeSpeedMode[] $values() {
        return null;
    }

    static {
        $VALUES = SmartEyeSpeedMode.$values();
        allValues = SmartEyeSpeedMode.values();
    }
}

