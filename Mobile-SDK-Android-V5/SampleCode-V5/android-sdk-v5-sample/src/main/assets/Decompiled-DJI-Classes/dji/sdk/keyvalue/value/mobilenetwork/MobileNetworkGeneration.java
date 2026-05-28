/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.mobilenetwork;

import dji.jni.JNIProguardKeepTag;

public final class MobileNetworkGeneration
extends Enum<MobileNetworkGeneration>
implements JNIProguardKeepTag {
    public static final /* enum */ MobileNetworkGeneration NONE = new MobileNetworkGeneration(0);
    public static final /* enum */ MobileNetworkGeneration NETWORK_2G = new MobileNetworkGeneration(1);
    public static final /* enum */ MobileNetworkGeneration NETWORK_3G = new MobileNetworkGeneration(2);
    public static final /* enum */ MobileNetworkGeneration NETWORK_4G = new MobileNetworkGeneration(3);
    public static final /* enum */ MobileNetworkGeneration UNKNOWN = new MobileNetworkGeneration(65535);
    private int value;
    private static final MobileNetworkGeneration[] allValues;
    private static final /* synthetic */ MobileNetworkGeneration[] $VALUES;

    public static MobileNetworkGeneration[] values() {
        return null;
    }

    public static MobileNetworkGeneration valueOf(String string) {
        return null;
    }

    private MobileNetworkGeneration(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MobileNetworkGeneration find(int n) {
        return null;
    }

    private static /* synthetic */ MobileNetworkGeneration[] $values() {
        return null;
    }

    static {
        $VALUES = MobileNetworkGeneration.$values();
        allValues = MobileNetworkGeneration.values();
    }
}

