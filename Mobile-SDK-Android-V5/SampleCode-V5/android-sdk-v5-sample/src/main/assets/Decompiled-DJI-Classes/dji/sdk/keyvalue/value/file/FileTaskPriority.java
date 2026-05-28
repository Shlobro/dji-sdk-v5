/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class FileTaskPriority
extends Enum<FileTaskPriority>
implements JNIProguardKeepTag {
    public static final /* enum */ FileTaskPriority DEFAULT = new FileTaskPriority(0);
    public static final /* enum */ FileTaskPriority MIDDLE = new FileTaskPriority(1);
    public static final /* enum */ FileTaskPriority HIGH = new FileTaskPriority(2);
    public static final /* enum */ FileTaskPriority UNKNOWN = new FileTaskPriority(65535);
    private int value;
    private static final FileTaskPriority[] allValues;
    private static final /* synthetic */ FileTaskPriority[] $VALUES;

    public static FileTaskPriority[] values() {
        return null;
    }

    public static FileTaskPriority valueOf(String string) {
        return null;
    }

    private FileTaskPriority(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FileTaskPriority find(int n) {
        return null;
    }

    private static /* synthetic */ FileTaskPriority[] $values() {
        return null;
    }

    static {
        $VALUES = FileTaskPriority.$values();
        allValues = FileTaskPriority.values();
    }
}

