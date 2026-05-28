/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class ChannelID
extends Enum<ChannelID>
implements JNIProguardKeepTag {
    public static final /* enum */ ChannelID CHANNEL_1 = new ChannelID(0);
    public static final /* enum */ ChannelID CHANNEL_2 = new ChannelID(1);
    public static final /* enum */ ChannelID CHANNEL_3 = new ChannelID(2);
    public static final /* enum */ ChannelID CHANNEL_ALL = new ChannelID(255);
    public static final /* enum */ ChannelID UNKNOWN = new ChannelID(65535);
    private int value;
    private static final ChannelID[] allValues;
    private static final /* synthetic */ ChannelID[] $VALUES;

    public static ChannelID[] values() {
        return null;
    }

    public static ChannelID valueOf(String string) {
        return null;
    }

    private ChannelID(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChannelID find(int n) {
        return null;
    }

    private static /* synthetic */ ChannelID[] $values() {
        return null;
    }

    static {
        $VALUES = ChannelID.$values();
        allValues = ChannelID.values();
    }
}

