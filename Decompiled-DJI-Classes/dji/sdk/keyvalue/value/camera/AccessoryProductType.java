/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class AccessoryProductType
extends Enum<AccessoryProductType>
implements JNIProguardKeepTag {
    public static final /* enum */ AccessoryProductType WIRED_EXTERNAL_MICROPHONE = new AccessoryProductType(0);
    public static final /* enum */ AccessoryProductType WIRED_EXTERNAL_SPEAKER = new AccessoryProductType(1);
    public static final /* enum */ AccessoryProductType WIRELESS_MICROPHONE = new AccessoryProductType(2);
    public static final /* enum */ AccessoryProductType MULTIFUNCTIONAL_BASE = new AccessoryProductType(3);
    public static final /* enum */ AccessoryProductType UNKNOWN = new AccessoryProductType(65535);
    private int value;
    private static final AccessoryProductType[] allValues;
    private static final /* synthetic */ AccessoryProductType[] $VALUES;

    public static AccessoryProductType[] values() {
        return null;
    }

    public static AccessoryProductType valueOf(String string) {
        return null;
    }

    private AccessoryProductType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AccessoryProductType find(int n) {
        return null;
    }

    private static /* synthetic */ AccessoryProductType[] $values() {
        return null;
    }

    static {
        $VALUES = AccessoryProductType.$values();
        allValues = AccessoryProductType.values();
    }
}

