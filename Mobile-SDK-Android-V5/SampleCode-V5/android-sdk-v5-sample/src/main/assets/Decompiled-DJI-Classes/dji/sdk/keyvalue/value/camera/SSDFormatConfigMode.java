/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SSDFormatConfigMode
extends Enum<SSDFormatConfigMode>
implements JNIProguardKeepTag {
    public static final /* enum */ SSDFormatConfigMode LOSS_LESS_RAW = new SSDFormatConfigMode(0);
    public static final /* enum */ SSDFormatConfigMode D_RAW = new SSDFormatConfigMode(1);
    public static final /* enum */ SSDFormatConfigMode PRORES_RAW = new SSDFormatConfigMode(2);
    public static final /* enum */ SSDFormatConfigMode PRORES_RAW_HQ = new SSDFormatConfigMode(3);
    public static final /* enum */ SSDFormatConfigMode PRORES_HQ422 = new SSDFormatConfigMode(16);
    public static final /* enum */ SSDFormatConfigMode PRORES_XQ444 = new SSDFormatConfigMode(17);
    public static final /* enum */ SSDFormatConfigMode OFF = new SSDFormatConfigMode(32);
    public static final /* enum */ SSDFormatConfigMode LIVE_VIEW = new SSDFormatConfigMode(48);
    public static final /* enum */ SSDFormatConfigMode UNKNOWN = new SSDFormatConfigMode(65535);
    private int value;
    private static final SSDFormatConfigMode[] allValues;
    private static final /* synthetic */ SSDFormatConfigMode[] $VALUES;

    public static SSDFormatConfigMode[] values() {
        return null;
    }

    public static SSDFormatConfigMode valueOf(String string) {
        return null;
    }

    private SSDFormatConfigMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SSDFormatConfigMode find(int n) {
        return null;
    }

    private static /* synthetic */ SSDFormatConfigMode[] $values() {
        return null;
    }

    static {
        $VALUES = SSDFormatConfigMode.$values();
        allValues = SSDFormatConfigMode.values();
    }
}

