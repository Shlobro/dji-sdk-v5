/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class LightGroup
extends Enum<LightGroup>
implements JNIProguardKeepTag {
    public static final /* enum */ LightGroup MAIN_LED = new LightGroup(0);
    public static final /* enum */ LightGroup UNKNOWN = new LightGroup(65535);
    private int value;
    private static final LightGroup[] allValues;
    private static final /* synthetic */ LightGroup[] $VALUES;

    public static LightGroup[] values() {
        return null;
    }

    public static LightGroup valueOf(String string) {
        return null;
    }

    private LightGroup(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static LightGroup find(int n) {
        return null;
    }

    private static /* synthetic */ LightGroup[] $values() {
        return null;
    }

    static {
        $VALUES = LightGroup.$values();
        allValues = LightGroup.values();
    }
}

