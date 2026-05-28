/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.room.DatabaseConfiguration
 *  androidx.room.InvalidationTracker
 *  androidx.room.migration.AutoMigrationSpec
 *  androidx.room.migration.Migration
 *  androidx.sqlite.db.SupportSQLiteDatabase
 *  androidx.sqlite.db.SupportSQLiteOpenHelper
 */
package dji.v5.inner.analytics.database;

import androidx.annotation.NonNull;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import dji.v5.inner.analytics.database.AnalyticsDatabase;
import dji.v5.inner.analytics.database.dao.AnalyticsDao;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class AnalyticsDatabase_Impl
extends AnalyticsDatabase {
    private volatile AnalyticsDao _analyticsDao;

    protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        return null;
    }

    protected InvalidationTracker createInvalidationTracker() {
        return null;
    }

    public void clearAllTables() {
    }

    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return null;
    }

    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return null;
    }

    public List<Migration> getAutoMigrations(@NonNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> map) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public AnalyticsDao getAnalyticsDao() {
        return null;
    }

    static /* synthetic */ List access$000(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$100(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$200(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$300(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$400(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$500(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ SupportSQLiteDatabase access$602(AnalyticsDatabase_Impl analyticsDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
        return null;
    }

    static /* synthetic */ void access$700(AnalyticsDatabase_Impl analyticsDatabase_Impl, SupportSQLiteDatabase supportSQLiteDatabase) {
    }

    static /* synthetic */ List access$800(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$900(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }

    static /* synthetic */ List access$1000(AnalyticsDatabase_Impl analyticsDatabase_Impl) {
        return null;
    }
}

