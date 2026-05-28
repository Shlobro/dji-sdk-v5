/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class MediaFileSyncStatus
extends Enum<MediaFileSyncStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaFileSyncStatus IDLE = new MediaFileSyncStatus(0);
    public static final /* enum */ MediaFileSyncStatus SYNCHRONIZING = new MediaFileSyncStatus(1);
    public static final /* enum */ MediaFileSyncStatus UNKNOWN = new MediaFileSyncStatus(65535);
    private int value;
    private static final MediaFileSyncStatus[] allValues;
    private static final /* synthetic */ MediaFileSyncStatus[] $VALUES;

    public static MediaFileSyncStatus[] values() {
        return null;
    }

    public static MediaFileSyncStatus valueOf(String string) {
        return null;
    }

    private MediaFileSyncStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaFileSyncStatus find(int n) {
        return null;
    }

    private static /* synthetic */ MediaFileSyncStatus[] $values() {
        return null;
    }

    static {
        $VALUES = MediaFileSyncStatus.$values();
        allValues = MediaFileSyncStatus.values();
    }
}

