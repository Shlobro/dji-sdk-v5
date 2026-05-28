/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.upgrade.internal.component;

import android.content.Context;
import dji.upgrade.CommonCallbacks;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.database.DatabaseUpgradeComponent;
import dji.upgrade.component.database.UpgradeDatabaseListener;
import dji.upgrade.internal.csdk.upgradeadapter.UpgradeLogicAdapter;
import dji.upgrade.internal.csdk.upgradeadapter.model.NativeObjects;
import dji.upgrade.internal.csdk.upgradeadapter.model.UpgradeProcessInformation;
import dji.upgrade.internal.model.DatabaseUpgradeProgressImpl;
import java.util.concurrent.CopyOnWriteArrayList;

public class DatabaseUpgradeComponentImpl
implements DatabaseUpgradeComponent {
    private CopyOnWriteArrayList<UpgradeDatabaseListener> mUpgradeDatabaseListenerList;
    private UpgradeLogicAdapter mUpgradeLogicAdapter;
    private DatabaseUpgradeProgressImpl.Builder upgradeBuilder;

    public void init(Context context) {
    }

    public void handleUpgradeProgress(UpgradeProcessInformation upgradeProcessInformation) {
    }

    private void notifyUpgradeProgressUpdated(DatabaseUpgradeProgressImpl databaseUpgradeProgressImpl) {
    }

    @Override
    public void addDatabaseUpgradeListener(UpgradeDatabaseListener upgradeDatabaseListener) {
    }

    @Override
    public void removeDatabaseUpgradeListener(UpgradeDatabaseListener upgradeDatabaseListener) {
    }

    @Override
    public void removeAllDatabaseUpgradeListener() {
    }

    @Override
    public void startUpgradeDatabase(String string2, NativeObjects.UpgradeComponentProductType upgradeComponentProductType, CommonCallbacks.CompletionCallback completionCallback) {
    }

    public void destroy() {
    }

    private static /* synthetic */ void lambda$startUpgradeDatabase$0(CommonCallbacks.CompletionCallback completionCallback, UpgradeError upgradeError) {
    }
}

