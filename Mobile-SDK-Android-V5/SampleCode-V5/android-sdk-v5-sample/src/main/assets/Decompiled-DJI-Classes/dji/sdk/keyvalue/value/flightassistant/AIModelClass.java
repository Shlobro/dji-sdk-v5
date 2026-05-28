/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class AIModelClass
extends Enum<AIModelClass>
implements JNIProguardKeepTag {
    public static final /* enum */ AIModelClass DET = new AIModelClass(1);
    public static final /* enum */ AIModelClass DET_AND_PARSING = new AIModelClass(2);
    public static final /* enum */ AIModelClass DET_AND_DET = new AIModelClass(3);
    public static final /* enum */ AIModelClass UNKNOWN = new AIModelClass(65535);
    private int value;
    private static final AIModelClass[] allValues;
    private static final /* synthetic */ AIModelClass[] $VALUES;

    public static AIModelClass[] values() {
        return null;
    }

    public static AIModelClass valueOf(String string) {
        return null;
    }

    private AIModelClass(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AIModelClass find(int n) {
        return null;
    }

    private static /* synthetic */ AIModelClass[] $values() {
        return null;
    }

    static {
        $VALUES = AIModelClass.$values();
        allValues = AIModelClass.values();
    }
}

