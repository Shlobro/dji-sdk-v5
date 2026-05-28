/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class PhysicalSource
extends Enum<PhysicalSource>
implements JNIProguardKeepTag {
    public static final /* enum */ PhysicalSource EXT = new PhysicalSource(0);
    public static final /* enum */ PhysicalSource LB = new PhysicalSource(1);
    public static final /* enum */ PhysicalSource HDMI = new PhysicalSource(2);
    public static final /* enum */ PhysicalSource AV = new PhysicalSource(3);
    public static final /* enum */ PhysicalSource MAIN_CAM = new PhysicalSource(4);
    public static final /* enum */ PhysicalSource FPV_CAM = new PhysicalSource(5);
    public static final /* enum */ PhysicalSource LEFT_CAM = new PhysicalSource(6);
    public static final /* enum */ PhysicalSource RIGHT_CAM = new PhysicalSource(7);
    public static final /* enum */ PhysicalSource TOP_CAM = new PhysicalSource(8);
    public static final /* enum */ PhysicalSource UNKNOWN = new PhysicalSource(255);
    private int value;
    private static final PhysicalSource[] allValues;
    private static final /* synthetic */ PhysicalSource[] $VALUES;

    public static PhysicalSource[] values() {
        return null;
    }

    public static PhysicalSource valueOf(String string) {
        return null;
    }

    private PhysicalSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhysicalSource find(int n) {
        return null;
    }

    private static /* synthetic */ PhysicalSource[] $values() {
        return null;
    }

    static {
        $VALUES = PhysicalSource.$values();
        allValues = PhysicalSource.values();
    }
}

