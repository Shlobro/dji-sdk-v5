/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class WidgetFetchState
extends Enum<WidgetFetchState>
implements JNIProguardKeepTag {
    public static final /* enum */ WidgetFetchState FETCH_SUCCESSED = new WidgetFetchState(1);
    public static final /* enum */ WidgetFetchState FETCH_FAILED = new WidgetFetchState(2);
    public static final /* enum */ WidgetFetchState FETCH_IN_PROGRESS = new WidgetFetchState(3);
    public static final /* enum */ WidgetFetchState WIDGET_INFO_SET_UPDATE = new WidgetFetchState(4);
    public static final /* enum */ WidgetFetchState WIDGET_JSON_VERSION_UPDATE = new WidgetFetchState(5);
    public static final /* enum */ WidgetFetchState TEXT_INPUT_PARAM_UPDATE = new WidgetFetchState(6);
    public static final /* enum */ WidgetFetchState FLOAT_WINDOW_WIDGET_UPDATE = new WidgetFetchState(7);
    public static final /* enum */ WidgetFetchState SPEAKER_WIDGET_UPDATE = new WidgetFetchState(8);
    public static final /* enum */ WidgetFetchState MAIN_INTERFACE_UPDATE = new WidgetFetchState(9);
    public static final /* enum */ WidgetFetchState CONFIG_INTERFACE_UPDATE = new WidgetFetchState(10);
    public static final /* enum */ WidgetFetchState WIDGET_CONFIG_JSON = new WidgetFetchState(11);
    public static final /* enum */ WidgetFetchState UNKNOWN = new WidgetFetchState(65535);
    private int value;
    private static final WidgetFetchState[] allValues;
    private static final /* synthetic */ WidgetFetchState[] $VALUES;

    public static WidgetFetchState[] values() {
        return null;
    }

    public static WidgetFetchState valueOf(String string) {
        return null;
    }

    private WidgetFetchState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WidgetFetchState find(int n) {
        return null;
    }

    private static /* synthetic */ WidgetFetchState[] $values() {
        return null;
    }

    static {
        $VALUES = WidgetFetchState.$values();
        allValues = WidgetFetchState.values();
    }
}

