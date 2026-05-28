/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class CoaxialityDetectionProgressStatus
extends Enum<CoaxialityDetectionProgressStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CoaxialityDetectionProgressStatus NOT_START = new CoaxialityDetectionProgressStatus(0);
    public static final /* enum */ CoaxialityDetectionProgressStatus IN_PROCESS = new CoaxialityDetectionProgressStatus(1);
    public static final /* enum */ CoaxialityDetectionProgressStatus FINISHED = new CoaxialityDetectionProgressStatus(2);
    public static final /* enum */ CoaxialityDetectionProgressStatus ERROR = new CoaxialityDetectionProgressStatus(3);
    public static final /* enum */ CoaxialityDetectionProgressStatus UNKNOWN = new CoaxialityDetectionProgressStatus(100);
    private int value;
    private static final CoaxialityDetectionProgressStatus[] allValues;
    private static final /* synthetic */ CoaxialityDetectionProgressStatus[] $VALUES;

    public static CoaxialityDetectionProgressStatus[] values() {
        return null;
    }

    public static CoaxialityDetectionProgressStatus valueOf(String string) {
        return null;
    }

    private CoaxialityDetectionProgressStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CoaxialityDetectionProgressStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CoaxialityDetectionProgressStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CoaxialityDetectionProgressStatus.$values();
        allValues = CoaxialityDetectionProgressStatus.values();
    }
}

