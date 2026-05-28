/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LensMountType
extends Enum<LensMountType>
implements JNIProguardKeepTag {
    public static final /* enum */ LensMountType DEFAULT = new LensMountType(0);
    public static final /* enum */ LensMountType MOUNT_DL = new LensMountType(1);
    public static final /* enum */ LensMountType MOUNT_L = new LensMountType(2);
    public static final /* enum */ LensMountType MOUNT_E = new LensMountType(3);
    public static final /* enum */ LensMountType MOUNT_M43 = new LensMountType(4);
    public static final /* enum */ LensMountType MOUNT_X = new LensMountType(5);
    public static final /* enum */ LensMountType MANUAL_LENS = new LensMountType(6);
    public static final /* enum */ LensMountType UNKNOWN = new LensMountType(65535);
    private int value;
    private static final LensMountType[] allValues;
    private static final /* synthetic */ LensMountType[] $VALUES;

    public static LensMountType[] values() {
        return null;
    }

    public static LensMountType valueOf(String string) {
        return null;
    }

    private LensMountType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LensMountType find(int n) {
        return null;
    }

    private static /* synthetic */ LensMountType[] $values() {
        return null;
    }

    static {
        $VALUES = LensMountType.$values();
        allValues = LensMountType.values();
    }
}

