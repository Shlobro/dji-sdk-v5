/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.camera.view;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.common.ComponentIndexType;
import dji.sdk.keyvalue.value.common.LocationCoordinate3D;
import dji.sdk.keyvalue.value.common.PhysicalSource;
import dji.v5.manager.datacenter.camera.view.PinPointInfo;
import dji.v5.utils.common.LogUtils;

public class PinPointManager {
    private static final String TAG = LogUtils.getTag("PinPointManager");

    public static PinPointManager getInstance() {
        return null;
    }

    public void init() {
    }

    public void destroy() {
    }

    private void subscribeState() {
    }

    private void unSubscribeState() {
    }

    @NonNull
    public PinPointInfo getLiveViewLocationWithGPS(@NonNull LocationCoordinate3D locationCoordinate3D, @NonNull ComponentIndexType componentIndexType) {
        return null;
    }

    private PhysicalSource toPhysicalSource(ComponentIndexType componentIndexType) {
        return null;
    }

    private /* synthetic */ void lambda$init$0(Boolean bl, Boolean bl2) {
    }

    static /* synthetic */ String access$100() {
        return null;
    }

    private static class Holder {
        private static final PinPointManager INSTANCE = new PinPointManager();

        private Holder() {
        }

        static /* synthetic */ PinPointManager access$000() {
            return null;
        }
    }
}

