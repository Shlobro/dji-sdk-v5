/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.cloudaccess;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class DrcHsiInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    Integer up_distance;
    Integer down_distance;
    List<Integer> around_distances;
    Boolean up_enable;
    Boolean up_work;
    Boolean down_enable;
    Boolean down_work;
    Boolean left_enable;
    Boolean left_work;
    Boolean right_enable;
    Boolean right_work;
    Boolean front_enable;
    Boolean front_work;
    Boolean back_enable;
    Boolean back_work;
    Boolean vertical_enable;
    Boolean vertical_work;
    Boolean horizontal_enable;
    Boolean horizontal_work;

    public DrcHsiInfo() {
    }

    public DrcHsiInfo(Integer n, Integer n2, List<Integer> list, Boolean bl, Boolean bl2, Boolean bl3, Boolean bl4, Boolean bl5, Boolean bl6, Boolean bl7, Boolean bl8, Boolean bl9, Boolean bl10, Boolean bl11, Boolean bl12, Boolean bl13, Boolean bl14, Boolean bl15, Boolean bl16) {
    }

    public static DrcHsiInfo fromJson(String string) {
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

    public Integer getUp_distance() {
        return null;
    }

    public void setUp_distance(Integer n) {
    }

    public Integer getDown_distance() {
        return null;
    }

    public void setDown_distance(Integer n) {
    }

    public List<Integer> getAround_distances() {
        return null;
    }

    public void setAround_distances(List<Integer> list) {
    }

    public Boolean getUp_enable() {
        return null;
    }

    public void setUp_enable(Boolean bl) {
    }

    public Boolean getUp_work() {
        return null;
    }

    public void setUp_work(Boolean bl) {
    }

    public Boolean getDown_enable() {
        return null;
    }

    public void setDown_enable(Boolean bl) {
    }

    public Boolean getDown_work() {
        return null;
    }

    public void setDown_work(Boolean bl) {
    }

    public Boolean getLeft_enable() {
        return null;
    }

    public void setLeft_enable(Boolean bl) {
    }

    public Boolean getLeft_work() {
        return null;
    }

    public void setLeft_work(Boolean bl) {
    }

    public Boolean getRight_enable() {
        return null;
    }

    public void setRight_enable(Boolean bl) {
    }

    public Boolean getRight_work() {
        return null;
    }

    public void setRight_work(Boolean bl) {
    }

    public Boolean getFront_enable() {
        return null;
    }

    public void setFront_enable(Boolean bl) {
    }

    public Boolean getFront_work() {
        return null;
    }

    public void setFront_work(Boolean bl) {
    }

    public Boolean getBack_enable() {
        return null;
    }

    public void setBack_enable(Boolean bl) {
    }

    public Boolean getBack_work() {
        return null;
    }

    public void setBack_work(Boolean bl) {
    }

    public Boolean getVertical_enable() {
        return null;
    }

    public void setVertical_enable(Boolean bl) {
    }

    public Boolean getVertical_work() {
        return null;
    }

    public void setVertical_work(Boolean bl) {
    }

    public Boolean getHorizontal_enable() {
        return null;
    }

    public void setHorizontal_enable(Boolean bl) {
    }

    public Boolean getHorizontal_work() {
        return null;
    }

    public void setHorizontal_work(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

