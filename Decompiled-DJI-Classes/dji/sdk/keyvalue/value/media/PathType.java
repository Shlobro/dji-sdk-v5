/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.media;

import dji.jni.JNIProguardKeepTag;

public final class PathType
extends Enum<PathType>
implements JNIProguardKeepTag {
    public static final /* enum */ PathType MAIN = new PathType(1);
    public static final /* enum */ PathType MISC = new PathType(2);
    public static final /* enum */ PathType UNKNOWN = new PathType(65535);
    private int value;
    private static final PathType[] allValues;
    private static final /* synthetic */ PathType[] $VALUES;

    public static PathType[] values() {
        return null;
    }

    public static PathType valueOf(String string) {
        return null;
    }

    private PathType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PathType find(int n) {
        return null;
    }

    private static /* synthetic */ PathType[] $values() {
        return null;
    }

    static {
        $VALUES = PathType.$values();
        allValues = PathType.values();
    }
}

