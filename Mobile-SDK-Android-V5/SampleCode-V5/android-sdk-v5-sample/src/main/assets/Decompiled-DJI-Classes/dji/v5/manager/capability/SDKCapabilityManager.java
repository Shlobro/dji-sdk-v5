/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.capability;

import dji.sdk.keyvalue.key.DJIKeyInfo;
import dji.v5.manager.interfaces.ISDKCapabilityManager;
import java.util.Set;

public class SDKCapabilityManager
implements ISDKCapabilityManager {
    private final Set<DJIKeyInfo<?>> lensDefaultKeys;

    private SDKCapabilityManager() {
    }

    public static ISDKCapabilityManager getInstance() {
        return null;
    }

    private void initLensDefaultKeys() {
    }

    @Override
    public boolean isLensDefaultKey(DJIKeyInfo<?> dJIKeyInfo) {
        return false;
    }

    /* synthetic */ SDKCapabilityManager(1 var1_1) {
    }

    private static class Holder {
        private static final SDKCapabilityManager INSTANCE = new SDKCapabilityManager(null);

        private Holder() {
        }

        static /* synthetic */ SDKCapabilityManager access$000() {
            return null;
        }
    }
}

