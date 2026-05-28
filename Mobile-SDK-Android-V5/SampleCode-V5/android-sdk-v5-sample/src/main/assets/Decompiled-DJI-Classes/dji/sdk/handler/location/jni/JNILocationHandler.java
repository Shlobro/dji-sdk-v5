/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.handler.location.jni;

import dji.jni.JNIProguardKeepTag;

public class JNILocationHandler
implements JNIProguardKeepTag {
    public static native void native_on_location_changed(double var0, double var2);
}

