/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;

public final class DongleLanguage
extends Enum<DongleLanguage>
implements JNIProguardKeepTag {
    public static final /* enum */ DongleLanguage CHINESE = new DongleLanguage(0);
    public static final /* enum */ DongleLanguage ENGLISH = new DongleLanguage(1);
    public static final /* enum */ DongleLanguage JAPANESE = new DongleLanguage(2);
    public static final /* enum */ DongleLanguage UNKNOWN = new DongleLanguage(65535);
    private int value;
    private static final DongleLanguage[] allValues;
    private static final /* synthetic */ DongleLanguage[] $VALUES;

    public static DongleLanguage[] values() {
        return null;
    }

    public static DongleLanguage valueOf(String string) {
        return null;
    }

    private DongleLanguage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static DongleLanguage find(int n) {
        return null;
    }

    private static /* synthetic */ DongleLanguage[] $values() {
        return null;
    }

    static {
        $VALUES = DongleLanguage.$values();
        allValues = DongleLanguage.values();
    }
}

