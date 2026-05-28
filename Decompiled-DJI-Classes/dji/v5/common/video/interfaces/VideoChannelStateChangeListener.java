/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.interfaces;

import dji.v5.common.video.channel.VideoChannelState;

@Deprecated
public interface VideoChannelStateChangeListener {
    public void onUpdate(VideoChannelState var1, VideoChannelState var2);
}

