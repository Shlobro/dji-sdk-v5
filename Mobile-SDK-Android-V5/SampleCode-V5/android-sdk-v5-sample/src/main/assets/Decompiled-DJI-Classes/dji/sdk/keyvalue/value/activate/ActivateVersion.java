/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;

public final class ActivateVersion
extends Enum<ActivateVersion>
implements JNIProguardKeepTag {
    public static final /* enum */ ActivateVersion V1_0 = new ActivateVersion(0);
    public static final /* enum */ ActivateVersion V1_1 = new ActivateVersion(1);
    public static final /* enum */ ActivateVersion V1_2 = new ActivateVersion(2);
    public static final /* enum */ ActivateVersion V1_3 = new ActivateVersion(3);
    public static final /* enum */ ActivateVersion V1_4 = new ActivateVersion(4);
    public static final /* enum */ ActivateVersion UNKNOWN = new ActivateVersion(65535);
    private int value;
    private static final ActivateVersion[] allValues;
    private static final /* synthetic */ ActivateVersion[] $VALUES;

    public static ActivateVersion[] values() {
        return null;
    }

    public static ActivateVersion valueOf(String string) {
        return null;
    }

    private ActivateVersion(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ActivateVersion find(int n) {
        return null;
    }

    private static /* synthetic */ ActivateVersion[] $values() {
        return null;
    }

    static {
        $VALUES = ActivateVersion.$values();
        allValues = ActivateVersion.values();
    }
}

