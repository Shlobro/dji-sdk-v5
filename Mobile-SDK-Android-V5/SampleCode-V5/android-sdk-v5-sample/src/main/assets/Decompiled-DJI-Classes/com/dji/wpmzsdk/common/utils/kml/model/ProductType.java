/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum ProductType implements JNIProguardKeepTag
{
    UNRECOGNIZED(0),
    OSMO(5),
    P4(7),
    MAVIC_PRO(13),
    OSMO_PRO(18),
    OSMO_RAW(19),
    OSMO_PLUS(20),
    P4P(24),
    P4A(28),
    P4R(35),
    OSMO_MOBILE1(22),
    MAVIC_AIR(38),
    OSMO_ACTION(40),
    OSMO_POCKET(41),
    MAVIC_2(42),
    P4P_V2(44),
    OSMO_MOBILE2(45),
    MAVIC_2_ENTERPRISE(58),
    MAVIC_MINI(59),
    PM420(60),
    M200_V2_PRO(61),
    M200_V2_RTK(62),
    MG_T16(63),
    DRTK_2(64),
    OSMO_MOBILE3(65),
    MAVIC_AIR_2(67),
    PM430(70),
    PM431(170),
    FPV_SERIAL_2(73),
    WM232(75),
    MAVIC_MINI_2(76),
    WM162(103),
    OSMO_MOBILE5(142),
    OSMO_ACTION_2(143),
    OSMO_ACTION_2_HASSELBLAD(141),
    AC202(231),
    HG212(145),
    MG_T20(83),
    MG_500(84),
    MG_501(85),
    MG_600(100),
    MG_601(101),
    OSMO_POCKET2(229),
    OSMO_MOBILE4(228),
    OSMO_MOBILE6(227),
    OSMO_MOBILE5_SE(226),
    WM260(77),
    WM169(105),
    MAVIC_MINI_SE(96),
    PM320(116),
    WM630(117),
    WM265(118),
    TA101(128),
    EA210(129),
    UNKNOWN(65535);

    private int value;
    private static final ProductType[] allValues;

    private ProductType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static ProductType find(int value) {
        ProductType result = null;
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
        allValues = ProductType.values();
    }
}

