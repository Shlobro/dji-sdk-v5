/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SSDColor
extends Enum<SSDColor>
implements JNIProguardKeepTag {
    public static final /* enum */ SSDColor STANDARD = new SSDColor(0);
    public static final /* enum */ SSDColor DLOG = new SSDColor(1);
    public static final /* enum */ SSDColor REC_709 = new SSDColor(2);
    public static final /* enum */ SSDColor CINE_LIKE = new SSDColor(3);
    public static final /* enum */ SSDColor RAW_COLOR = new SSDColor(254);
    public static final /* enum */ SSDColor UNKNOWN = new SSDColor(65535);
    private int value;
    private static final SSDColor[] allValues;
    private static final /* synthetic */ SSDColor[] $VALUES;

    public static SSDColor[] values() {
        return null;
    }

    public static SSDColor valueOf(String string) {
        return null;
    }

    private SSDColor(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SSDColor find(int n) {
        return null;
    }

    private static /* synthetic */ SSDColor[] $values() {
        return null;
    }

    static {
        $VALUES = SSDColor.$values();
        allValues = SSDColor.values();
    }
}

