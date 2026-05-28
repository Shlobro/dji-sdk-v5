/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.push;

import dji.sdk.keyvalue.callback.IListenCallback;
import dji.sdk.keyvalue.key.DJIKey;
import java.util.List;

public class PushRecorder<R> {
    private static final String TAG = "PushRecorder";
    private DJIKey<R> key;
    private int id;
    private boolean had_notify;
    private List<IListenCallback<R>> strongCallback;

    public PushRecorder(DJIKey dJIKey, IListenCallback<R> iListenCallback, boolean bl) {
    }

    private void listen(boolean bl) {
    }

    public void addCallback(IListenCallback<R> iListenCallback, boolean bl) {
    }

    public void notifyCallback(R r, R r2) {
    }

    public void cancel() {
    }

    public boolean valid() {
        return false;
    }

    private /* synthetic */ void lambda$listen$1(byte[] byArray, int n, int n2) {
    }

    private /* synthetic */ void lambda$listen$0(int n, byte[] byArray, int n2) {
    }

    static /* synthetic */ boolean access$000(PushRecorder pushRecorder) {
        return false;
    }
}

