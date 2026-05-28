/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraCropMode
extends Enum<CameraCropMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraCropMode AUTO = new CameraCropMode(0);
    public static final /* enum */ CameraCropMode FULLFRAME = new CameraCropMode(1);
    public static final /* enum */ CameraCropMode S35 = new CameraCropMode(2);
    public static final /* enum */ CameraCropMode UNKNOWN = new CameraCropMode(65535);
    private int value;
    private static final CameraCropMode[] allValues;
    private static final /* synthetic */ CameraCropMode[] $VALUES;

    public static CameraCropMode[] values() {
        return null;
    }

    public static CameraCropMode valueOf(String string) {
        return null;
    }

    private CameraCropMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraCropMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraCropMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraCropMode.$values();
        allValues = CameraCropMode.values();
    }
}

