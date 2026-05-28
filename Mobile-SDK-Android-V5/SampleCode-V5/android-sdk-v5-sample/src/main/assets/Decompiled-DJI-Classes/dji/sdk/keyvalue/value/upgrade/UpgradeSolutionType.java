/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.upgrade;

import dji.jni.JNIProguardKeepTag;

public final class UpgradeSolutionType
extends Enum<UpgradeSolutionType>
implements JNIProguardKeepTag {
    public static final /* enum */ UpgradeSolutionType V1_ALL_DEVICES_TAR_FILE = new UpgradeSolutionType(1);
    public static final /* enum */ UpgradeSolutionType V1_ALL_DEVICES_MULTI_FILE = new UpgradeSolutionType(2);
    public static final /* enum */ UpgradeSolutionType V1_ONE_DEVICES = new UpgradeSolutionType(3);
    public static final /* enum */ UpgradeSolutionType FTP_ALL_DEVICES_TAR_FILE = new UpgradeSolutionType(4);
    public static final /* enum */ UpgradeSolutionType FTP_ALL_DEVICES_MULTI_FILE = new UpgradeSolutionType(5);
    public static final /* enum */ UpgradeSolutionType FTP_ONE_DEVICES = new UpgradeSolutionType(6);
    public static final /* enum */ UpgradeSolutionType V1_VERSION_LIST_MULTI_MODULE = new UpgradeSolutionType(7);
    public static final /* enum */ UpgradeSolutionType UNKNOWN = new UpgradeSolutionType(65535);
    private int value;
    private static final UpgradeSolutionType[] allValues;
    private static final /* synthetic */ UpgradeSolutionType[] $VALUES;

    public static UpgradeSolutionType[] values() {
        return null;
    }

    public static UpgradeSolutionType valueOf(String string) {
        return null;
    }

    private UpgradeSolutionType(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static UpgradeSolutionType find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeSolutionType[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeSolutionType.$values();
        allValues = UpgradeSolutionType.values();
    }
}

