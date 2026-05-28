/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class BridgeDataType
extends Enum<BridgeDataType>
implements JNIProguardKeepTag {
    public static final /* enum */ BridgeDataType COMPOSITE = new BridgeDataType(0);
    public static final /* enum */ BridgeDataType V1 = new BridgeDataType(1);
    public static final /* enum */ BridgeDataType MEDIA = new BridgeDataType(2);
    public static final /* enum */ BridgeDataType RAW_VIDEO = new BridgeDataType(3);
    public static final /* enum */ BridgeDataType CSDK_SEND_V1 = new BridgeDataType(4);
    public static final /* enum */ BridgeDataType LOGDATA = new BridgeDataType(5);
    public static final /* enum */ BridgeDataType MULTI_VIDEO = new BridgeDataType(6);
    public static final /* enum */ BridgeDataType UNKNOWN = new BridgeDataType(65535);
    private int value;
    private static final BridgeDataType[] allValues;
    private static final /* synthetic */ BridgeDataType[] $VALUES;

    public static BridgeDataType[] values() {
        return null;
    }

    public static BridgeDataType valueOf(String string) {
        return null;
    }

    private BridgeDataType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BridgeDataType find(int n) {
        return null;
    }

    private static /* synthetic */ BridgeDataType[] $values() {
        return null;
    }

    static {
        $VALUES = BridgeDataType.$values();
        allValues = BridgeDataType.values();
    }
}

