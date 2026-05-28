/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hmslog;

import dji.jni.JNIProguardKeepTag;

public final class HmsLogType
extends Enum<HmsLogType>
implements JNIProguardKeepTag {
    public static final /* enum */ HmsLogType NORMAL_LOG = new HmsLogType(0);
    public static final /* enum */ HmsLogType DCL_LOG = new HmsLogType(1);
    public static final /* enum */ HmsLogType SIMPLE_LOG = new HmsLogType(2);
    public static final /* enum */ HmsLogType UNKNOWN = new HmsLogType(65535);
    private int value;
    private static final HmsLogType[] allValues;
    private static final /* synthetic */ HmsLogType[] $VALUES;

    public static HmsLogType[] values() {
        return null;
    }

    public static HmsLogType valueOf(String string) {
        return null;
    }

    private HmsLogType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HmsLogType find(int n) {
        return null;
    }

    private static /* synthetic */ HmsLogType[] $values() {
        return null;
    }

    static {
        $VALUES = HmsLogType.$values();
        allValues = HmsLogType.values();
    }
}

