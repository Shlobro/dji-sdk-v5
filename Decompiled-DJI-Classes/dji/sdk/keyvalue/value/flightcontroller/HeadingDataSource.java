/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class HeadingDataSource
extends Enum<HeadingDataSource>
implements JNIProguardKeepTag {
    public static final /* enum */ HeadingDataSource GYROSCOPE = new HeadingDataSource(0);
    public static final /* enum */ HeadingDataSource COMPASS = new HeadingDataSource(1);
    public static final /* enum */ HeadingDataSource RTK = new HeadingDataSource(2);
    public static final /* enum */ HeadingDataSource UNKNOWN = new HeadingDataSource(65535);
    private int value;
    private static final HeadingDataSource[] allValues;
    private static final /* synthetic */ HeadingDataSource[] $VALUES;

    public static HeadingDataSource[] values() {
        return null;
    }

    public static HeadingDataSource valueOf(String string) {
        return null;
    }

    private HeadingDataSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static HeadingDataSource find(int n) {
        return null;
    }

    private static /* synthetic */ HeadingDataSource[] $values() {
        return null;
    }

    static {
        $VALUES = HeadingDataSource.$values();
        allValues = HeadingDataSource.values();
    }
}

