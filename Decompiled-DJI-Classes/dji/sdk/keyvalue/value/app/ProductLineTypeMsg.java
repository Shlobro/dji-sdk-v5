/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.app.ProductLineType;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ProductLineTypeMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ProductLineType value;

    public ProductLineTypeMsg() {
    }

    public ProductLineTypeMsg(ProductLineType productLineType) {
    }

    public static ProductLineTypeMsg fromJson(String string) {
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

    public ProductLineType getValue() {
        return null;
    }

    public void setValue(ProductLineType productLineType) {
    }

    public String toString() {
        return null;
    }
}

