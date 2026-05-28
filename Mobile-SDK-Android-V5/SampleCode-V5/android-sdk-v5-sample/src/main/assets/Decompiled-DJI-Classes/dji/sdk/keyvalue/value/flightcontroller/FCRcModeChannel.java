/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCRcModeChannel
extends Enum<FCRcModeChannel>
implements JNIProguardKeepTag {
    public static final /* enum */ FCRcModeChannel CHANNEL_A = new FCRcModeChannel(1);
    public static final /* enum */ FCRcModeChannel CHANNEL_P = new FCRcModeChannel(2);
    public static final /* enum */ FCRcModeChannel CHANNEL_NAV = new FCRcModeChannel(3);
    public static final /* enum */ FCRcModeChannel CHANNEL_FPV = new FCRcModeChannel(4);
    public static final /* enum */ FCRcModeChannel CHANNEL_FARM = new FCRcModeChannel(5);
    public static final /* enum */ FCRcModeChannel CHANNEL_S = new FCRcModeChannel(6);
    public static final /* enum */ FCRcModeChannel CHANNEL_F = new FCRcModeChannel(7);
    public static final /* enum */ FCRcModeChannel CHANNEL_M = new FCRcModeChannel(8);
    public static final /* enum */ FCRcModeChannel CHANNEL_G = new FCRcModeChannel(9);
    public static final /* enum */ FCRcModeChannel CHANNEL_T = new FCRcModeChannel(10);
    public static final /* enum */ FCRcModeChannel UNKNOWN = new FCRcModeChannel(65535);
    private int value;
    private static final FCRcModeChannel[] allValues;
    private static final /* synthetic */ FCRcModeChannel[] $VALUES;

    public static FCRcModeChannel[] values() {
        return null;
    }

    public static FCRcModeChannel valueOf(String string) {
        return null;
    }

    private FCRcModeChannel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCRcModeChannel find(int n) {
        return null;
    }

    private static /* synthetic */ FCRcModeChannel[] $values() {
        return null;
    }

    static {
        $VALUES = FCRcModeChannel.$values();
        allValues = FCRcModeChannel.values();
    }
}

