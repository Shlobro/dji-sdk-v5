/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class UAVLogComponentType
extends Enum<UAVLogComponentType>
implements JNIProguardKeepTag {
    public static final /* enum */ UAVLogComponentType FLIGHT_CONTROLLER = new UAVLogComponentType(1);
    public static final /* enum */ UAVLogComponentType NAVIGATION = new UAVLogComponentType(2);
    public static final /* enum */ UAVLogComponentType FLIGHT_ASSISTANT = new UAVLogComponentType(3);
    public static final /* enum */ UAVLogComponentType SDR = new UAVLogComponentType(4);
    public static final /* enum */ UAVLogComponentType LINUX_SYSTEM = new UAVLogComponentType(5);
    public static final /* enum */ UAVLogComponentType COMPONENT_ALL = new UAVLogComponentType(128);
    public static final /* enum */ UAVLogComponentType UNKNOWN = new UAVLogComponentType(65535);
    private int value;
    private static final UAVLogComponentType[] allValues;
    private static final /* synthetic */ UAVLogComponentType[] $VALUES;

    public static UAVLogComponentType[] values() {
        return null;
    }

    public static UAVLogComponentType valueOf(String string) {
        return null;
    }

    private UAVLogComponentType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UAVLogComponentType find(int n) {
        return null;
    }

    private static /* synthetic */ UAVLogComponentType[] $values() {
        return null;
    }

    static {
        $VALUES = UAVLogComponentType.$values();
        allValues = UAVLogComponentType.values();
    }
}

