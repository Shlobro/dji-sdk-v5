/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.diagnostic;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.diagnostic.DiagnosticLevel;
import dji.sdk.keyvalue.value.diagnostic.DisplaySceneType;
import dji.sdk.keyvalue.value.diagnostic.HMSDetailDiagnostic;
import dji.sdk.keyvalue.value.product.ProductType;
import java.util.List;
import org.json.JSONObject;

public class HMSDiagnostic
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long alarmId;
    Integer componentIndex;
    Integer sensorIndex;
    String deviceId;
    String senderHostId;
    DiagnosticLevel level;
    DisplaySceneType displayScene;
    Long alarmInfo;
    String timestamp;
    List<HMSDetailDiagnostic> detail_alarm_list;
    ProductType deviceType;
    Boolean isFlying;
    Boolean imminent;
    DiagnosticLevel fh_level;
    Boolean i18nIgnore;

    public HMSDiagnostic() {
    }

    public HMSDiagnostic(Long l2, Integer n, Integer n2, String string, String string2, DiagnosticLevel diagnosticLevel, DisplaySceneType displaySceneType, Long l3, String string3, List<HMSDetailDiagnostic> list, ProductType productType, Boolean bl, Boolean bl2, DiagnosticLevel diagnosticLevel2, Boolean bl3) {
    }

    public static HMSDiagnostic fromJson(String string) {
        return null;
    }

    @Override
    public JSONObject toJson() {
        return null;
    }

    @Override
    public int serializedLength() {
        return 0;
    }

    @Override
    public int toBytes(byte[] byArray, int n) {
        return 0;
    }

    @Override
    public byte[] toBytes() {
        return null;
    }

    @Override
    public int fromBytes(byte[] byArray, int n) {
        return 0;
    }

    public Long getAlarmId() {
        return null;
    }

    public void setAlarmId(Long l2) {
    }

    public Integer getComponentIndex() {
        return null;
    }

    public void setComponentIndex(Integer n) {
    }

    public Integer getSensorIndex() {
        return null;
    }

    public void setSensorIndex(Integer n) {
    }

    public String getDeviceId() {
        return null;
    }

    public void setDeviceId(String string) {
    }

    public String getSenderHostId() {
        return null;
    }

    public void setSenderHostId(String string) {
    }

    public DiagnosticLevel getLevel() {
        return null;
    }

    public void setLevel(DiagnosticLevel diagnosticLevel) {
    }

    public DisplaySceneType getDisplayScene() {
        return null;
    }

    public void setDisplayScene(DisplaySceneType displaySceneType) {
    }

    public Long getAlarmInfo() {
        return null;
    }

    public void setAlarmInfo(Long l2) {
    }

    public String getTimestamp() {
        return null;
    }

    public void setTimestamp(String string) {
    }

    public List<HMSDetailDiagnostic> getDetail_alarm_list() {
        return null;
    }

    public void setDetail_alarm_list(List<HMSDetailDiagnostic> list) {
    }

    public ProductType getDeviceType() {
        return null;
    }

    public void setDeviceType(ProductType productType) {
    }

    public Boolean getIsFlying() {
        return null;
    }

    public void setIsFlying(Boolean bl) {
    }

    public Boolean getImminent() {
        return null;
    }

    public void setImminent(Boolean bl) {
    }

    public DiagnosticLevel getFh_level() {
        return null;
    }

    public void setFh_level(DiagnosticLevel diagnosticLevel) {
    }

    public Boolean getI18nIgnore() {
        return null;
    }

    public void setI18nIgnore(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

