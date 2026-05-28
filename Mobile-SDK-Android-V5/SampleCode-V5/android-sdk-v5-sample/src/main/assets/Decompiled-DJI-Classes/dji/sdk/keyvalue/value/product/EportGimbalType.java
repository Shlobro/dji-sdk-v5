/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class EportGimbalType
extends Enum<EportGimbalType>
implements JNIProguardKeepTag {
    public static final /* enum */ EportGimbalType EMPTY = new EportGimbalType(0);
    public static final /* enum */ EportGimbalType DOWN_SINGLE = new EportGimbalType(2);
    public static final /* enum */ EportGimbalType DOWN_SINGLE_PRO = new EportGimbalType(3);
    public static final /* enum */ EportGimbalType DOWN_LEFT = new EportGimbalType(4);
    public static final /* enum */ EportGimbalType DOWN_RIGHT = new EportGimbalType(5);
    public static final /* enum */ EportGimbalType BELLY_BRACKET = new EportGimbalType(6);
    public static final /* enum */ EportGimbalType UNKNOWN = new EportGimbalType(65535);
    private int value;
    private static final EportGimbalType[] allValues;
    private static final /* synthetic */ EportGimbalType[] $VALUES;

    public static EportGimbalType[] values() {
        return null;
    }

    public static EportGimbalType valueOf(String string) {
        return null;
    }

    private EportGimbalType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EportGimbalType find(int n) {
        return null;
    }

    private static /* synthetic */ EportGimbalType[] $values() {
        return null;
    }

    static {
        $VALUES = EportGimbalType.$values();
        allValues = EportGimbalType.values();
    }
}

