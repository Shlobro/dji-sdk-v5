/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class PcdColorMode
extends Enum<PcdColorMode>
implements JNIProguardKeepTag {
    public static final /* enum */ PcdColorMode HEIGHT = new PcdColorMode(0);
    public static final /* enum */ PcdColorMode INTENSITY = new PcdColorMode(1);
    public static final /* enum */ PcdColorMode DISTANCE_HYBIRD = new PcdColorMode(2);
    public static final /* enum */ PcdColorMode VISIBLE_LIGHT_PIXEL = new PcdColorMode(3);
    public static final /* enum */ PcdColorMode DISTANCE_ONLY = new PcdColorMode(4);
    public static final /* enum */ PcdColorMode UNKNOWN = new PcdColorMode(65535);
    private int value;
    private static final PcdColorMode[] allValues;
    private static final /* synthetic */ PcdColorMode[] $VALUES;

    public static PcdColorMode[] values() {
        return null;
    }

    public static PcdColorMode valueOf(String string) {
        return null;
    }

    private PcdColorMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PcdColorMode find(int n) {
        return null;
    }

    private static /* synthetic */ PcdColorMode[] $values() {
        return null;
    }

    static {
        $VALUES = PcdColorMode.$values();
        allValues = PcdColorMode.values();
    }
}

