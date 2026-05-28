/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmLinkMode
extends Enum<WlmLinkMode>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmLinkMode OCUSYNC_ONLY = new WlmLinkMode(1);
    public static final /* enum */ WlmLinkMode LTE_ONLY = new WlmLinkMode(2);
    public static final /* enum */ WlmLinkMode HYBRID_LTE_OCUSYNC = new WlmLinkMode(3);
    public static final /* enum */ WlmLinkMode WIFI_ONLY = new WlmLinkMode(4);
    public static final /* enum */ WlmLinkMode HYBRID_OCUSYNC_WIFI = new WlmLinkMode(5);
    public static final /* enum */ WlmLinkMode HYBRID_LTE_WIFI = new WlmLinkMode(6);
    public static final /* enum */ WlmLinkMode HYBRID_ALL = new WlmLinkMode(7);
    public static final /* enum */ WlmLinkMode UNKNOWN = new WlmLinkMode(65535);
    private int value;
    private static final WlmLinkMode[] allValues;
    private static final /* synthetic */ WlmLinkMode[] $VALUES;

    public static WlmLinkMode[] values() {
        return null;
    }

    public static WlmLinkMode valueOf(String string) {
        return null;
    }

    private WlmLinkMode(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmLinkMode find(int n) {
        return null;
    }

    private static /* synthetic */ WlmLinkMode[] $values() {
        return null;
    }

    static {
        $VALUES = WlmLinkMode.$values();
        allValues = WlmLinkMode.values();
    }
}

