/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;

public final class CloudFileActionState
extends Enum<CloudFileActionState>
implements JNIProguardKeepTag {
    public static final /* enum */ CloudFileActionState FILE_UPLOAD = new CloudFileActionState(0);
    public static final /* enum */ CloudFileActionState FILE_DOWNLOAD = new CloudFileActionState(1);
    public static final /* enum */ CloudFileActionState FILE_CANCEL_OPERATE = new CloudFileActionState(2);
    public static final /* enum */ CloudFileActionState FILE_PAUSE = new CloudFileActionState(3);
    public static final /* enum */ CloudFileActionState FILE_RESUME = new CloudFileActionState(4);
    public static final /* enum */ CloudFileActionState UNKNOWN = new CloudFileActionState(65535);
    private int value;
    private static final CloudFileActionState[] allValues;
    private static final /* synthetic */ CloudFileActionState[] $VALUES;

    public static CloudFileActionState[] values() {
        return null;
    }

    public static CloudFileActionState valueOf(String string) {
        return null;
    }

    private CloudFileActionState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CloudFileActionState find(int n) {
        return null;
    }

    private static /* synthetic */ CloudFileActionState[] $values() {
        return null;
    }

    static {
        $VALUES = CloudFileActionState.$values();
        allValues = CloudFileActionState.values();
    }
}

