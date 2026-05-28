/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class MediaTaskPriority
extends Enum<MediaTaskPriority>
implements JNIProguardKeepTag {
    public static final /* enum */ MediaTaskPriority DEFAULT = new MediaTaskPriority(0);
    public static final /* enum */ MediaTaskPriority MIDDLE = new MediaTaskPriority(1);
    public static final /* enum */ MediaTaskPriority HIGH = new MediaTaskPriority(2);
    public static final /* enum */ MediaTaskPriority UNKNOWN = new MediaTaskPriority(65535);
    private int value;
    private static final MediaTaskPriority[] allValues;
    private static final /* synthetic */ MediaTaskPriority[] $VALUES;

    public static MediaTaskPriority[] values() {
        return null;
    }

    public static MediaTaskPriority valueOf(String string) {
        return null;
    }

    private MediaTaskPriority(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MediaTaskPriority find(int n) {
        return null;
    }

    private static /* synthetic */ MediaTaskPriority[] $values() {
        return null;
    }

    static {
        $VALUES = MediaTaskPriority.$values();
        allValues = MediaTaskPriority.values();
    }
}

