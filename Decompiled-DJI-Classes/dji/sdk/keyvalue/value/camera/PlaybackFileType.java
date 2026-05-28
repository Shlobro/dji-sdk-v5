/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PlaybackFileType
extends Enum<PlaybackFileType>
implements JNIProguardKeepTag {
    public static final /* enum */ PlaybackFileType JPG = new PlaybackFileType(0);
    public static final /* enum */ PlaybackFileType DMG = new PlaybackFileType(1);
    public static final /* enum */ PlaybackFileType VIDEO = new PlaybackFileType(2);
    public static final /* enum */ PlaybackFileType UNKNOWN = new PlaybackFileType(65535);
    private int value;
    private static final PlaybackFileType[] allValues;
    private static final /* synthetic */ PlaybackFileType[] $VALUES;

    public static PlaybackFileType[] values() {
        return null;
    }

    public static PlaybackFileType valueOf(String string) {
        return null;
    }

    private PlaybackFileType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PlaybackFileType find(int n) {
        return null;
    }

    private static /* synthetic */ PlaybackFileType[] $values() {
        return null;
    }

    static {
        $VALUES = PlaybackFileType.$values();
        allValues = PlaybackFileType.values();
    }
}

