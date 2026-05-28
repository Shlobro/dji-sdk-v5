/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.common.video.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.video.interfaces.IVideoFrame;

@Deprecated
public interface StreamDataListener {
    public void onReceive(@NonNull IVideoFrame var1);
}

