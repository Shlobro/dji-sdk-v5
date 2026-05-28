/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AreaRoiSource
extends Enum<AreaRoiSource>
implements JNIProguardKeepTag {
    public static final /* enum */ AreaRoiSource None = new AreaRoiSource(0);
    public static final /* enum */ AreaRoiSource App = new AreaRoiSource(1);
    public static final /* enum */ AreaRoiSource Ml = new AreaRoiSource(2);
    public static final /* enum */ AreaRoiSource Nav = new AreaRoiSource(3);
    public static final /* enum */ AreaRoiSource Remote = new AreaRoiSource(4);
    public static final /* enum */ AreaRoiSource Gui = new AreaRoiSource(5);
    public static final /* enum */ AreaRoiSource UNKNOWN = new AreaRoiSource(65535);
    private int value;
    private static final AreaRoiSource[] allValues;
    private static final /* synthetic */ AreaRoiSource[] $VALUES;

    public static AreaRoiSource[] values() {
        return null;
    }

    public static AreaRoiSource valueOf(String string) {
        return null;
    }

    private AreaRoiSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AreaRoiSource find(int n) {
        return null;
    }

    private static /* synthetic */ AreaRoiSource[] $values() {
        return null;
    }

    static {
        $VALUES = AreaRoiSource.$values();
        allValues = AreaRoiSource.values();
    }
}

