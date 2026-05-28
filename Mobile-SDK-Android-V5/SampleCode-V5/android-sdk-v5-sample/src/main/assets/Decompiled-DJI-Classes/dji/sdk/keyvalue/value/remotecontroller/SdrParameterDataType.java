/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class SdrParameterDataType
extends Enum<SdrParameterDataType>
implements JNIProguardKeepTag {
    public static final /* enum */ SdrParameterDataType UINT32 = new SdrParameterDataType(0);
    public static final /* enum */ SdrParameterDataType UINT16 = new SdrParameterDataType(1);
    public static final /* enum */ SdrParameterDataType UINT8 = new SdrParameterDataType(2);
    public static final /* enum */ SdrParameterDataType UNKNOWN = new SdrParameterDataType(255);
    private int value;
    private static final SdrParameterDataType[] allValues;
    private static final /* synthetic */ SdrParameterDataType[] $VALUES;

    public static SdrParameterDataType[] values() {
        return null;
    }

    public static SdrParameterDataType valueOf(String string) {
        return null;
    }

    private SdrParameterDataType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SdrParameterDataType find(int n) {
        return null;
    }

    private static /* synthetic */ SdrParameterDataType[] $values() {
        return null;
    }

    static {
        $VALUES = SdrParameterDataType.$values();
        allValues = SdrParameterDataType.values();
    }
}

