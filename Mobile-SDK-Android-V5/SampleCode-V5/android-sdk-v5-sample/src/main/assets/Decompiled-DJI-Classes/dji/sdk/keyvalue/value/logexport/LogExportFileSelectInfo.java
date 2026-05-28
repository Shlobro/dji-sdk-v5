/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package dji.sdk.keyvalue.value.logexport;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.ByteStream;
import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectAction;
import dji.sdk.keyvalue.value.logexport.LogExportFileSelectModule;
import dji.sdk.keyvalue.value.logexport.LogExportSender;
import java.util.List;
import org.json.JSONObject;

public class LogExportFileSelectInfo
implements DJIValue,
JNIProguardKeepTag,
ByteStream {
    LogExportSender receiver;
    LogExportFileSelectAction action;
    String aircraftSN;
    List<Integer> flyIndexs;
    List<LogExportFileSelectModule> modules;
    Boolean allModuleSelected;

    public LogExportFileSelectInfo() {
    }

    public LogExportFileSelectInfo(LogExportSender logExportSender, LogExportFileSelectAction logExportFileSelectAction, String string, List<Integer> list, List<LogExportFileSelectModule> list2, Boolean bl) {
    }

    public static LogExportFileSelectInfo fromJson(String string) {
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

    public LogExportSender getReceiver() {
        return null;
    }

    public void setReceiver(LogExportSender logExportSender) {
    }

    public LogExportFileSelectAction getAction() {
        return null;
    }

    public void setAction(LogExportFileSelectAction logExportFileSelectAction) {
    }

    public String getAircraftSN() {
        return null;
    }

    public void setAircraftSN(String string) {
    }

    public List<Integer> getFlyIndexs() {
        return null;
    }

    public void setFlyIndexs(List<Integer> list) {
    }

    public List<LogExportFileSelectModule> getModules() {
        return null;
    }

    public void setModules(List<LogExportFileSelectModule> list) {
    }

    public Boolean getAllModuleSelected() {
        return null;
    }

    public void setAllModuleSelected(Boolean bl) {
    }

    public String toString() {
        return null;
    }
}

