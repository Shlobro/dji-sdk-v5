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
import dji.sdk.keyvalue.value.flightcontroller.AlarmMediaFileInfoItemInFTR;
import java.util.List;
import org.json.JSONObject;

public class AlarmMediaFileInfoInFTR
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String ftr_uuid;
    List<AlarmMediaFileInfoItemInFTR> media_file_infos;

    public AlarmMediaFileInfoInFTR() {
    }

    public AlarmMediaFileInfoInFTR(String string, List<AlarmMediaFileInfoItemInFTR> list) {
    }

    public static AlarmMediaFileInfoInFTR fromJson(String string) {
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

    public String getFtr_uuid() {
        return null;
    }

    public void setFtr_uuid(String string) {
    }

    public List<AlarmMediaFileInfoItemInFTR> getMedia_file_infos() {
        return null;
    }

    public void setMedia_file_infos(List<AlarmMediaFileInfoItemInFTR> list) {
    }

    public String toString() {
        return null;
    }
}

