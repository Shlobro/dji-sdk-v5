/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class RadarComponentIndexType
extends Enum<RadarComponentIndexType>
implements JNIProguardKeepTag {
    public static final /* enum */ RadarComponentIndexType UP_OR_MAIN = new RadarComponentIndexType(0);
    public static final /* enum */ RadarComponentIndexType DOWN = new RadarComponentIndexType(1);
    public static final /* enum */ RadarComponentIndexType UNKNOWN = new RadarComponentIndexType(65535);
    private int value;
    private static final RadarComponentIndexType[] allValues;
    private static final /* synthetic */ RadarComponentIndexType[] $VALUES;

    public static RadarComponentIndexType[] values() {
        return null;
    }

    public static RadarComponentIndexType valueOf(String string) {
        return null;
    }

    private RadarComponentIndexType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RadarComponentIndexType find(int n) {
        return null;
    }

    private static /* synthetic */ RadarComponentIndexType[] $values() {
        return null;
    }

    static {
        $VALUES = RadarComponentIndexType.$values();
        allValues = RadarComponentIndexType.values();
    }
}

