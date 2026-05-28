/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCConfigCompassCheckStatus
extends Enum<FCConfigCompassCheckStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ FCConfigCompassCheckStatus NONE = new FCConfigCompassCheckStatus(0);
    public static final /* enum */ FCConfigCompassCheckStatus NORMAL = new FCConfigCompassCheckStatus(1);
    public static final /* enum */ FCConfigCompassCheckStatus NEED_CALIBRATION = new FCConfigCompassCheckStatus(2);
    public static final /* enum */ FCConfigCompassCheckStatus NEED_CHECK_INSTALL_DIRECTION = new FCConfigCompassCheckStatus(3);
    public static final /* enum */ FCConfigCompassCheckStatus NEED_RESTART = new FCConfigCompassCheckStatus(4);
    public static final /* enum */ FCConfigCompassCheckStatus UNKNOWN = new FCConfigCompassCheckStatus(65535);
    private int value;
    private static final FCConfigCompassCheckStatus[] allValues;
    private static final /* synthetic */ FCConfigCompassCheckStatus[] $VALUES;

    public static FCConfigCompassCheckStatus[] values() {
        return null;
    }

    public static FCConfigCompassCheckStatus valueOf(String string) {
        return null;
    }

    private FCConfigCompassCheckStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCConfigCompassCheckStatus find(int n) {
        return null;
    }

    private static /* synthetic */ FCConfigCompassCheckStatus[] $values() {
        return null;
    }

    static {
        $VALUES = FCConfigCompassCheckStatus.$values();
        allValues = FCConfigCompassCheckStatus.values();
    }
}

