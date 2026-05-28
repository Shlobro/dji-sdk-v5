/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;

public final class PanoControlAction
extends Enum<PanoControlAction>
implements JNIProguardKeepTag {
    public static final /* enum */ PanoControlAction ACTION_ABORT = new PanoControlAction(0);
    public static final /* enum */ PanoControlAction ACTION_CAPTURE = new PanoControlAction(1);
    public static final /* enum */ PanoControlAction ACTION_RELEASE = new PanoControlAction(2);
    public static final /* enum */ PanoControlAction ACTION_3X1 = new PanoControlAction(3);
    public static final /* enum */ PanoControlAction ACTION_BOKEH = new PanoControlAction(4);
    public static final /* enum */ PanoControlAction ACTION_GESTURE = new PanoControlAction(5);
    public static final /* enum */ PanoControlAction ACTION_1X3 = new PanoControlAction(6);
    public static final /* enum */ PanoControlAction ACTION_3X3 = new PanoControlAction(7);
    public static final /* enum */ PanoControlAction ACTION_SPHERE = new PanoControlAction(8);
    public static final /* enum */ PanoControlAction ACTION_3x7 = new PanoControlAction(9);
    public static final /* enum */ PanoControlAction ACTION_SUPER_SR = new PanoControlAction(10);
    public static final /* enum */ PanoControlAction UNKNOWN = new PanoControlAction(255);
    private int value;
    private static final PanoControlAction[] allValues;
    private static final /* synthetic */ PanoControlAction[] $VALUES;

    public static PanoControlAction[] values() {
        return null;
    }

    public static PanoControlAction valueOf(String string) {
        return null;
    }

    private PanoControlAction(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static PanoControlAction find(int n) {
        return null;
    }

    private static /* synthetic */ PanoControlAction[] $values() {
        return null;
    }

    static {
        $VALUES = PanoControlAction.$values();
        allValues = PanoControlAction.values();
    }
}

