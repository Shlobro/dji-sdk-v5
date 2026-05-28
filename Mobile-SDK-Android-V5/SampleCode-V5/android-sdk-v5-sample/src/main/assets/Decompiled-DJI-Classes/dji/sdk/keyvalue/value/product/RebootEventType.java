/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class RebootEventType
extends Enum<RebootEventType>
implements JNIProguardKeepTag {
    public static final /* enum */ RebootEventType UPGRADE = new RebootEventType(0);
    public static final /* enum */ RebootEventType UNKNOWN = new RebootEventType(65535);
    private int value;
    private static final RebootEventType[] allValues;
    private static final /* synthetic */ RebootEventType[] $VALUES;

    public static RebootEventType[] values() {
        return null;
    }

    public static RebootEventType valueOf(String string) {
        return null;
    }

    private RebootEventType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RebootEventType find(int n) {
        return null;
    }

    private static /* synthetic */ RebootEventType[] $values() {
        return null;
    }

    static {
        $VALUES = RebootEventType.$values();
        allValues = RebootEventType.values();
    }
}

