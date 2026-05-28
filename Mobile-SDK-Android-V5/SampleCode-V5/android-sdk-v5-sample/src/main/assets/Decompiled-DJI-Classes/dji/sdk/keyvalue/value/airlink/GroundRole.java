/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class GroundRole
extends Enum<GroundRole>
implements JNIProguardKeepTag {
    public static final /* enum */ GroundRole T_GND = new GroundRole(0);
    public static final /* enum */ GroundRole R_GND = new GroundRole(1);
    public static final /* enum */ GroundRole UNKNOWN = new GroundRole(65535);
    private int value;
    private static final GroundRole[] allValues;
    private static final /* synthetic */ GroundRole[] $VALUES;

    public static GroundRole[] values() {
        return null;
    }

    public static GroundRole valueOf(String string) {
        return null;
    }

    private GroundRole(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GroundRole find(int n) {
        return null;
    }

    private static /* synthetic */ GroundRole[] $values() {
        return null;
    }

    static {
        $VALUES = GroundRole.$values();
        allValues = GroundRole.values();
    }
}

