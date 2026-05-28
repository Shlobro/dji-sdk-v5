/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class SSDVideoLicense
extends Enum<SSDVideoLicense>
implements JNIProguardKeepTag {
    public static final /* enum */ SSDVideoLicense CINEMA_DNG = new SSDVideoLicense(0);
    public static final /* enum */ SSDVideoLicense PRO_RES_422HQ = new SSDVideoLicense(1);
    public static final /* enum */ SSDVideoLicense PRO_RES_4444XQ = new SSDVideoLicense(2);
    public static final /* enum */ SSDVideoLicense UNKNOWN = new SSDVideoLicense(65535);
    private int value;
    private static final SSDVideoLicense[] allValues;
    private static final /* synthetic */ SSDVideoLicense[] $VALUES;

    public static SSDVideoLicense[] values() {
        return null;
    }

    public static SSDVideoLicense valueOf(String string) {
        return null;
    }

    private SSDVideoLicense(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static SSDVideoLicense find(int n) {
        return null;
    }

    private static /* synthetic */ SSDVideoLicense[] $values() {
        return null;
    }

    static {
        $VALUES = SSDVideoLicense.$values();
        allValues = SSDVideoLicense.values();
    }
}

