/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class DeviceConfigActionType
extends Enum<DeviceConfigActionType>
implements JNIProguardKeepTag {
    public static final /* enum */ DeviceConfigActionType GET_FILE_REQ = new DeviceConfigActionType(0);
    public static final /* enum */ DeviceConfigActionType GET_FILE_DONE = new DeviceConfigActionType(1);
    public static final /* enum */ DeviceConfigActionType PUT_FILE_REQ = new DeviceConfigActionType(2);
    public static final /* enum */ DeviceConfigActionType PUT_FILE_DONE = new DeviceConfigActionType(3);
    public static final /* enum */ DeviceConfigActionType NOTIFY_LOAD = new DeviceConfigActionType(4);
    public static final /* enum */ DeviceConfigActionType GET_LOCALE_LANG_FILE_MD5 = new DeviceConfigActionType(5);
    public static final /* enum */ DeviceConfigActionType GET_LOCALE_LANG_FILE = new DeviceConfigActionType(6);
    public static final /* enum */ DeviceConfigActionType UNKNOWN = new DeviceConfigActionType(65535);
    private int value;
    private static final DeviceConfigActionType[] allValues;
    private static final /* synthetic */ DeviceConfigActionType[] $VALUES;

    public static DeviceConfigActionType[] values() {
        return null;
    }

    public static DeviceConfigActionType valueOf(String string) {
        return null;
    }

    private DeviceConfigActionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DeviceConfigActionType find(int n) {
        return null;
    }

    private static /* synthetic */ DeviceConfigActionType[] $values() {
        return null;
    }

    static {
        $VALUES = DeviceConfigActionType.$values();
        allValues = DeviceConfigActionType.values();
    }
}

