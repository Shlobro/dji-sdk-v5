/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.ble;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.product.ProductType;
import org.json.JSONObject;

public class BLEPeripheral
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    String uuid;
    String name;
    String macAddress;
    String DJIUuid;
    Integer RSSI;
    Boolean isParing;
    Boolean isConnectedInSystem;
    ProductType type;
    Integer bootTimes;
    Integer bleId;

    public BLEPeripheral() {
    }

    public BLEPeripheral(String string, String string2, String string3, String string4, Integer n, Boolean bl, Boolean bl2, ProductType productType, Integer n2, Integer n3) {
    }

    public static BLEPeripheral fromJson(String string) {
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

    public String getUuid() {
        return null;
    }

    public void setUuid(String string) {
    }

    public String getName() {
        return null;
    }

    public void setName(String string) {
    }

    public String getMacAddress() {
        return null;
    }

    public void setMacAddress(String string) {
    }

    public String getDJIUuid() {
        return null;
    }

    public void setDJIUuid(String string) {
    }

    public Integer getRSSI() {
        return null;
    }

    public void setRSSI(Integer n) {
    }

    public Boolean getIsParing() {
        return null;
    }

    public void setIsParing(Boolean bl) {
    }

    public Boolean getIsConnectedInSystem() {
        return null;
    }

    public void setIsConnectedInSystem(Boolean bl) {
    }

    public ProductType getType() {
        return null;
    }

    public void setType(ProductType productType) {
    }

    public Integer getBootTimes() {
        return null;
    }

    public void setBootTimes(Integer n) {
    }

    public Integer getBleId() {
        return null;
    }

    public void setBleId(Integer n) {
    }

    public String toString() {
        return null;
    }
}

