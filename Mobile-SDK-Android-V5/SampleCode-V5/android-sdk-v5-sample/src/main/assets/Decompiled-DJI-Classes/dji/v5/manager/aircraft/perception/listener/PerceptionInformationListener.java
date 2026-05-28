/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.perception.listener;

import androidx.annotation.NonNull;
import dji.v5.manager.aircraft.perception.data.PerceptionInfo;

public interface PerceptionInformationListener {
    public void onUpdate(@NonNull PerceptionInfo var1);
}

