/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.intelligent;

import androidx.annotation.NonNull;
import dji.v5.manager.intelligent.AutoSensingInfo;
import dji.v5.manager.intelligent.AutoSensingTarget;
import dji.v5.manager.intelligent.IntelligentModel;
import java.util.List;

public interface AutoSensingInfoListener {
    public void onAutoSensingInfoUpdate(@NonNull AutoSensingInfo var1);

    default public void onTrackingTargetUpdate(@NonNull AutoSensingTarget autoSensingTarget) {
    }

    default public void onIntelligentModelUpdate(@NonNull List<IntelligentModel> list) {
    }

    default public void onRunningIntelligentModelUpdate(int n) {
    }
}

