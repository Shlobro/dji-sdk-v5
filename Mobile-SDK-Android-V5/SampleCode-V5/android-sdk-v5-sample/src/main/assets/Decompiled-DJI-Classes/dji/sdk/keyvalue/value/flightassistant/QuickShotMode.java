/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class QuickShotMode
extends Enum<QuickShotMode>
implements JNIProguardKeepTag {
    public static final /* enum */ QuickShotMode CIRCLE = new QuickShotMode(1);
    public static final /* enum */ QuickShotMode DRONIE = new QuickShotMode(2);
    public static final /* enum */ QuickShotMode HELIX = new QuickShotMode(3);
    public static final /* enum */ QuickShotMode ROCKET = new QuickShotMode(4);
    public static final /* enum */ QuickShotMode BOOMERANG = new QuickShotMode(6);
    public static final /* enum */ QuickShotMode ASTEROID = new QuickShotMode(8);
    public static final /* enum */ QuickShotMode DOLLY_ZOOM = new QuickShotMode(10);
    public static final /* enum */ QuickShotMode UNKNOWN = new QuickShotMode(65535);
    private int value;
    private static final QuickShotMode[] allValues;
    private static final /* synthetic */ QuickShotMode[] $VALUES;

    public static QuickShotMode[] values() {
        return null;
    }

    public static QuickShotMode valueOf(String string) {
        return null;
    }

    private QuickShotMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static QuickShotMode find(int n) {
        return null;
    }

    private static /* synthetic */ QuickShotMode[] $values() {
        return null;
    }

    static {
        $VALUES = QuickShotMode.$values();
        allValues = QuickShotMode.values();
    }
}

