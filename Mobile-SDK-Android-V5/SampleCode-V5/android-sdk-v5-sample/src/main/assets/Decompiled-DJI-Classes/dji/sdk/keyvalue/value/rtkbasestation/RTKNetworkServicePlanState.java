/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKNetworkServicePlanState
extends Enum<RTKNetworkServicePlanState>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKNetworkServicePlanState UNACTIVATED = new RTKNetworkServicePlanState(0);
    public static final /* enum */ RTKNetworkServicePlanState ACTIVATED = new RTKNetworkServicePlanState(1);
    public static final /* enum */ RTKNetworkServicePlanState EXPIRED = new RTKNetworkServicePlanState(2);
    public static final /* enum */ RTKNetworkServicePlanState UNKNOWN = new RTKNetworkServicePlanState(65535);
    private int value;
    private static final RTKNetworkServicePlanState[] allValues;
    private static final /* synthetic */ RTKNetworkServicePlanState[] $VALUES;

    public static RTKNetworkServicePlanState[] values() {
        return null;
    }

    public static RTKNetworkServicePlanState valueOf(String string) {
        return null;
    }

    private RTKNetworkServicePlanState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKNetworkServicePlanState find(int n) {
        return null;
    }

    private static /* synthetic */ RTKNetworkServicePlanState[] $values() {
        return null;
    }

    static {
        $VALUES = RTKNetworkServicePlanState.$values();
        allValues = RTKNetworkServicePlanState.values();
    }
}

