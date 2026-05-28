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
import dji.sdk.keyvalue.value.diagnostic.DisplaySceneType;
import org.json.JSONObject;

public class HMSDetailDiagnostic
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long alarmId;
    Integer sensorIndex;
    String deviceId;
    String senderHostId;
    DisplaySceneType displayScene;
    Long alarmInfo;
    String timestamp;

    public HMSDetailDiagnostic() {
    }

    public HMSDetailDiagnostic(Long l2, Integer n, String string, String string2, DisplaySceneType displaySceneType, Long l3, String string3) {
    }

    public static HMSDetailDiagnostic fromJson(String string) {
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

    public String toString() {
        return null;
    }
}

