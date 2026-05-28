/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DongleSubscribeInfoSource
extends Enum<DongleSubscribeInfoSource>
implements JNIProguardKeepTag {
    public static final /* enum */ DongleSubscribeInfoSource SERVER = new DongleSubscribeInfoSource(0);
    public static final /* enum */ DongleSubscribeInfoSource LOCAL = new DongleSubscribeInfoSource(1);
    public static final /* enum */ DongleSubscribeInfoSource UNKNOWN = new DongleSubscribeInfoSource(65535);
    private int value;
    private static final DongleSubscribeInfoSource[] allValues;
    private static final /* synthetic */ DongleSubscribeInfoSource[] $VALUES;

    public static DongleSubscribeInfoSource[] values() {
        return null;
    }

    public static DongleSubscribeInfoSource valueOf(String string) {
        return null;
    }

    private DongleSubscribeInfoSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DongleSubscribeInfoSource find(int n) {
        return null;
    }

    private static /* synthetic */ DongleSubscribeInfoSource[] $values() {
        return null;
    }

    static {
        $VALUES = DongleSubscribeInfoSource.$values();
        allValues = DongleSubscribeInfoSource.values();
    }
}

