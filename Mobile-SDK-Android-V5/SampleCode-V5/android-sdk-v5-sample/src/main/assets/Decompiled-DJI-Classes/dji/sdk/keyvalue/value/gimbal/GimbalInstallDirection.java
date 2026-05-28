/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalInstallDirection
extends Enum<GimbalInstallDirection>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalInstallDirection NORMAL = new GimbalInstallDirection(0);
    public static final /* enum */ GimbalInstallDirection REVERSAL = new GimbalInstallDirection(1);
    public static final /* enum */ GimbalInstallDirection UNKNOWN = new GimbalInstallDirection(65535);
    private int value;
    private static final GimbalInstallDirection[] allValues;
    private static final /* synthetic */ GimbalInstallDirection[] $VALUES;

    public static GimbalInstallDirection[] values() {
        return null;
    }

    public static GimbalInstallDirection valueOf(String string) {
        return null;
    }

    private GimbalInstallDirection(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalInstallDirection find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalInstallDirection[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalInstallDirection.$values();
        allValues = GimbalInstallDirection.values();
    }
}

