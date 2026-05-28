/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.gimbal;

import dji.jni.JNIProguardKeepTag;

public final class SuggestedDirectionAdjustment
extends Enum<SuggestedDirectionAdjustment>
implements JNIProguardKeepTag {
    public static final /* enum */ SuggestedDirectionAdjustment NONE = new SuggestedDirectionAdjustment(0);
    public static final /* enum */ SuggestedDirectionAdjustment LEFT = new SuggestedDirectionAdjustment(1);
    public static final /* enum */ SuggestedDirectionAdjustment RIGHT = new SuggestedDirectionAdjustment(2);
    public static final /* enum */ SuggestedDirectionAdjustment UPWARDS = new SuggestedDirectionAdjustment(3);
    public static final /* enum */ SuggestedDirectionAdjustment DOWNWARDS = new SuggestedDirectionAdjustment(4);
    public static final /* enum */ SuggestedDirectionAdjustment FORWARDS = new SuggestedDirectionAdjustment(5);
    public static final /* enum */ SuggestedDirectionAdjustment BACKWARDS = new SuggestedDirectionAdjustment(6);
    public static final /* enum */ SuggestedDirectionAdjustment UNKNOWN = new SuggestedDirectionAdjustment(100);
    private int value;
    private static final SuggestedDirectionAdjustment[] allValues;
    private static final /* synthetic */ SuggestedDirectionAdjustment[] $VALUES;

    public static SuggestedDirectionAdjustment[] values() {
        return null;
    }

    public static SuggestedDirectionAdjustment valueOf(String string) {
        return null;
    }

    private SuggestedDirectionAdjustment(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SuggestedDirectionAdjustment find(int n) {
        return null;
    }

    private static /* synthetic */ SuggestedDirectionAdjustment[] $values() {
        return null;
    }

    static {
        $VALUES = SuggestedDirectionAdjustment.$values();
        allValues = SuggestedDirectionAdjustment.values();
    }
}

