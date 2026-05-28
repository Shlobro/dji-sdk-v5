/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.Network;

import dji.jni.JNIProguardKeepTag;

public interface IDownloadSizeCallback
extends JNIProguardKeepTag {
    public void result(boolean var1, boolean var2);

    public void progress(long var1, long var3, double var5);
}

