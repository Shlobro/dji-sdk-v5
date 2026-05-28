/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class VisualExplorationScoreLevel
extends Enum<VisualExplorationScoreLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ VisualExplorationScoreLevel LOW = new VisualExplorationScoreLevel(0);
    public static final /* enum */ VisualExplorationScoreLevel MEDIUM = new VisualExplorationScoreLevel(1);
    public static final /* enum */ VisualExplorationScoreLevel HIGH = new VisualExplorationScoreLevel(2);
    public static final /* enum */ VisualExplorationScoreLevel UNKNOWN = new VisualExplorationScoreLevel(65535);
    private int value;
    private static final VisualExplorationScoreLevel[] allValues;
    private static final /* synthetic */ VisualExplorationScoreLevel[] $VALUES;

    public static VisualExplorationScoreLevel[] values() {
        return null;
    }

    public static VisualExplorationScoreLevel valueOf(String string) {
        return null;
    }

    private VisualExplorationScoreLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisualExplorationScoreLevel find(int n) {
        return null;
    }

    private static /* synthetic */ VisualExplorationScoreLevel[] $values() {
        return null;
    }

    static {
        $VALUES = VisualExplorationScoreLevel.$values();
        allValues = VisualExplorationScoreLevel.values();
    }
}

