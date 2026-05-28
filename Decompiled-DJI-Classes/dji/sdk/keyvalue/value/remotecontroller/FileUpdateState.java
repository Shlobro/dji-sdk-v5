/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class FileUpdateState
extends Enum<FileUpdateState>
implements JNIProguardKeepTag {
    public static final /* enum */ FileUpdateState PREPARE = new FileUpdateState(0);
    public static final /* enum */ FileUpdateState TRANSFER = new FileUpdateState(1);
    public static final /* enum */ FileUpdateState VERIFY = new FileUpdateState(2);
    public static final /* enum */ FileUpdateState FAILED = new FileUpdateState(3);
    public static final /* enum */ FileUpdateState SUCCESSFUL = new FileUpdateState(4);
    public static final /* enum */ FileUpdateState UNKNOWN = new FileUpdateState(255);
    private int value;
    private static final FileUpdateState[] allValues;
    private static final /* synthetic */ FileUpdateState[] $VALUES;

    public static FileUpdateState[] values() {
        return null;
    }

    public static FileUpdateState valueOf(String string) {
        return null;
    }

    private FileUpdateState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileUpdateState find(int n) {
        return null;
    }

    private static /* synthetic */ FileUpdateState[] $values() {
        return null;
    }

    static {
        $VALUES = FileUpdateState.$values();
        allValues = FileUpdateState.values();
    }
}

