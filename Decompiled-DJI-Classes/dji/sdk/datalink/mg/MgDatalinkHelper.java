/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.datalink.mg;

import dji.sdk.keyvalue.value.product.ChangeDataLinkMgrResult;

public class MgDatalinkHelper {
    public static void changeDatalinkV1ToUpgrade(int n, ChangeDatalinkCallback changeDatalinkCallback) {
    }

    public static void changeDatalinkUpgradeToV1(int n, ChangeDatalinkCallback changeDatalinkCallback) {
    }

    public static interface ChangeDatalinkCallback {
        public void onChangeDatalink(ChangeDataLinkMgrResult var1);
    }
}

