/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CameraPanoType
extends Enum<CameraPanoType>
implements JNIProguardKeepTag {
    public static final /* enum */ CameraPanoType TYPE_360AUTO = new CameraPanoType(1);
    public static final /* enum */ CameraPanoType TYPE_BALL = new CameraPanoType(2);
    public static final /* enum */ CameraPanoType TYPE_SELF = new CameraPanoType(3);
    public static final /* enum */ CameraPanoType TYPE_MANUAL = new CameraPanoType(4);
    public static final /* enum */ CameraPanoType TYPE_CYLINDRICAL = new CameraPanoType(5);
    public static final /* enum */ CameraPanoType TYPE_VERTICAL = new CameraPanoType(6);
    public static final /* enum */ CameraPanoType TYPE_SECTORIAL = new CameraPanoType(7);
    public static final /* enum */ CameraPanoType UNKNOWN = new CameraPanoType(65535);
    private int value;
    private static final CameraPanoType[] allValues;
    private static final /* synthetic */ CameraPanoType[] $VALUES;

    public static CameraPanoType[] values() {
        return null;
    }

    public static CameraPanoType valueOf(String string) {
        return null;
    }

    private CameraPanoType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CameraPanoType find(int n) {
        return null;
    }

    private static /* synthetic */ CameraPanoType[] $values() {
        return null;
    }

    static {
        $VALUES = CameraPanoType.$values();
        allValues = CameraPanoType.values();
    }
}

