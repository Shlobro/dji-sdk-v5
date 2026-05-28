/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ClearLogStatus
extends Enum<ClearLogStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ ClearLogStatus SUCCESSFUL = new ClearLogStatus(0);
    public static final /* enum */ ClearLogStatus CLEARING = new ClearLogStatus(1);
    public static final /* enum */ ClearLogStatus NORMAL = new ClearLogStatus(2);
    public static final /* enum */ ClearLogStatus CREATE_FLAG_ERR = new ClearLogStatus(3);
    public static final /* enum */ ClearLogStatus DEVICE_OFFLINE = new ClearLogStatus(4);
    public static final /* enum */ ClearLogStatus UMOUNT_ERR = new ClearLogStatus(5);
    public static final /* enum */ ClearLogStatus LOG_ERR = new ClearLogStatus(6);
    public static final /* enum */ ClearLogStatus INCOMPLETE = new ClearLogStatus(7);
    public static final /* enum */ ClearLogStatus TIMEOUT = new ClearLogStatus(8);
    public static final /* enum */ ClearLogStatus DELETE_FLAG_ERR = new ClearLogStatus(9);
    public static final /* enum */ ClearLogStatus UAV_ERR = new ClearLogStatus(10);
    public static final /* enum */ ClearLogStatus UNKNOWN = new ClearLogStatus(65535);
    private int value;
    private static final ClearLogStatus[] allValues;
    private static final /* synthetic */ ClearLogStatus[] $VALUES;

    public static ClearLogStatus[] values() {
        return null;
    }

    public static ClearLogStatus valueOf(String string) {
        return null;
    }

    private ClearLogStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ClearLogStatus find(int n) {
        return null;
    }

    private static /* synthetic */ ClearLogStatus[] $values() {
        return null;
    }

    static {
        $VALUES = ClearLogStatus.$values();
        allValues = ClearLogStatus.values();
    }
}

