/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DiskMode
extends Enum<DiskMode>
implements JNIProguardKeepTag {
    public static final /* enum */ DiskMode PERMANENTLY_ENABLE = new DiskMode(0);
    public static final /* enum */ DiskMode PERMANENTLY_DISABLE = new DiskMode(1);
    public static final /* enum */ DiskMode SINGLE_DISABLED = new DiskMode(2);
    public static final /* enum */ DiskMode UNKNOWN = new DiskMode(65535);
    private int value;
    private static final DiskMode[] allValues;
    private static final /* synthetic */ DiskMode[] $VALUES;

    public static DiskMode[] values() {
        return null;
    }

    public static DiskMode valueOf(String string) {
        return null;
    }

    private DiskMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DiskMode find(int n) {
        return null;
    }

    private static /* synthetic */ DiskMode[] $values() {
        return null;
    }

    static {
        $VALUES = DiskMode.$values();
        allValues = DiskMode.values();
    }
}

