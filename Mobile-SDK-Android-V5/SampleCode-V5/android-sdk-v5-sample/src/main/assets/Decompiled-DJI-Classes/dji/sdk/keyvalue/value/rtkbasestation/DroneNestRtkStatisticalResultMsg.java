/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.rtkbasestation;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import java.util.List;
import org.json.JSONObject;

public class DroneNestRtkStatisticalResultMsg
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LocationCoordinate3D rtkPointHome;
    LocationCoordinate3D rtkPointStopMotor;
    LocationCoordinate3D rtkPointCentralized;
    Double headingHome;
    Double headingStopMotor;
    Double headingCentralized;
    Double rtkFixRateMain;
    Double rtkFixRateSecondary;
    Double rtkSppRateMain;
    Double rtkSppRateSecondary;
    Double rtkSppvelRateMain;
    Double rtkSppvelRateSecondary;
    Double headingFixRate;
    Integer rtkTtffMain;
    Integer rtkTtffSecondary;
    Integer headingTtff;
    Integer rtkMaxDiffageMain;
    Integer rtkMaxDiffageSecondary;
    Integer rtkInteruptCountMain;
    Integer rtkInteruptCountSecondary;
    Integer rtkMaxInteruptTimeMain;
    Integer rtkMaxInteruptTimeSecondary;
    Integer rtkMinSatnumMain;
    Integer rtkMinSatnumSecondary;
    List<Integer> rtkAvgAnr;
    Integer rtkRtcmLostCnt;
    Double rtkRtcmIntegrity;
    Integer rtkStopMotorPosFlag;
    Integer rtkPointCentralizedPosFlag;
    Integer headingStopMotorPosFlag;
    Integer headingPointCentralizedPosFlag;

    public DroneNestRtkStatisticalResultMsg() {
    }

    public DroneNestRtkStatisticalResultMsg(LocationCoordinate3D locationCoordinate3D, LocationCoordinate3D locationCoordinate3D2, LocationCoordinate3D locationCoordinate3D3, Double d2, Double d3, Double d4, Double d5, Double d6, Double d7, Double d8, Double d9, Double d10, Double d11, Integer n, Integer n2, Integer n3, Integer n4, Integer n5, Integer n6, Integer n7, Integer n8, Integer n9, Integer n10, Integer n11, List<Integer> list, Integer n12, Double d12, Integer n13, Integer n14, Integer n15, Integer n16) {
    }

    public static DroneNestRtkStatisticalResultMsg fromJson(String string) {
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

    public LocationCoordinate3D getRtkPointHome() {
        return null;
    }

    public void setRtkPointHome(LocationCoordinate3D locationCoordinate3D) {
    }

    public LocationCoordinate3D getRtkPointStopMotor() {
        return null;
    }

    public void setRtkPointStopMotor(LocationCoordinate3D locationCoordinate3D) {
    }

    public LocationCoordinate3D getRtkPointCentralized() {
        return null;
    }

    public void setRtkPointCentralized(LocationCoordinate3D locationCoordinate3D) {
    }

    public Double getHeadingHome() {
        return null;
    }

    public void setHeadingHome(Double d2) {
    }

    public Double getHeadingStopMotor() {
        return null;
    }

    public void setHeadingStopMotor(Double d2) {
    }

    public Double getHeadingCentralized() {
        return null;
    }

    public void setHeadingCentralized(Double d2) {
    }

    public Double getRtkFixRateMain() {
        return null;
    }

    public void setRtkFixRateMain(Double d2) {
    }

    public Double getRtkFixRateSecondary() {
        return null;
    }

    public void setRtkFixRateSecondary(Double d2) {
    }

    public Double getRtkSppRateMain() {
        return null;
    }

    public void setRtkSppRateMain(Double d2) {
    }

    public Double getRtkSppRateSecondary() {
        return null;
    }

    public void setRtkSppRateSecondary(Double d2) {
    }

    public Double getRtkSppvelRateMain() {
        return null;
    }

    public void setRtkSppvelRateMain(Double d2) {
    }

    public Double getRtkSppvelRateSecondary() {
        return null;
    }

    public void setRtkSppvelRateSecondary(Double d2) {
    }

    public Double getHeadingFixRate() {
        return null;
    }

    public void setHeadingFixRate(Double d2) {
    }

    public Integer getRtkTtffMain() {
        return null;
    }

    public void setRtkTtffMain(Integer n) {
    }

    public Integer getRtkTtffSecondary() {
        return null;
    }

    public void setRtkTtffSecondary(Integer n) {
    }

    public Integer getHeadingTtff() {
        return null;
    }

    public void setHeadingTtff(Integer n) {
    }

    public Integer getRtkMaxDiffageMain() {
        return null;
    }

    public void setRtkMaxDiffageMain(Integer n) {
    }

    public Integer getRtkMaxDiffageSecondary() {
        return null;
    }

    public void setRtkMaxDiffageSecondary(Integer n) {
    }

    public Integer getRtkInteruptCountMain() {
        return null;
    }

    public void setRtkInteruptCountMain(Integer n) {
    }

    public Integer getRtkInteruptCountSecondary() {
        return null;
    }

    public void setRtkInteruptCountSecondary(Integer n) {
    }

    public Integer getRtkMaxInteruptTimeMain() {
        return null;
    }

    public void setRtkMaxInteruptTimeMain(Integer n) {
    }

    public Integer getRtkMaxInteruptTimeSecondary() {
        return null;
    }

    public void setRtkMaxInteruptTimeSecondary(Integer n) {
    }

    public Integer getRtkMinSatnumMain() {
        return null;
    }

    public void setRtkMinSatnumMain(Integer n) {
    }

    public Integer getRtkMinSatnumSecondary() {
        return null;
    }

    public void setRtkMinSatnumSecondary(Integer n) {
    }

    public List<Integer> getRtkAvgAnr() {
        return null;
    }

    public void setRtkAvgAnr(List<Integer> list) {
    }

    public Integer getRtkRtcmLostCnt() {
        return null;
    }

    public void setRtkRtcmLostCnt(Integer n) {
    }

    public Double getRtkRtcmIntegrity() {
        return null;
    }

    public void setRtkRtcmIntegrity(Double d2) {
    }

    public Integer getRtkStopMotorPosFlag() {
        return null;
    }

    public void setRtkStopMotorPosFlag(Integer n) {
    }

    public Integer getRtkPointCentralizedPosFlag() {
        return null;
    }

    public void setRtkPointCentralizedPosFlag(Integer n) {
    }

    public Integer getHeadingStopMotorPosFlag() {
        return null;
    }

    public void setHeadingStopMotorPosFlag(Integer n) {
    }

    public Integer getHeadingPointCentralizedPosFlag() {
        return null;
    }

    public void setHeadingPointCentralizedPosFlag(Integer n) {
    }

    public String toString() {
        return null;
    }
}

