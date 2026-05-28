/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class VisionAssistDirection
extends Enum<VisionAssistDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ VisionAssistDirection OFF = new VisionAssistDirection(0);
    public static final /* enum */ VisionAssistDirection FRONT = new VisionAssistDirection(1);
    public static final /* enum */ VisionAssistDirection BACK = new VisionAssistDirection(2);
    public static final /* enum */ VisionAssistDirection LEFT = new VisionAssistDirection(3);
    public static final /* enum */ VisionAssistDirection RIGHT = new VisionAssistDirection(4);
    public static final /* enum */ VisionAssistDirection UP = new VisionAssistDirection(5);
    public static final /* enum */ VisionAssistDirection DOWN = new VisionAssistDirection(6);
    public static final /* enum */ VisionAssistDirection AUTO = new VisionAssistDirection(127);
    public static final /* enum */ VisionAssistDirection UNKNOWN = new VisionAssistDirection(255);
    private int value;
    private static final VisionAssistDirection[] allValues;
    private static final /* synthetic */ VisionAssistDirection[] $VALUES;

    public static VisionAssistDirection[] values() {
        return null;
    }

    public static VisionAssistDirection valueOf(String string) {
        return null;
    }

    private VisionAssistDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisionAssistDirection find(int n) {
        return null;
    }

    private static /* synthetic */ VisionAssistDirection[] $values() {
        return null;
    }

    static {
        $VALUES = VisionAssistDirection.$values();
        allValues = VisionAssistDirection.values();
    }
}

