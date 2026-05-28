/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.LTENetcardInfo;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class LTENetcardInfos
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<LTENetcardInfo> netcardInfoList;

    public LTENetcardInfos() {
    }

    public LTENetcardInfos(List<LTENetcardInfo> list) {
    }

    public static LTENetcardInfos fromJson(String string) {
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

    public List<LTENetcardInfo> getNetcardInfoList() {
        return null;
    }

    public void setNetcardInfoList(List<LTENetcardInfo> list) {
    }

    public String toString() {
        return null;
    }
}

