/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class ChannelType
extends Enum<ChannelType>
implements JNIProguardKeepTag {
    public static final /* enum */ ChannelType SDR_MA = new ChannelType(0);
    public static final /* enum */ ChannelType SDR_IP = new ChannelType(1);
    public static final /* enum */ ChannelType LTE = new ChannelType(2);
    public static final /* enum */ ChannelType UNKNOWN = new ChannelType(65535);
    private int value;
    private static final ChannelType[] allValues;
    private static final /* synthetic */ ChannelType[] $VALUES;

    public static ChannelType[] values() {
        return null;
    }

    public static ChannelType valueOf(String string) {
        return null;
    }

    private ChannelType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChannelType find(int n) {
        return null;
    }

    private static /* synthetic */ ChannelType[] $values() {
        return null;
    }

    static {
        $VALUES = ChannelType.$values();
        allValues = ChannelType.values();
    }
}

