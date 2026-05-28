/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.airlink;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.airlink.LTENetDonglDiagnosisFailReason;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class LTENetDongleInfos
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<LTENetDonglDiagnosisFailReason> lteNetDongleCardInfoList;

    public LTENetDongleInfos() {
    }

    public LTENetDongleInfos(List<LTENetDonglDiagnosisFailReason> list) {
    }

    public static LTENetDongleInfos fromJson(String string) {
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

    public List<LTENetDonglDiagnosisFailReason> getLteNetDongleCardInfoList() {
        return null;
    }

    public void setLteNetDongleCardInfoList(List<LTENetDonglDiagnosisFailReason> list) {
    }

    public String toString() {
        return null;
    }
}

