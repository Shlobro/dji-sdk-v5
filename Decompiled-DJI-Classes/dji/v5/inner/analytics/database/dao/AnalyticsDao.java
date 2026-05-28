/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.IntRange
 *  androidx.room.Dao
 *  androidx.room.Insert
 *  androidx.room.Query
 *  androidx.room.Transaction
 *  io.reactivex.rxjava3.core.Completable
 *  io.reactivex.rxjava3.core.Flowable
 */
package dji.v5.inner.analytics.database.dao;

import androidx.annotation.IntRange;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import dji.v5.inner.analytics.database.entities.Analytics;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Flowable;
import java.util.List;

@Dao
public interface AnalyticsDao {
    @Transaction
    @Insert(onConflict=1)
    public Completable insertAnalytics(List<Analytics> var1);

    @Query(value="DELETE FROM event WHERE _id IN (SELECT _id FROM event ORDER BY _id ASC LIMIT :num)")
    public void deleteAnalytics(int var1);

    @Query(value="SELECT COUNT(*) FROM event")
    public int countAnalytics();

    @Query(value="SELECT * FROM event ORDER BY _id ASC LIMIT :num")
    public List<Analytics> peakAnalytics(@IntRange(from=0L, to=0x7FFFFFFFL) int var1);

    @Query(value="SELECT * FROM event")
    public Flowable<List<Analytics>> peakAllAnalytics();
}

