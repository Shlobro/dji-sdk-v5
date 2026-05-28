/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WaylinePayloadType implements JNIProguardKeepTag
{
    P4(6),
    P4P_PRO(13),
    ZENMUSE_X7(16),
    ZENMUSE_Z30(20),
    P4A(21),
    ZENMUSE_XT2(26),
    P4P_PRO_V2(28),
    WM245_ZOOM(38),
    FPV(39),
    WM246(40),
    ZENMUSE_XTS(41),
    ZENMUSE_H20(42),
    ZENMUSE_H20T(43),
    ZENMUSE_P1(50),
    PM320_DUAL(52),
    PM320_TRIPLE(53),
    ZENMUSE_H20N(61),
    ZENMUSE_L1(90742),
    P4R(5000),
    WM630(63),
    WM265E(66),
    WM265T(67),
    WM265M(68),
    EA220E(80),
    EA220T(81),
    EP300_E(82),
    EP300_T(83),
    EP810(84),
    WA345_E(88),
    WA345_T(89),
    EA230_E(98),
    EA230_T(99),
    PAYLOAD_MEGAPHONE(65532),
    PAYLOAD_SEARCHLIGHT(65533),
    PAYLOAD_CAMERA(65534),
    UNKNOWN(65535);

    private int value;
    private static final WaylinePayloadType[] allValues;

    private WaylinePayloadType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WaylinePayloadType find(int value) {
        WaylinePayloadType result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = WaylinePayloadType.values();
    }
}

