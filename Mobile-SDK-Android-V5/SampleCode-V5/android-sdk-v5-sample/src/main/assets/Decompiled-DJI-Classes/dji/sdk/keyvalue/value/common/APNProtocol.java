/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class APNProtocol
extends Enum<APNProtocol>
implements JNIProguardKeepTag {
    public static final /* enum */ APNProtocol IPV4 = new APNProtocol(0);
    public static final /* enum */ APNProtocol IPV6 = new APNProtocol(1);
    public static final /* enum */ APNProtocol IPV4_6 = new APNProtocol(2);
    public static final /* enum */ APNProtocol UNKNOWN = new APNProtocol(65535);
    private int value;
    private static final APNProtocol[] allValues;
    private static final /* synthetic */ APNProtocol[] $VALUES;

    public static APNProtocol[] values() {
        return null;
    }

    public static APNProtocol valueOf(String string) {
        return null;
    }

    private APNProtocol(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static APNProtocol find(int n) {
        return null;
    }

    private static /* synthetic */ APNProtocol[] $values() {
        return null;
    }

    static {
        $VALUES = APNProtocol.$values();
        allValues = APNProtocol.values();
    }
}

