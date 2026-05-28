/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class VisualExplorationStage
extends Enum<VisualExplorationStage>
implements JNIProguardKeepTag {
    public static final /* enum */ VisualExplorationStage IDLE = new VisualExplorationStage(0);
    public static final /* enum */ VisualExplorationStage SKY_PARSING = new VisualExplorationStage(1);
    public static final /* enum */ VisualExplorationStage SATELLITE_SEARCHING = new VisualExplorationStage(2);
    public static final /* enum */ VisualExplorationStage TRANSFING = new VisualExplorationStage(3);
    public static final /* enum */ VisualExplorationStage MANUAL_SET_DEPARTURE_POINT = new VisualExplorationStage(4);
    public static final /* enum */ VisualExplorationStage WAIT_EXECUTE_DEPARTURE_WAYLINE = new VisualExplorationStage(5);
    public static final /* enum */ VisualExplorationStage EXECUTE_DEPARTURE_WAYLINE = new VisualExplorationStage(6);
    public static final /* enum */ VisualExplorationStage UNKNOWN = new VisualExplorationStage(65535);
    private int value;
    private static final VisualExplorationStage[] allValues;
    private static final /* synthetic */ VisualExplorationStage[] $VALUES;

    public static VisualExplorationStage[] values() {
        return null;
    }

    public static VisualExplorationStage valueOf(String string) {
        return null;
    }

    private VisualExplorationStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static VisualExplorationStage find(int n) {
        return null;
    }

    private static /* synthetic */ VisualExplorationStage[] $values() {
        return null;
    }

    static {
        $VALUES = VisualExplorationStage.$values();
        allValues = VisualExplorationStage.values();
    }
}

