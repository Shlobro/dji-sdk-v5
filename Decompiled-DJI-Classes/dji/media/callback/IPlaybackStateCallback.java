/*
 * Decompiled with CFR 0.152.
 */
package dji.media.callback;

import dji.sdk.keyvalue.value.media.MediaPlaybackState;

public interface IPlaybackStateCallback {
    public void onPlaybackStateChanged(int var1, int var2, MediaPlaybackState var3);
}

