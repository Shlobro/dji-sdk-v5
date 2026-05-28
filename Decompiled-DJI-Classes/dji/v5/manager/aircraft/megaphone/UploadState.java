/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.megaphone;

public final class UploadState
extends Enum<UploadState> {
    public static final /* enum */ UploadState UPLOADING = new UploadState(0);
    public static final /* enum */ UploadState UPLOAD_SUCCESS = new UploadState(1);
    public static final /* enum */ UploadState UPLOAD_FAILED = new UploadState(2);
    public static final /* enum */ UploadState MD5_FAILED = new UploadState(3);
    public static final /* enum */ UploadState ABORTED = new UploadState(4);
    public static final /* enum */ UploadState UNKNOWN = new UploadState(65535);
    private final int value;
    private static UploadState[] mValues;
    private static final /* synthetic */ UploadState[] $VALUES;

    public static UploadState[] values() {
        return null;
    }

    public static UploadState valueOf(String string2) {
        return null;
    }

    private UploadState(int n2) {
    }

    private boolean _equals(int n) {
        return false;
    }

    public static UploadState[] getValues() {
        return null;
    }

    public static UploadState find(int n) {
        return null;
    }

    private static /* synthetic */ UploadState[] $values() {
        return null;
    }

    static {
        $VALUES = UploadState.$values();
    }
}

