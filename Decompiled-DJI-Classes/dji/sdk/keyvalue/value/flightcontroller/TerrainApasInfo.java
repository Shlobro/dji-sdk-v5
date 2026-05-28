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
import org.json.JSONObject;

public class TerrainApasInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean is_in_terrain_mode;
    Integer terrain_height;
    Boolean is_default_height;
    Boolean is_offline_map;

    public TerrainApasInfo() {
    }

    public TerrainApasInfo(Boolean bl, Integer n, Boolean bl2, Boolean bl3) {
    }

    public static TerrainApasInfo fromJson(String string) {
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

    public Boolean getIs_in_terrain_mode() {
        return null;
    }

    public void setIs_in_terrain_mode(Boolean bl) {
    }

    public Integer getTerrain_height() {
        return null;
    }

    public void setTerrain_height(Integer n) {
    }

    public Boolean getIs_default_height() {
        return null;
    }

    public void setIs_default_height(Boolean bl) {
    }

    public Boolean getIs_offline_map() {
        return null;
    }

    public void setIs_offline_map(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

