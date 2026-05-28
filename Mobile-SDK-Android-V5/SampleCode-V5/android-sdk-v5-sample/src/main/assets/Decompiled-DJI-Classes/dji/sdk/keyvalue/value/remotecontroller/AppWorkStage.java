/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class AppWorkStage
extends Enum<AppWorkStage>
implements JNIProguardKeepTag {
    public static final /* enum */ AppWorkStage IN_DOWNLOAD = new AppWorkStage(0);
    public static final /* enum */ AppWorkStage IN_UPLOAD_LOG = new AppWorkStage(1);
    public static final /* enum */ AppWorkStage IN_DRAWING = new AppWorkStage(2);
    public static final /* enum */ AppWorkStage IN_WIFI_4G_FLY = new AppWorkStage(3);
    public static final /* enum */ AppWorkStage UNKNOWN = new AppWorkStage(65535);
    private int value;
    private static final AppWorkStage[] allValues;
    private static final /* synthetic */ AppWorkStage[] $VALUES;

    public static AppWorkStage[] values() {
        return null;
    }

    public static AppWorkStage valueOf(String string) {
        return null;
    }

    private AppWorkStage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AppWorkStage find(int n) {
        return null;
    }

    private static /* synthetic */ AppWorkStage[] $values() {
        return null;
    }

    static {
        $VALUES = AppWorkStage.$values();
        allValues = AppWorkStage.values();
    }
}

