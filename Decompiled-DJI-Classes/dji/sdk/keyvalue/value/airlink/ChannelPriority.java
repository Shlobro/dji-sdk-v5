/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class ChannelPriority
extends Enum<ChannelPriority>
implements JNIProguardKeepTag {
    public static final /* enum */ ChannelPriority HIGH = new ChannelPriority(0);
    public static final /* enum */ ChannelPriority MEDIUM = new ChannelPriority(1);
    public static final /* enum */ ChannelPriority LOW = new ChannelPriority(2);
    public static final /* enum */ ChannelPriority HIGHEST = new ChannelPriority(3);
    public static final /* enum */ ChannelPriority UNKNOWN = new ChannelPriority(65535);
    private int value;
    private static final ChannelPriority[] allValues;
    private static final /* synthetic */ ChannelPriority[] $VALUES;

    public static ChannelPriority[] values() {
        return null;
    }

    public static ChannelPriority valueOf(String string) {
        return null;
    }

    private ChannelPriority(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChannelPriority find(int n) {
        return null;
    }

    private static /* synthetic */ ChannelPriority[] $values() {
        return null;
    }

    static {
        $VALUES = ChannelPriority.$values();
        allValues = ChannelPriority.values();
    }
}

