/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.hms;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.hms.ChargerModuleType;
import org.json.JSONObject;

public class ChargerModuleMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    ChargerModuleType value;

    public ChargerModuleMsg() {
    }

    public ChargerModuleMsg(ChargerModuleType chargerModuleType) {
    }

    public static ChargerModuleMsg fromJson(String string) {
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

    public ChargerModuleType getValue() {
        return null;
    }

    public void setValue(ChargerModuleType chargerModuleType) {
    }

    public String toString() {
        return null;
    }
}

