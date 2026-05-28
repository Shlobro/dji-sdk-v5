/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmDownloadServiceMode
extends Enum<WlmDownloadServiceMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmDownloadServiceMode COMMON = new WlmDownloadServiceMode(0);
    public static final /* enum */ WlmDownloadServiceMode WIFI_HIGH_SPEED = new WlmDownloadServiceMode(1);
    public static final /* enum */ WlmDownloadServiceMode UNKNOWN = new WlmDownloadServiceMode(255);
    private int value;
    private static final WlmDownloadServiceMode[] allValues;
    private static final /* synthetic */ WlmDownloadServiceMode[] $VALUES;

    public static WlmDownloadServiceMode[] values() {
        return null;
    }

    public static WlmDownloadServiceMode valueOf(String string) {
        return null;
    }

    private WlmDownloadServiceMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmDownloadServiceMode find(int n) {
        return null;
    }

    private static /* synthetic */ WlmDownloadServiceMode[] $values() {
        return null;
    }

    static {
        $VALUES = WlmDownloadServiceMode.$values();
        allValues = WlmDownloadServiceMode.values();
    }
}

