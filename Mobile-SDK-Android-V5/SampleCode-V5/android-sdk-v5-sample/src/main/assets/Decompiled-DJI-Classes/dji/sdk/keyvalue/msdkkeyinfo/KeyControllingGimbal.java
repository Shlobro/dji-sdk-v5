/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import androidx.annotation.Keep;
import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.v5.common.callback.CommonCallbacks;

@Keep
public class KeyControllingGimbal
extends MSDKKeyInfo<ComponentIndexType> {
    @Override
    public void setValue(ComponentIndexType componentIndexType, CommonCallbacks.CompletionCallback completionCallback, KeyParam keyParam) {
    }

    private void setMasterScreen(int n, CommonCallbacks.CompletionCallback completionCallback) {
    }

    static /* synthetic */ void access$000(KeyControllingGimbal keyControllingGimbal, int n, CommonCallbacks.CompletionCallback completionCallback) {
    }
}

