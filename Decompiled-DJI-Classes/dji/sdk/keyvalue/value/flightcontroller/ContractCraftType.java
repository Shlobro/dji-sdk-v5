/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ContractCraftType
extends Enum<ContractCraftType>
implements JNIProguardKeepTag {
    public static final /* enum */ ContractCraftType IDLE = new ContractCraftType(0);
    public static final /* enum */ ContractCraftType NONCONTRACTUAL_CRAFT = new ContractCraftType(1);
    public static final /* enum */ ContractCraftType CONTRACTUAL_CRAFT = new ContractCraftType(2);
    public static final /* enum */ ContractCraftType UNBOUND_CONTRACTUAL_CRAFT = new ContractCraftType(3);
    public static final /* enum */ ContractCraftType RENTAL_CRAFT = new ContractCraftType(4);
    public static final /* enum */ ContractCraftType UNKNOWN = new ContractCraftType(65535);
    private int value;
    private static final ContractCraftType[] allValues;
    private static final /* synthetic */ ContractCraftType[] $VALUES;

    public static ContractCraftType[] values() {
        return null;
    }

    public static ContractCraftType valueOf(String string) {
        return null;
    }

    private ContractCraftType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ContractCraftType find(int n) {
        return null;
    }

    private static /* synthetic */ ContractCraftType[] $values() {
        return null;
    }

    static {
        $VALUES = ContractCraftType.$values();
        allValues = ContractCraftType.values();
    }
}

