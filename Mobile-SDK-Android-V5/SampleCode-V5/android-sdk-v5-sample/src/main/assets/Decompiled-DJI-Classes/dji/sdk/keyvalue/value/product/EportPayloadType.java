/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;

public final class EportPayloadType
extends Enum<EportPayloadType>
implements JNIProguardKeepTag {
    public static final /* enum */ EportPayloadType CAMERA = new EportPayloadType(0);
    public static final /* enum */ EportPayloadType LIGHT = new EportPayloadType(1);
    public static final /* enum */ EportPayloadType SPEAKER = new EportPayloadType(2);
    public static final /* enum */ EportPayloadType PSDK = new EportPayloadType(3);
    public static final /* enum */ EportPayloadType UNKNOWN = new EportPayloadType(65535);
    private int value;
    private static final EportPayloadType[] allValues;
    private static final /* synthetic */ EportPayloadType[] $VALUES;

    public static EportPayloadType[] values() {
        return null;
    }

    public static EportPayloadType valueOf(String string) {
        return null;
    }

    private EportPayloadType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EportPayloadType find(int n) {
        return null;
    }

    private static /* synthetic */ EportPayloadType[] $values() {
        return null;
    }

    static {
        $VALUES = EportPayloadType.$values();
        allValues = EportPayloadType.values();
    }
}

