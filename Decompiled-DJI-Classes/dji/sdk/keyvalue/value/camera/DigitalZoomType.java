/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class DigitalZoomType
extends Enum<DigitalZoomType>
implements JNIProguardKeepTag {
    public static final /* enum */ DigitalZoomType WIDTH = new DigitalZoomType(0);
    public static final /* enum */ DigitalZoomType TELE = new DigitalZoomType(1);
    public static final /* enum */ DigitalZoomType UNKNOWN = new DigitalZoomType(65535);
    private int value;
    private static final DigitalZoomType[] allValues;
    private static final /* synthetic */ DigitalZoomType[] $VALUES;

    public static DigitalZoomType[] values() {
        return null;
    }

    public static DigitalZoomType valueOf(String string) {
        return null;
    }

    private DigitalZoomType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DigitalZoomType find(int n) {
        return null;
    }

    private static /* synthetic */ DigitalZoomType[] $values() {
        return null;
    }

    static {
        $VALUES = DigitalZoomType.$values();
        allValues = DigitalZoomType.values();
    }
}

