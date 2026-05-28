/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmDongleWorkState
extends Enum<WlmDongleWorkState>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmDongleWorkState NONE = new WlmDongleWorkState(0);
    public static final /* enum */ WlmDongleWorkState NOT_REGISTER_NO_SEARCH = new WlmDongleWorkState(1);
    public static final /* enum */ WlmDongleWorkState NOT_REGISTER_SEARCHING = new WlmDongleWorkState(2);
    public static final /* enum */ WlmDongleWorkState REGISTER_HOME_NETWORK = new WlmDongleWorkState(3);
    public static final /* enum */ WlmDongleWorkState REGISTER_ROAMING = new WlmDongleWorkState(4);
    public static final /* enum */ WlmDongleWorkState REGISTER_DENIED = new WlmDongleWorkState(5);
    public static final /* enum */ WlmDongleWorkState UNKNOWN = new WlmDongleWorkState(65535);
    private int value;
    private static final WlmDongleWorkState[] allValues;
    private static final /* synthetic */ WlmDongleWorkState[] $VALUES;

    public static WlmDongleWorkState[] values() {
        return null;
    }

    public static WlmDongleWorkState valueOf(String string) {
        return null;
    }

    private WlmDongleWorkState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmDongleWorkState find(int n) {
        return null;
    }

    private static /* synthetic */ WlmDongleWorkState[] $values() {
        return null;
    }

    static {
        $VALUES = WlmDongleWorkState.$values();
        allValues = WlmDongleWorkState.values();
    }
}

