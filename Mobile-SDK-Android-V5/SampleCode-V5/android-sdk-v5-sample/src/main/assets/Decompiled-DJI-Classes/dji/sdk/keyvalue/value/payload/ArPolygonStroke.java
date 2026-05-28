/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.payload;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import org.json.JSONObject;

public class ArPolygonStroke
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Boolean top_show;
    Boolean top_dist_alpha_enable;
    Boolean side_show;
    Boolean side_dist_alpha_enable;
    Boolean bottom_show;
    Boolean bottom_dist_alpha_enable;

    public ArPolygonStroke() {
    }

    public ArPolygonStroke(Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6) {
    }

    public static ArPolygonStroke fromJson(String string) {
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

    public Boolean getTop_show() {
        return null;
    }

    public void setTop_show(Boolean bl) {
    }

    public Boolean getTop_dist_alpha_enable() {
        return null;
    }

    public void setTop_dist_alpha_enable(Boolean bl) {
    }

    public Boolean getSide_show() {
        return null;
    }

    public void setSide_show(Boolean bl) {
    }

    public Boolean getSide_dist_alpha_enable() {
        return null;
    }

    public void setSide_dist_alpha_enable(Boolean bl) {
    }

    public Boolean getBottom_show() {
        return null;
    }

    public void setBottom_show(Boolean bl) {
    }

    public Boolean getBottom_dist_alpha_enable() {
        return null;
    }

    public void setBottom_dist_alpha_enable(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

