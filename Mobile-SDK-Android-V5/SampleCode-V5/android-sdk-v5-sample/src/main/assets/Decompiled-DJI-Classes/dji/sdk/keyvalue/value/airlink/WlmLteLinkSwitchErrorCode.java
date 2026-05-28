/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmLteLinkSwitchErrorCode
extends Enum<WlmLteLinkSwitchErrorCode>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_TIME_OUT = new WlmLteLinkSwitchErrorCode(1);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_HARDWARE_UNPREPARED = new WlmLteLinkSwitchErrorCode(2);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_LINK_AGENT_UNPREPARED = new WlmLteLinkSwitchErrorCode(3);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_ROUTE_FAILED = new WlmLteLinkSwitchErrorCode(4);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_AGAIN = new WlmLteLinkSwitchErrorCode(5);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_REPEAT_REQUEST = new WlmLteLinkSwitchErrorCode(6);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_NO_DEVICE = new WlmLteLinkSwitchErrorCode(7);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_INTERNAL_ERROR = new WlmLteLinkSwitchErrorCode(8);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_ERROR_PARAMETER = new WlmLteLinkSwitchErrorCode(9);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_ERROR_NEGOTIATION = new WlmLteLinkSwitchErrorCode(10);
    public static final /* enum */ WlmLteLinkSwitchErrorCode SWITCH_ERROR_NO_TARGET_DEVICE = new WlmLteLinkSwitchErrorCode(11);
    public static final /* enum */ WlmLteLinkSwitchErrorCode UNKNOWN = new WlmLteLinkSwitchErrorCode(65535);
    private int value;
    private static final WlmLteLinkSwitchErrorCode[] allValues;
    private static final /* synthetic */ WlmLteLinkSwitchErrorCode[] $VALUES;

    public static WlmLteLinkSwitchErrorCode[] values() {
        return null;
    }

    public static WlmLteLinkSwitchErrorCode valueOf(String string) {
        return null;
    }

    private WlmLteLinkSwitchErrorCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmLteLinkSwitchErrorCode find(int n) {
        return null;
    }

    private static /* synthetic */ WlmLteLinkSwitchErrorCode[] $values() {
        return null;
    }

    static {
        $VALUES = WlmLteLinkSwitchErrorCode.$values();
        allValues = WlmLteLinkSwitchErrorCode.values();
    }
}

