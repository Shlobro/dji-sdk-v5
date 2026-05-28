/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;

public final class GlassPairingState
extends Enum<GlassPairingState>
implements JNIProguardKeepTag {
    public static final /* enum */ GlassPairingState UNPAIRED = new GlassPairingState(0);
    public static final /* enum */ GlassPairingState PAIRING = new GlassPairingState(1);
    public static final /* enum */ GlassPairingState PAIRED = new GlassPairingState(2);
    public static final /* enum */ GlassPairingState UNKNOWN = new GlassPairingState(65535);
    private int value;
    private static final GlassPairingState[] allValues;
    private static final /* synthetic */ GlassPairingState[] $VALUES;

    public static GlassPairingState[] values() {
        return null;
    }

    public static GlassPairingState valueOf(String string) {
        return null;
    }

    private GlassPairingState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static GlassPairingState find(int n) {
        return null;
    }

    private static /* synthetic */ GlassPairingState[] $values() {
        return null;
    }

    static {
        $VALUES = GlassPairingState.$values();
        allValues = GlassPairingState.values();
    }
}

