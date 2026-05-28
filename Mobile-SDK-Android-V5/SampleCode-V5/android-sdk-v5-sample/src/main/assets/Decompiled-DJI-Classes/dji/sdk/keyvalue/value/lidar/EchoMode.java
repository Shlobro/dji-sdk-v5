/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;

public final class EchoMode
extends Enum<EchoMode>
implements JNIProguardKeepTag {
    public static final /* enum */ EchoMode SINGLE_ECHO_FIRST = new EchoMode(0);
    public static final /* enum */ EchoMode SINGLE_ECHO_STRONGEST = new EchoMode(1);
    public static final /* enum */ EchoMode DOUBLE_ECHO = new EchoMode(2);
    public static final /* enum */ EchoMode TRIPLE_ECHO = new EchoMode(3);
    public static final /* enum */ EchoMode QUADRUPLE_ECHO = new EchoMode(4);
    public static final /* enum */ EchoMode QUINTUPLE_ECHO = new EchoMode(5);
    public static final /* enum */ EchoMode OCTUPLE_ECHO = new EchoMode(8);
    public static final /* enum */ EchoMode SEDECUPLE_ECHO = new EchoMode(16);
    public static final /* enum */ EchoMode UNKNOWN = new EchoMode(65535);
    private int value;
    private static final EchoMode[] allValues;
    private static final /* synthetic */ EchoMode[] $VALUES;

    public static EchoMode[] values() {
        return null;
    }

    public static EchoMode valueOf(String string) {
        return null;
    }

    private EchoMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EchoMode find(int n) {
        return null;
    }

    private static /* synthetic */ EchoMode[] $values() {
        return null;
    }

    static {
        $VALUES = EchoMode.$values();
        allValues = EchoMode.values();
    }
}

