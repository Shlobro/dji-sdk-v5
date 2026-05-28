/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class SocketPackRecordAction
extends Enum<SocketPackRecordAction>
implements JNIProguardKeepTag {
    public static final /* enum */ SocketPackRecordAction START_INPUT_V1 = new SocketPackRecordAction(0);
    public static final /* enum */ SocketPackRecordAction START_OUTPUT_V1 = new SocketPackRecordAction(1);
    public static final /* enum */ SocketPackRecordAction STOP_INPUT_V1 = new SocketPackRecordAction(2);
    public static final /* enum */ SocketPackRecordAction STOP_OUTPUT_V1 = new SocketPackRecordAction(3);
    public static final /* enum */ SocketPackRecordAction UNKNOWN = new SocketPackRecordAction(65535);
    private int value;
    private static final SocketPackRecordAction[] allValues;
    private static final /* synthetic */ SocketPackRecordAction[] $VALUES;

    public static SocketPackRecordAction[] values() {
        return null;
    }

    public static SocketPackRecordAction valueOf(String string) {
        return null;
    }

    private SocketPackRecordAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SocketPackRecordAction find(int n) {
        return null;
    }

    private static /* synthetic */ SocketPackRecordAction[] $values() {
        return null;
    }

    static {
        $VALUES = SocketPackRecordAction.$values();
        allValues = SocketPackRecordAction.values();
    }
}

