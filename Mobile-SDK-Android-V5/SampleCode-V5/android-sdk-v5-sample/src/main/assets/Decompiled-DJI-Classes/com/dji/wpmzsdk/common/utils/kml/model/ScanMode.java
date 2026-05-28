/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import dji.sdk.wpmz.jni.JNIProguardKeepTag;

public enum ScanMode implements JNIProguardKeepTag
{
    NON_REPEAT(0),
    REPEAT(1),
    UNKNOWN(65535);

    private int value;
    private static final ScanMode[] allValues;

    private ScanMode(int value) {
        this.value = value;
    }

    public int value() {
        return this.value;
    }

    public boolean equals(int b) {
        return this.value == b;
    }

    public static ScanMode find(int value) {
        ScanMode result = null;
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
        allValues = ScanMode.values();
    }
}

