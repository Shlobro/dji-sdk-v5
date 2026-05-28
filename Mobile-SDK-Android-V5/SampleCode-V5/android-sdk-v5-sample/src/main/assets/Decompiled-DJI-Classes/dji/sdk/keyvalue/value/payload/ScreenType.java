/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class ScreenType
extends Enum<ScreenType>
implements JNIProguardKeepTag {
    public static final /* enum */ ScreenType BIG = new ScreenType(0);
    public static final /* enum */ ScreenType SMALL = new ScreenType(1);
    public static final /* enum */ ScreenType UNKNOWN = new ScreenType(65535);
    private int value;
    private static final ScreenType[] allValues;
    private static final /* synthetic */ ScreenType[] $VALUES;

    public static ScreenType[] values() {
        return null;
    }

    public static ScreenType valueOf(String string) {
        return null;
    }

    private ScreenType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ScreenType find(int n) {
        return null;
    }

    private static /* synthetic */ ScreenType[] $values() {
        return null;
    }

    static {
        $VALUES = ScreenType.$values();
        allValues = ScreenType.values();
    }
}

