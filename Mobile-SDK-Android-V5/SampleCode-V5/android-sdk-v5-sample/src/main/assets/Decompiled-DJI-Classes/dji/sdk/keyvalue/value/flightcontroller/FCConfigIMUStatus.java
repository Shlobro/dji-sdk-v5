/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCConfigIMUStatus
extends Enum<FCConfigIMUStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ FCConfigIMUStatus NONE = new FCConfigIMUStatus(0);
    public static final /* enum */ FCConfigIMUStatus NORMAL = new FCConfigIMUStatus(1);
    public static final /* enum */ FCConfigIMUStatus WARMING_UP = new FCConfigIMUStatus(2);
    public static final /* enum */ FCConfigIMUStatus NEED_CALIBRATION = new FCConfigIMUStatus(3);
    public static final /* enum */ FCConfigIMUStatus NEED_RESTART = new FCConfigIMUStatus(4);
    public static final /* enum */ FCConfigIMUStatus NEED_CHECK_INSTALL_DIRECTION = new FCConfigIMUStatus(5);
    public static final /* enum */ FCConfigIMUStatus OFFSET_EXCEPTION = new FCConfigIMUStatus(6);
    public static final /* enum */ FCConfigIMUStatus UNKNOWN = new FCConfigIMUStatus(65535);
    private int value;
    private static final FCConfigIMUStatus[] allValues;
    private static final /* synthetic */ FCConfigIMUStatus[] $VALUES;

    public static FCConfigIMUStatus[] values() {
        return null;
    }

    public static FCConfigIMUStatus valueOf(String string) {
        return null;
    }

    private FCConfigIMUStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCConfigIMUStatus find(int n) {
        return null;
    }

    private static /* synthetic */ FCConfigIMUStatus[] $values() {
        return null;
    }

    static {
        $VALUES = FCConfigIMUStatus.$values();
        allValues = FCConfigIMUStatus.values();
    }
}

