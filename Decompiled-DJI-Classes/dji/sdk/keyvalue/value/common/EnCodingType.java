/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.common;

import dji.jni.JNIProguardKeepTag;

public final class EnCodingType
extends Enum<EnCodingType>
implements JNIProguardKeepTag {
    public static final /* enum */ EnCodingType UTF8 = new EnCodingType(0);
    public static final /* enum */ EnCodingType UNKNOWN = new EnCodingType(65535);
    private int value;
    private static final EnCodingType[] allValues;
    private static final /* synthetic */ EnCodingType[] $VALUES;

    public static EnCodingType[] values() {
        return null;
    }

    public static EnCodingType valueOf(String string) {
        return null;
    }

    private EnCodingType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static EnCodingType find(int n) {
        return null;
    }

    private static /* synthetic */ EnCodingType[] $values() {
        return null;
    }

    static {
        $VALUES = EnCodingType.$values();
        allValues = EnCodingType.values();
    }
}

