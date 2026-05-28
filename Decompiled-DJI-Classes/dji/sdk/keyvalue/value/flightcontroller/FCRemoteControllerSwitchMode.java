/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FCRemoteControllerSwitchMode
extends Enum<FCRemoteControllerSwitchMode>
implements JNIProguardKeepTag {
    public static final /* enum */ FCRemoteControllerSwitchMode ATTITUDE = new FCRemoteControllerSwitchMode(0);
    public static final /* enum */ FCRemoteControllerSwitchMode SPORT = new FCRemoteControllerSwitchMode(1);
    public static final /* enum */ FCRemoteControllerSwitchMode GPS = new FCRemoteControllerSwitchMode(2);
    public static final /* enum */ FCRemoteControllerSwitchMode NO_SIGNAL = new FCRemoteControllerSwitchMode(3);
    public static final /* enum */ FCRemoteControllerSwitchMode UNKNOWN = new FCRemoteControllerSwitchMode(65535);
    private int value;
    private static final FCRemoteControllerSwitchMode[] allValues;
    private static final /* synthetic */ FCRemoteControllerSwitchMode[] $VALUES;

    public static FCRemoteControllerSwitchMode[] values() {
        return null;
    }

    public static FCRemoteControllerSwitchMode valueOf(String string) {
        return null;
    }

    private FCRemoteControllerSwitchMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FCRemoteControllerSwitchMode find(int n) {
        return null;
    }

    private static /* synthetic */ FCRemoteControllerSwitchMode[] $values() {
        return null;
    }

    static {
        $VALUES = FCRemoteControllerSwitchMode.$values();
        allValues = FCRemoteControllerSwitchMode.values();
    }
}

