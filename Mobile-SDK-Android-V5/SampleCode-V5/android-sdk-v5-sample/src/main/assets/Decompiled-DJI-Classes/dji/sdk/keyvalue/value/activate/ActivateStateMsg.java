/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.activate.ActivateState;
import dji.sdk.keyvalue.value.activate.ActivateVersion;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.camera.DateTime;
import java.util.List;
import org.json.JSONObject;

public class ActivateStateMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ActivateState state;
    DateTime activateTime;
    String boardNumber;
    String countryCode;
    ActivateVersion version;
    Integer moduleType;
    Integer moduleSeq;
    Boolean comboActivateState;
    List<Integer> activatedModules;

    public ActivateStateMsg() {
    }

    public ActivateStateMsg(ActivateState activateState, DateTime dateTime, String string, String string2, ActivateVersion activateVersion, Integer n, Integer n2, Boolean bl, List<Integer> list) {
    }

    public static ActivateStateMsg fromJson(String string) {
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

    public ActivateState getState() {
        return null;
    }

    public void setState(ActivateState activateState) {
    }

    public DateTime getActivateTime() {
        return null;
    }

    public void setActivateTime(DateTime dateTime) {
    }

    public String getBoardNumber() {
        return null;
    }

    public void setBoardNumber(String string) {
    }

    public String getCountryCode() {
        return null;
    }

    public void setCountryCode(String string) {
    }

    public ActivateVersion getVersion() {
        return null;
    }

    public void setVersion(ActivateVersion activateVersion) {
    }

    public Integer getModuleType() {
        return null;
    }

    public void setModuleType(Integer n) {
    }

    public Integer getModuleSeq() {
        return null;
    }

    public void setModuleSeq(Integer n) {
    }

    public Boolean getComboActivateState() {
        return null;
    }

    public void setComboActivateState(Boolean bl) {
    }

    public List<Integer> getActivatedModules() {
        return null;
    }

    public void setActivatedModules(List<Integer> list) {
    }

    public String toString() {
        return null;
    }
}

