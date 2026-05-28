/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudEnvType
extends Enum<CloudEnvType>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudEnvType CloudTestEnv = new CloudEnvType(0);
    public static final /* enum */ CloudEnvType CloudStagEnv = new CloudEnvType(1);
    public static final /* enum */ CloudEnvType CloudProductEnv = new CloudEnvType(2);
    public static final /* enum */ CloudEnvType UNKNOWN = new CloudEnvType(256);
    private int value;
    private static final CloudEnvType[] allValues;
    private static final /* synthetic */ CloudEnvType[] $VALUES;

    public static CloudEnvType[] values() {
        return null;
    }

    public static CloudEnvType valueOf(String string) {
        return null;
    }

    private CloudEnvType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudEnvType find(int n) {
        return null;
    }

    private static /* synthetic */ CloudEnvType[] $values() {
        return null;
    }

    static {
        $VALUES = CloudEnvType.$values();
        allValues = CloudEnvType.values();
    }
}

