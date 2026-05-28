/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class LiveViewType
extends Enum<LiveViewType>
implements JNIProguardKeepTag {
    public static final /* enum */ LiveViewType SDR = new LiveViewType(0);
    public static final /* enum */ LiveViewType LTE = new LiveViewType(1);
    public static final /* enum */ LiveViewType UNKNOWN = new LiveViewType(65535);
    private int value;
    private static final LiveViewType[] allValues;
    private static final /* synthetic */ LiveViewType[] $VALUES;

    public static LiveViewType[] values() {
        return null;
    }

    public static LiveViewType valueOf(String string) {
        return null;
    }

    private LiveViewType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiveViewType find(int n) {
        return null;
    }

    private static /* synthetic */ LiveViewType[] $values() {
        return null;
    }

    static {
        $VALUES = LiveViewType.$values();
        allValues = LiveViewType.values();
    }
}

