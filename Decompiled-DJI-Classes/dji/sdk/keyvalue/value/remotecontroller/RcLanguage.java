/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class RcLanguage
extends Enum<RcLanguage>
implements JNIProguardKeepTag {
    public static final /* enum */ RcLanguage LANGUAGE_SIMPLIFIED_CHINESE = new RcLanguage(0);
    public static final /* enum */ RcLanguage LANGUAGE_TRADITIONAL_CHINESE = new RcLanguage(1);
    public static final /* enum */ RcLanguage LANGUAGE_ENGLISH = new RcLanguage(2);
    public static final /* enum */ RcLanguage LANGUAGE_TGERMAN = new RcLanguage(3);
    public static final /* enum */ RcLanguage LANGUAGE_KOREAN = new RcLanguage(4);
    public static final /* enum */ RcLanguage LANGUAGE_JAPANESE = new RcLanguage(5);
    public static final /* enum */ RcLanguage UNKNOWN = new RcLanguage(65535);
    private int value;
    private static final RcLanguage[] allValues;
    private static final /* synthetic */ RcLanguage[] $VALUES;

    public static RcLanguage[] values() {
        return null;
    }

    public static RcLanguage valueOf(String string) {
        return null;
    }

    private RcLanguage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static RcLanguage find(int n) {
        return null;
    }

    private static /* synthetic */ RcLanguage[] $values() {
        return null;
    }

    static {
        $VALUES = RcLanguage.$values();
        allValues = RcLanguage.values();
    }
}

