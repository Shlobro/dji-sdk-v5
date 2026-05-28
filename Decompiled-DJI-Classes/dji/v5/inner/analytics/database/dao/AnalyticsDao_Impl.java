/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.room.EntityInsertionAdapter
 *  androidx.room.RoomDatabase
 *  androidx.room.SharedSQLiteStatement
 *  io.reactivex.rxjava3.core.Completable
 *  io.reactivex.rxjava3.core.Flowable
 */
package dji.v5.inner.analytics.database.dao;

import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import dji.v5.inner.analytics.database.dao.AnalyticsDao;
import dji.v5.inner.analytics.database.entities.Analytics;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

public final class AnalyticsDao_Impl
implements AnalyticsDao {
    private final RoomDatabase __db;
    private final EntityInsertionAdapter<Analytics> __insertionAdapterOfAnalytics;
    private final SharedSQLiteStatement __preparedStmtOfDeleteAnalytics;

    public AnalyticsDao_Impl(RoomDatabase roomDatabase) {
    }

    @Override
    public Completable insertAnalytics(List<Analytics> list) {
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void deleteAnalytics(int n) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public int countAnalytics() {
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public List<Analytics> peakAnalytics(int n) {
        return null;
    }

    @Override
    public Flowable<List<Analytics>> peakAllAnalytics() {
        return null;
    }

    public static List<Class<?>> getRequiredConverters() {
        return null;
    }

    static /* synthetic */ RoomDatabase access$000(AnalyticsDao_Impl analyticsDao_Impl) {
        return null;
    }

    static /* synthetic */ EntityInsertionAdapter access$100(AnalyticsDao_Impl analyticsDao_Impl) {
        return null;
    }
}

