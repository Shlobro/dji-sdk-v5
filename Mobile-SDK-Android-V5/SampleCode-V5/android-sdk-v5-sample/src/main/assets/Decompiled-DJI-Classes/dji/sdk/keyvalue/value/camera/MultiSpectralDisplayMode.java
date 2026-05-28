/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.value.camera;

import dji.sdk.keyvalue.value.camera.ThermalDisplayMode;

public final class MultiSpectralDisplayMode
extends Enum<MultiSpectralDisplayMode> {
    public static final /* enum */ MultiSpectralDisplayMode VISUAL_ONLY = new MultiSpectralDisplayMode(0);
    public static final /* enum */ MultiSpectralDisplayMode NDVI_ONLY = new MultiSpectralDisplayMode(1);
    public static final /* enum */ MultiSpectralDisplayMode PIP = new MultiSpectralDisplayMode(2);
    public static final /* enum */ MultiSpectralDisplayMode MSX = new MultiSpectralDisplayMode(3);
    public static final /* enum */ MultiSpectralDisplayMode UNKNOWN = new MultiSpectralDisplayMode(65535);
    private int value;
    private static final MultiSpectralDisplayMode[] allValues;
    private static final /* synthetic */ MultiSpectralDisplayMode[] $VALUES;

    public static MultiSpectralDisplayMode[] values() {
        return null;
    }

    public static MultiSpectralDisplayMode valueOf(String string) {
        return null;
    }

    private MultiSpectralDisplayMode(int n2) {
    }

    private boolean compareValue(int n) {
        return false;
    }

    public int value() {
        return 0;
    }

    public ThermalDisplayMode toThermalDisplayMode() {
        return null;
    }

    public static MultiSpectralDisplayMode find(int n) {
        return null;
    }

    public static MultiSpectralDisplayMode find(ThermalDisplayMode thermalDisplayMode) {
        return null;
    }

    private static /* synthetic */ MultiSpectralDisplayMode[] $values() {
        return null;
    }

    static {
        $VALUES = MultiSpectralDisplayMode.$values();
        allValues = MultiSpectralDisplayMode.values();
    }
}

