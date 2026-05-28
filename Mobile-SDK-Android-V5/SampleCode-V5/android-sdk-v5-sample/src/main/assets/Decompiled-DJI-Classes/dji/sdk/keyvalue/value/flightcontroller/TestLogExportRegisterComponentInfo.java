/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightcontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightcontroller.TestLogExportComponentMsg;
import java.util.List;
import org.json.JSONObject;

public class TestLogExportRegisterComponentInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String logName;
    Integer flightOffset;
    List<TestLogExportComponentMsg> components;

    public TestLogExportRegisterComponentInfo() {
    }

    public TestLogExportRegisterComponentInfo(String string, Integer n, List<TestLogExportComponentMsg> list) {
    }

    public static TestLogExportRegisterComponentInfo fromJson(String string) {
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

    public String getLogName() {
        return null;
    }

    public void setLogName(String string) {
    }

    public Integer getFlightOffset() {
        return null;
    }

    public void setFlightOffset(Integer n) {
    }

    public List<TestLogExportComponentMsg> getComponents() {
        return null;
    }

    public void setComponents(List<TestLogExportComponentMsg> list) {
    }

    public String toString() {
        return null;
    }
}

