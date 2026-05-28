/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;

public final class ActivateModulePushType
extends Enum<ActivateModulePushType>
implements JNIProguardKeepTag {
    public static final /* enum */ ActivateModulePushType ACTIVATE_REQUEST = new ActivateModulePushType(0);
    public static final /* enum */ ActivateModulePushType ACTIVATE_FAILED = new ActivateModulePushType(1);
    public static final /* enum */ ActivateModulePushType ACTIVATE_VERIFY_MSG = new ActivateModulePushType(2);
    public static final /* enum */ ActivateModulePushType UNKNOWN = new ActivateModulePushType(65535);
    private int value;
    private static final ActivateModulePushType[] allValues;
    private static final /* synthetic */ ActivateModulePushType[] $VALUES;

    public static ActivateModulePushType[] values() {
        return null;
    }

    public static ActivateModulePushType valueOf(String string) {
        return null;
    }

    private ActivateModulePushType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ActivateModulePushType find(int n) {
        return null;
    }

    private static /* synthetic */ ActivateModulePushType[] $values() {
        return null;
    }

    static {
        $VALUES = ActivateModulePushType.$values();
        allValues = ActivateModulePushType.values();
    }
}

