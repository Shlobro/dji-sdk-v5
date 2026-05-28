/*
 * Decompiled with CFR 0.152.
 */
package dji.file.callback;

import dji.sdk.keyvalue.value.media.DownloadWorkingInfo;

public interface WorkingInfoObserver {
    public void invoke(DownloadWorkingInfo var1);
}

