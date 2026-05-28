/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.innertool;

import dji.jni.JNIProguardKeepTag;

public final class CSDKRecordItemType
extends Enum<CSDKRecordItemType>
implements JNIProguardKeepTag {
    public static final /* enum */ CSDKRecordItemType INDEX = new CSDKRecordItemType(0);
    public static final /* enum */ CSDKRecordItemType KEY_REQ = new CSDKRecordItemType(1);
    public static final /* enum */ CSDKRecordItemType KEY_RSP = new CSDKRecordItemType(2);
    public static final /* enum */ CSDKRecordItemType UNKNOWN = new CSDKRecordItemType(65535);
    private int value;
    private static final CSDKRecordItemType[] allValues;
    private static final /* synthetic */ CSDKRecordItemType[] $VALUES;

    public static CSDKRecordItemType[] values() {
        return null;
    }

    public static CSDKRecordItemType valueOf(String string) {
        return null;
    }

    private CSDKRecordItemType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CSDKRecordItemType find(int n) {
        return null;
    }

    private static /* synthetic */ CSDKRecordItemType[] $values() {
        return null;
    }

    static {
        $VALUES = CSDKRecordItemType.$values();
        allValues = CSDKRecordItemType.values();
    }
}

