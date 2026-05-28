/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.natives.pack;

import com.dji.industry.mission.natives.pack.PackHelper;
import dji.v5.common.KeepProguard;

public interface JNIPackCommonCallback
extends KeepProguard {
    public void onResult(int var1, PackHelper.PackRoute var2, PackHelper.PackRoute var3, byte[] var4, int var5, int var6);
}

