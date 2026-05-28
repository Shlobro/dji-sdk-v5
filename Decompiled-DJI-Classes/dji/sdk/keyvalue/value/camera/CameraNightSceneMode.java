/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraNightSceneMode
extends Enum<CameraNightSceneMode>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraNightSceneMode DISABLE = new CameraNightSceneMode(0);
    public static final /* enum */ CameraNightSceneMode ENABLE = new CameraNightSceneMode(1);
    public static final /* enum */ CameraNightSceneMode AUTO = new CameraNightSceneMode(2);
    public static final /* enum */ CameraNightSceneMode UNKNOWN = new CameraNightSceneMode(65535);
    private int value;
    private static final CameraNightSceneMode[] allValues;
    private static final /* synthetic */ CameraNightSceneMode[] $VALUES;

    public static CameraNightSceneMode[] values() {
        return null;
    }

    public static CameraNightSceneMode valueOf(String string) {
        return null;
    }

    private CameraNightSceneMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraNightSceneMode find(int n) {
        return null;
    }

    private static /* synthetic */ CameraNightSceneMode[] $values() {
        return null;
    }

    static {
        $VALUES = CameraNightSceneMode.$values();
        allValues = CameraNightSceneMode.values();
    }
}

