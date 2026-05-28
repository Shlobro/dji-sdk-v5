/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum CameraType implements JNIProguardKeepTag
{
    DJICameraTypeFC350(0),
    DJICameraTypeFC550(1),
    DJICameraTypeFC260(2),
    DJICameraTypeFC300S(3),
    DJICameraTypeFC300X(4),
    DJICameraTypeFC550Raw(5),
    DJICameraTypeFC330X(6),
    DJICameraTypeTau640(7),
    ZENMUSE_XT(8),
    DJICameraTypeFC220(9),
    DJICameraTypeFC300XW(10),
    DJICameraTypeCV600(11),
    DJICameraTypeFC65XXUnknown(12),
    DJICameraTypeFC6310(13),
    ZENMUSE_X4s(14),
    ZENMUSE_X5s(15),
    ZENMUSE_X7(16),
    DJICameraTypeFC6540(17),
    DJICameraTypeFC220S(18),
    DJICameraTypeFC1102(19),
    ZENMUSE_X30(20),
    DJICameraTypeFC6310A(21),
    DJICameraTypeP3SE(22),
    MAVIC_AIR(23),
    FC300X_HG200(24),
    MAVIC_2_ZOOM(25),
    ZENMUSE_XT2(26),
    DJICameraTypeHG330(27),
    P4P_V2_CAMERA(28),
    MAVIC_2_PRO(29),
    Payload(31),
    AC101(33),
    DJICameraTypeFC336(37),
    DJICameraTypeFC245_IMX477(38),
    M200_V2_Camera(39),
    DJICameraTypeFC2403(40),
    ZENMUSE_XTS(41),
    DJICameraTypeGD610DualLight(42),
    DJICameraTypeGD610TripleLight(43),
    MAVIC_MINI(44),
    MAVIC_AIR_2(45),
    WM170_GLASS(46),
    OSMO_POCKET_2(47),
    AC201(48),
    MAVIC_MINI_2(49),
    ZENMUSE_L1(50),
    MAVIC_AIR_2S(51),
    DJICameraTypePM320DualLight(52),
    DJICameraTypePM320TripleLight(53),
    WM260(54),
    MAVIC_MINI_SE(56),
    OSMO_ACTION_2_HASSELBLAD(57),
    OSMO_ACTION_2(62),
    WM169(58),
    WM162(60),
    GD612(61),
    WM630(63),
    WM265_E(66),
    WM265_T(67),
    WM265_M(68),
    AC202(69),
    HG212(70),
    TA101(71),
    DJICameraTypeHasselH6D50C(166),
    DJICameraTypeHasselH6D100C(167),
    UNKNOWN(65535);

    private int value;
    private static final CameraType[] allValues;

    private CameraType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static CameraType find(int value) {
        CameraType result = null;
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
        allValues = CameraType.values();
    }
}

