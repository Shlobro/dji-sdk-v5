/*
 * Decompiled with CFR 0.152.
 */
package dji.activate;

import dji.jni.JNIProguardKeepTag;
import dji.sdk.keyvalue.value.product.ProductType;

public interface ActivateConnectionStateCallback
extends JNIProguardKeepTag {
    public void callback(int var1, boolean var2, ProductType var3);
}

