/*
 * Decompiled with CFR 0.152.
 */
package dji.media.player.jni;

import dji.jni.JNIProguardKeepTag;

public interface PlaybackAudioCallback
extends JNIProguardKeepTag {
    public void invoke(long var1, char var3, double var4, byte[] var6);
}

