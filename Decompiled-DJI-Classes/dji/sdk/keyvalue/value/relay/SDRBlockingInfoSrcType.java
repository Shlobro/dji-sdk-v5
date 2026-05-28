/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class SDRBlockingInfoSrcType
extends Enum<SDRBlockingInfoSrcType>
implements JNIProguardKeepTag {
    public static final /* enum */ SDRBlockingInfoSrcType FUSION = new SDRBlockingInfoSrcType(0);
    public static final /* enum */ SDRBlockingInfoSrcType IMAGE_TRANSMISSION = new SDRBlockingInfoSrcType(3);
    public static final /* enum */ SDRBlockingInfoSrcType FLIGHT_CONTROLLER = new SDRBlockingInfoSrcType(4);
    public static final /* enum */ SDRBlockingInfoSrcType UNKNOWN = new SDRBlockingInfoSrcType(65535);
    private int value;
    private static final SDRBlockingInfoSrcType[] allValues;
    private static final /* synthetic */ SDRBlockingInfoSrcType[] $VALUES;

    public static SDRBlockingInfoSrcType[] values() {
        return null;
    }

    public static SDRBlockingInfoSrcType valueOf(String string) {
        return null;
    }

    private SDRBlockingInfoSrcType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDRBlockingInfoSrcType find(int n) {
        return null;
    }

    private static /* synthetic */ SDRBlockingInfoSrcType[] $values() {
        return null;
    }

    static {
        $VALUES = SDRBlockingInfoSrcType.$values();
        allValues = SDRBlockingInfoSrcType.values();
    }
}

