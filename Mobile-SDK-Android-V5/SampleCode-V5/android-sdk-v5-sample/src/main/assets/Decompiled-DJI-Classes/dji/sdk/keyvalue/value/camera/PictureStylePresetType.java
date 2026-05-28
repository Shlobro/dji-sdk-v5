/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PictureStylePresetType
extends Enum<PictureStylePresetType>
implements JNIProguardKeepTag {
    public static final /* enum */ PictureStylePresetType STANDARD = new PictureStylePresetType(0);
    public static final /* enum */ PictureStylePresetType LANDSCAPE = new PictureStylePresetType(1);
    public static final /* enum */ PictureStylePresetType SOFT = new PictureStylePresetType(2);
    public static final /* enum */ PictureStylePresetType CUSTOM = new PictureStylePresetType(3);
    public static final /* enum */ PictureStylePresetType UNKNOWN = new PictureStylePresetType(65535);
    private int value;
    private static final PictureStylePresetType[] allValues;
    private static final /* synthetic */ PictureStylePresetType[] $VALUES;

    public static PictureStylePresetType[] values() {
        return null;
    }

    public static PictureStylePresetType valueOf(String string) {
        return null;
    }

    private PictureStylePresetType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PictureStylePresetType find(int n) {
        return null;
    }

    private static /* synthetic */ PictureStylePresetType[] $values() {
        return null;
    }

    static {
        $VALUES = PictureStylePresetType.$values();
        allValues = PictureStylePresetType.values();
    }
}

