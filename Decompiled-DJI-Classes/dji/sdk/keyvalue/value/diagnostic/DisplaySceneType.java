/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.diagnostic;

import dji.jni.JNIProguardKeepTag;

public final class DisplaySceneType
extends Enum<DisplaySceneType>
implements JNIProguardKeepTag {
    public static final /* enum */ DisplaySceneType RELEASE_AND_INNER = new DisplaySceneType(0);
    public static final /* enum */ DisplaySceneType INNER = new DisplaySceneType(1);
    public static final /* enum */ DisplaySceneType UNKNOWN = new DisplaySceneType(65535);
    private int value;
    private static final DisplaySceneType[] allValues;
    private static final /* synthetic */ DisplaySceneType[] $VALUES;

    public static DisplaySceneType[] values() {
        return null;
    }

    public static DisplaySceneType valueOf(String string) {
        return null;
    }

    private DisplaySceneType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DisplaySceneType find(int n) {
        return null;
    }

    private static /* synthetic */ DisplaySceneType[] $values() {
        return null;
    }

    static {
        $VALUES = DisplaySceneType.$values();
        allValues = DisplaySceneType.values();
    }
}

