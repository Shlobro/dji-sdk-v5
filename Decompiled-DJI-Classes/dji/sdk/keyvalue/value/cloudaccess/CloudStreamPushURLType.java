/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudStreamPushURLType
extends Enum<CloudStreamPushURLType>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudStreamPushURLType AGORA = new CloudStreamPushURLType(0);
    public static final /* enum */ CloudStreamPushURLType RTMP = new CloudStreamPushURLType(1);
    public static final /* enum */ CloudStreamPushURLType RTSP = new CloudStreamPushURLType(2);
    public static final /* enum */ CloudStreamPushURLType GB28181 = new CloudStreamPushURLType(3);
    public static final /* enum */ CloudStreamPushURLType FLIGHT_HUB = new CloudStreamPushURLType(4);
    public static final /* enum */ CloudStreamPushURLType UNKNOWN = new CloudStreamPushURLType(256);
    private int value;
    private static final CloudStreamPushURLType[] allValues;
    private static final /* synthetic */ CloudStreamPushURLType[] $VALUES;

    public static CloudStreamPushURLType[] values() {
        return null;
    }

    public static CloudStreamPushURLType valueOf(String string) {
        return null;
    }

    private CloudStreamPushURLType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudStreamPushURLType find(int n) {
        return null;
    }

    private static /* synthetic */ CloudStreamPushURLType[] $values() {
        return null;
    }

    static {
        $VALUES = CloudStreamPushURLType.$values();
        allValues = CloudStreamPushURLType.values();
    }
}

