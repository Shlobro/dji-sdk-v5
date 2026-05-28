/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.component.firmware.model;

import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;

public final class UpgradeDynamicComponentChangeState
extends Enum<UpgradeDynamicComponentChangeState> {
    public static final /* enum */ UpgradeDynamicComponentChangeState ADD = new UpgradeDynamicComponentChangeState();
    public static final /* enum */ UpgradeDynamicComponentChangeState REMOVE = new UpgradeDynamicComponentChangeState();
    public static final /* enum */ UpgradeDynamicComponentChangeState UNKNOWN = new UpgradeDynamicComponentChangeState();
    private static final /* synthetic */ UpgradeDynamicComponentChangeState[] $VALUES;

    public static UpgradeDynamicComponentChangeState[] values() {
        return null;
    }

    public static UpgradeDynamicComponentChangeState valueOf(String string2) {
        return null;
    }

    public static UpgradeDynamicComponentChangeState getComponentChangeState(NativeObjects.UpgradeComponentChangeState upgradeComponentChangeState) {
        return null;
    }

    private static /* synthetic */ UpgradeDynamicComponentChangeState[] $values() {
        return null;
    }

    static {
        $VALUES = UpgradeDynamicComponentChangeState.$values();
    }
}

