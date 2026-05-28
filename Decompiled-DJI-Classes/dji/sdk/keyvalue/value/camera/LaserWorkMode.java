/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class LaserWorkMode
extends Enum<LaserWorkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ LaserWorkMode OPEN_ON_DEMAND = new LaserWorkMode(0);
    public static final /* enum */ LaserWorkMode OPEN_ALWAYS = new LaserWorkMode(1);
    public static final /* enum */ LaserWorkMode UNKNOWN = new LaserWorkMode(255);
    private int value;
    private static final LaserWorkMode[] allValues;
    private static final /* synthetic */ LaserWorkMode[] $VALUES;

    public static LaserWorkMode[] values() {
        return null;
    }

    public static LaserWorkMode valueOf(String string) {
        return null;
    }

    private LaserWorkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LaserWorkMode find(int n) {
        return null;
    }

    private static /* synthetic */ LaserWorkMode[] $values() {
        return null;
    }

    static {
        $VALUES = LaserWorkMode.$values();
        allValues = LaserWorkMode.values();
    }
}

