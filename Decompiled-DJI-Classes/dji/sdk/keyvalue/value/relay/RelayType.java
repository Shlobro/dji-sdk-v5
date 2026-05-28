/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;

public final class RelayType
extends Enum<RelayType>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayType NONE = new RelayType(0);
    public static final /* enum */ RelayType EA600 = new RelayType(1);
    public static final /* enum */ RelayType AL002 = new RelayType(2);
    public static final /* enum */ RelayType EA230 = new RelayType(3);
    public static final /* enum */ RelayType PM440 = new RelayType(4);
    public static final /* enum */ RelayType WA345 = new RelayType(254);
    public static final /* enum */ RelayType UNKNOWN = new RelayType(65535);
    private int value;
    private static final RelayType[] allValues;
    private static final /* synthetic */ RelayType[] $VALUES;

    public static RelayType[] values() {
        return null;
    }

    public static RelayType valueOf(String string) {
        return null;
    }

    private RelayType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayType find(int n) {
        return null;
    }

    private static /* synthetic */ RelayType[] $values() {
        return null;
    }

    static {
        $VALUES = RelayType.$values();
        allValues = RelayType.values();
    }
}

