/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.callback;

import dji.jni.JNIProguardKeepTag;
import dji.rtk.CoordinateSystem;
import dji.sdk.errorcode.DJIErrorCode;

public interface RTKCoordinateSystemCallback
extends JNIProguardKeepTag {
    public void onSuccess(CoordinateSystem var1);

    public void onFailure(DJIErrorCode var1);
}

