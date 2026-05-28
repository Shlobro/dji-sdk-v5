/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.wpmz.value.mission;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum WPMLParseError implements JNIProguardKeepTag
{
    NO_ERROR(0),
    VERSION_CHECK_FAIL(1),
    DOCUMENT_PARSE_ERROR(2),
    FAILD_PARSE_ERROR(3),
    FILE_NOT_EXIST(4),
    REQUIRED_FIELD_MISSING(5),
    UNKNOWN(65535);

    private int value;
    private static final WPMLParseError[] allValues;

    private WPMLParseError(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static WPMLParseError find(int value) {
        WPMLParseError result = null;
        for (int i = 0; i < allValues.length; ++i) {
            if (!allValues[i].equals(value)) continue;
            result = allValues[i];
            break;
        }
        if (null == result) {
            result = UNKNOWN;
            result.value = value;
        }
        return result;
    }

    static {
        allValues = WPMLParseError.values();
    }
}

