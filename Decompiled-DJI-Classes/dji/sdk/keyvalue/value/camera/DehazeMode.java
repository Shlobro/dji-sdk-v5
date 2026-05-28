/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class DehazeMode
extends Enum<DehazeMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DehazeMode DISABLE = new DehazeMode(0);
    public static final /* enum */ DehazeMode ENABLE = new DehazeMode(1);
    public static final /* enum */ DehazeMode AUTO = new DehazeMode(2);
    public static final /* enum */ DehazeMode UNKNOWN = new DehazeMode(65535);
    private int value;
    private static final DehazeMode[] allValues;
    private static final /* synthetic */ DehazeMode[] $VALUES;

    public static DehazeMode[] values() {
        return null;
    }

    public static DehazeMode valueOf(String string) {
        return null;
    }

    private DehazeMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DehazeMode find(int n) {
        return null;
    }

    private static /* synthetic */ DehazeMode[] $values() {
        return null;
    }

    static {
        $VALUES = DehazeMode.$values();
        allValues = DehazeMode.values();
    }
}

