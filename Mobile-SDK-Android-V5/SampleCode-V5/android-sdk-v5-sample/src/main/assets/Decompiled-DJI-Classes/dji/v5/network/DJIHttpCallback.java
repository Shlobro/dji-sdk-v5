/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.v5.network;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.v5.common.error.IDJIError;

@Keep
public interface DJIHttpCallback<Param> {
    public void onFailure(IDJIError var1);

    public void onResponse(@NonNull Param var1);

    default public void onLoading(long l2, long l3) {
    }
}

