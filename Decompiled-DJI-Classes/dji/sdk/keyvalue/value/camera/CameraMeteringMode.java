/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraMeteringMode
extends Enum<CameraMeteringMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraMeteringMode CENTER = new CameraMeteringMode(0);
    public static final /* enum */ CameraMeteringMode AVERAGE = new CameraMeteringMode(1);
    public static final /* enum */ CameraMeteringMode REGION = new CameraMeteringMode(2);
    public static final /* enum */ CameraMeteringMode UNKNOWN = new CameraMeteringMode(65535);
    private int value;
    private static final CameraMeteringMode[] allValues;
    private static final /* synthetic */ CameraMeteringMode[] $VALUES;

    public static CameraMeteringMode[] values() {
        return null;
    }

    public static CameraMeteringMode valueOf(String string) {
        return null;
    }

    private CameraMeteringMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraMeteringMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraMeteringMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraMeteringMode.$values();
        allValues = CameraMeteringMode.values();
    }
}

