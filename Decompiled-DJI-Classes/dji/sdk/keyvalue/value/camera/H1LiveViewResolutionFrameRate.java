/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class H1LiveViewResolutionFrameRate
extends Enum<H1LiveViewResolutionFrameRate>
implements JNIProguardKeepTag {
    public static final /* enum */ H1LiveViewResolutionFrameRate VIEW_720P_30FPS = new H1LiveViewResolutionFrameRate(0);
    public static final /* enum */ H1LiveViewResolutionFrameRate VIEW_1080P_30FPS = new H1LiveViewResolutionFrameRate(1);
    public static final /* enum */ H1LiveViewResolutionFrameRate VIEW_720P_60FPS = new H1LiveViewResolutionFrameRate(2);
    public static final /* enum */ H1LiveViewResolutionFrameRate UNKNOWN = new H1LiveViewResolutionFrameRate(65535);
    private int value;
    private static final H1LiveViewResolutionFrameRate[] allValues;
    private static final /* synthetic */ H1LiveViewResolutionFrameRate[] $VALUES;

    public static H1LiveViewResolutionFrameRate[] values() {
        return null;
    }

    public static H1LiveViewResolutionFrameRate valueOf(String string) {
        return null;
    }

    private H1LiveViewResolutionFrameRate(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static H1LiveViewResolutionFrameRate find(int n) {
        return null;
    }

    private static /* synthetic */ H1LiveViewResolutionFrameRate[] $values() {
        return null;
    }

    static {
        $VALUES = H1LiveViewResolutionFrameRate.$values();
        allValues = H1LiveViewResolutionFrameRate.values();
    }
}

