/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.flightassistant;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.flightassistant.MasterShotParam;
import java.util.List;
import org.json.JSONObject;

public class MasterShotParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<MasterShotParam> paramList;

    public MasterShotParams() {
    }

    public MasterShotParams(List<MasterShotParam> list) {
    }

    public static MasterShotParams fromJson(String string) {
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

    public List<MasterShotParam> getParamList() {
        return null;
    }

    public void setParamList(List<MasterShotParam> list) {
    }

    public String toString() {
        return null;
    }
}

