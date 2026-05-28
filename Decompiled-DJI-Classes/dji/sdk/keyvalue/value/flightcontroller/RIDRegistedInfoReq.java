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
import dji.sdk.keyvalue.value.flightcontroller.RIDInfoOpt;
import org.json.JSONObject;

public class RIDRegistedInfoReq
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RIDInfoOpt opt;
    String dataBlock;

    public RIDRegistedInfoReq() {
    }

    public RIDRegistedInfoReq(RIDInfoOpt rIDInfoOpt, String string) {
    }

    public static RIDRegistedInfoReq fromJson(String string) {
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

    public RIDInfoOpt getOpt() {
        return null;
    }

    public void setOpt(RIDInfoOpt rIDInfoOpt) {
    }

    public String getDataBlock() {
        return null;
    }

    public void setDataBlock(String string) {
    }

    public String toString() {
        return null;
    }
}

