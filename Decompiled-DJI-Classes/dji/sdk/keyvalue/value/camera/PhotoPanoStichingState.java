/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoPanoStichingState
extends Enum<PhotoPanoStichingState>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoPanoStichingState IDLE = new PhotoPanoStichingState(0);
    public static final /* enum */ PhotoPanoStichingState SUCCEEDED = new PhotoPanoStichingState(1);
    public static final /* enum */ PhotoPanoStichingState IN_PROGRESS = new PhotoPanoStichingState(2);
    public static final /* enum */ PhotoPanoStichingState FAILED = new PhotoPanoStichingState(3);
    public static final /* enum */ PhotoPanoStichingState UNKNOWN = new PhotoPanoStichingState(65535);
    private int value;
    private static final PhotoPanoStichingState[] allValues;
    private static final /* synthetic */ PhotoPanoStichingState[] $VALUES;

    public static PhotoPanoStichingState[] values() {
        return null;
    }

    public static PhotoPanoStichingState valueOf(String string) {
        return null;
    }

    private PhotoPanoStichingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoPanoStichingState find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoPanoStichingState[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoPanoStichingState.$values();
        allValues = PhotoPanoStichingState.values();
    }
}

