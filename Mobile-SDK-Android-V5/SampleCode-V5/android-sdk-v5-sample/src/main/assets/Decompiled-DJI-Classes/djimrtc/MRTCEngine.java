/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package djimrtc;

import android.content.Context;
import djimrtc.DJILiveShareChannel;
import djimrtc.DJILiveShareOptions;
import java.util.Map;

public class MRTCEngine {
    private static final String TAG = "MRTCLiveShare";
    private static volatile MRTCEngine ourInstance;
    private Context mContext;
    private Map<DJILiveShareOptions, DJILiveShareChannel> mLiveShareChannelMap;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static MRTCEngine createInstance(Context context) {
        return null;
    }

    private MRTCEngine(Context context) {
    }

    public DJILiveShareChannel createLiveShareChannel(DJILiveShareOptions dJILiveShareOptions, CreateLiveShareChannelCallback createLiveShareChannelCallback) {
        return null;
    }

    private int checkOptions(DJILiveShareOptions dJILiveShareOptions) {
        return 0;
    }

    public void releaseData() {
    }

    public static interface CreateLiveShareChannelCallback {
        public void onResult(int var1);
    }
}

