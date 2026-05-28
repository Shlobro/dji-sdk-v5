/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class FirmwareDecompressingProcessState
extends Enum<FirmwareDecompressingProcessState> {
    public static final /* enum */ FirmwareDecompressingProcessState INITIALIZING = new FirmwareDecompressingProcessState();
    public static final /* enum */ FirmwareDecompressingProcessState DECOMPRESSING = new FirmwareDecompressingProcessState();
    public static final /* enum */ FirmwareDecompressingProcessState DECOMPRESS_FAILED = new FirmwareDecompressingProcessState();
    public static final /* enum */ FirmwareDecompressingProcessState DECOMPRESS_SUCCESSED = new FirmwareDecompressingProcessState();
    public static final /* enum */ FirmwareDecompressingProcessState UNKNOWN = new FirmwareDecompressingProcessState();
    private static final /* synthetic */ FirmwareDecompressingProcessState[] $VALUES;

    public static FirmwareDecompressingProcessState[] values() {
        return null;
    }

    public static FirmwareDecompressingProcessState valueOf(String string2) {
        return null;
    }

    public static FirmwareDecompressingProcessState getFirmwareDecompressProcessState(NativeObjects.FirmwareDecompressProcessState firmwareDecompressProcessState) {
        return null;
    }

    private static /* synthetic */ FirmwareDecompressingProcessState[] $values() {
        return null;
    }

    static {
        $VALUES = FirmwareDecompressingProcessState.$values();
    }
}

