/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class TestLogExportComponentType
extends Enum<TestLogExportComponentType>
implements JNIProguardKeepTag {
    public static final /* enum */ TestLogExportComponentType PLATFORM_SYSTEM = new TestLogExportComponentType(0);
    public static final /* enum */ TestLogExportComponentType FLIGHT_SYSTEM = new TestLogExportComponentType(1);
    public static final /* enum */ TestLogExportComponentType CAMERA = new TestLogExportComponentType(2);
    public static final /* enum */ TestLogExportComponentType AIRLINK = new TestLogExportComponentType(3);
    public static final /* enum */ TestLogExportComponentType GIMBAL = new TestLogExportComponentType(4);
    public static final /* enum */ TestLogExportComponentType MACHINE_LEARNING = new TestLogExportComponentType(5);
    public static final /* enum */ TestLogExportComponentType CENTER_BOARD = new TestLogExportComponentType(6);
    public static final /* enum */ TestLogExportComponentType ALL = new TestLogExportComponentType(7);
    public static final /* enum */ TestLogExportComponentType UNKNOWN = new TestLogExportComponentType(65535);
    private int value;
    private static final TestLogExportComponentType[] allValues;
    private static final /* synthetic */ TestLogExportComponentType[] $VALUES;

    public static TestLogExportComponentType[] values() {
        return null;
    }

    public static TestLogExportComponentType valueOf(String string) {
        return null;
    }

    private TestLogExportComponentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static TestLogExportComponentType find(int n) {
        return null;
    }

    private static /* synthetic */ TestLogExportComponentType[] $values() {
        return null;
    }

    static {
        $VALUES = TestLogExportComponentType.$values();
        allValues = TestLogExportComponentType.values();
    }
}

