/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class ValidWhiteListType
extends Enum<ValidWhiteListType>
implements JNIProguardKeepTag {
    public static final /* enum */ ValidWhiteListType NONE = new ValidWhiteListType(0);
    public static final /* enum */ ValidWhiteListType CIRCLE = new ValidWhiteListType(1);
    public static final /* enum */ ValidWhiteListType POLYGON = new ValidWhiteListType(2);
    public static final /* enum */ ValidWhiteListType UNKNOWN = new ValidWhiteListType(65535);
    private int value;
    private static final ValidWhiteListType[] allValues;
    private static final /* synthetic */ ValidWhiteListType[] $VALUES;

    public static ValidWhiteListType[] values() {
        return null;
    }

    public static ValidWhiteListType valueOf(String string) {
        return null;
    }

    private ValidWhiteListType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static ValidWhiteListType find(int n) {
        return null;
    }

    private static /* synthetic */ ValidWhiteListType[] $values() {
        return null;
    }

    static {
        $VALUES = ValidWhiteListType.$values();
        allValues = ValidWhiteListType.values();
    }
}

