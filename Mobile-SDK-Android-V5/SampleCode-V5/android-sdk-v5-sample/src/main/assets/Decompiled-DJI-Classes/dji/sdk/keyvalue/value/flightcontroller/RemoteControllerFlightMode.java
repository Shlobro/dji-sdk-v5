/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class RemoteControllerFlightMode
extends Enum<RemoteControllerFlightMode>
implements JNIProguardKeepTag {
    public static final /* enum */ RemoteControllerFlightMode F = new RemoteControllerFlightMode(0);
    public static final /* enum */ RemoteControllerFlightMode A = new RemoteControllerFlightMode(1);
    public static final /* enum */ RemoteControllerFlightMode P = new RemoteControllerFlightMode(2);
    public static final /* enum */ RemoteControllerFlightMode S = new RemoteControllerFlightMode(3);
    public static final /* enum */ RemoteControllerFlightMode G = new RemoteControllerFlightMode(4);
    public static final /* enum */ RemoteControllerFlightMode M = new RemoteControllerFlightMode(5);
    public static final /* enum */ RemoteControllerFlightMode T = new RemoteControllerFlightMode(6);
    public static final /* enum */ RemoteControllerFlightMode UNKNOWN = new RemoteControllerFlightMode(65535);
    private int value;
    private static final RemoteControllerFlightMode[] allValues;
    private static final /* synthetic */ RemoteControllerFlightMode[] $VALUES;

    public static RemoteControllerFlightMode[] values() {
        return null;
    }

    public static RemoteControllerFlightMode valueOf(String string) {
        return null;
    }

    private RemoteControllerFlightMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RemoteControllerFlightMode find(int n) {
        return null;
    }

    private static /* synthetic */ RemoteControllerFlightMode[] $values() {
        return null;
    }

    static {
        $VALUES = RemoteControllerFlightMode.$values();
        allValues = RemoteControllerFlightMode.values();
    }
}

