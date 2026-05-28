/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class OutOfMultiGimbalSyncReason
extends Enum<OutOfMultiGimbalSyncReason>
implements JNIProguardKeepTag {
    public static final /* enum */ OutOfMultiGimbalSyncReason DISCONNECT = new OutOfMultiGimbalSyncReason(0);
    public static final /* enum */ OutOfMultiGimbalSyncReason NO_PERMISSION = new OutOfMultiGimbalSyncReason(1);
    public static final /* enum */ OutOfMultiGimbalSyncReason NORMAL = new OutOfMultiGimbalSyncReason(2);
    public static final /* enum */ OutOfMultiGimbalSyncReason UNKNOWN = new OutOfMultiGimbalSyncReason(65535);
    private int value;
    private static final OutOfMultiGimbalSyncReason[] allValues;
    private static final /* synthetic */ OutOfMultiGimbalSyncReason[] $VALUES;

    public static OutOfMultiGimbalSyncReason[] values() {
        return null;
    }

    public static OutOfMultiGimbalSyncReason valueOf(String string) {
        return null;
    }

    private OutOfMultiGimbalSyncReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static OutOfMultiGimbalSyncReason find(int n) {
        return null;
    }

    private static /* synthetic */ OutOfMultiGimbalSyncReason[] $values() {
        return null;
    }

    static {
        $VALUES = OutOfMultiGimbalSyncReason.$values();
        allValues = OutOfMultiGimbalSyncReason.values();
    }
}

