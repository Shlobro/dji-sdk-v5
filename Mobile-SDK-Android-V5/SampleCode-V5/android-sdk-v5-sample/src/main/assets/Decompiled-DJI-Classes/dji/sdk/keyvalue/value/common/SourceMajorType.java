/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class SourceMajorType
extends Enum<SourceMajorType>
implements JNIProguardKeepTag {
    public static final /* enum */ SourceMajorType CAMERA = new SourceMajorType(0);
    public static final /* enum */ SourceMajorType RADAR = new SourceMajorType(1);
    public static final /* enum */ SourceMajorType PSDK = new SourceMajorType(2);
    public static final /* enum */ SourceMajorType FLIGHT_ASSISTANT = new SourceMajorType(3);
    public static final /* enum */ SourceMajorType AI_BOX = new SourceMajorType(5);
    public static final /* enum */ SourceMajorType OTHER = new SourceMajorType(255);
    public static final /* enum */ SourceMajorType UNKNOWN = new SourceMajorType(65535);
    private int value;
    private static final SourceMajorType[] allValues;
    private static final /* synthetic */ SourceMajorType[] $VALUES;

    public static SourceMajorType[] values() {
        return null;
    }

    public static SourceMajorType valueOf(String string) {
        return null;
    }

    private SourceMajorType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SourceMajorType find(int n) {
        return null;
    }

    private static /* synthetic */ SourceMajorType[] $values() {
        return null;
    }

    static {
        $VALUES = SourceMajorType.$values();
        allValues = SourceMajorType.values();
    }
}

