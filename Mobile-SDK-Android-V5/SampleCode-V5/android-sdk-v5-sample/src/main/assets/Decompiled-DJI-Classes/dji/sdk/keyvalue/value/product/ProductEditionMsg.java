/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.product;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.ProductEdition;
import org.json.JSONObject;

public class ProductEditionMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ProductEdition value;

    public ProductEditionMsg() {
    }

    public ProductEditionMsg(ProductEdition productEdition) {
    }

    public static ProductEditionMsg fromJson(String string) {
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

    public ProductEdition getValue() {
        return null;
    }

    public void setValue(ProductEdition productEdition) {
    }

    public String toString() {
        return null;
    }
}

