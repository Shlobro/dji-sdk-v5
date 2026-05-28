/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class CodecStrategy
extends Enum<CodecStrategy>
implements JNIProguardKeepTag {
    public static final /* enum */ CodecStrategy ON_DEMAND_I = new CodecStrategy(0);
    public static final /* enum */ CodecStrategy GDR = new CodecStrategy(1);
    public static final /* enum */ CodecStrategy PERIOD_I = new CodecStrategy(2);
    public static final /* enum */ CodecStrategy UNKNOWN = new CodecStrategy(65535);
    private int value;
    private static final CodecStrategy[] allValues;
    private static final /* synthetic */ CodecStrategy[] $VALUES;

    public static CodecStrategy[] values() {
        return null;
    }

    public static CodecStrategy valueOf(String string) {
        return null;
    }

    private CodecStrategy(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CodecStrategy find(int n) {
        return null;
    }

    private static /* synthetic */ CodecStrategy[] $values() {
        return null;
    }

    static {
        $VALUES = CodecStrategy.$values();
        allValues = CodecStrategy.values();
    }
}

