/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class UavLockFailReason
extends Enum<UavLockFailReason>
implements JNIProguardKeepTag {
    public static final /* enum */ UavLockFailReason OTHER_RC_LOCKED = new UavLockFailReason(0);
    public static final /* enum */ UavLockFailReason UNKNOWN = new UavLockFailReason(255);
    private int value;
    private static final UavLockFailReason[] allValues;
    private static final /* synthetic */ UavLockFailReason[] $VALUES;

    public static UavLockFailReason[] values() {
        return null;
    }

    public static UavLockFailReason valueOf(String string) {
        return null;
    }

    private UavLockFailReason(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UavLockFailReason find(int n) {
        return null;
    }

    private static /* synthetic */ UavLockFailReason[] $values() {
        return null;
    }

    static {
        $VALUES = UavLockFailReason.$values();
        allValues = UavLockFailReason.values();
    }
}

