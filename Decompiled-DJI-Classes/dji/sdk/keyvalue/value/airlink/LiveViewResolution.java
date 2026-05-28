/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class LiveViewResolution
extends Enum<LiveViewResolution>
implements JNIProguardKeepTag {
    public static final /* enum */ LiveViewResolution R_270P = new LiveViewResolution(0);
    public static final /* enum */ LiveViewResolution R_480P = new LiveViewResolution(1);
    public static final /* enum */ LiveViewResolution R_540P = new LiveViewResolution(2);
    public static final /* enum */ LiveViewResolution R_720P = new LiveViewResolution(3);
    public static final /* enum */ LiveViewResolution R_1080P = new LiveViewResolution(4);
    public static final /* enum */ LiveViewResolution R_2P7K = new LiveViewResolution(5);
    public static final /* enum */ LiveViewResolution R_4K = new LiveViewResolution(6);
    public static final /* enum */ LiveViewResolution R_DEFAULT = new LiveViewResolution(255);
    public static final /* enum */ LiveViewResolution UNKNOWN = new LiveViewResolution(65535);
    private int value;
    private static final LiveViewResolution[] allValues;
    private static final /* synthetic */ LiveViewResolution[] $VALUES;

    public static LiveViewResolution[] values() {
        return null;
    }

    public static LiveViewResolution valueOf(String string) {
        return null;
    }

    private LiveViewResolution(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LiveViewResolution find(int n) {
        return null;
    }

    private static /* synthetic */ LiveViewResolution[] $values() {
        return null;
    }

    static {
        $VALUES = LiveViewResolution.$values();
        allValues = LiveViewResolution.values();
    }
}

