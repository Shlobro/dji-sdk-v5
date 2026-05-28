/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.payload;

import dji.sdk.keyvalue.value.common.ComponentIndexType;

public final class PayloadIndexType
extends Enum<PayloadIndexType> {
    public static final /* enum */ PayloadIndexType LEFT_OR_MAIN = new PayloadIndexType(0);
    public static final /* enum */ PayloadIndexType RIGHT = new PayloadIndexType(1);
    public static final /* enum */ PayloadIndexType UP = new PayloadIndexType(2);
    public static final /* enum */ PayloadIndexType EXTERNAL = new PayloadIndexType(3);
    public static final /* enum */ PayloadIndexType EXTERNAL_PORT = new PayloadIndexType(6);
    public static final /* enum */ PayloadIndexType PORT_1 = new PayloadIndexType(ComponentIndexType.PORT_1.value());
    public static final /* enum */ PayloadIndexType PORT_2 = new PayloadIndexType(ComponentIndexType.PORT_2.value());
    public static final /* enum */ PayloadIndexType PORT_3 = new PayloadIndexType(ComponentIndexType.PORT_3.value());
    public static final /* enum */ PayloadIndexType PORT_4 = new PayloadIndexType(ComponentIndexType.PORT_4.value());
    public static final /* enum */ PayloadIndexType PORT_5 = new PayloadIndexType(ComponentIndexType.PORT_5.value());
    public static final /* enum */ PayloadIndexType PORT_6 = new PayloadIndexType(ComponentIndexType.PORT_6.value());
    public static final /* enum */ PayloadIndexType PORT_7 = new PayloadIndexType(ComponentIndexType.PORT_7.value());
    public static final /* enum */ PayloadIndexType UNKNOWN = new PayloadIndexType(65535);
    private int value;
    public static final PayloadIndexType[] allValues;
    private static final /* synthetic */ PayloadIndexType[] $VALUES;

    public static PayloadIndexType[] values() {
        return null;
    }

    public static PayloadIndexType valueOf(String string2) {
        return null;
    }

    private PayloadIndexType(int n2) {
    }

    private boolean compareValue(int n) {
        return false;
    }

    public int value() {
        return 0;
    }

    public static PayloadIndexType find(int n) {
        return null;
    }

    private static /* synthetic */ PayloadIndexType[] $values() {
        return null;
    }

    static {
        $VALUES = PayloadIndexType.$values();
        allValues = PayloadIndexType.values();
    }
}

