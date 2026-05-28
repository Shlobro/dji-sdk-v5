/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.aircraft.simulator;

import androidx.annotation.NonNull;
import dji.v5.manager.aircraft.simulator.SimulatorState;

public interface SimulatorStatusListener {
    public void onUpdate(@NonNull SimulatorState var1);
}

