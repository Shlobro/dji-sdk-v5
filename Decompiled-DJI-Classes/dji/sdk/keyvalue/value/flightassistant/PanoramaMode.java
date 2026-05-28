/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class PanoramaMode
extends Enum<PanoramaMode>
implements JNIProguardKeepTag {
    public static final /* enum */ PanoramaMode ABORT = new PanoramaMode(0);
    public static final /* enum */ PanoramaMode CAPTURE = new PanoramaMode(1);
    public static final /* enum */ PanoramaMode RELEASE = new PanoramaMode(2);
    public static final /* enum */ PanoramaMode BY_3X1 = new PanoramaMode(3);
    public static final /* enum */ PanoramaMode BOKEH = new PanoramaMode(4);
    public static final /* enum */ PanoramaMode GESTURE = new PanoramaMode(5);
    public static final /* enum */ PanoramaMode BY_1X3 = new PanoramaMode(6);
    public static final /* enum */ PanoramaMode BY_3X3 = new PanoramaMode(7);
    public static final /* enum */ PanoramaMode SPHERE = new PanoramaMode(8);
    public static final /* enum */ PanoramaMode BY_3X7 = new PanoramaMode(9);
    public static final /* enum */ PanoramaMode SUPER_SR = new PanoramaMode(10);
    public static final /* enum */ PanoramaMode UNKNOWN = new PanoramaMode(255);
    private int value;
    private static final PanoramaMode[] allValues;
    private static final /* synthetic */ PanoramaMode[] $VALUES;

    public static PanoramaMode[] values() {
        return null;
    }

    public static PanoramaMode valueOf(String string) {
        return null;
    }

    private PanoramaMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PanoramaMode find(int n) {
        return null;
    }

    private static /* synthetic */ PanoramaMode[] $values() {
        return null;
    }

    static {
        $VALUES = PanoramaMode.$values();
        allValues = PanoramaMode.values();
    }
}

