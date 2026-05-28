/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class WidgetType
extends Enum<WidgetType>
implements JNIProguardKeepTag {
    public static final /* enum */ WidgetType BUTTON = new WidgetType(1);
    public static final /* enum */ WidgetType SWITCH = new WidgetType(2);
    public static final /* enum */ WidgetType RANGE = new WidgetType(3);
    public static final /* enum */ WidgetType LIST = new WidgetType(4);
    public static final /* enum */ WidgetType INPUT = new WidgetType(5);
    public static final /* enum */ WidgetType UNKNOWN = new WidgetType(65535);
    private int value;
    private static final WidgetType[] allValues;
    private static final /* synthetic */ WidgetType[] $VALUES;

    public static WidgetType[] values() {
        return null;
    }

    public static WidgetType valueOf(String string) {
        return null;
    }

    private WidgetType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WidgetType find(int n) {
        return null;
    }

    private static /* synthetic */ WidgetType[] $values() {
        return null;
    }

    static {
        $VALUES = WidgetType.$values();
        allValues = WidgetType.values();
    }
}

