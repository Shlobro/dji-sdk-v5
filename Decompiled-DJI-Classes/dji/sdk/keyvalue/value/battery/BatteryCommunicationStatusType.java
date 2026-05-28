/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.battery;

import dji.jni.JNIProguardKeepTag;

public final class BatteryCommunicationStatusType
extends Enum<BatteryCommunicationStatusType>
implements JNIProguardKeepTag {
    public static final /* enum */ BatteryCommunicationStatusType NORMAL = new BatteryCommunicationStatusType(1);
    public static final /* enum */ BatteryCommunicationStatusType INVALID_BATTERY = new BatteryCommunicationStatusType(2);
    public static final /* enum */ BatteryCommunicationStatusType DISCONNECTED = new BatteryCommunicationStatusType(3);
    public static final /* enum */ BatteryCommunicationStatusType UNKNOWN = new BatteryCommunicationStatusType(65535);
    private int value;
    private static final BatteryCommunicationStatusType[] allValues;
    private static final /* synthetic */ BatteryCommunicationStatusType[] $VALUES;

    public static BatteryCommunicationStatusType[] values() {
        return null;
    }

    public static BatteryCommunicationStatusType valueOf(String string) {
        return null;
    }

    private BatteryCommunicationStatusType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatteryCommunicationStatusType find(int n) {
        return null;
    }

    private static /* synthetic */ BatteryCommunicationStatusType[] $values() {
        return null;
    }

    static {
        $VALUES = BatteryCommunicationStatusType.$values();
        allValues = BatteryCommunicationStatusType.values();
    }
}

