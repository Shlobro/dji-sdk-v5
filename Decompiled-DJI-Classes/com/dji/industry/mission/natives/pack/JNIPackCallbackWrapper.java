/*
 * Decompiled with CFR 0.152.
 */
package com.dji.industry.mission.natives.pack;

import com.dji.industry.mission.natives.pack.JNIPackCommonCallback;
import com.dji.industry.mission.natives.pack.PackHelper;

public class JNIPackCallbackWrapper
implements JNIPackCommonCallback {
    private long mCppCallbackPtr;

    public JNIPackCallbackWrapper(long l2) {
    }

    @Override
    public void onResult(int n, PackHelper.PackRoute packRoute, PackHelper.PackRoute packRoute2, byte[] byArray, int n2, int n3) {
    }
}

