/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.TTS;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.handler.TTS.ITTSResultCallback;
import dji.sdk.keyvalue.value.common.TTSConfigInfo;

public interface ITTSHandler
extends JNIProguardKeepTag {
    public void initialize(TTSConfigInfo var1, ITTSResultCallback var2);

    public void uninitialize();

    public boolean startTTSToPCM(String var1, String var2, ITTSResultCallback var3);

    public boolean stopTTSToPCM();
}

