/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionPOIMode
extends Enum<VisionPOIMode>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionPOIMode NONE = new VisionPOIMode(0);
    public static final /* enum */ VisionPOIMode VISION = new VisionPOIMode(1);
    public static final /* enum */ VisionPOIMode GPS = new VisionPOIMode(2);
    public static final /* enum */ VisionPOIMode UNKNOWN = new VisionPOIMode(255);
    private int value;
    private static final VisionPOIMode[] allValues;
    private static final /* synthetic */ VisionPOIMode[] $VALUES;

    public static VisionPOIMode[] values() {
        return null;
    }

    public static VisionPOIMode valueOf(String string) {
        return null;
    }

    private VisionPOIMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionPOIMode find(int n) {
        return null;
    }

    private static /* synthetic */ VisionPOIMode[] $values() {
        return null;
    }

    static {
        $VALUES = VisionPOIMode.$values();
        allValues = VisionPOIMode.values();
    }
}

