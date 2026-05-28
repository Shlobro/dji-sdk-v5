/*
 * Decompiled with CFR 0.152.
 */
package dji.flightrecord;

import dji.flightrecord.callback.FileEventCallback;
import dji.flightrecord.callback.RecoveryEventCallback;
import dji.sdk.common.BoolCallback;

public class DJIFlightRecordManager {
    private static volatile DJIFlightRecordManager mInstance = null;
    private FileEventCallback fileEventCallback;
    private RecoveryEventCallback recoveryEventCallback;
    private boolean mDebug;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static synchronized DJIFlightRecordManager getInstance() {
        return null;
    }

    private DJIFlightRecordManager() {
    }

    public void updateAppVersion(byte[] byArray) {
    }

    public void updateUserID(String string2) {
    }

    public void updateAppShootPhoto(int n) {
    }

    public void updateAppSnapShot(byte[] byArray, byte[] byArray2) {
    }

    public void updateAppRecordVideoStart() {
    }

    public void updateAppRecordVideoEnd(int n) {
    }

    public void updateAppMobileDeviceLocation(double[] dArray) {
    }

    public void updateAppOperation(int n, int n2) {
    }

    public void updateRemoteControllerSN(String string2) {
    }

    public void updateAppBusinessData(byte[] byArray) {
    }

    public void setFileEventCallback(FileEventCallback fileEventCallback) {
    }

    public void setRecoveryEventCallback(RecoveryEventCallback recoveryEventCallback) {
    }

    public String getFlightRecordDirPath() {
        return null;
    }

    public int addWriteStateObserver(BoolCallback boolCallback) {
        return 0;
    }

    public void removeWriteStateObserver(int n) {
    }

    public boolean writeTlvFrameData(int n, int n2, byte[] byArray, boolean bl) {
        return false;
    }

    public boolean writeTlvSummaryData(int n, int n2, byte[] byArray, boolean bl) {
        return false;
    }

    public boolean setFlightRecordDirPath(String string2) {
        return false;
    }

    public void setRecordUnderSimulator(boolean bl) {
    }

    public boolean isRecordUnderSimulator() {
        return false;
    }

    public void updateAppShowTipsPopedUp(String string2) {
    }

    public void updateAppWarning(String string2) {
    }

    public void updateAppVisionWarning(String string2) {
    }

    public void updateAppSeriousWarning(String string2) {
    }

    private /* synthetic */ void lambda$setRecoveryEventCallback$3(int n, int n2, byte[] byArray) {
    }

    private /* synthetic */ void lambda$setRecoveryEventCallback$2(int n, int n2, byte[] byArray) {
    }

    private /* synthetic */ void lambda$setFileEventCallback$1(int n, int n2, byte[] byArray) {
    }

    private /* synthetic */ void lambda$setFileEventCallback$0(int n, int n2, byte[] byArray) {
    }
}

