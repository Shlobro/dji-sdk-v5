/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager$NetworkCallback
 *  androidx.annotation.Keep
 *  androidx.annotation.NonNull
 */
package dji.v5.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import dji.v5.common.ldm.LDMExemptModule;
import dji.v5.network.DJIHttpCallback;
import dji.v5.network.DJIHttpRequest;
import dji.v5.network.DJIHttpResponse;
import dji.v5.network.IDJINetworkManager;
import dji.v5.network.IDJINetworkStatusListener;
import dji.v5.network.IDJINetworkStatusManager;
import dji.v5.network.NetWorkStateReceiver;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class DJINetworkManager
implements IDJINetworkManager,
IDJINetworkStatusManager {
    private final AtomicBoolean isNetworkManagerInit;
    private final AtomicBoolean isNetworkStatusManagerInit;
    private final NetWorkStateReceiver receiver;
    private final ConnectivityManager.NetworkCallback networkCallback;
    private final List<IDJINetworkStatusListener> statusListeners;
    private IDJINetworkManager delegate;

    public static DJINetworkManager getInstance() {
        return null;
    }

    @Override
    public String getSign() {
        return null;
    }

    @Override
    public void enqueue(@NonNull DJIHttpRequest dJIHttpRequest, DJIHttpCallback<DJIHttpResponse> dJIHttpCallback) {
    }

    @Override
    public DJIHttpResponse execute(@NonNull DJIHttpRequest dJIHttpRequest) {
        return null;
    }

    @Override
    public void cancel(@NonNull DJIHttpRequest dJIHttpRequest) {
    }

    @Override
    public void cancel(@NonNull LDMExemptModule lDMExemptModule) {
    }

    @Override
    public void cancelAll() {
    }

    @Override
    public void initNetworkStatusManager(Context context) {
    }

    @Override
    public void releaseNetworkStatusManager(Context context) {
    }

    @Override
    public void addNetworkStatusListener(IDJINetworkStatusListener iDJINetworkStatusListener) {
    }

    @Override
    public void removeNetworkStatusListener(IDJINetworkStatusListener iDJINetworkStatusListener) {
    }

    private void notifyNetworkStatusListeners() {
    }

    @Keep
    public boolean init(Object object) {
        return false;
    }

    public boolean isInit() {
        return false;
    }

    static /* synthetic */ void access$000(DJINetworkManager dJINetworkManager) {
    }

    private static class LazyHolder {
        private static final DJINetworkManager INSTANCE = new DJINetworkManager();

        private LazyHolder() {
        }

        static /* synthetic */ DJINetworkManager access$100() {
            return null;
        }
    }
}

