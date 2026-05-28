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
import dji.sdk.keyvalue.value.flightcontroller.OfflineMapFileInfo;
import java.util.List;
import org.json.JSONObject;

public class OfflineMapFileInfos
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<OfflineMapFileInfo> infos;

    public OfflineMapFileInfos() {
    }

    public OfflineMapFileInfos(List<OfflineMapFileInfo> list) {
    }

    public static OfflineMapFileInfos fromJson(String string) {
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

    public List<OfflineMapFileInfo> getInfos() {
        return null;
    }

    public void setInfos(List<OfflineMapFileInfo> list) {
    }

    public String toString() {
        return null;
    }
}

