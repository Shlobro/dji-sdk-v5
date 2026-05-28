/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class CurrentTaskStatusCode
extends Enum<CurrentTaskStatusCode>
implements JNIProguardKeepTag {
    public static final /* enum */ CurrentTaskStatusCode TASK_TESTING = new CurrentTaskStatusCode(0);
    public static final /* enum */ CurrentTaskStatusCode TASK_FAIL = new CurrentTaskStatusCode(1);
    public static final /* enum */ CurrentTaskStatusCode TASK_FINISH = new CurrentTaskStatusCode(2);
    public static final /* enum */ CurrentTaskStatusCode UNKNOWN = new CurrentTaskStatusCode(255);
    private int value;
    private static final CurrentTaskStatusCode[] allValues;
    private static final /* synthetic */ CurrentTaskStatusCode[] $VALUES;

    public static CurrentTaskStatusCode[] values() {
        return null;
    }

    public static CurrentTaskStatusCode valueOf(String string) {
        return null;
    }

    private CurrentTaskStatusCode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CurrentTaskStatusCode find(int n) {
        return null;
    }

    private static /* synthetic */ CurrentTaskStatusCode[] $values() {
        return null;
    }

    static {
        $VALUES = CurrentTaskStatusCode.$values();
        allValues = CurrentTaskStatusCode.values();
    }
}

