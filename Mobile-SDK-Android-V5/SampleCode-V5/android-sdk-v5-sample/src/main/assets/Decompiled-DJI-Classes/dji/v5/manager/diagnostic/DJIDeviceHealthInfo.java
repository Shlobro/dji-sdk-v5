/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.diagnostic;

import dji.sdk.keyvalue.value.diagnostic.HMSDiagnostic;
import dji.v5.manager.diagnostic.IDJIDeviceHealthInfo;
import dji.v5.manager.diagnostic.WarningLevel;

public class DJIDeviceHealthInfo
implements IDJIDeviceHealthInfo {
    protected String informationCode;
    protected String informationCodeInLowCase;
    protected WarningLevel warningLevel;
    private int componentId;
    private int sensorIndex;
    protected String title;
    protected String description;
    private String descriptionInFlying;
    private static final String HMS_TITLE = "hms_title_";
    private static final String HMS_CONTENT = "hms_content_";
    private static final String FPV_TIP = "fpv_tip_";
    private static final String FPV_TIP_SUFFIX = "_in_the_sky";
    private static final String PLACE_HOLDER_ALARM_ID = "%alarmid";
    private static final String PLACE_HOLDER_SENSOR_INDEX = "%index";
    private static final String PLACE_HOLDER_COMPONENT_INDEX = "%component_index";
    private static final String PLACE_HOLDER_BATTERY_INDEX = "%battery_index";

    public DJIDeviceHealthInfo(HMSDiagnostic hMSDiagnostic) {
    }

    public DJIDeviceHealthInfo() {
    }

    @Override
    public String informationCode() {
        return null;
    }

    @Override
    public int componentId() {
        return 0;
    }

    @Override
    public int sensorIndex() {
        return 0;
    }

    @Override
    public String title() {
        return null;
    }

    @Override
    public String description() {
        return null;
    }

    @Override
    public WarningLevel warningLevel() {
        return null;
    }

    private String formattedString(String string2) {
        return null;
    }

    protected void updateDesDescription() {
    }

    private void updateTitle() {
    }

    private boolean isFlying() {
        return false;
    }

    private String getFlyingDescription() {
        return null;
    }

    private String getCommonDescription() {
        return null;
    }

    private String getHmsDescription() {
        return null;
    }

    private String getFpvDescription() {
        return null;
    }

    private String getHmsTitle() {
        return null;
    }
}

