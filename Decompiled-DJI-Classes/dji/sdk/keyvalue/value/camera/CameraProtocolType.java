/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraProtocolType
extends Enum<CameraProtocolType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraProtocolType DEFAULT = new CameraProtocolType(0);
    public static final /* enum */ CameraProtocolType APP2_LIB = new CameraProtocolType(1);
    public static final /* enum */ CameraProtocolType SUPPORT2_7K_3S = new CameraProtocolType(2);
    public static final /* enum */ CameraProtocolType FC350SUPPORT1080_120 = new CameraProtocolType(3);
    public static final /* enum */ CameraProtocolType FC350SUPPORT_DIGIZOOMANDOSMONO368 = new CameraProtocolType(4);
    public static final /* enum */ CameraProtocolType DIGITAL_EFFECT_UPDATE = new CameraProtocolType(5);
    public static final /* enum */ CameraProtocolType MECHANICAL_SHUTTER = new CameraProtocolType(6);
    public static final /* enum */ CameraProtocolType NEW_DIGITAL_EFFECT = new CameraProtocolType(7);
    public static final /* enum */ CameraProtocolType SUPPORT_EXFAT = new CameraProtocolType(8);
    public static final /* enum */ CameraProtocolType SUPPORT_AFC = new CameraProtocolType(9);
    public static final /* enum */ CameraProtocolType SUPPORT_5SRAW = new CameraProtocolType(10);
    public static final /* enum */ CameraProtocolType LOW_LATENCY_MODE = new CameraProtocolType(11);
    public static final /* enum */ CameraProtocolType UNKNOWN = new CameraProtocolType(65535);
    private int value;
    private static final CameraProtocolType[] allValues;
    private static final /* synthetic */ CameraProtocolType[] $VALUES;

    public static CameraProtocolType[] values() {
        return null;
    }

    public static CameraProtocolType valueOf(String string) {
        return null;
    }

    private CameraProtocolType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraProtocolType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraProtocolType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraProtocolType.$values();
        allValues = CameraProtocolType.values();
    }
}

