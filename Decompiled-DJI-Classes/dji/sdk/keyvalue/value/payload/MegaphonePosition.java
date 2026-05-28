/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class MegaphonePosition
extends Enum<MegaphonePosition>
implements JNIProguardKeepTag {
    public static final /* enum */ MegaphonePosition LIMIT_MIN = new MegaphonePosition(0);
    public static final /* enum */ MegaphonePosition LEFT_MAIN = new MegaphonePosition(0);
    public static final /* enum */ MegaphonePosition RIGHT = new MegaphonePosition(1);
    public static final /* enum */ MegaphonePosition TOP = new MegaphonePosition(2);
    public static final /* enum */ MegaphonePosition OSDK = new MegaphonePosition(3);
    public static final /* enum */ MegaphonePosition EPORT_DEBUG = new MegaphonePosition(4);
    public static final /* enum */ MegaphonePosition LIMIT_MAX = new MegaphonePosition(4);
    public static final /* enum */ MegaphonePosition UNKNOWN = new MegaphonePosition(65535);
    private int value;
    private static final MegaphonePosition[] allValues;
    private static final /* synthetic */ MegaphonePosition[] $VALUES;

    public static MegaphonePosition[] values() {
        return null;
    }

    public static MegaphonePosition valueOf(String string) {
        return null;
    }

    private MegaphonePosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MegaphonePosition find(int n) {
        return null;
    }

    private static /* synthetic */ MegaphonePosition[] $values() {
        return null;
    }

    static {
        $VALUES = MegaphonePosition.$values();
        allValues = MegaphonePosition.values();
    }
}

