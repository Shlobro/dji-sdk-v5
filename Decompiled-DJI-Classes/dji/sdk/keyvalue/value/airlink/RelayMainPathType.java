/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class RelayMainPathType
extends Enum<RelayMainPathType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayMainPathType DIRECT = new RelayMainPathType(0);
    public static final /* enum */ RelayMainPathType RELAY = new RelayMainPathType(1);
    public static final /* enum */ RelayMainPathType UNKNOWN = new RelayMainPathType(65535);
    private int value;
    private static final RelayMainPathType[] allValues;
    private static final /* synthetic */ RelayMainPathType[] $VALUES;

    public static RelayMainPathType[] values() {
        return null;
    }

    public static RelayMainPathType valueOf(String string) {
        return null;
    }

    private RelayMainPathType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayMainPathType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayMainPathType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayMainPathType.$values();
        allValues = RelayMainPathType.values();
    }
}

