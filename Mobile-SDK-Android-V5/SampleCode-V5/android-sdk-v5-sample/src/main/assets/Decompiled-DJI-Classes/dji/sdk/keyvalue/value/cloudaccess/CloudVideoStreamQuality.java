/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudVideoStreamQuality
extends Enum<CloudVideoStreamQuality>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudVideoStreamQuality AUTO = new CloudVideoStreamQuality(0);
    public static final /* enum */ CloudVideoStreamQuality NORMAL = new CloudVideoStreamQuality(1);
    public static final /* enum */ CloudVideoStreamQuality HIGH = new CloudVideoStreamQuality(2);
    public static final /* enum */ CloudVideoStreamQuality SUPER_HIGH = new CloudVideoStreamQuality(3);
    public static final /* enum */ CloudVideoStreamQuality FULL_HIGH = new CloudVideoStreamQuality(4);
    public static final /* enum */ CloudVideoStreamQuality UNKNOWN = new CloudVideoStreamQuality(65535);
    private int value;
    private static final CloudVideoStreamQuality[] allValues;
    private static final /* synthetic */ CloudVideoStreamQuality[] $VALUES;

    public static CloudVideoStreamQuality[] values() {
        return null;
    }

    public static CloudVideoStreamQuality valueOf(String string) {
        return null;
    }

    private CloudVideoStreamQuality(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudVideoStreamQuality find(int n) {
        return null;
    }

    private static /* synthetic */ CloudVideoStreamQuality[] $values() {
        return null;
    }

    static {
        $VALUES = CloudVideoStreamQuality.$values();
        allValues = CloudVideoStreamQuality.values();
    }
}

