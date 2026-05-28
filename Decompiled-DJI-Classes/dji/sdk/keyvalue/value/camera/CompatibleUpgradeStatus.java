/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.jni.JNIProguardKeepTag;

public final class CompatibleUpgradeStatus
extends Enum<CompatibleUpgradeStatus>
implements JNIProguardKeepTag {
    public static final /* enum */ CompatibleUpgradeStatus UP_TO_DATE = new CompatibleUpgradeStatus(0);
    public static final /* enum */ CompatibleUpgradeStatus UPGRADE_SUCCESS = new CompatibleUpgradeStatus(5);
    public static final /* enum */ CompatibleUpgradeStatus UPGRADE_FAILURE = new CompatibleUpgradeStatus(6);
    public static final /* enum */ CompatibleUpgradeStatus NEED_COMPATIBLE_UPGRADE = new CompatibleUpgradeStatus(7);
    public static final /* enum */ CompatibleUpgradeStatus UNKNOWN = new CompatibleUpgradeStatus(65535);
    private int value;
    private static final CompatibleUpgradeStatus[] allValues;
    private static final /* synthetic */ CompatibleUpgradeStatus[] $VALUES;

    public static CompatibleUpgradeStatus[] values() {
        return null;
    }

    public static CompatibleUpgradeStatus valueOf(String string) {
        return null;
    }

    private CompatibleUpgradeStatus(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static CompatibleUpgradeStatus find(int n) {
        return null;
    }

    private static /* synthetic */ CompatibleUpgradeStatus[] $values() {
        return null;
    }

    static {
        $VALUES = CompatibleUpgradeStatus.$values();
        allValues = CompatibleUpgradeStatus.values();
    }
}

