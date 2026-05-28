/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoBurstCount
extends Enum<PhotoBurstCount>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoBurstCount COUNT3 = new PhotoBurstCount(3);
    public static final /* enum */ PhotoBurstCount COUNT5 = new PhotoBurstCount(5);
    public static final /* enum */ PhotoBurstCount COUNT7 = new PhotoBurstCount(7);
    public static final /* enum */ PhotoBurstCount COUNT10 = new PhotoBurstCount(10);
    public static final /* enum */ PhotoBurstCount COUNT14 = new PhotoBurstCount(14);
    public static final /* enum */ PhotoBurstCount CONTINUOUS = new PhotoBurstCount(255);
    public static final /* enum */ PhotoBurstCount UNKNOWN = new PhotoBurstCount(65535);
    private int value;
    private static final PhotoBurstCount[] allValues;
    private static final /* synthetic */ PhotoBurstCount[] $VALUES;

    public static PhotoBurstCount[] values() {
        return null;
    }

    public static PhotoBurstCount valueOf(String string) {
        return null;
    }

    private PhotoBurstCount(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoBurstCount find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoBurstCount[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoBurstCount.$values();
        allValues = PhotoBurstCount.values();
    }
}

