/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RCModeChannelType
extends Enum<RCModeChannelType>
implements JNIProguardKeepTag {
    public static final /* enum */ RCModeChannelType RC_MODE_CHANNEL_A = new RCModeChannelType(1);
    public static final /* enum */ RCModeChannelType RC_MODE_CHANNEL_B = new RCModeChannelType(2);
    public static final /* enum */ RCModeChannelType UNKNOWN = new RCModeChannelType(255);
    private int value;
    private static final RCModeChannelType[] allValues;
    private static final /* synthetic */ RCModeChannelType[] $VALUES;

    public static RCModeChannelType[] values() {
        return null;
    }

    public static RCModeChannelType valueOf(String string) {
        return null;
    }

    private RCModeChannelType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RCModeChannelType find(int n) {
        return null;
    }

    private static /* synthetic */ RCModeChannelType[] $values() {
        return null;
    }

    static {
        $VALUES = RCModeChannelType.$values();
        allValues = RCModeChannelType.values();
    }
}

