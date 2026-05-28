/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;

public final class AppLanguage
extends Enum<AppLanguage>
implements JNIProguardKeepTag {
    public static final /* enum */ AppLanguage ENGLISH = new AppLanguage(0);
    public static final /* enum */ AppLanguage SIMPLIFIED_CHINESE = new AppLanguage(1);
    public static final /* enum */ AppLanguage JAPANESE = new AppLanguage(2);
    public static final /* enum */ AppLanguage FRENCH = new AppLanguage(3);
    public static final /* enum */ AppLanguage UNKNOWN = new AppLanguage(65535);
    private int value;
    private static final AppLanguage[] allValues;
    private static final /* synthetic */ AppLanguage[] $VALUES;

    public static AppLanguage[] values() {
        return null;
    }

    public static AppLanguage valueOf(String string) {
        return null;
    }

    private AppLanguage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static AppLanguage find(int n) {
        return null;
    }

    private static /* synthetic */ AppLanguage[] $values() {
        return null;
    }

    static {
        $VALUES = AppLanguage.$values();
        allValues = AppLanguage.values();
    }
}

