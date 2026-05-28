/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class GimbalSceneMode
extends Enum<GimbalSceneMode>
implements JNIProguardKeepTag {
    public static final /* enum */ GimbalSceneMode WALK = new GimbalSceneMode(0);
    public static final /* enum */ GimbalSceneMode SPORT = new GimbalSceneMode(2);
    public static final /* enum */ GimbalSceneMode WEARING = new GimbalSceneMode(3);
    public static final /* enum */ GimbalSceneMode UNKNOWN = new GimbalSceneMode(65535);
    private int value;
    private static final GimbalSceneMode[] allValues;
    private static final /* synthetic */ GimbalSceneMode[] $VALUES;

    public static GimbalSceneMode[] values() {
        return null;
    }

    public static GimbalSceneMode valueOf(String string) {
        return null;
    }

    private GimbalSceneMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GimbalSceneMode find(int n) {
        return null;
    }

    private static /* synthetic */ GimbalSceneMode[] $values() {
        return null;
    }

    static {
        $VALUES = GimbalSceneMode.$values();
        allValues = GimbalSceneMode.values();
    }
}

