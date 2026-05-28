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
import dji.sdk.keyvalue.value.payload.ArCoordinate;
import dji.sdk.keyvalue.value.payload.ArIconInfo;
import dji.sdk.keyvalue.value.payload.ArTextInfo;
import dji.sdk.keyvalue.value.payload.ArTouchAction;
import org.json.JSONObject;

public class ArPointInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Long uuid;
    Long res_id;
    Long style_id;
    ArCoordinate point;
    ArTextInfo text;
    ArIconInfo icon;
    ArTouchAction touch_action;
    Boolean is_always_in_edge;

    public ArPointInfo() {
    }

    public ArPointInfo(Long l2, Long l3, Long l4, ArCoordinate arCoordinate, ArTextInfo arTextInfo, ArIconInfo arIconInfo, ArTouchAction arTouchAction, Boolean bl) {
    }

    public static ArPointInfo fromJson(String string) {
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

    public Long getUuid() {
        return null;
    }

    public void setUuid(Long l2) {
    }

    public Long getRes_id() {
        return null;
    }

    public void setRes_id(Long l2) {
    }

    public Long getStyle_id() {
        return null;
    }

    public void setStyle_id(Long l2) {
    }

    public ArCoordinate getPoint() {
        return null;
    }

    public void setPoint(ArCoordinate arCoordinate) {
    }

    public ArTextInfo getText() {
        return null;
    }

    public void setText(ArTextInfo arTextInfo) {
    }

    public ArIconInfo getIcon() {
        return null;
    }

    public void setIcon(ArIconInfo arIconInfo) {
    }

    public ArTouchAction getTouch_action() {
        return null;
    }

    public void setTouch_action(ArTouchAction arTouchAction) {
    }

    public Boolean getIs_always_in_edge() {
        return null;
    }

    public void setIs_always_in_edge(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

