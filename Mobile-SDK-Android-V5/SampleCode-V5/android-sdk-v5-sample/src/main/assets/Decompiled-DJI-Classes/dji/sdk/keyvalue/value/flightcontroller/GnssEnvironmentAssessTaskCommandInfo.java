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
import dji.sdk.keyvalue.value.flightcontroller.GnssEnvironmentAssessTaskCommand;
import org.json.JSONObject;

public class GnssEnvironmentAssessTaskCommandInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String taskId;
    String taskName;
    GnssEnvironmentAssessTaskCommand taskCommand;

    public GnssEnvironmentAssessTaskCommandInfo() {
    }

    public GnssEnvironmentAssessTaskCommandInfo(String string, String string2, GnssEnvironmentAssessTaskCommand gnssEnvironmentAssessTaskCommand) {
    }

    public static GnssEnvironmentAssessTaskCommandInfo fromJson(String string) {
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

    public String getTaskId() {
        return null;
    }

    public void setTaskId(String string) {
    }

    public String getTaskName() {
        return null;
    }

    public void setTaskName(String string) {
    }

    public GnssEnvironmentAssessTaskCommand getTaskCommand() {
        return null;
    }

    public void setTaskCommand(GnssEnvironmentAssessTaskCommand gnssEnvironmentAssessTaskCommand) {
    }

    public String toString() {
        return null;
    }
}

