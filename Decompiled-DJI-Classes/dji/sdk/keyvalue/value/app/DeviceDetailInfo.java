/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.app;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.ProductType;
import org.json.JSONObject;

public class DeviceDetailInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ProductType productType;
    String productSN;
    String activateTime;

    public DeviceDetailInfo() {
    }

    public DeviceDetailInfo(ProductType productType, String string, String string2) {
    }

    public static DeviceDetailInfo fromJson(String string) {
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

    public ProductType getProductType() {
        return null;
    }

    public void setProductType(ProductType productType) {
    }

    public String getProductSN() {
        return null;
    }

    public void setProductSN(String string) {
    }

    public String getActivateTime() {
        return null;
    }

    public void setActivateTime(String string) {
    }

    public String toString() {
        return null;
    }
}

