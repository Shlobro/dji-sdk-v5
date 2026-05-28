/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 */
package xcrash;

import android.app.Activity;
import android.app.Application;
import java.util.LinkedList;

class ActivityMonitor {
    private static final ActivityMonitor instance = new ActivityMonitor();
    private LinkedList<Activity> activities;
    private boolean isAppForeground;
    private static final int MAX_ACTIVITY_NUM = 100;

    private ActivityMonitor() {
    }

    static ActivityMonitor getInstance() {
        return null;
    }

    void initialize(Application application) {
    }

    void finishAllActivities() {
    }

    boolean isApplicationForeground() {
        return false;
    }

    static /* synthetic */ LinkedList access$000(ActivityMonitor activityMonitor) {
        return null;
    }

    static /* synthetic */ boolean access$102(ActivityMonitor activityMonitor, boolean bl) {
        return false;
    }
}

