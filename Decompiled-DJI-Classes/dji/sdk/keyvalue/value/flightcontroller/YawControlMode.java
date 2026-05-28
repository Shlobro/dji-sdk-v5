/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class YawControlMode
extends Enum<YawControlMode>
implements JNIProguardKeepTag {
    public static final /* enum */ YawControlMode ANGLE = new YawControlMode(0);
    public static final /* enum */ YawControlMode ANGULAR_VELOCITY = new YawControlMode(1);
    public static final /* enum */ YawControlMode UNKNOWN = new YawControlMode(65535);
    private int value;
    private static final YawControlMode[] allValues;
    private static final /* synthetic */ YawControlMode[] $VALUES;

    public static YawControlMode[] values() {
        return null;
    }

    public static YawControlMode valueOf(String string) {
        return null;
    }

    private YawControlMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static YawControlMode find(int n) {
        return null;
    }

    private static /* synthetic */ YawControlMode[] $values() {
        return null;
    }

    static {
        $VALUES = YawControlMode.$values();
        allValues = YawControlMode.values();
    }
}

