/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class DestinationPointType
extends Enum<DestinationPointType>
implements JNIProguardKeepTag {
    public static final /* enum */ DestinationPointType END_POINT = new DestinationPointType(0);
    public static final /* enum */ DestinationPointType NEXT_POINT = new DestinationPointType(1);
    public static final /* enum */ DestinationPointType HOME_POINT = new DestinationPointType(2);
    public static final /* enum */ DestinationPointType MANUAL_POINT = new DestinationPointType(3);
    public static final /* enum */ DestinationPointType UNKNOWN = new DestinationPointType(65535);
    private int value;
    private static final DestinationPointType[] allValues;
    private static final /* synthetic */ DestinationPointType[] $VALUES;

    public static DestinationPointType[] values() {
        return null;
    }

    public static DestinationPointType valueOf(String string) {
        return null;
    }

    private DestinationPointType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DestinationPointType find(int n) {
        return null;
    }

    private static /* synthetic */ DestinationPointType[] $values() {
        return null;
    }

    static {
        $VALUES = DestinationPointType.$values();
        allValues = DestinationPointType.values();
    }
}

