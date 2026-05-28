/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.flysafe;

import dji.v5.manager.aircraft.flysafe.FlySafeDatabaseState;
import dji.v5.manager.aircraft.flysafe.info.FlySafeDatabaseInfo;

public interface FlySafeDatabaseListener {
    public void onFlySafeDatabaseInfoUpdate(FlySafeDatabaseInfo var1);

    public void onFlySafeDatabaseStateUpdate(FlySafeDatabaseState var1);
}

