/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKGNDLinkState
extends Enum<RTKGNDLinkState>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKGNDLinkState DISCONNECT = new RTKGNDLinkState(0);
    public static final /* enum */ RTKGNDLinkState CONNECT = new RTKGNDLinkState(1);
    public static final /* enum */ RTKGNDLinkState UNKNOWN = new RTKGNDLinkState(65535);
    private int value;
    private static final RTKGNDLinkState[] allValues;
    private static final /* synthetic */ RTKGNDLinkState[] $VALUES;

    public static RTKGNDLinkState[] values() {
        return null;
    }

    public static RTKGNDLinkState valueOf(String string) {
        return null;
    }

    private RTKGNDLinkState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKGNDLinkState find(int n) {
        return null;
    }

    private static /* synthetic */ RTKGNDLinkState[] $values() {
        return null;
    }

    static {
        $VALUES = RTKGNDLinkState.$values();
        allValues = RTKGNDLinkState.values();
    }
}

