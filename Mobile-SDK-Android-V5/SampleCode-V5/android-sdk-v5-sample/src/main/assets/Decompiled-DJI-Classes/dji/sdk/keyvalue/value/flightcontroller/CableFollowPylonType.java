/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CableFollowPylonType
extends Enum<CableFollowPylonType>
implements JNIProguardKeepTag {
    public static final /* enum */ CableFollowPylonType SLAVE = new CableFollowPylonType(0);
    public static final /* enum */ CableFollowPylonType MASTER = new CableFollowPylonType(1);
    public static final /* enum */ CableFollowPylonType UNKNOWN = new CableFollowPylonType(65535);
    private int value;
    private static final CableFollowPylonType[] allValues;
    private static final /* synthetic */ CableFollowPylonType[] $VALUES;

    public static CableFollowPylonType[] values() {
        return null;
    }

    public static CableFollowPylonType valueOf(String string) {
        return null;
    }

    private CableFollowPylonType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CableFollowPylonType find(int n) {
        return null;
    }

    private static /* synthetic */ CableFollowPylonType[] $values() {
        return null;
    }

    static {
        $VALUES = CableFollowPylonType.$values();
        allValues = CableFollowPylonType.values();
    }
}

