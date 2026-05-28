/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade;

import dji.sdk.keyvalue.value.upgrade.UpgradeComponentTypeMsg;

public interface UpgradeVersionCallback {
    public void callBack(int var1, UpgradeComponentTypeMsg var2, int var3, byte[] var4);
}

