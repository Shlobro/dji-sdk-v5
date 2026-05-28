/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DonglePosition
extends Enum<DonglePosition>
implements JNIProguardKeepTag {
    public static final /* enum */ DonglePosition RC = new DonglePosition(0);
    public static final /* enum */ DonglePosition FC = new DonglePosition(1);
    public static final /* enum */ DonglePosition UNKNOWN = new DonglePosition(65535);
    private int value;
    private static final DonglePosition[] allValues;
    private static final /* synthetic */ DonglePosition[] $VALUES;

    public static DonglePosition[] values() {
        return null;
    }

    public static DonglePosition valueOf(String string) {
        return null;
    }

    private DonglePosition(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DonglePosition find(int n) {
        return null;
    }

    private static /* synthetic */ DonglePosition[] $values() {
        return null;
    }

    static {
        $VALUES = DonglePosition.$values();
        allValues = DonglePosition.values();
    }
}

