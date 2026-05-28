/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade;

import dji.sdk.keyvalue.value.base.DJIValue;
import dji.sdk.keyvalue.value.upgrade.UpgradeComponentTypeMsg;
import dji.sdk.keyvalue.value.upgrade.UpgradeStageMsg;

public interface UpgradeStatusCallback {
    public void callBack(int var1, UpgradeComponentTypeMsg var2, UpgradeStageMsg var3, DJIValue var4);
}

