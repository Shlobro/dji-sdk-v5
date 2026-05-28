/*
 * Decompiled with CFR 0.152.
 */
package dji.utmiss;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.common.UtmissUploadStatusMsg;
import dji.utmiss.jni.callback.UtmissOrderIDCallback;
import dji.utmiss.jni.callback.UtmissUploadRecordCallback;
import dji.utmiss.jni.callback.UtmissUploadStatusCallback;

public class DJIUtmissManager
implements JNIProguardKeepTag {
    private static volatile DJIUtmissManager sInstance;
    private static String TAG;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static DJIUtmissManager getInstance() {
        return null;
    }

    public int startUtmissUpload(String string2) {
        return 0;
    }

    public void stopUtmissUpload() {
    }

    public int setUASId(String string2) {
        return 0;
    }

    @Deprecated
    public void listenUploadStatus(UtmissUploadStatusCallback utmissUploadStatusCallback) {
    }

    public long addUploadStatusObserver(UtmissUploadStatusCallback utmissUploadStatusCallback) {
        return 0L;
    }

    public void removeUploadStatusObserver(long l2) {
    }

    public void RegisterOrderIDObserver(UtmissOrderIDCallback utmissOrderIDCallback) {
    }

    public void getUploadRecord(UtmissUploadRecordCallback utmissUploadRecordCallback) {
    }

    public UtmissUploadStatusMsg getCurrentUploadStatus() {
        return null;
    }

    public void setUtmissSimulatorEnable(boolean bl) {
    }

    static {
        TAG = "DJIUtmiss-Android";
    }
}

