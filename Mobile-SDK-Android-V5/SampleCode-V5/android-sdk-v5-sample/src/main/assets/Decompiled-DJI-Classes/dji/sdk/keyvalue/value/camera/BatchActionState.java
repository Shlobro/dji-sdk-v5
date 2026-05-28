/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class BatchActionState
extends Enum<BatchActionState>
implements JNIProguardKeepTag {
    public static final /* enum */ BatchActionState IDLE = new BatchActionState(0);
    public static final /* enum */ BatchActionState DELETING = new BatchActionState(1);
    public static final /* enum */ BatchActionState STARRING = new BatchActionState(2);
    public static final /* enum */ BatchActionState UNKNOWN = new BatchActionState(65535);
    private int value;
    private static final BatchActionState[] allValues;
    private static final /* synthetic */ BatchActionState[] $VALUES;

    public static BatchActionState[] values() {
        return null;
    }

    public static BatchActionState valueOf(String string) {
        return null;
    }

    private BatchActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BatchActionState find(int n) {
        return null;
    }

    private static /* synthetic */ BatchActionState[] $values() {
        return null;
    }

    static {
        $VALUES = BatchActionState.$values();
        allValues = BatchActionState.values();
    }
}

