/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ControlChannelMapping
extends Enum<ControlChannelMapping>
implements JNIProguardKeepTag {
    public static final /* enum */ ControlChannelMapping MANUAL = new ControlChannelMapping(0);
    public static final /* enum */ ControlChannelMapping ATTITUDE = new ControlChannelMapping(1);
    public static final /* enum */ ControlChannelMapping ATTITUDE_GENTLE = new ControlChannelMapping(2);
    public static final /* enum */ ControlChannelMapping ATTITUDE_NORMAL = new ControlChannelMapping(3);
    public static final /* enum */ ControlChannelMapping ATTITUDE_SPORT = new ControlChannelMapping(4);
    public static final /* enum */ ControlChannelMapping GPS_ATTITUDE = new ControlChannelMapping(5);
    public static final /* enum */ ControlChannelMapping GPS_GENTLE = new ControlChannelMapping(6);
    public static final /* enum */ ControlChannelMapping GPS_NORMAL = new ControlChannelMapping(7);
    public static final /* enum */ ControlChannelMapping GPS_SPORT = new ControlChannelMapping(8);
    public static final /* enum */ ControlChannelMapping NAVIGATION = new ControlChannelMapping(9);
    public static final /* enum */ ControlChannelMapping FPV = new ControlChannelMapping(10);
    public static final /* enum */ ControlChannelMapping FARM = new ControlChannelMapping(11);
    public static final /* enum */ ControlChannelMapping TRIPOD = new ControlChannelMapping(12);
    public static final /* enum */ ControlChannelMapping UNKNOWN = new ControlChannelMapping(65535);
    private int value;
    private static final ControlChannelMapping[] allValues;
    private static final /* synthetic */ ControlChannelMapping[] $VALUES;

    public static ControlChannelMapping[] values() {
        return null;
    }

    public static ControlChannelMapping valueOf(String string) {
        return null;
    }

    private ControlChannelMapping(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ControlChannelMapping find(int n) {
        return null;
    }

    private static /* synthetic */ ControlChannelMapping[] $values() {
        return null;
    }

    static {
        $VALUES = ControlChannelMapping.$values();
        allValues = ControlChannelMapping.values();
    }
}

