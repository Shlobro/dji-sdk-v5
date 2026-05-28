/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class TapZoomMode
extends Enum<TapZoomMode>
implements JNIProguardKeepTag {
    public static final /* enum */ TapZoomMode GIMBAL_LOCK = new TapZoomMode(0);
    public static final /* enum */ TapZoomMode GIMBAL_FOLLOW = new TapZoomMode(1);
    public static final /* enum */ TapZoomMode UNKNOWN = new TapZoomMode(65535);
    private int value;
    private static final TapZoomMode[] allValues;
    private static final /* synthetic */ TapZoomMode[] $VALUES;

    public static TapZoomMode[] values() {
        return null;
    }

    public static TapZoomMode valueOf(String string) {
        return null;
    }

    private TapZoomMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TapZoomMode find(int n) {
        return null;
    }

    private static /* synthetic */ TapZoomMode[] $values() {
        return null;
    }

    static {
        $VALUES = TapZoomMode.$values();
        allValues = TapZoomMode.values();
    }
}

