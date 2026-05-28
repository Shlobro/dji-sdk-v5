/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 */
package dji.v5.common.video.interfaces;

import android.media.MediaFormat;

@Deprecated
public interface YuvDataListener {
    public void onReceive(MediaFormat var1, byte[] var2, int var3, int var4);
}

