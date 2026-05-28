/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MLTargetObjectType
extends Enum<MLTargetObjectType>
implements JNIProguardKeepTag {
    public static final /* enum */ MLTargetObjectType TYPE_UNKNOWN = new MLTargetObjectType(0);
    public static final /* enum */ MLTargetObjectType PERSON = new MLTargetObjectType(1);
    public static final /* enum */ MLTargetObjectType CAR = new MLTargetObjectType(2);
    public static final /* enum */ MLTargetObjectType VAN = new MLTargetObjectType(3);
    public static final /* enum */ MLTargetObjectType BIKE = new MLTargetObjectType(4);
    public static final /* enum */ MLTargetObjectType ANIMAL = new MLTargetObjectType(5);
    public static final /* enum */ MLTargetObjectType BOAT = new MLTargetObjectType(6);
    public static final /* enum */ MLTargetObjectType HOT_POINT = new MLTargetObjectType(7);
    public static final /* enum */ MLTargetObjectType UNKNOWN = new MLTargetObjectType(65535);
    private int value;
    private static final MLTargetObjectType[] allValues;
    private static final /* synthetic */ MLTargetObjectType[] $VALUES;

    public static MLTargetObjectType[] values() {
        return null;
    }

    public static MLTargetObjectType valueOf(String string) {
        return null;
    }

    private MLTargetObjectType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MLTargetObjectType find(int n) {
        return null;
    }

    private static /* synthetic */ MLTargetObjectType[] $values() {
        return null;
    }

    static {
        $VALUES = MLTargetObjectType.$values();
        allValues = MLTargetObjectType.values();
    }
}

