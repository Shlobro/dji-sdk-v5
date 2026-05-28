/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class BalanceDetectionProgressStatus
extends Enum<BalanceDetectionProgressStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ BalanceDetectionProgressStatus NOT_START = new BalanceDetectionProgressStatus(0);
    public static final /* enum */ BalanceDetectionProgressStatus IN_PROCESS = new BalanceDetectionProgressStatus(1);
    public static final /* enum */ BalanceDetectionProgressStatus FINISHED = new BalanceDetectionProgressStatus(2);
    public static final /* enum */ BalanceDetectionProgressStatus ERROR = new BalanceDetectionProgressStatus(3);
    public static final /* enum */ BalanceDetectionProgressStatus UNKNOWN = new BalanceDetectionProgressStatus(100);
    private int value;
    private static final BalanceDetectionProgressStatus[] allValues;
    private static final /* synthetic */ BalanceDetectionProgressStatus[] $VALUES;

    public static BalanceDetectionProgressStatus[] values() {
        return null;
    }

    public static BalanceDetectionProgressStatus valueOf(String string) {
        return null;
    }

    private BalanceDetectionProgressStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BalanceDetectionProgressStatus find(int n) {
        return null;
    }

    private static /* synthetic */ BalanceDetectionProgressStatus[] $values() {
        return null;
    }

    static {
        $VALUES = BalanceDetectionProgressStatus.$values();
        allValues = BalanceDetectionProgressStatus.values();
    }
}

