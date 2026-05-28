/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;

public final class CpStatus
extends Enum<CpStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CpStatus UPGRADE_BIN = new CpStatus(0);
    public static final /* enum */ CpStatus WM170_BIN = new CpStatus(1);
    public static final /* enum */ CpStatus WM150_BIN = new CpStatus(2);
    public static final /* enum */ CpStatus WM232_BIN = new CpStatus(3);
    public static final /* enum */ CpStatus UNKNOWN = new CpStatus(65535);
    private int value;
    private static final CpStatus[] allValues;
    private static final /* synthetic */ CpStatus[] $VALUES;

    public static CpStatus[] values() {
        return null;
    }

    public static CpStatus valueOf(String string) {
        return null;
    }

    private CpStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CpStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CpStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CpStatus.$values();
        allValues = CpStatus.values();
    }
}

