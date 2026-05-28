/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.WorkStatusInfo;
import java.util.List;
import org.json.JSONObject;

public class RelayTypeStatisticsMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer devMode;
    String devSn;
    List<WorkStatusInfo> workStatusInfos;

    public RelayTypeStatisticsMsg() {
    }

    public RelayTypeStatisticsMsg(Integer n, String string, List<WorkStatusInfo> list) {
    }

    public static RelayTypeStatisticsMsg fromJson(String string) {
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

    public Integer getDevMode() {
        return null;
    }

    public void setDevMode(Integer n) {
    }

    public String getDevSn() {
        return null;
    }

    public void setDevSn(String string) {
    }

    public List<WorkStatusInfo> getWorkStatusInfos() {
        return null;
    }

    public void setWorkStatusInfos(List<WorkStatusInfo> list) {
    }

    public String toString() {
        return null;
    }
}

