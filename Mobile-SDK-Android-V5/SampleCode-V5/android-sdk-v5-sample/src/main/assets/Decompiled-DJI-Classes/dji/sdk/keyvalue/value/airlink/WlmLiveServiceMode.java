/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmLiveServiceMode
extends Enum<WlmLiveServiceMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmLiveServiceMode SDR = new WlmLiveServiceMode(0);
    public static final /* enum */ WlmLiveServiceMode HYBRID = new WlmLiveServiceMode(1);
    public static final /* enum */ WlmLiveServiceMode UNKNOWN = new WlmLiveServiceMode(255);
    private int value;
    private static final WlmLiveServiceMode[] allValues;
    private static final /* synthetic */ WlmLiveServiceMode[] $VALUES;

    public static WlmLiveServiceMode[] values() {
        return null;
    }

    public static WlmLiveServiceMode valueOf(String string) {
        return null;
    }

    private WlmLiveServiceMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmLiveServiceMode find(int n) {
        return null;
    }

    private static /* synthetic */ WlmLiveServiceMode[] $values() {
        return null;
    }

    static {
        $VALUES = WlmLiveServiceMode.$values();
        allValues = WlmLiveServiceMode.values();
    }
}

