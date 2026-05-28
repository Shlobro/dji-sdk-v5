/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.batterybox;

import dji.jni.JNIProguardKeepTag;

public final class BlackBoxTargetType
extends Enum<BlackBoxTargetType>
implements JNIProguardKeepTag {
    public static final /* enum */ BlackBoxTargetType BBX = new BlackBoxTargetType(1);
    public static final /* enum */ BlackBoxTargetType LT = new BlackBoxTargetType(3);
    public static final /* enum */ BlackBoxTargetType PF = new BlackBoxTargetType(5);
    public static final /* enum */ BlackBoxTargetType ALGO = new BlackBoxTargetType(7);
    public static final /* enum */ BlackBoxTargetType UNKNOWN = new BlackBoxTargetType(255);
    private int value;
    private static final BlackBoxTargetType[] allValues;
    private static final /* synthetic */ BlackBoxTargetType[] $VALUES;

    public static BlackBoxTargetType[] values() {
        return null;
    }

    public static BlackBoxTargetType valueOf(String string) {
        return null;
    }

    private BlackBoxTargetType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BlackBoxTargetType find(int n) {
        return null;
    }

    private static /* synthetic */ BlackBoxTargetType[] $values() {
        return null;
    }

    static {
        $VALUES = BlackBoxTargetType.$values();
        allValues = BlackBoxTargetType.values();
    }
}

