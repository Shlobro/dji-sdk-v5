/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.upgrade;

import dji.upgrade.UpgradeError;
import dji.v5.manager.aircraft.upgrade.UpgradeProgressState;

public class UpgradeInfo {
    private int progress;
    private final UpgradeProgressState state;
    private final UpgradeError error;

    public int getProgress() {
        return 0;
    }

    public void setProgress(int n) {
    }

    public UpgradeError getError() {
        return null;
    }

    public UpgradeProgressState getUpgradeState() {
        return null;
    }

    public UpgradeInfo(int n, UpgradeProgressState upgradeProgressState, UpgradeError upgradeError) {
    }

    public static class Builder {
        private int progress;
        private UpgradeProgressState processState;
        private UpgradeError error;

        public Builder progress(int n) {
            return null;
        }

        public Builder upgradeState(UpgradeProgressState upgradeProgressState) {
            return null;
        }

        public Builder error(UpgradeError upgradeError) {
            return null;
        }

        public UpgradeInfo build() {
            return null;
        }
    }
}

