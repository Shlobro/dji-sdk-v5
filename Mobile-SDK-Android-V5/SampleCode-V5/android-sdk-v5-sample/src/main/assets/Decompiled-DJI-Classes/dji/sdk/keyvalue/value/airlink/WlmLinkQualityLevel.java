/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class WlmLinkQualityLevel
extends Enum<WlmLinkQualityLevel>
implements JNIProguardKeepTag {
    public static final /* enum */ WlmLinkQualityLevel NO_SIGNAL = new WlmLinkQualityLevel(0);
    public static final /* enum */ WlmLinkQualityLevel LEVEL_1 = new WlmLinkQualityLevel(1);
    public static final /* enum */ WlmLinkQualityLevel LEVEL_2 = new WlmLinkQualityLevel(2);
    public static final /* enum */ WlmLinkQualityLevel LEVEL_3 = new WlmLinkQualityLevel(3);
    public static final /* enum */ WlmLinkQualityLevel LEVEL_4 = new WlmLinkQualityLevel(4);
    public static final /* enum */ WlmLinkQualityLevel LEVEL_5 = new WlmLinkQualityLevel(5);
    public static final /* enum */ WlmLinkQualityLevel UNKNOWN = new WlmLinkQualityLevel(65535);
    private int value;
    private static final WlmLinkQualityLevel[] allValues;
    private static final /* synthetic */ WlmLinkQualityLevel[] $VALUES;

    public static WlmLinkQualityLevel[] values() {
        return null;
    }

    public static WlmLinkQualityLevel valueOf(String string) {
        return null;
    }

    private WlmLinkQualityLevel(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static WlmLinkQualityLevel find(int n) {
        return null;
    }

    private static /* synthetic */ WlmLinkQualityLevel[] $values() {
        return null;
    }

    static {
        $VALUES = WlmLinkQualityLevel.$values();
        allValues = WlmLinkQualityLevel.values();
    }
}

