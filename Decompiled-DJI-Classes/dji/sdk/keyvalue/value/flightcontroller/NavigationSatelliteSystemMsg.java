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
import dji.sdk.keyvalue.value.flightcontroller.NavigationSatelliteSystem;
import org.json.JSONObject;

public class NavigationSatelliteSystemMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    NavigationSatelliteSystem value;

    public NavigationSatelliteSystemMsg() {
    }

    public NavigationSatelliteSystemMsg(NavigationSatelliteSystem navigationSatelliteSystem) {
    }

    public static NavigationSatelliteSystemMsg fromJson(String string) {
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

    public NavigationSatelliteSystem getValue() {
        return null;
    }

    public void setValue(NavigationSatelliteSystem navigationSatelliteSystem) {
    }

    public String toString() {
        return null;
    }
}

