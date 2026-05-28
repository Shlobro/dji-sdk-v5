/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SDCardLoadState
extends Enum<SDCardLoadState>
implements JNIProguardKeepTag {
    public static final /* enum */ SDCardLoadState INSERTED = new SDCardLoadState(0);
    public static final /* enum */ SDCardLoadState NOT_INSERTED = new SDCardLoadState(1);
    public static final /* enum */ SDCardLoadState UNKNOWN = new SDCardLoadState(65535);
    private int value;
    private static final SDCardLoadState[] allValues;
    private static final /* synthetic */ SDCardLoadState[] $VALUES;

    public static SDCardLoadState[] values() {
        return null;
    }

    public static SDCardLoadState valueOf(String string) {
        return null;
    }

    private SDCardLoadState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SDCardLoadState find(int n) {
        return null;
    }

    private static /* synthetic */ SDCardLoadState[] $values() {
        return null;
    }

    static {
        $VALUES = SDCardLoadState.$values();
        allValues = SDCardLoadState.values();
    }
}

