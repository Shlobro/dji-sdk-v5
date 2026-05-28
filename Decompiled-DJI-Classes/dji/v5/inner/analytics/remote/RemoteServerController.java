/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.inner.analytics.remote;

import dji.v5.inner.analytics.event.DJIAnalyticsEvent;
import dji.v5.network.DJIHttpCallback;
import dji.v5.network.DJIHttpResponse;
import dji.v5.utils.inner.ConstantsUtils;
import java.util.List;

public class RemoteServerController {
    private static final String APP_ID = ConstantsUtils.getConstant(ConstantsUtils.CONSTANT.ANALYTICS_APP_ID);

    private RemoteServerController() {
    }

    public static RemoteServerController getInstance() {
        return null;
    }

    public void sendToServer(List<DJIAnalyticsEvent> list, DJIHttpCallback<DJIHttpResponse> dJIHttpCallback) {
    }

    /* synthetic */ RemoteServerController(1 var1_1) {
    }

    private static class Holder {
        private static final RemoteServerController instance = new RemoteServerController(null);

        private Holder() {
        }

        static /* synthetic */ RemoteServerController access$100() {
            return null;
        }
    }
}

