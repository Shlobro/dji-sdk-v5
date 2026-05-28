/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SSDTotalSpace
extends Enum<SSDTotalSpace>
implements JNIProguardKeepTag {
    public static final /* enum */ SSDTotalSpace SPACE_256GB = new SSDTotalSpace(0);
    public static final /* enum */ SSDTotalSpace SPACE_512GB = new SSDTotalSpace(1);
    public static final /* enum */ SSDTotalSpace SPACE_1TB = new SSDTotalSpace(2);
    public static final /* enum */ SSDTotalSpace UNKNOWN = new SSDTotalSpace(65535);
    private int value;
    private static final SSDTotalSpace[] allValues;
    private static final /* synthetic */ SSDTotalSpace[] $VALUES;

    public static SSDTotalSpace[] values() {
        return null;
    }

    public static SSDTotalSpace valueOf(String string) {
        return null;
    }

    private SSDTotalSpace(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SSDTotalSpace find(int n) {
        return null;
    }

    private static /* synthetic */ SSDTotalSpace[] $values() {
        return null;
    }

    static {
        $VALUES = SSDTotalSpace.$values();
        allValues = SSDTotalSpace.values();
    }
}

