/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Nullable;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public class UpgradeComponentIdInformation {
    private final NativeObjects.UpgradeComponentProductType productType;
    private final int componentUuid;
    private String composeId;

    public UpgradeComponentIdInformation(NativeObjects.UpgradeComponentProductType upgradeComponentProductType) {
    }

    public UpgradeComponentIdInformation(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n) {
    }

    private String CreateComposeId(NativeObjects.UpgradeComponentProductType upgradeComponentProductType, int n) {
        return null;
    }

    @Nullable
    public NativeObjects.UpgradeComponentProductType getProductType() {
        return null;
    }

    @Nullable
    public int getComponentUuid() {
        return 0;
    }

    @Nullable
    public String getComposeId() {
        return null;
    }
}

