/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.glass;

import dji.jni.JNIProguardKeepTag;

public final class CommonFileType
extends Enum<CommonFileType>
implements JNIProguardKeepTag {
    public static final /* enum */ CommonFileType FLIGHT_LOG = new CommonFileType(1);
    public static final /* enum */ CommonFileType SIMPLE_LOG = new CommonFileType(2);
    public static final /* enum */ CommonFileType UNKNOWN = new CommonFileType(255);
    private int value;
    private static final CommonFileType[] allValues;
    private static final /* synthetic */ CommonFileType[] $VALUES;

    public static CommonFileType[] values() {
        return null;
    }

    public static CommonFileType valueOf(String string) {
        return null;
    }

    private CommonFileType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CommonFileType find(int n) {
        return null;
    }

    private static /* synthetic */ CommonFileType[] $values() {
        return null;
    }

    static {
        $VALUES = CommonFileType.$values();
        allValues = CommonFileType.values();
    }
}

