/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PhotoDeletionCommandType
extends Enum<PhotoDeletionCommandType>
implements JNIProguardKeepTag {
    public static final /* enum */ PhotoDeletionCommandType CONFIRM_SINGLE = new PhotoDeletionCommandType(0);
    public static final /* enum */ PhotoDeletionCommandType CONFIRM_MULTIPLE = new PhotoDeletionCommandType(1);
    public static final /* enum */ PhotoDeletionCommandType ENTER_MULTI_MODE = new PhotoDeletionCommandType(2);
    public static final /* enum */ PhotoDeletionCommandType EXIT_MULTI_MODE = new PhotoDeletionCommandType(3);
    public static final /* enum */ PhotoDeletionCommandType PHOTO_INDEX = new PhotoDeletionCommandType(4);
    public static final /* enum */ PhotoDeletionCommandType UNKNOWN = new PhotoDeletionCommandType(65535);
    private int value;
    private static final PhotoDeletionCommandType[] allValues;
    private static final /* synthetic */ PhotoDeletionCommandType[] $VALUES;

    public static PhotoDeletionCommandType[] values() {
        return null;
    }

    public static PhotoDeletionCommandType valueOf(String string) {
        return null;
    }

    private PhotoDeletionCommandType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PhotoDeletionCommandType find(int n) {
        return null;
    }

    private static /* synthetic */ PhotoDeletionCommandType[] $values() {
        return null;
    }

    static {
        $VALUES = PhotoDeletionCommandType.$values();
        allValues = PhotoDeletionCommandType.values();
    }
}

