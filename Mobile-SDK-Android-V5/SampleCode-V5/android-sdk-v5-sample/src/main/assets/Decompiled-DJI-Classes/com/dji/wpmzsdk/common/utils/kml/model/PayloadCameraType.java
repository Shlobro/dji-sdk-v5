/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum PayloadCameraType implements JNIProguardKeepTag
{
    EP800(1),
    EP600(2),
    UNKNOWN(65535);

    private int value;
    private static final PayloadCameraType[] allValues;

    private PayloadCameraType(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static PayloadCameraType find(int value) {
        PayloadCameraType result = null;
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
        allValues = PayloadCameraType.values();
    }
}

