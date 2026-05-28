/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.megaphone;

import dji.sdk.keyvalue.value.common.ComponentIndexType;

public final class MegaphoneIndex
extends Enum<MegaphoneIndex> {
    public static final /* enum */ MegaphoneIndex PORTSIDE = new MegaphoneIndex(0);
    public static final /* enum */ MegaphoneIndex STARBOARD = new MegaphoneIndex(1);
    public static final /* enum */ MegaphoneIndex UPSIDE = new MegaphoneIndex(2);
    public static final /* enum */ MegaphoneIndex OSDK = new MegaphoneIndex(3);
    public static final /* enum */ MegaphoneIndex PORT_1 = new MegaphoneIndex(ComponentIndexType.PORT_1.value());
    public static final /* enum */ MegaphoneIndex PORT_2 = new MegaphoneIndex(ComponentIndexType.PORT_2.value());
    public static final /* enum */ MegaphoneIndex PORT_3 = new MegaphoneIndex(ComponentIndexType.PORT_3.value());
    public static final /* enum */ MegaphoneIndex PORT_4 = new MegaphoneIndex(ComponentIndexType.PORT_4.value());
    public static final /* enum */ MegaphoneIndex PORT_5 = new MegaphoneIndex(ComponentIndexType.PORT_5.value());
    public static final /* enum */ MegaphoneIndex PORT_6 = new MegaphoneIndex(ComponentIndexType.PORT_6.value());
    public static final /* enum */ MegaphoneIndex PORT_7 = new MegaphoneIndex(ComponentIndexType.PORT_7.value());
    public static final /* enum */ MegaphoneIndex UNKNOWN = new MegaphoneIndex(255);
    private int value;
    private static MegaphoneIndex[] values;
    private static final /* synthetic */ MegaphoneIndex[] $VALUES;

    public static MegaphoneIndex[] values() {
        return null;
    }

    public static MegaphoneIndex valueOf(String string2) {
        return null;
    }

    private MegaphoneIndex(int n2) {
    }

    private boolean _equals(int n) {
        return false;
    }

    public int value() {
        return 0;
    }

    public static MegaphoneIndex[] getValues() {
        return null;
    }

    public static MegaphoneIndex find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphoneIndex[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphoneIndex.$values();
    }
}

