/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class UpgradeFirmwareState
extends Enum<UpgradeFirmwareState> {
    public static final /* enum */ UpgradeFirmwareState INITIALIZING = new UpgradeFirmwareState(0);
    public static final /* enum */ UpgradeFirmwareState CHECKING = new UpgradeFirmwareState(1);
    public static final /* enum */ UpgradeFirmwareState UP_TO_DATE = new UpgradeFirmwareState(2);
    public static final /* enum */ UpgradeFirmwareState NEED_FORCE_UPDATE = new UpgradeFirmwareState(3);
    public static final /* enum */ UpgradeFirmwareState NEED_UPDATE = new UpgradeFirmwareState(4);
    public static final /* enum */ UpgradeFirmwareState UNKNOWN = new UpgradeFirmwareState(255);
    private int data;
    private static final /* synthetic */ UpgradeFirmwareState[] $VALUES;

    public static UpgradeFirmwareState[] values() {
        return null;
    }

    public static UpgradeFirmwareState valueOf(String string2) {
        return null;
    }

    public static UpgradeFirmwareState getUpgradeFirmwareState(NativeObjects.ComponentVersionCheckState componentVersionCheckState, NativeObjects.ComponentVersionFetchState componentVersionFetchState) {
        return null;
    }

    private UpgradeFirmwareState(int n2) {
    }

    public int value() {
        return 0;
    }

    public boolean _equals(int n) {
        return false;
    }

    public static UpgradeFirmwareState find(int n) {
        return null;
    }

    private static /* synthetic */ UpgradeFirmwareState[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeFirmwareState.$values();
    }
}

