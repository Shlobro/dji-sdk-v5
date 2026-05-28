/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class ComponentIndexType
extends Enum<ComponentIndexType>
implements JNIProguardKeepTag {
    public static final /* enum */ ComponentIndexType LEFT_OR_MAIN = new ComponentIndexType(0);
    public static final /* enum */ ComponentIndexType RIGHT = new ComponentIndexType(1);
    public static final /* enum */ ComponentIndexType UP = new ComponentIndexType(2);
    public static final /* enum */ ComponentIndexType INDEX_3 = new ComponentIndexType(3);
    public static final /* enum */ ComponentIndexType UP_TYPE_C = new ComponentIndexType(4);
    public static final /* enum */ ComponentIndexType UP_TYPE_C_EXT_ONE = new ComponentIndexType(5);
    public static final /* enum */ ComponentIndexType INDEX_6 = new ComponentIndexType(6);
    public static final /* enum */ ComponentIndexType FPV = new ComponentIndexType(7);
    public static final /* enum */ ComponentIndexType INDEX_8 = new ComponentIndexType(8);
    public static final /* enum */ ComponentIndexType INDEX_9 = new ComponentIndexType(9);
    public static final /* enum */ ComponentIndexType INDEX_10 = new ComponentIndexType(10);
    public static final /* enum */ ComponentIndexType INDEX_11 = new ComponentIndexType(11);
    public static final /* enum */ ComponentIndexType INDEX_12 = new ComponentIndexType(12);
    public static final /* enum */ ComponentIndexType AGGREGATION = new ComponentIndexType(65534);
    public static final /* enum */ ComponentIndexType VISION_ASSIST = new ComponentIndexType(10000);
    public static final /* enum */ ComponentIndexType PORT_1 = new ComponentIndexType(20001);
    public static final /* enum */ ComponentIndexType PORT_2 = new ComponentIndexType(20002);
    public static final /* enum */ ComponentIndexType PORT_3 = new ComponentIndexType(20003);
    public static final /* enum */ ComponentIndexType PORT_4 = new ComponentIndexType(20004);
    public static final /* enum */ ComponentIndexType PORT_5 = new ComponentIndexType(20005);
    public static final /* enum */ ComponentIndexType PORT_6 = new ComponentIndexType(20006);
    public static final /* enum */ ComponentIndexType PORT_7 = new ComponentIndexType(20007);
    public static final /* enum */ ComponentIndexType PORT_8 = new ComponentIndexType(20008);
    public static final /* enum */ ComponentIndexType UNKNOWN = new ComponentIndexType(65535);
    private int value;
    private static final ComponentIndexType[] allValues;
    private static final /* synthetic */ ComponentIndexType[] $VALUES;

    public static ComponentIndexType[] values() {
        return null;
    }

    public static ComponentIndexType valueOf(String string) {
        return null;
    }

    private ComponentIndexType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ComponentIndexType find(int n) {
        return null;
    }

    private static /* synthetic */ ComponentIndexType[] $values() {
        return null;
    }

    static {
        $VALUES = ComponentIndexType.$values();
        allValues = ComponentIndexType.values();
    }
}

