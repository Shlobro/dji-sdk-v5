/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;

public final class FlyLimitLicenseVersion
extends Enum<FlyLimitLicenseVersion>
implements JNIProguardKeepTag {
    public static final /* enum */ FlyLimitLicenseVersion V2 = new FlyLimitLicenseVersion(0);
    public static final /* enum */ FlyLimitLicenseVersion v3 = new FlyLimitLicenseVersion(1);
    public static final /* enum */ FlyLimitLicenseVersion V4 = new FlyLimitLicenseVersion(2);
    public static final /* enum */ FlyLimitLicenseVersion V5 = new FlyLimitLicenseVersion(3);
    public static final /* enum */ FlyLimitLicenseVersion UNKNOWN = new FlyLimitLicenseVersion(65535);
    private int value;
    private static final FlyLimitLicenseVersion[] allValues;
    private static final /* synthetic */ FlyLimitLicenseVersion[] $VALUES;

    public static FlyLimitLicenseVersion[] values() {
        return null;
    }

    public static FlyLimitLicenseVersion valueOf(String string) {
        return null;
    }

    private FlyLimitLicenseVersion(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static FlyLimitLicenseVersion find(int n) {
        return null;
    }

    private static /* synthetic */ FlyLimitLicenseVersion[] $values() {
        return null;
    }

    static {
        $VALUES = FlyLimitLicenseVersion.$values();
        allValues = FlyLimitLicenseVersion.values();
    }
}

