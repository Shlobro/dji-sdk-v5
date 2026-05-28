/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.livestream;

import dji.v5.common.error.IDJIError;
import dji.v5.manager.datacenter.livestream.LiveStreamStatus;

public interface LiveStreamStatusListener {
    public void onLiveStreamStatusUpdate(LiveStreamStatus var1);

    public void onError(IDJIError var1);
}

