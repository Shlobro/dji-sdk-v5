/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RelayConnectionResult
extends Enum<RelayConnectionResult>
implements JNIProguardKeepTag {
    public static final /* enum */ RelayConnectionResult OK = new RelayConnectionResult(0);
    public static final /* enum */ RelayConnectionResult FAIL_SEARCH = new RelayConnectionResult(1);
    public static final /* enum */ RelayConnectionResult FAIL_ACCESS = new RelayConnectionResult(2);
    public static final /* enum */ RelayConnectionResult FAIL_HANDSHAKE = new RelayConnectionResult(3);
    public static final /* enum */ RelayConnectionResult FAIL_SESSION = new RelayConnectionResult(4);
    public static final /* enum */ RelayConnectionResult FAIL_TIMEOUT = new RelayConnectionResult(5);
    public static final /* enum */ RelayConnectionResult UNKNOWN = new RelayConnectionResult(65535);
    private int value;
    private static final RelayConnectionResult[] allValues;
    private static final /* synthetic */ RelayConnectionResult[] $VALUES;

    public static RelayConnectionResult[] values() {
        return null;
    }

    public static RelayConnectionResult valueOf(String string) {
        return null;
    }

    private RelayConnectionResult(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RelayConnectionResult find(int n) {
        return null;
    }

    private static /* synthetic */ RelayConnectionResult[] $values() {
        return null;
    }

    static {
        $VALUES = RelayConnectionResult.$values();
        allValues = RelayConnectionResult.values();
    }
}

