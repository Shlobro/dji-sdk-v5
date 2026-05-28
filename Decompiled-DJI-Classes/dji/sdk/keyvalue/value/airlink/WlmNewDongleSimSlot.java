/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmNewDongleSimSlot
extends Enum<WlmNewDongleSimSlot>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmNewDongleSimSlot NONE = new WlmNewDongleSimSlot(0);
    public static final /* enum */ WlmNewDongleSimSlot OUT_SIM_SLOT = new WlmNewDongleSimSlot(1);
    public static final /* enum */ WlmNewDongleSimSlot INNER_SIM_SLOT = new WlmNewDongleSimSlot(2);
    public static final /* enum */ WlmNewDongleSimSlot UNKNOWN = new WlmNewDongleSimSlot(65535);
    private int value;
    private static final WlmNewDongleSimSlot[] allValues;
    private static final /* synthetic */ WlmNewDongleSimSlot[] $VALUES;

    public static WlmNewDongleSimSlot[] values() {
        return null;
    }

    public static WlmNewDongleSimSlot valueOf(String string) {
        return null;
    }

    private WlmNewDongleSimSlot(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmNewDongleSimSlot find(int n) {
        return null;
    }

    private static /* synthetic */ WlmNewDongleSimSlot[] $values() {
        return null;
    }

    static {
        $VALUES = WlmNewDongleSimSlot.$values();
        allValues = WlmNewDongleSimSlot.values();
    }
}

