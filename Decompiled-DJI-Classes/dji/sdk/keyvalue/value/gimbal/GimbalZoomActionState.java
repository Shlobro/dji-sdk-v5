/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalZoomActionState
extends Enum<GimbalZoomActionState>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalZoomActionState STOPPED = new GimbalZoomActionState(0);
    public static final /* enum */ GimbalZoomActionState FROM_WIDE_TO_TELE = new GimbalZoomActionState(1);
    public static final /* enum */ GimbalZoomActionState FROM_TELE_TO_WIDE = new GimbalZoomActionState(2);
    public static final /* enum */ GimbalZoomActionState UNKNOWN = new GimbalZoomActionState(65535);
    private int value;
    private static final GimbalZoomActionState[] allValues;
    private static final /* synthetic */ GimbalZoomActionState[] $VALUES;

    public static GimbalZoomActionState[] values() {
        return null;
    }

    public static GimbalZoomActionState valueOf(String string) {
        return null;
    }

    private GimbalZoomActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalZoomActionState find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalZoomActionState[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalZoomActionState.$values();
        allValues = GimbalZoomActionState.values();
    }
}

