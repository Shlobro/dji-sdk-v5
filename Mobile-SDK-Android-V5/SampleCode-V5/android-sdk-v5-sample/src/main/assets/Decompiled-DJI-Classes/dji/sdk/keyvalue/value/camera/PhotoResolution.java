/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoResolution
extends Enum<PhotoResolution>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoResolution RESOLUTION_12MP = new PhotoResolution(12);
    public static final /* enum */ PhotoResolution RESOLUTION_20MP = new PhotoResolution(20);
    public static final /* enum */ PhotoResolution RESOLUTION_48MP = new PhotoResolution(48);
    public static final /* enum */ PhotoResolution UNKNOWN = new PhotoResolution(65535);
    private int value;
    private static final PhotoResolution[] allValues;
    private static final /* synthetic */ PhotoResolution[] $VALUES;

    public static PhotoResolution[] values() {
        return null;
    }

    public static PhotoResolution valueOf(String string) {
        return null;
    }

    private PhotoResolution(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoResolution find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoResolution[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoResolution.$values();
        allValues = PhotoResolution.values();
    }
}

