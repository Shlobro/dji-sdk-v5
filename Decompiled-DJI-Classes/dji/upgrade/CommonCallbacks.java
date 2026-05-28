/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade;

import dji.upgrade.UpgradeError;
import java.util.ArrayList;

public class CommonCallbacks {

    public static interface CompletionCallbackWithTwoParam<X, Y> {
        public void onSuccess(X var1, Y var2);

        public void onFailure(UpgradeError var1);
    }

    public static interface CompletionCallbackWith<T> {
        public void onSuccess(T var1);

        public void onFailure(UpgradeError var1);
    }

    public static interface CompletionCallbackWithErrors {
        public void onFailure(ArrayList<UpgradeError> var1);

        public void onSuccess();
    }

    public static interface CompletionCallback {
        public void onResult(UpgradeError var1);
    }
}

