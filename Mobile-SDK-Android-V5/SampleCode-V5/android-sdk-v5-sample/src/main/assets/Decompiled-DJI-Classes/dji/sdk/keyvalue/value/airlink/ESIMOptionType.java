/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class ESIMOptionType
extends Enum<ESIMOptionType>
implements JNIProguardKeepTag {
    public static final /* enum */ ESIMOptionType REQUEST_ACTIVATE = new ESIMOptionType(1);
    public static final /* enum */ ESIMOptionType REQUEST_DESTROY = new ESIMOptionType(2);
    public static final /* enum */ ESIMOptionType SWITCH_SLOT = new ESIMOptionType(3);
    public static final /* enum */ ESIMOptionType SWITCH_OPERATOR = new ESIMOptionType(4);
    public static final /* enum */ ESIMOptionType REQUEST_ESIM_INFO = new ESIMOptionType(5);
    public static final /* enum */ ESIMOptionType UNKNOWN = new ESIMOptionType(65535);
    private int value;
    private static final ESIMOptionType[] allValues;
    private static final /* synthetic */ ESIMOptionType[] $VALUES;

    public static ESIMOptionType[] values() {
        return null;
    }

    public static ESIMOptionType valueOf(String string) {
        return null;
    }

    private ESIMOptionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ESIMOptionType find(int n) {
        return null;
    }

    private static /* synthetic */ ESIMOptionType[] $values() {
        return null;
    }

    static {
        $VALUES = ESIMOptionType.$values();
        allValues = ESIMOptionType.values();
    }
}

