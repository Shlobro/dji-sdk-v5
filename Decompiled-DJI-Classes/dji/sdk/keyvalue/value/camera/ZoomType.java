/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class ZoomType
extends Enum<ZoomType>
implements JNIProguardKeepTag {
    public static final /* enum */ ZoomType SMOOTH = new ZoomType(0);
    public static final /* enum */ ZoomType SKIP = new ZoomType(1);
    public static final /* enum */ ZoomType UNKNOWN = new ZoomType(65535);
    private int value;
    private static final ZoomType[] allValues;
    private static final /* synthetic */ ZoomType[] $VALUES;

    public static ZoomType[] values() {
        return null;
    }

    public static ZoomType valueOf(String string) {
        return null;
    }

    private ZoomType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ZoomType find(int n) {
        return null;
    }

    private static /* synthetic */ ZoomType[] $values() {
        return null;
    }

    static {
        $VALUES = ZoomType.$values();
        allValues = ZoomType.values();
    }
}

