/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.channel;

import dji.jni.JNIProguardKeepTag;

public final class ChannelMode
extends Enum<ChannelMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ChannelMode RC_A = new ChannelMode(1);
    public static final /* enum */ ChannelMode RC_B = new ChannelMode(2);
    public static final /* enum */ ChannelMode UNKNOWN = new ChannelMode(65535);
    private int value;
    private static final ChannelMode[] allValues;
    private static final /* synthetic */ ChannelMode[] $VALUES;

    public static ChannelMode[] values() {
        return null;
    }

    public static ChannelMode valueOf(String string) {
        return null;
    }

    private ChannelMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChannelMode find(int n) {
        return null;
    }

    private static /* synthetic */ ChannelMode[] $values() {
        return null;
    }

    static {
        $VALUES = ChannelMode.$values();
        allValues = ChannelMode.values();
    }
}

