/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraSDCardState
extends Enum<CameraSDCardState>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraSDCardState NORMAL = new CameraSDCardState(0);
    public static final /* enum */ CameraSDCardState NOT_INSERTED = new CameraSDCardState(1);
    public static final /* enum */ CameraSDCardState INVALID = new CameraSDCardState(2);
    public static final /* enum */ CameraSDCardState READ_ONLY = new CameraSDCardState(3);
    public static final /* enum */ CameraSDCardState FORMAT_NEEDED = new CameraSDCardState(4);
    public static final /* enum */ CameraSDCardState FORMATTING = new CameraSDCardState(5);
    public static final /* enum */ CameraSDCardState INVALID_FILE_SYSTEM = new CameraSDCardState(6);
    public static final /* enum */ CameraSDCardState BUSY = new CameraSDCardState(7);
    public static final /* enum */ CameraSDCardState FULL = new CameraSDCardState(8);
    public static final /* enum */ CameraSDCardState SLOW = new CameraSDCardState(9);
    public static final /* enum */ CameraSDCardState UNKNOWN_ERROR = new CameraSDCardState(10);
    public static final /* enum */ CameraSDCardState NO_REMAINING_FILE_INDICES = new CameraSDCardState(11);
    public static final /* enum */ CameraSDCardState INITIALIZING = new CameraSDCardState(12);
    public static final /* enum */ CameraSDCardState FORMAT_RECOMMENDED = new CameraSDCardState(13);
    public static final /* enum */ CameraSDCardState RECOVERING_FILES = new CameraSDCardState(14);
    public static final /* enum */ CameraSDCardState WRITING_SLOWLY = new CameraSDCardState(15);
    public static final /* enum */ CameraSDCardState USB_CONNECTED = new CameraSDCardState(16);
    public static final /* enum */ CameraSDCardState UNKNOWN = new CameraSDCardState(65535);
    private int value;
    private static final CameraSDCardState[] allValues;
    private static final /* synthetic */ CameraSDCardState[] $VALUES;

    public static CameraSDCardState[] values() {
        return null;
    }

    public static CameraSDCardState valueOf(String string) {
        return null;
    }

    private CameraSDCardState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraSDCardState find(int n) {
        return null;
    }

    private static /* synthetic */ CameraSDCardState[] $values() {
        return null;
    }

    static {
        $VALUES = CameraSDCardState.$values();
        allValues = CameraSDCardState.values();
    }
}

