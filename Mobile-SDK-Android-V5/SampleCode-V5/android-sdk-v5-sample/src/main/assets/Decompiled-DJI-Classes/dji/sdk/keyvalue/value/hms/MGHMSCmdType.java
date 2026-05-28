/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;

public final class MGHMSCmdType
extends Enum<MGHMSCmdType>
implements JNIProguardKeepTag {
    public static final /* enum */ MGHMSCmdType UNSUBSCRIBE = new MGHMSCmdType(0);
    public static final /* enum */ MGHMSCmdType SUBSCRIBE = new MGHMSCmdType(1);
    public static final /* enum */ MGHMSCmdType UNKNOWN = new MGHMSCmdType(65535);
    private int value;
    private static final MGHMSCmdType[] allValues;
    private static final /* synthetic */ MGHMSCmdType[] $VALUES;

    public static MGHMSCmdType[] values() {
        return null;
    }

    public static MGHMSCmdType valueOf(String string) {
        return null;
    }

    private MGHMSCmdType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MGHMSCmdType find(int n) {
        return null;
    }

    private static /* synthetic */ MGHMSCmdType[] $values() {
        return null;
    }

    static {
        $VALUES = MGHMSCmdType.$values();
        allValues = MGHMSCmdType.values();
    }
}

