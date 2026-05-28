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
import dji.sdk.keyvalue.value.flightcontroller.PrecisionFileType;
import org.json.JSONObject;

public class PrecisionChartTransRequestParams
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    PrecisionFileType type;
    String md5;

    public PrecisionChartTransRequestParams() {
    }

    public PrecisionChartTransRequestParams(PrecisionFileType precisionFileType, String string) {
    }

    public static PrecisionChartTransRequestParams fromJson(String string) {
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

    public PrecisionFileType getType() {
        return null;
    }

    public void setType(PrecisionFileType precisionFileType) {
    }

    public String getMd5() {
        return null;
    }

    public void setMd5(String string) {
    }

    public String toString() {
        return null;
    }
}

