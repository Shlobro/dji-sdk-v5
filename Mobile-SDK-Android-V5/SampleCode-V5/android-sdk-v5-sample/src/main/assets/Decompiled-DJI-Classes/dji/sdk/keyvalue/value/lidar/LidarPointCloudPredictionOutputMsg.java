/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.lidar;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import java.util.List;
import org.json.JSONObject;

public class LidarPointCloudPredictionOutputMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    List<Double> fig_1_x;
    List<Double> fig_1_y;
    Double fig_1_min_y_point_x;
    Double fig_1_min_y_point_y;
    Double fig_1_disp_y_lb;
    Double fig_1_disp_y_ub;
    Double fig_1_disp_x_lb;
    Double fig_1_disp_x_ub;
    Double fig_1_reference_yline_1;
    Double fig_1_reference_yline_2;
    Double fig_1_reference_yline_3;
    List<Double> fig_2_x;
    List<Double> fig_2_y;
    Double fig_2_disp_y_lb;
    Double fig_2_disp_y_ub;
    Double fig_2_disp_x_lb;
    Double fig_2_disp_x_ub;
    List<Double> fig_3_x;
    List<Double> fig_3_y;
    Double fig_3_disp_y_lb;
    Double fig_3_disp_y_ub;
    Double fig_3_disp_x_lb;
    Double fig_3_disp_x_ub;
    List<Double> fig_4_x;
    List<Double> fig_4_y;
    Double fig_4_disp_y_lb;
    Double fig_4_disp_y_ub;
    Double fig_4_disp_x_lb;
    Double fig_4_disp_x_ub;
    Double avg_point_density;

    public LidarPointCloudPredictionOutputMsg() {
    }

    public LidarPointCloudPredictionOutputMsg(List<Double> list, List<Double> list2, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, List<Double> list3, List<Double> list4, Double d11, Double d12, Double d13, Double d14, List<Double> list5, List<Double> list6, Double d15, Double d16, Double d17, Double d18, List<Double> list7, List<Double> list8, Double d19, Double d20, Double d21, Double d22, Double d23) {
    }

    public static LidarPointCloudPredictionOutputMsg fromJson(String string) {
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

    public List<Double> getFig_1_x() {
        return null;
    }

    public void setFig_1_x(List<Double> list) {
    }

    public List<Double> getFig_1_y() {
        return null;
    }

    public void setFig_1_y(List<Double> list) {
    }

    public Double getFig_1_min_y_point_x() {
        return null;
    }

    public void setFig_1_min_y_point_x(Double d2) {
    }

    public Double getFig_1_min_y_point_y() {
        return null;
    }

    public void setFig_1_min_y_point_y(Double d2) {
    }

    public Double getFig_1_disp_y_lb() {
        return null;
    }

    public void setFig_1_disp_y_lb(Double d2) {
    }

    public Double getFig_1_disp_y_ub() {
        return null;
    }

    public void setFig_1_disp_y_ub(Double d2) {
    }

    public Double getFig_1_disp_x_lb() {
        return null;
    }

    public void setFig_1_disp_x_lb(Double d2) {
    }

    public Double getFig_1_disp_x_ub() {
        return null;
    }

    public void setFig_1_disp_x_ub(Double d2) {
    }

    public Double getFig_1_reference_yline_1() {
        return null;
    }

    public void setFig_1_reference_yline_1(Double d2) {
    }

    public Double getFig_1_reference_yline_2() {
        return null;
    }

    public void setFig_1_reference_yline_2(Double d2) {
    }

    public Double getFig_1_reference_yline_3() {
        return null;
    }

    public void setFig_1_reference_yline_3(Double d2) {
    }

    public List<Double> getFig_2_x() {
        return null;
    }

    public void setFig_2_x(List<Double> list) {
    }

    public List<Double> getFig_2_y() {
        return null;
    }

    public void setFig_2_y(List<Double> list) {
    }

    public Double getFig_2_disp_y_lb() {
        return null;
    }

    public void setFig_2_disp_y_lb(Double d2) {
    }

    public Double getFig_2_disp_y_ub() {
        return null;
    }

    public void setFig_2_disp_y_ub(Double d2) {
    }

    public Double getFig_2_disp_x_lb() {
        return null;
    }

    public void setFig_2_disp_x_lb(Double d2) {
    }

    public Double getFig_2_disp_x_ub() {
        return null;
    }

    public void setFig_2_disp_x_ub(Double d2) {
    }

    public List<Double> getFig_3_x() {
        return null;
    }

    public void setFig_3_x(List<Double> list) {
    }

    public List<Double> getFig_3_y() {
        return null;
    }

    public void setFig_3_y(List<Double> list) {
    }

    public Double getFig_3_disp_y_lb() {
        return null;
    }

    public void setFig_3_disp_y_lb(Double d2) {
    }

    public Double getFig_3_disp_y_ub() {
        return null;
    }

    public void setFig_3_disp_y_ub(Double d2) {
    }

    public Double getFig_3_disp_x_lb() {
        return null;
    }

    public void setFig_3_disp_x_lb(Double d2) {
    }

    public Double getFig_3_disp_x_ub() {
        return null;
    }

    public void setFig_3_disp_x_ub(Double d2) {
    }

    public List<Double> getFig_4_x() {
        return null;
    }

    public void setFig_4_x(List<Double> list) {
    }

    public List<Double> getFig_4_y() {
        return null;
    }

    public void setFig_4_y(List<Double> list) {
    }

    public Double getFig_4_disp_y_lb() {
        return null;
    }

    public void setFig_4_disp_y_lb(Double d2) {
    }

    public Double getFig_4_disp_y_ub() {
        return null;
    }

    public void setFig_4_disp_y_ub(Double d2) {
    }

    public Double getFig_4_disp_x_lb() {
        return null;
    }

    public void setFig_4_disp_x_lb(Double d2) {
    }

    public Double getFig_4_disp_x_ub() {
        return null;
    }

    public void setFig_4_disp_x_ub(Double d2) {
    }

    public Double getAvg_point_density() {
        return null;
    }

    public void setAvg_point_density(Double d2) {
    }

    public String toString() {
        return null;
    }
}

