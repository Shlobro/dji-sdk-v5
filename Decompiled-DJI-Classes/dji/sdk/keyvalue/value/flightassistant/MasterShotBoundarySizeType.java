/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class MasterShotBoundarySizeType
extends Enum<MasterShotBoundarySizeType>
implements JNIProguardKeepTag {
    public static final /* enum */ MasterShotBoundarySizeType SMALL = new MasterShotBoundarySizeType(0);
    public static final /* enum */ MasterShotBoundarySizeType MIDDLE = new MasterShotBoundarySizeType(1);
    public static final /* enum */ MasterShotBoundarySizeType BIG = new MasterShotBoundarySizeType(2);
    public static final /* enum */ MasterShotBoundarySizeType UNKNOWN = new MasterShotBoundarySizeType(255);
    private int value;
    private static final MasterShotBoundarySizeType[] allValues;
    private static final /* synthetic */ MasterShotBoundarySizeType[] $VALUES;

    public static MasterShotBoundarySizeType[] values() {
        return null;
    }

    public static MasterShotBoundarySizeType valueOf(String string) {
        return null;
    }

    private MasterShotBoundarySizeType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MasterShotBoundarySizeType find(int n) {
        return null;
    }

    private static /* synthetic */ MasterShotBoundarySizeType[] $values() {
        return null;
    }

    static {
        $VALUES = MasterShotBoundarySizeType.$values();
        allValues = MasterShotBoundarySizeType.values();
    }
}

