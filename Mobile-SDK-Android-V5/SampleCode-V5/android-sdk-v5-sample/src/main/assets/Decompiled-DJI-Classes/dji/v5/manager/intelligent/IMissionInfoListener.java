/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.intelligent;

import androidx.annotation.NonNull;

public interface IMissionInfoListener<Info, Target> {
    public void onMissionInfoUpdate(@NonNull Info var1);

    public void onMissionTargetUpdate(@NonNull Target var1);
}

