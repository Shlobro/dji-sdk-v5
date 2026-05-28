/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class In2CameraProtocolVersion
extends Enum<In2CameraProtocolVersion>
implements JNIProguardKeepTag {
    public static final /* enum */ In2CameraProtocolVersion SUPPORT_AFC = new In2CameraProtocolVersion(1);
    public static final /* enum */ In2CameraProtocolVersion SUPPORT_EX_FAT = new In2CameraProtocolVersion(2);
    public static final /* enum */ In2CameraProtocolVersion SUPPORT_EI_MODE = new In2CameraProtocolVersion(3);
    public static final /* enum */ In2CameraProtocolVersion UNKNOWN = new In2CameraProtocolVersion(65535);
    private int value;
    private static final In2CameraProtocolVersion[] allValues;
    private static final /* synthetic */ In2CameraProtocolVersion[] $VALUES;

    public static In2CameraProtocolVersion[] values() {
        return null;
    }

    public static In2CameraProtocolVersion valueOf(String string) {
        return null;
    }

    private In2CameraProtocolVersion(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static In2CameraProtocolVersion find(int n) {
        return null;
    }

    private static /* synthetic */ In2CameraProtocolVersion[] $values() {
        return null;
    }

    static {
        $VALUES = In2CameraProtocolVersion.$values();
        allValues = In2CameraProtocolVersion.values();
    }
}

