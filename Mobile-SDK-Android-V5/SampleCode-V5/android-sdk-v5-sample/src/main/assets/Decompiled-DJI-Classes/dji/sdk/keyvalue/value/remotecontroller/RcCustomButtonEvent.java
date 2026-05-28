/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.remotecontroller;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.remotecontroller.RcButtonAction;
import org.json.JSONObject;

public class RcCustomButtonEvent
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    RcButtonAction value;
    Integer buttonActionValue;
    Integer isC1Click;
    Integer isC2Click;
    Integer isC3Click;
    Integer isC4Click;

    public RcCustomButtonEvent() {
    }

    public RcCustomButtonEvent(RcButtonAction rcButtonAction, Integer n, Integer n2, Integer n3, Integer n4, Integer n5) {
    }

    public static RcCustomButtonEvent fromJson(String string) {
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

    public RcButtonAction getValue() {
        return null;
    }

    public void setValue(RcButtonAction rcButtonAction) {
    }

    public Integer getButtonActionValue() {
        return null;
    }

    public void setButtonActionValue(Integer n) {
    }

    public Integer getIsC1Click() {
        return null;
    }

    public void setIsC1Click(Integer n) {
    }

    public Integer getIsC2Click() {
        return null;
    }

    public void setIsC2Click(Integer n) {
    }

    public Integer getIsC3Click() {
        return null;
    }

    public void setIsC3Click(Integer n) {
    }

    public Integer getIsC4Click() {
        return null;
    }

    public void setIsC4Click(Integer n) {
    }

    public String toString() {
        return null;
    }
}

