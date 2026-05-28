/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.rtkmobilestation;

import dji.jni.JNIProguardKeepTag;

public final class RTKHomePointDataSource
extends Enum<RTKHomePointDataSource>
implements JNIProguardKeepTag {
    public static final /* enum */ RTKHomePointDataSource NONE = new RTKHomePointDataSource(0);
    public static final /* enum */ RTKHomePointDataSource GPS = new RTKHomePointDataSource(1);
    public static final /* enum */ RTKHomePointDataSource RTK = new RTKHomePointDataSource(2);
    public static final /* enum */ RTKHomePointDataSource UNKNOWN = new RTKHomePointDataSource(65535);
    private int value;
    private static final RTKHomePointDataSource[] allValues;
    private static final /* synthetic */ RTKHomePointDataSource[] $VALUES;

    public static RTKHomePointDataSource[] values() {
        return null;
    }

    public static RTKHomePointDataSource valueOf(String string) {
        return null;
    }

    private RTKHomePointDataSource(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RTKHomePointDataSource find(int n) {
        return null;
    }

    private static /* synthetic */ RTKHomePointDataSource[] $values() {
        return null;
    }

    static {
        $VALUES = RTKHomePointDataSource.$values();
        allValues = RTKHomePointDataSource.values();
    }
}

