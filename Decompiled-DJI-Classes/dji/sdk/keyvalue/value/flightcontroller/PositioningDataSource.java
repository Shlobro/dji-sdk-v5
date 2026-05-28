/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class PositioningDataSource
extends Enum<PositioningDataSource>
implements JNIProguardKeepTag {
    public static final /* enum */ PositioningDataSource NONE = new PositioningDataSource(0);
    public static final /* enum */ PositioningDataSource MVO = new PositioningDataSource(1);
    public static final /* enum */ PositioningDataSource GPS = new PositioningDataSource(2);
    public static final /* enum */ PositioningDataSource RTK = new PositioningDataSource(3);
    public static final /* enum */ PositioningDataSource UNKNOWN = new PositioningDataSource(65535);
    private int value;
    private static final PositioningDataSource[] allValues;
    private static final /* synthetic */ PositioningDataSource[] $VALUES;

    public static PositioningDataSource[] values() {
        return null;
    }

    public static PositioningDataSource valueOf(String string) {
        return null;
    }

    private PositioningDataSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PositioningDataSource find(int n) {
        return null;
    }

    private static /* synthetic */ PositioningDataSource[] $values() {
        return null;
    }

    static {
        $VALUES = PositioningDataSource.$values();
        allValues = PositioningDataSource.values();
    }
}

