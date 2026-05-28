/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.cloudaccess.MaintainStatusOSDInfo;
import java.util.List;
import org.json.JSONObject;

public class CloudMaintainStatusOSDInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<MaintainStatusOSDInfo> maintain_status_array;

    public CloudMaintainStatusOSDInfo() {
    }

    public CloudMaintainStatusOSDInfo(List<MaintainStatusOSDInfo> list) {
    }

    public static CloudMaintainStatusOSDInfo fromJson(String string) {
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

    public List<MaintainStatusOSDInfo> getMaintain_status_array() {
        return null;
    }

    public void setMaintain_status_array(List<MaintainStatusOSDInfo> list) {
    }

    public String toString() {
        return null;
    }
}

