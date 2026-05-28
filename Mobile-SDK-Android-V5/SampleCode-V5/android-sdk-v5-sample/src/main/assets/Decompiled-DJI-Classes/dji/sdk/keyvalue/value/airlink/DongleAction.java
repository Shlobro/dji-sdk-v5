/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DongleAction
extends Enum<DongleAction>
implements JNIProguardKeepTag {
    public static final /* enum */ DongleAction GET = new DongleAction(0);
    public static final /* enum */ DongleAction SET = new DongleAction(1);
    public static final /* enum */ DongleAction UNKNOWN = new DongleAction(65535);
    private int value;
    private static final DongleAction[] allValues;
    private static final /* synthetic */ DongleAction[] $VALUES;

    public static DongleAction[] values() {
        return null;
    }

    public static DongleAction valueOf(String string) {
        return null;
    }

    private DongleAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DongleAction find(int n) {
        return null;
    }

    private static /* synthetic */ DongleAction[] $values() {
        return null;
    }

    static {
        $VALUES = DongleAction.$values();
        allValues = DongleAction.values();
    }
}

