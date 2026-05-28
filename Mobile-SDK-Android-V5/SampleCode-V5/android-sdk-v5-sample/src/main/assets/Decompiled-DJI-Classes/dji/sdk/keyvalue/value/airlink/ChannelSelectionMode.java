/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class ChannelSelectionMode
extends Enum<ChannelSelectionMode>
implements JNIProguardKeepTag {
    public static final /* enum */ ChannelSelectionMode AUTO = new ChannelSelectionMode(0);
    public static final /* enum */ ChannelSelectionMode MANUAL = new ChannelSelectionMode(1);
    public static final /* enum */ ChannelSelectionMode UNKNOWN = new ChannelSelectionMode(65535);
    private int value;
    private static final ChannelSelectionMode[] allValues;
    private static final /* synthetic */ ChannelSelectionMode[] $VALUES;

    public static ChannelSelectionMode[] values() {
        return null;
    }

    public static ChannelSelectionMode valueOf(String string) {
        return null;
    }

    private ChannelSelectionMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ChannelSelectionMode find(int n) {
        return null;
    }

    private static /* synthetic */ ChannelSelectionMode[] $values() {
        return null;
    }

    static {
        $VALUES = ChannelSelectionMode.$values();
        allValues = ChannelSelectionMode.values();
    }
}

