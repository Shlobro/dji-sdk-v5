/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.manager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import dji.sdk.keyvalue.key.DJIActionKeyInfo;
import dji.sdk.keyvalue.key.DJIKey;
import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.common.error.IDJIError;
import dji.v5.manager.interfaces.IKeyManager;

public class KeyManager
implements IKeyManager {
    private KeyManager() {
    }

    public static KeyManager getInstance() {
        return null;
    }

    @Override
    @Nullable
    public <R> R getValue(DJIKey<R> dJIKey) {
        return null;
    }

    @Override
    @NonNull
    public <R> R getValue(DJIKey<R> dJIKey, @NonNull R r) {
        return null;
    }

    @Override
    public <R> void getValue(DJIKey<R> dJIKey, CommonCallbacks.CompletionCallbackWithParam<R> completionCallbackWithParam) {
    }

    @Override
    public <P> void setValue(DJIKey<P> dJIKey, P p, CommonCallbacks.CompletionCallback completionCallback) {
    }

    @Override
    public <R> void performAction(DJIKey.ActionKey<?, R> actionKey, CommonCallbacks.CompletionCallbackWithParam<R> completionCallbackWithParam) {
    }

    @Override
    public <P, R> void performAction(DJIKey.ActionKey<P, R> actionKey, P p, CommonCallbacks.CompletionCallbackWithParam<R> completionCallbackWithParam) {
    }

    @Override
    public <R> void listen(DJIKey<R> dJIKey, Object object, CommonCallbacks.KeyListener<R> keyListener) {
    }

    @Override
    public <R> void listen(DJIKey<R> dJIKey, Object object, boolean bl, CommonCallbacks.KeyListener<R> keyListener) {
    }

    @Override
    public void cancelListen(DJIKey<?> dJIKey, Object object) {
    }

    @Override
    public void cancelListen(DJIKey<?> dJIKey) {
    }

    @Override
    public void cancelListen(Object object) {
    }

    @Override
    public <T> boolean isKeySupported(DJIKey<T> dJIKey) {
        return false;
    }

    @Override
    public <T> DJIKey<T> create(DJIKeyInfo<T> dJIKeyInfo, int n, int n2, int n3, int n4) {
        return null;
    }

    @Override
    public <T, R> DJIKey.ActionKey<T, R> create(DJIActionKeyInfo<T, R> dJIActionKeyInfo, int n, int n2, int n3, int n4) {
        return null;
    }

    private IDJIError toError(DJIKey dJIKey, int n, String string2) {
        return null;
    }

    private void logKey(DJIKeyInfo dJIKeyInfo, int n) {
    }

    private void logKeyOnSuccess(DJIKeyInfo dJIKeyInfo, int n) {
    }

    private void logKeyOnFailed(DJIKeyInfo dJIKeyInfo, int n, int n2) {
    }

    /* synthetic */ KeyManager(1 var1_1) {
    }

    static /* synthetic */ IDJIError access$200(KeyManager keyManager, DJIKey dJIKey, int n, String string2) {
        return null;
    }

    static /* synthetic */ void access$300(KeyManager keyManager, DJIKeyInfo dJIKeyInfo, int n) {
    }

    static /* synthetic */ void access$400(KeyManager keyManager, DJIKeyInfo dJIKeyInfo, int n, int n2) {
    }

    private static class MSDKKeyManagerHolder {
        private static final KeyManager INSTANCE = new KeyManager(null);

        private MSDKKeyManagerHolder() {
        }

        static /* synthetic */ KeyManager access$000() {
            return null;
        }
    }
}

