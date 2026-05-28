/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.callback;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.rtkbasestation.NetworkRTKParam;

public interface RTKNetworkServiceRTKParamCallback
extends JNIProguardKeepTag {
    public void onSuccess(NetworkRTKParam var1);

    public void onFailure(DJIErrorCode var1);
}

