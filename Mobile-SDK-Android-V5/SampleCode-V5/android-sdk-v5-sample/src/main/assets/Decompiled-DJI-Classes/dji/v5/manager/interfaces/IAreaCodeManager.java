/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.interfaces;

import androidx.annotation.NonNull;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.areacode.AreaCodeChangeListener;
import dji.v5.manager.areacode.AreaCodeData;

public interface IAreaCodeManager {
    public void init(int var1);

    public void addAreaCodeChangeListener(@NonNull AreaCodeChangeListener var1);

    public void removeAreaCodeChangeListener(@NonNull AreaCodeChangeListener var1);

    public void clearAllListeners();

    public AreaCodeData getAreaCode();

    public IDJIError updateAreaCode(String var1);

    public void getAreaCode(@NonNull CommonCallbacks.CompletionCallbackWithParam<AreaCodeData> var1);

    public void destroy();
}

