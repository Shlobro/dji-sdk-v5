/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.relay;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.relay.RelayWorkModeProductType;
import java.util.List;
import org.json.JSONObject;

public class RelayWorkModeProductInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RelayWorkModeProductType currentMode;
    List<RelayWorkModeProductType> supportModes;

    public RelayWorkModeProductInfo() {
    }

    public RelayWorkModeProductInfo(RelayWorkModeProductType relayWorkModeProductType, List<RelayWorkModeProductType> list) {
    }

    public static RelayWorkModeProductInfo fromJson(String string) {
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

    public RelayWorkModeProductType getCurrentMode() {
        return null;
    }

    public void setCurrentMode(RelayWorkModeProductType relayWorkModeProductType) {
    }

    public List<RelayWorkModeProductType> getSupportModes() {
        return null;
    }

    public void setSupportModes(List<RelayWorkModeProductType> list) {
    }

    public String toString() {
        return null;
    }
}

