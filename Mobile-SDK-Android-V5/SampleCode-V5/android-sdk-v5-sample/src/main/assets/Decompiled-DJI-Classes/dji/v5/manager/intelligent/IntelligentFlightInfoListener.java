/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.intelligent;

import androidx.annotation.NonNull;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.intelligent.IntelligentFlightInfo;

public interface IntelligentFlightInfoListener {
    public void onIntelligentFlightInfoUpdate(@NonNull IntelligentFlightInfo var1);

    public void onIntelligentFlightErrorUpdate(@NonNull IDJIError var1);
}

