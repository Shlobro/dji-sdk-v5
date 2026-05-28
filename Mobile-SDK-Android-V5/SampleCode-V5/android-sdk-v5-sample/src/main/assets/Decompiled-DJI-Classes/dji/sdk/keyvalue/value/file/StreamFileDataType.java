/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.file;

import dji.jni.JNIProguardKeepTag;

public final class StreamFileDataType
extends Enum<StreamFileDataType>
implements JNIProguardKeepTag {
    public static final /* enum */ StreamFileDataType ORIGIN = new StreamFileDataType(0);
    public static final /* enum */ StreamFileDataType PROXY = new StreamFileDataType(1);
    public static final /* enum */ StreamFileDataType UNKNOWN = new StreamFileDataType(65535);
    private int value;
    private static final StreamFileDataType[] allValues;
    private static final /* synthetic */ StreamFileDataType[] $VALUES;

    public static StreamFileDataType[] values() {
        return null;
    }

    public static StreamFileDataType valueOf(String string) {
        return null;
    }

    private StreamFileDataType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static StreamFileDataType find(int n) {
        return null;
    }

    private static /* synthetic */ StreamFileDataType[] $values() {
        return null;
    }

    static {
        $VALUES = StreamFileDataType.$values();
        allValues = StreamFileDataType.values();
    }
}

