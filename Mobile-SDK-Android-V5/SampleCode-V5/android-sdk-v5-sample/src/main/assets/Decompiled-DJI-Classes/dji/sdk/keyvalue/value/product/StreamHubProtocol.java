/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class StreamHubProtocol
extends Enum<StreamHubProtocol>
implements JNIProguardKeepTag {
    public static final /* enum */ StreamHubProtocol DJI_CLOUD = new StreamHubProtocol(0);
    public static final /* enum */ StreamHubProtocol GB28181 = new StreamHubProtocol(1);
    public static final /* enum */ StreamHubProtocol RTMP = new StreamHubProtocol(2);
    public static final /* enum */ StreamHubProtocol UNKNOWN = new StreamHubProtocol(65535);
    private int value;
    private static final StreamHubProtocol[] allValues;
    private static final /* synthetic */ StreamHubProtocol[] $VALUES;

    public static StreamHubProtocol[] values() {
        return null;
    }

    public static StreamHubProtocol valueOf(String string) {
        return null;
    }

    private StreamHubProtocol(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static StreamHubProtocol find(int n) {
        return null;
    }

    private static /* synthetic */ StreamHubProtocol[] $values() {
        return null;
    }

    static {
        $VALUES = StreamHubProtocol.$values();
        allValues = StreamHubProtocol.values();
    }
}

