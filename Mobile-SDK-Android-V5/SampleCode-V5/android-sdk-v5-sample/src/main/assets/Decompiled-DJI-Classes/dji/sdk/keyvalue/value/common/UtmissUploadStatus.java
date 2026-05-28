/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class UtmissUploadStatus
extends Enum<UtmissUploadStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ UtmissUploadStatus IDLE = new UtmissUploadStatus(0);
    public static final /* enum */ UtmissUploadStatus LIVE_UPLOAD = new UtmissUploadStatus(1);
    public static final /* enum */ UtmissUploadStatus CACHING = new UtmissUploadStatus(2);
    public static final /* enum */ UtmissUploadStatus LOST = new UtmissUploadStatus(3);
    public static final /* enum */ UtmissUploadStatus UNKNOWN = new UtmissUploadStatus(65535);
    private int value;
    private static final UtmissUploadStatus[] allValues;
    private static final /* synthetic */ UtmissUploadStatus[] $VALUES;

    public static UtmissUploadStatus[] values() {
        return null;
    }

    public static UtmissUploadStatus valueOf(String string) {
        return null;
    }

    private UtmissUploadStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UtmissUploadStatus find(int n) {
        return null;
    }

    private static /* synthetic */ UtmissUploadStatus[] $values() {
        return null;
    }

    static {
        $VALUES = UtmissUploadStatus.$values();
        allValues = UtmissUploadStatus.values();
    }
}

