/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.multiclientsync;

import dji.jni.JNIProguardKeepTag;

public final class ClientType
extends Enum<ClientType>
implements JNIProguardKeepTag {
    public static final /* enum */ ClientType SHADOW = new ClientType(1);
    public static final /* enum */ ClientType LOCAL = new ClientType(2);
    public static final /* enum */ ClientType Custom = new ClientType(3);
    public static final /* enum */ ClientType UNKNOWN = new ClientType(255);
    private int value;
    private static final ClientType[] allValues;
    private static final /* synthetic */ ClientType[] $VALUES;

    public static ClientType[] values() {
        return null;
    }

    public static ClientType valueOf(String string) {
        return null;
    }

    private ClientType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ClientType find(int n) {
        return null;
    }

    private static /* synthetic */ ClientType[] $values() {
        return null;
    }

    static {
        $VALUES = ClientType.$values();
        allValues = ClientType.values();
    }
}

