/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class ClientLanguage
extends Enum<ClientLanguage>
implements JNIProguardKeepTag {
    public static final /* enum */ ClientLanguage CHI_SIMP = new ClientLanguage(0);
    public static final /* enum */ ClientLanguage CHI_TRADI = new ClientLanguage(1);
    public static final /* enum */ ClientLanguage ENG = new ClientLanguage(2);
    public static final /* enum */ ClientLanguage GERM = new ClientLanguage(3);
    public static final /* enum */ ClientLanguage KOREAN = new ClientLanguage(4);
    public static final /* enum */ ClientLanguage JAPAN = new ClientLanguage(5);
    public static final /* enum */ ClientLanguage OTHER = new ClientLanguage(6);
    public static final /* enum */ ClientLanguage UNKNOWN = new ClientLanguage(65535);
    private int value;
    private static final ClientLanguage[] allValues;
    private static final /* synthetic */ ClientLanguage[] $VALUES;

    public static ClientLanguage[] values() {
        return null;
    }

    public static ClientLanguage valueOf(String string) {
        return null;
    }

    private ClientLanguage(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ClientLanguage find(int n) {
        return null;
    }

    private static /* synthetic */ ClientLanguage[] $values() {
        return null;
    }

    static {
        $VALUES = ClientLanguage.$values();
        allValues = ClientLanguage.values();
    }
}

