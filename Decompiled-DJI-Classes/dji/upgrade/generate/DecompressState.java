/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;

public final class DecompressState
extends Enum<DecompressState>
implements JNIProguardKeepTag {
    public static final /* enum */ DecompressState Init = new DecompressState(0);
    public static final /* enum */ DecompressState Decompressing = new DecompressState(1);
    public static final /* enum */ DecompressState DecompressFailed = new DecompressState(2);
    public static final /* enum */ DecompressState DecompressSuccess = new DecompressState(3);
    private int value;
    private static final DecompressState[] allValues;
    private static final /* synthetic */ DecompressState[] $VALUES;

    public static DecompressState[] values() {
        return null;
    }

    public static DecompressState valueOf(String string2) {
        return null;
    }

    private DecompressState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static DecompressState find(int n) {
        return null;
    }

    private static /* synthetic */ DecompressState[] $values() {
        return null;
    }

    static {
        $VALUES = DecompressState.$values();
        allValues = DecompressState.values();
    }
}

