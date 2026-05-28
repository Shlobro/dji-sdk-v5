/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.multiclientsync;

import dji.jni.JNIProguardKeepTag;

public final class MCSOperationType
extends Enum<MCSOperationType>
implements JNIProguardKeepTag {
    public static final /* enum */ MCSOperationType ADD = new MCSOperationType(0);
    public static final /* enum */ MCSOperationType DELETE = new MCSOperationType(1);
    public static final /* enum */ MCSOperationType UPDATE = new MCSOperationType(2);
    public static final /* enum */ MCSOperationType SOFT_DELETE = new MCSOperationType(3);
    public static final /* enum */ MCSOperationType UNKNOWN = new MCSOperationType(65535);
    private int value;
    private static final MCSOperationType[] allValues;
    private static final /* synthetic */ MCSOperationType[] $VALUES;

    public static MCSOperationType[] values() {
        return null;
    }

    public static MCSOperationType valueOf(String string) {
        return null;
    }

    private MCSOperationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static MCSOperationType find(int n) {
        return null;
    }

    private static /* synthetic */ MCSOperationType[] $values() {
        return null;
    }

    static {
        $VALUES = MCSOperationType.$values();
        allValues = MCSOperationType.values();
    }
}

