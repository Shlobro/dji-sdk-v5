/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class VideoBitrateMode
extends Enum<VideoBitrateMode>
implements JNIProguardKeepTag {
    public static final /* enum */ VideoBitrateMode AUTO = new VideoBitrateMode(0);
    public static final /* enum */ VideoBitrateMode CBR = new VideoBitrateMode(1);
    public static final /* enum */ VideoBitrateMode VBR = new VideoBitrateMode(2);
    public static final /* enum */ VideoBitrateMode UNKNOWN = new VideoBitrateMode(65535);
    private int value;
    private static final VideoBitrateMode[] allValues;
    private static final /* synthetic */ VideoBitrateMode[] $VALUES;

    public static VideoBitrateMode[] values() {
        return null;
    }

    public static VideoBitrateMode valueOf(String string) {
        return null;
    }

    private VideoBitrateMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VideoBitrateMode find(int n) {
        return null;
    }

    private static /* synthetic */ VideoBitrateMode[] $values() {
        return null;
    }

    static {
        $VALUES = VideoBitrateMode.$values();
        allValues = VideoBitrateMode.values();
    }
}

