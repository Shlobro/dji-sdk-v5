/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudMQTTQosLevel
extends Enum<CloudMQTTQosLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudMQTTQosLevel QoS0 = new CloudMQTTQosLevel(0);
    public static final /* enum */ CloudMQTTQosLevel QoS1 = new CloudMQTTQosLevel(1);
    public static final /* enum */ CloudMQTTQosLevel QoS2 = new CloudMQTTQosLevel(2);
    public static final /* enum */ CloudMQTTQosLevel UNKNOWN = new CloudMQTTQosLevel(256);
    private int value;
    private static final CloudMQTTQosLevel[] allValues;
    private static final /* synthetic */ CloudMQTTQosLevel[] $VALUES;

    public static CloudMQTTQosLevel[] values() {
        return null;
    }

    public static CloudMQTTQosLevel valueOf(String string) {
        return null;
    }

    private CloudMQTTQosLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudMQTTQosLevel find(int n) {
        return null;
    }

    private static /* synthetic */ CloudMQTTQosLevel[] $values() {
        return null;
    }

    static {
        $VALUES = CloudMQTTQosLevel.$values();
        allValues = CloudMQTTQosLevel.values();
    }
}

