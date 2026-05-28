/*
 * Decompiled with CFR 0.152.
 */
package dji.utmiss.jni.callback;

import dji.sdk.keyvalue.value.common.UtmissUploadStatusMsg;

public interface UtmissUploadStatusCallback {
    public void invoke(int var1, int var2, UtmissUploadStatusMsg var3);
}

