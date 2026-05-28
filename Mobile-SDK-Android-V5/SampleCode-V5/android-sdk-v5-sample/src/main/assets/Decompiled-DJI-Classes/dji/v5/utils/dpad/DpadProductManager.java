/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.utils.dpad;

import dji.v5.utils.dpad.DpadProductType;

public class DpadProductManager {
    private String tag;
    private DpadProductType productType;
    private static final DpadProductManager mInstance = new DpadProductManager();

    public static DpadProductManager getInstance() {
        return null;
    }

    private DpadProductManager() {
    }

    public DpadProductType getProductType() {
        return null;
    }

    public boolean isDpad() {
        return false;
    }

    public boolean isPomato() {
        return false;
    }

    public boolean useUsbdec() {
        return false;
    }

    public static boolean isPomato(DpadProductType dpadProductType) {
        return false;
    }

    public boolean isRMSeries() {
        return false;
    }

    public boolean useUsbWifiLink() {
        return false;
    }

    public boolean isCrystalSky() {
        return false;
    }

    public boolean isCrystalSkyZS600a() {
        return false;
    }

    public boolean isRcDpad() {
        return false;
    }

    public boolean isCrystalSkyB() {
        return false;
    }

    public boolean isRM500Series() {
        return false;
    }

    public boolean isM300RTK() {
        return false;
    }

    public boolean isSmartController() {
        return false;
    }

    public boolean isDjiRcPlus() {
        return false;
    }

    public boolean isDjiRcPro() {
        return false;
    }

    public boolean supportSystemVideoSmooth() {
        return false;
    }

    public boolean useLowQualityAnim() {
        return false;
    }

    private void init() {
    }

    public int getProductTag() {
        return 0;
    }
}

