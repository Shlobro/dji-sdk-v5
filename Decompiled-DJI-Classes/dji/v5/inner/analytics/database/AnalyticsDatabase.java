/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.room.Database
 *  androidx.room.RoomDatabase
 */
package dji.v5.inner.analytics.database;

import android.content.Context;
import androidx.room.Database;
import androidx.room.RoomDatabase;
import dji.v5.inner.analytics.database.dao.AnalyticsDao;
import dji.v5.inner.analytics.database.entities.Analytics;

@Database(entities={Analytics.class}, version=1, exportSchema=false)
public abstract class AnalyticsDatabase
extends RoomDatabase {
    private static final String DB_NAME = "V5_DJIAnalytics2.db";
    private static volatile AnalyticsDatabase instance;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static AnalyticsDatabase getInstance(Context context) {
        return null;
    }

    public abstract AnalyticsDao getAnalyticsDao();
}

