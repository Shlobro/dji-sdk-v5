/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.megaphone;

import dji.v5.manager.aircraft.megaphone.UploadState;

public interface RealTimeTransimissionStateListener {
    public void onProgress(long var1, long var3);

    public void onUploadedStatus(UploadState var1);
}

