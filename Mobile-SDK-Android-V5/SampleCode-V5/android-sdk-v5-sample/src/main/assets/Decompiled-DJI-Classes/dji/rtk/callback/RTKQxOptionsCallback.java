/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.callback;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.djinetworkrtkhelper.DJIRTKOptions;
import dji.sdk.errorcode.DJIErrorCode;

public interface RTKQxOptionsCallback
extends JNIProguardKeepTag {
    public void onSuccess(DJIRTKOptions var1);

    public void onFailure(DJIErrorCode var1);
}

