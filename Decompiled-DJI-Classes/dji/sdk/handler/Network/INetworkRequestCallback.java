/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.Network;

import dji.jni.JNIProguardKeepTag;
import java.util.Map;

public interface INetworkRequestCallback
extends JNIProguardKeepTag {
    public void result(boolean var1, int var2, byte[] var3, Map<String, String> var4);
}

