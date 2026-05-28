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
import dji.sdk.keyvalue.value.hms.ChargerModuleMsg;
import java.util.List;
import org.json.JSONObject;

public class ChargerModuleInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<ChargerModuleMsg> value;

    public ChargerModuleInfo() {
    }

    public ChargerModuleInfo(List<ChargerModuleMsg> list) {
    }

    public static ChargerModuleInfo fromJson(String string) {
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

    public List<ChargerModuleMsg> getValue() {
        return null;
    }

    public void setValue(List<ChargerModuleMsg> list) {
    }

    public String toString() {
        return null;
    }
}

