/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class IrScreen
extends Enum<IrScreen>
implements JNIProguardKeepTag {
    public static final /* enum */ IrScreen IR_ONLY = new IrScreen(0);
    public static final /* enum */ IrScreen VISIBLE_ONLY = new IrScreen(1);
    public static final /* enum */ IrScreen SIDE_BY_SIDE_LEFT = new IrScreen(2);
    public static final /* enum */ IrScreen SIDE_BY_SIDE_RIGHT = new IrScreen(3);
    public static final /* enum */ IrScreen SIDE_BY_SIDE = new IrScreen(100);
    public static final /* enum */ IrScreen UNKNOWN = new IrScreen(255);
    private int value;
    private static final IrScreen[] allValues;
    private static final /* synthetic */ IrScreen[] $VALUES;

    public static IrScreen[] values() {
        return null;
    }

    public static IrScreen valueOf(String string) {
        return null;
    }

    private IrScreen(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static IrScreen find(int n) {
        return null;
    }

    private static /* synthetic */ IrScreen[] $values() {
        return null;
    }

    static {
        $VALUES = IrScreen.$values();
        allValues = IrScreen.values();
    }
}

