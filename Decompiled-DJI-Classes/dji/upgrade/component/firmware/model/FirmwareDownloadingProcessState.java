/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class FirmwareDownloadingProcessState
extends Enum<FirmwareDownloadingProcessState> {
    public static final /* enum */ FirmwareDownloadingProcessState INITIALIZING = new FirmwareDownloadingProcessState();
    public static final /* enum */ FirmwareDownloadingProcessState DOWNLOADING = new FirmwareDownloadingProcessState();
    public static final /* enum */ FirmwareDownloadingProcessState DOWNLOAD_FAILED = new FirmwareDownloadingProcessState();
    public static final /* enum */ FirmwareDownloadingProcessState DOWNLOAD_SUCCESSED = new FirmwareDownloadingProcessState();
    public static final /* enum */ FirmwareDownloadingProcessState UNKNOWN = new FirmwareDownloadingProcessState();
    private static final /* synthetic */ FirmwareDownloadingProcessState[] $VALUES;

    public static FirmwareDownloadingProcessState[] values() {
        return null;
    }

    public static FirmwareDownloadingProcessState valueOf(String string2) {
        return null;
    }

    public static FirmwareDownloadingProcessState getFirmwareDownloadProcessState(NativeObjects.FirmwareDownloadProcessState firmwareDownloadProcessState) {
        return null;
    }

    private static /* synthetic */ FirmwareDownloadingProcessState[] $values() {
        return null;
    }

    static {
        $VALUES = FirmwareDownloadingProcessState.$values();
    }
}

