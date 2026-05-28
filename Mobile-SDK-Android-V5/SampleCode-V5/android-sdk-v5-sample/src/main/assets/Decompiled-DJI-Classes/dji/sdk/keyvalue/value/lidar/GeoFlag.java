/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class GeoFlag
extends Enum<GeoFlag>
implements JNIProguardKeepTag {
    public static final /* enum */ GeoFlag INVALID = new GeoFlag(0);
    public static final /* enum */ GeoFlag INITIALIZING = new GeoFlag(1);
    public static final /* enum */ GeoFlag INITIALIZED = new GeoFlag(2);
    public static final /* enum */ GeoFlag UNKNOWN = new GeoFlag(65535);
    private int value;
    private static final GeoFlag[] allValues;
    private static final /* synthetic */ GeoFlag[] $VALUES;

    public static GeoFlag[] values() {
        return null;
    }

    public static GeoFlag valueOf(String string) {
        return null;
    }

    private GeoFlag(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GeoFlag find(int n) {
        return null;
    }

    private static /* synthetic */ GeoFlag[] $values() {
        return null;
    }

    static {
        $VALUES = GeoFlag.$values();
        allValues = GeoFlag.values();
    }
}

