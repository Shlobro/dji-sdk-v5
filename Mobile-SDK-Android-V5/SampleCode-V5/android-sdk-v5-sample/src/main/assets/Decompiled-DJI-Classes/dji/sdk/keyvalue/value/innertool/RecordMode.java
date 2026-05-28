/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class RecordMode
extends Enum<RecordMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RecordMode FILE = new RecordMode(0);
    public static final /* enum */ RecordMode NETWORK = new RecordMode(1);
    public static final /* enum */ RecordMode UNKNOWN = new RecordMode(65535);
    private int value;
    private static final RecordMode[] allValues;
    private static final /* synthetic */ RecordMode[] $VALUES;

    public static RecordMode[] values() {
        return null;
    }

    public static RecordMode valueOf(String string) {
        return null;
    }

    private RecordMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RecordMode find(int n) {
        return null;
    }

    private static /* synthetic */ RecordMode[] $values() {
        return null;
    }

    static {
        $VALUES = RecordMode.$values();
        allValues = RecordMode.values();
    }
}

