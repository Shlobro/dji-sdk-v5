/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;

public final class AIBoxExternalStorageState
extends Enum<AIBoxExternalStorageState>
implements JNIProguardKeepTag {
    public static final /* enum */ AIBoxExternalStorageState DEFAULT_DISK = new AIBoxExternalStorageState(0);
    public static final /* enum */ AIBoxExternalStorageState UNPLUG_DISK = new AIBoxExternalStorageState(1);
    public static final /* enum */ AIBoxExternalStorageState PLUG_DISK = new AIBoxExternalStorageState(2);
    public static final /* enum */ AIBoxExternalStorageState UNMOUNT_DISK = new AIBoxExternalStorageState(3);
    public static final /* enum */ AIBoxExternalStorageState MOUNT_DISK = new AIBoxExternalStorageState(4);
    public static final /* enum */ AIBoxExternalStorageState UNKNOWN = new AIBoxExternalStorageState(255);
    private int value;
    private static final AIBoxExternalStorageState[] allValues;
    private static final /* synthetic */ AIBoxExternalStorageState[] $VALUES;

    public static AIBoxExternalStorageState[] values() {
        return null;
    }

    public static AIBoxExternalStorageState valueOf(String string) {
        return null;
    }

    private AIBoxExternalStorageState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIBoxExternalStorageState find(int n) {
        return null;
    }

    private static /* synthetic */ AIBoxExternalStorageState[] $values() {
        return null;
    }

    static {
        $VALUES = AIBoxExternalStorageState.$values();
        allValues = AIBoxExternalStorageState.values();
    }
}

