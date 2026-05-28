/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class AuthenticationType
extends Enum<AuthenticationType>
implements JNIProguardKeepTag {
    public static final /* enum */ AuthenticationType NONE = new AuthenticationType(0);
    public static final /* enum */ AuthenticationType PAP = new AuthenticationType(1);
    public static final /* enum */ AuthenticationType CHAP = new AuthenticationType(2);
    public static final /* enum */ AuthenticationType PAP_OR_CHAP = new AuthenticationType(3);
    public static final /* enum */ AuthenticationType UNKNOWN = new AuthenticationType(65535);
    private int value;
    private static final AuthenticationType[] allValues;
    private static final /* synthetic */ AuthenticationType[] $VALUES;

    public static AuthenticationType[] values() {
        return null;
    }

    public static AuthenticationType valueOf(String string) {
        return null;
    }

    private AuthenticationType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AuthenticationType find(int n) {
        return null;
    }

    private static /* synthetic */ AuthenticationType[] $values() {
        return null;
    }

    static {
        $VALUES = AuthenticationType.$values();
        allValues = AuthenticationType.values();
    }
}

