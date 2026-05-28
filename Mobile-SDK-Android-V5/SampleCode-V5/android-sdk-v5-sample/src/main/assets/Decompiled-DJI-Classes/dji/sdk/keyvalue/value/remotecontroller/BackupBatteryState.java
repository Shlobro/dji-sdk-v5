/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;

public final class BackupBatteryState
extends Enum<BackupBatteryState>
implements JNIProguardKeepTag {
    public static final /* enum */ BackupBatteryState BACKUP_BATTERY_STATE_OFF = new BackupBatteryState(0);
    public static final /* enum */ BackupBatteryState BACKUP_BATTERY_STATE_ON = new BackupBatteryState(1);
    public static final /* enum */ BackupBatteryState UNKNOWN = new BackupBatteryState(65535);
    private int value;
    private static final BackupBatteryState[] allValues;
    private static final /* synthetic */ BackupBatteryState[] $VALUES;

    public static BackupBatteryState[] values() {
        return null;
    }

    public static BackupBatteryState valueOf(String string) {
        return null;
    }

    private BackupBatteryState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean equals(int n) {
        return false;
    }

    public static BackupBatteryState find(int n) {
        return null;
    }

    private static /* synthetic */ BackupBatteryState[] $values() {
        return null;
    }

    static {
        $VALUES = BackupBatteryState.$values();
        allValues = BackupBatteryState.values();
    }
}

