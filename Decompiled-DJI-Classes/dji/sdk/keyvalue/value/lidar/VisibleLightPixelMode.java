/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class VisibleLightPixelMode
extends Enum<VisibleLightPixelMode>
implements JNIProguardKeepTag {
    public static final /* enum */ VisibleLightPixelMode PIXEL_OFF = new VisibleLightPixelMode(0);
    public static final /* enum */ VisibleLightPixelMode PIXEL_ON_TIMED_SHOT_ON = new VisibleLightPixelMode(1);
    public static final /* enum */ VisibleLightPixelMode PIXEL_ON_TIMED_SHOT_OFF = new VisibleLightPixelMode(2);
    public static final /* enum */ VisibleLightPixelMode UNKNOWN = new VisibleLightPixelMode(65535);
    private int value;
    private static final VisibleLightPixelMode[] allValues;
    private static final /* synthetic */ VisibleLightPixelMode[] $VALUES;

    public static VisibleLightPixelMode[] values() {
        return null;
    }

    public static VisibleLightPixelMode valueOf(String string) {
        return null;
    }

    private VisibleLightPixelMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisibleLightPixelMode find(int n) {
        return null;
    }

    private static /* synthetic */ VisibleLightPixelMode[] $values() {
        return null;
    }

    static {
        $VALUES = VisibleLightPixelMode.$values();
        allValues = VisibleLightPixelMode.values();
    }
}

