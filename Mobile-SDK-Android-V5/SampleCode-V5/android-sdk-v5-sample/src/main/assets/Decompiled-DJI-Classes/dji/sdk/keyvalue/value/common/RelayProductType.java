/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class RelayProductType
extends Enum<RelayProductType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayProductType EA600 = new RelayProductType(0);
    public static final /* enum */ RelayProductType WA345 = new RelayProductType(1);
    public static final /* enum */ RelayProductType EA230 = new RelayProductType(2);
    public static final /* enum */ RelayProductType PM440 = new RelayProductType(3);
    public static final /* enum */ RelayProductType UNKNOWN = new RelayProductType(65535);
    private int value;
    private static final RelayProductType[] allValues;
    private static final /* synthetic */ RelayProductType[] $VALUES;

    public static RelayProductType[] values() {
        return null;
    }

    public static RelayProductType valueOf(String string) {
        return null;
    }

    private RelayProductType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayProductType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayProductType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayProductType.$values();
        allValues = RelayProductType.values();
    }
}

