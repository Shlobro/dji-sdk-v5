/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class MultiControlChannel
extends Enum<MultiControlChannel>
implements JNIProguardKeepTag {
    public static final /* enum */ MultiControlChannel CHANNEL_A = new MultiControlChannel(1);
    public static final /* enum */ MultiControlChannel CHANNEL_B = new MultiControlChannel(2);
    public static final /* enum */ MultiControlChannel UNKNOWN = new MultiControlChannel(65535);
    private int value;
    private static final MultiControlChannel[] allValues;
    private static final /* synthetic */ MultiControlChannel[] $VALUES;

    public static MultiControlChannel[] values() {
        return null;
    }

    public static MultiControlChannel valueOf(String string) {
        return null;
    }

    private MultiControlChannel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MultiControlChannel find(int n) {
        return null;
    }

    private static /* synthetic */ MultiControlChannel[] $values() {
        return null;
    }

    static {
        $VALUES = MultiControlChannel.$values();
        allValues = MultiControlChannel.values();
    }
}

