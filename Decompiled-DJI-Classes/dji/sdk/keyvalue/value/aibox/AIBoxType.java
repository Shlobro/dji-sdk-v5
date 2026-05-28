/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.aibox;

import dji.jni.JNIProguardKeepTag;

public final class AIBoxType
extends Enum<AIBoxType>
implements JNIProguardKeepTag {
    public static final /* enum */ AIBoxType UNDEFINE = new AIBoxType(0);
    public static final /* enum */ AIBoxType EA700 = new AIBoxType(1);
    public static final /* enum */ AIBoxType UNKNOWN = new AIBoxType(65535);
    private int value;
    private static final AIBoxType[] allValues;
    private static final /* synthetic */ AIBoxType[] $VALUES;

    public static AIBoxType[] values() {
        return null;
    }

    public static AIBoxType valueOf(String string) {
        return null;
    }

    private AIBoxType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIBoxType find(int n) {
        return null;
    }

    private static /* synthetic */ AIBoxType[] $values() {
        return null;
    }

    static {
        $VALUES = AIBoxType.$values();
        allValues = AIBoxType.values();
    }
}

