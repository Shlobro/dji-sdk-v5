/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.manager.aircraft.waypoint3;

import androidx.annotation.Nullable;
import dji.v5.common.error.IDJIError;

public interface WaypointActionListener {
    @Deprecated
    public void onExecutionStart(int var1);

    @Deprecated
    public void onExecutionFinish(int var1, @Nullable IDJIError var2);

    public void onExecutionStart(int var1, int var2);

    public void onExecutionFinish(int var1, int var2, @Nullable IDJIError var3);
}

