/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class EIMode
extends Enum<EIMode>
implements JNIProguardKeepTag {
    public static final /* enum */ EIMode CLOSE = new EIMode(0);
    public static final /* enum */ EIMode OPEN = new EIMode(1);
    public static final /* enum */ EIMode UNKNOWN = new EIMode(255);
    private int value;
    private static final EIMode[] allValues;
    private static final /* synthetic */ EIMode[] $VALUES;

    public static EIMode[] values() {
        return null;
    }

    public static EIMode valueOf(String string) {
        return null;
    }

    private EIMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EIMode find(int n) {
        return null;
    }

    private static /* synthetic */ EIMode[] $values() {
        return null;
    }

    static {
        $VALUES = EIMode.$values();
        allValues = EIMode.values();
    }
}

