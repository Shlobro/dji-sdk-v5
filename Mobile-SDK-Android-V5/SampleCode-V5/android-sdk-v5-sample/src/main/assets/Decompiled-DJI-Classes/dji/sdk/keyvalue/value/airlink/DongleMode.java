/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DongleMode
extends Enum<DongleMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DongleMode NOT_SUPPORT = new DongleMode(0);
    public static final /* enum */ DongleMode AUTO = new DongleMode(1);
    public static final /* enum */ DongleMode MANUAL = new DongleMode(2);
    public static final /* enum */ DongleMode UNKNOWN = new DongleMode(65535);
    private int value;
    private static final DongleMode[] allValues;
    private static final /* synthetic */ DongleMode[] $VALUES;

    public static DongleMode[] values() {
        return null;
    }

    public static DongleMode valueOf(String string) {
        return null;
    }

    private DongleMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DongleMode find(int n) {
        return null;
    }

    private static /* synthetic */ DongleMode[] $values() {
        return null;
    }

    static {
        $VALUES = DongleMode.$values();
        allValues = DongleMode.values();
    }
}

