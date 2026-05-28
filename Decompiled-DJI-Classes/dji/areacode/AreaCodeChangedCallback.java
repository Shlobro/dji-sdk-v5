/*
 * Decompiled with CFR 0.152.
 */
package dji.areacode;

import dji.areacode.AreaCodeStrategy;
import dji.jni.JNIProguardKeepTag;

public interface AreaCodeChangedCallback
extends JNIProguardKeepTag {
    public void onChange(int var1, int var2, String var3, int var4, AreaCodeStrategy var5);
}

