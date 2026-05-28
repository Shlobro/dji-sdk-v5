/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.room.ColumnInfo
 *  androidx.room.Entity
 *  androidx.room.Ignore
 *  androidx.room.Index
 *  androidx.room.PrimaryKey
 */
package dji.v5.inner.analytics.database.entities;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.Index;
import androidx.room.PrimaryKey;

@Entity(tableName="event", indices={@Index(value={"_id"}, unique=true)})
public class Analytics {
    @PrimaryKey(autoGenerate=true)
    @ColumnInfo(name="_id", typeAffinity=3)
    public int _id;
    @ColumnInfo(name="event_data")
    public String event_data;

    @Ignore
    public Analytics(String string) {
    }

    public Analytics() {
    }

    public int get_id() {
        return 0;
    }

    public void set_id(int n) {
    }

    public String getEvent_data() {
        return null;
    }

    public void setEvent_data(String string) {
    }

    @NonNull
    public String toString() {
        return null;
    }
}

