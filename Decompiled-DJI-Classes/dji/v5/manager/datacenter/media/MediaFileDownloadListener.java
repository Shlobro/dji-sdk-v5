/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.media;

import dji.v5.common.error.IDJIError;

public interface MediaFileDownloadListener {
    public void onStart();

    public void onProgress(long var1, long var3);

    public void onRealtimeDataUpdate(byte[] var1, long var2);

    public void onFinish();

    public void onFailure(IDJIError var1);
}

