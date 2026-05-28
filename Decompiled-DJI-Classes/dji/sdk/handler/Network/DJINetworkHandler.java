/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  okhttp3.Call
 *  okhttp3.Callback
 *  okhttp3.Response
 */
package dji.sdk.handler.Network;

import android.content.Context;
import dji.sdk.handler.Network.IDownloadCallback;
import dji.sdk.handler.Network.IDownloadSizeCallback;
import dji.sdk.handler.Network.INetworkHandler;
import dji.sdk.handler.Network.INetworkRequestCallback;
import dji.sdk.handler.Network.NetWorkStateReceiver;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

public class DJINetworkHandler
implements INetworkHandler {
    private static final String TAG = "DJINetworkHandler";
    private static Map<Integer, Call> downCalls = new ConcurrentHashMap<Integer, Call>();
    private Context context;
    private NetWorkStateReceiver receiver;

    public DJINetworkHandler(Context context) {
    }

    @Override
    public boolean initialize() {
        return false;
    }

    @Override
    public void uninitialize() {
    }

    @Override
    public boolean get(String string, Map<String, String> map, INetworkRequestCallback iNetworkRequestCallback) {
        return false;
    }

    @Override
    public boolean post(String string, byte[] byArray, Map<String, String> map, INetworkRequestCallback iNetworkRequestCallback, byte[] byArray2) {
        return false;
    }

    @Override
    public void download(int n, String string, Map<String, String> map, String string2, IDownloadCallback iDownloadCallback) {
    }

    @Override
    public void download(int n, String string, Map<String, String> map, String string2, IDownloadSizeCallback iDownloadSizeCallback) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static void writeFileToStorage(int n, Call call, String string, boolean bl, Response response, IDownloadSizeCallback iDownloadSizeCallback) {
    }

    @Override
    public synchronized void stopDownload(int n) {
    }

    @Override
    public boolean networkStatus() {
        return false;
    }

    @Override
    public boolean isDebugUrl() {
        return false;
    }

    private /* synthetic */ void lambda$initialize$0() {
    }

    static /* synthetic */ Map access$000() {
        return null;
    }

    static /* synthetic */ void access$100(int n, Call call, String string, boolean bl, Response response, IDownloadSizeCallback iDownloadSizeCallback) {
    }

    private static final class WriteState
    extends Enum<WriteState> {
        public static final /* enum */ WriteState Normal = new WriteState();
        public static final /* enum */ WriteState Cancel = new WriteState();
        public static final /* enum */ WriteState Exception = new WriteState();
        private static final /* synthetic */ WriteState[] $VALUES;

        public static WriteState[] values() {
            return null;
        }

        public static WriteState valueOf(String string) {
            return null;
        }

        private static /* synthetic */ WriteState[] $values() {
            return null;
        }

        static {
            $VALUES = WriteState.$values();
        }
    }

    public static abstract class OperationCallback
    implements Callback {
        private final int operationID;

        public OperationCallback(int n) {
        }

        public int getOperationID() {
            return 0;
        }
    }
}

