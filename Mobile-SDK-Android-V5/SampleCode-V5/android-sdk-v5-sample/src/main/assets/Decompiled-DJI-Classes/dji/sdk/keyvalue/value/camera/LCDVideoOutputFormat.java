/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LCDVideoOutputFormat
extends Enum<LCDVideoOutputFormat>
implements JNIProguardKeepTag {
    public static final /* enum */ LCDVideoOutputFormat AUTO = new LCDVideoOutputFormat(0);
    public static final /* enum */ LCDVideoOutputFormat SIZE_1280_720_P30 = new LCDVideoOutputFormat(1);
    public static final /* enum */ LCDVideoOutputFormat SIZE_1280_720_P60 = new LCDVideoOutputFormat(2);
    public static final /* enum */ LCDVideoOutputFormat SIZE_1920_1080_P30 = new LCDVideoOutputFormat(3);
    public static final /* enum */ LCDVideoOutputFormat SIZE_1920_1080_P60 = new LCDVideoOutputFormat(4);
    public static final /* enum */ LCDVideoOutputFormat AUTO_WITH_GOGGLES = new LCDVideoOutputFormat(5);
    public static final /* enum */ LCDVideoOutputFormat AUTO_WITHOUT_GOGGLES = new LCDVideoOutputFormat(6);
    public static final /* enum */ LCDVideoOutputFormat AUTO_WITH_APP = new LCDVideoOutputFormat(7);
    public static final /* enum */ LCDVideoOutputFormat UNKNOWN = new LCDVideoOutputFormat(65535);
    private int value;
    private static final LCDVideoOutputFormat[] allValues;
    private static final /* synthetic */ LCDVideoOutputFormat[] $VALUES;

    public static LCDVideoOutputFormat[] values() {
        return null;
    }

    public static LCDVideoOutputFormat valueOf(String string) {
        return null;
    }

    private LCDVideoOutputFormat(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LCDVideoOutputFormat find(int n) {
        return null;
    }

    private static /* synthetic */ LCDVideoOutputFormat[] $values() {
        return null;
    }

    static {
        $VALUES = LCDVideoOutputFormat.$values();
        allValues = LCDVideoOutputFormat.values();
    }
}

