/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class SmartEyeMode
extends Enum<SmartEyeMode>
implements JNIProguardKeepTag {
    public static final /* enum */ SmartEyeMode TRACE = new SmartEyeMode(0);
    public static final /* enum */ SmartEyeMode PROFILE = new SmartEyeMode(2);
    public static final /* enum */ SmartEyeMode FREE = new SmartEyeMode(10);
    public static final /* enum */ SmartEyeMode CIRCLE = new SmartEyeMode(11);
    public static final /* enum */ SmartEyeMode AUTO_SHOT = new SmartEyeMode(21);
    public static final /* enum */ SmartEyeMode UNKNOWN = new SmartEyeMode(255);
    private int value;
    private static final SmartEyeMode[] allValues;
    private static final /* synthetic */ SmartEyeMode[] $VALUES;

    public static SmartEyeMode[] values() {
        return null;
    }

    public static SmartEyeMode valueOf(String string) {
        return null;
    }

    private SmartEyeMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SmartEyeMode find(int n) {
        return null;
    }

    private static /* synthetic */ SmartEyeMode[] $values() {
        return null;
    }

    static {
        $VALUES = SmartEyeMode.$values();
        allValues = SmartEyeMode.values();
    }
}

