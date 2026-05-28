/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class DirectionType
extends Enum<DirectionType>
implements JNIProguardKeepTag {
    public static final /* enum */ DirectionType DOWN = new DirectionType(0);
    public static final /* enum */ DirectionType FRONT = new DirectionType(1);
    public static final /* enum */ DirectionType BACK = new DirectionType(2);
    public static final /* enum */ DirectionType RIGHT = new DirectionType(3);
    public static final /* enum */ DirectionType LEFT = new DirectionType(4);
    public static final /* enum */ DirectionType UP = new DirectionType(5);
    public static final /* enum */ DirectionType HORIZONTAL = new DirectionType(6);
    public static final /* enum */ DirectionType VERTICAL = new DirectionType(7);
    public static final /* enum */ DirectionType UNKNOWN = new DirectionType(65535);
    private int value;
    private static final DirectionType[] allValues;
    private static final /* synthetic */ DirectionType[] $VALUES;

    public static DirectionType[] values() {
        return null;
    }

    public static DirectionType valueOf(String string) {
        return null;
    }

    private DirectionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DirectionType find(int n) {
        return null;
    }

    private static /* synthetic */ DirectionType[] $values() {
        return null;
    }

    static {
        $VALUES = DirectionType.$values();
        allValues = DirectionType.values();
    }
}

