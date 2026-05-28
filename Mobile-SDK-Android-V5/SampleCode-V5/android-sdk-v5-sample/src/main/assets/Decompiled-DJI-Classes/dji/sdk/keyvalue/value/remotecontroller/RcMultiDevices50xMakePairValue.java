/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RcMakePairMode;
import dji.sdk.keyvalue.value.remotecontroller.RcMakePairOperate;
import dji.sdk.keyvalue.value.remotecontroller.RcPairParams;
import org.json.JSONObject;

public class RcMultiDevices50xMakePairValue
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RcMakePairOperate operate;
    RcMakePairMode mode;
    RcPairParams param;
    Integer index;

    public RcMultiDevices50xMakePairValue() {
    }

    public RcMultiDevices50xMakePairValue(RcMakePairOperate rcMakePairOperate, RcMakePairMode rcMakePairMode, RcPairParams rcPairParams, Integer n) {
    }

    public static RcMultiDevices50xMakePairValue fromJson(String string) {
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

    public RcMakePairOperate getOperate() {
        return null;
    }

    public void setOperate(RcMakePairOperate rcMakePairOperate) {
    }

    public RcMakePairMode getMode() {
        return null;
    }

    public void setMode(RcMakePairMode rcMakePairMode) {
    }

    public RcPairParams getParam() {
        return null;
    }

    public void setParam(RcPairParams rcPairParams) {
    }

    public Integer getIndex() {
        return null;
    }

    public void setIndex(Integer n) {
    }

    public String toString() {
        return null;
    }
}

