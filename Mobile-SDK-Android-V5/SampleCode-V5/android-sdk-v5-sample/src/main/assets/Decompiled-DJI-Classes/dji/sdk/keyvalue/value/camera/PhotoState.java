/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoState
extends Enum<PhotoState>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoState IDLE = new PhotoState(0);
    public static final /* enum */ PhotoState IN_SHOOTING = new PhotoState(1);
    public static final /* enum */ PhotoState STOPPED = new PhotoState(2);
    public static final /* enum */ PhotoState STORAGE_ERROR = new PhotoState(3);
    public static final /* enum */ PhotoState FAIL = new PhotoState(4);
    public static final /* enum */ PhotoState EXPOSURE_DONE = new PhotoState(5);
    public static final /* enum */ PhotoState SHOOT_DONE = new PhotoState(6);
    public static final /* enum */ PhotoState UNKNOWN = new PhotoState(65535);
    private int value;
    private static final PhotoState[] allValues;
    private static final /* synthetic */ PhotoState[] $VALUES;

    public static PhotoState[] values() {
        return null;
    }

    public static PhotoState valueOf(String string) {
        return null;
    }

    private PhotoState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoState find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoState[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoState.$values();
        allValues = PhotoState.values();
    }
}

