/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.ComponentInformation;
import dji.upgrade.generate.ComponentUpgradePathMsg;
import dji.upgrade.generate.CompositeProgressObserver;
import dji.upgrade.generate.DecompressProgressObserver;
import dji.upgrade.generate.ResultCallback;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

public interface CompositeManager
extends JNIProguardKeepTag {
    public static void StartUpgrade(ArrayList<ComponentInformation> arrayList, ResultCallback resultCallback) {
    }

    public static void StartSelfUpgrade(ComponentInformation componentInformation, boolean bl, ResultCallback resultCallback) {
    }

    public static void StartImageSwitch(ArrayList<ComponentInformation> arrayList, ResultCallback resultCallback) {
    }

    public static void TriggerImageSwitch(ComponentInformation componentInformation, ResultCallback resultCallback) {
    }

    public static void SetUpgradeStateObserver(CompositeProgressObserver compositeProgressObserver) {
    }

    public static void StartUpgradeFirmwareByArchivePath(ArrayList<ComponentUpgradePathMsg> arrayList, ResultCallback resultCallback) {
    }

    public static void SetDepressStateObserver(DecompressProgressObserver decompressProgressObserver) {
    }

    public static final class CppProxy
    implements CompositeManager {
        private final long nativeRef;
        private final AtomicBoolean destroyed;

        private CppProxy(long l2) {
        }

        private native void nativeDestroy(long var1);

        public void _djinni_private_destroy() {
        }

        protected void finalize() throws Throwable {
        }

        public static native void StartUpgrade(ArrayList<ComponentInformation> var0, ResultCallback var1);

        public static native void StartSelfUpgrade(ComponentInformation var0, boolean var1, ResultCallback var2);

        public static native void StartImageSwitch(ArrayList<ComponentInformation> var0, ResultCallback var1);

        public static native void TriggerImageSwitch(ComponentInformation var0, ResultCallback var1);

        public static native void SetUpgradeStateObserver(CompositeProgressObserver var0);

        public static native void StartUpgradeFirmwareByArchivePath(ArrayList<ComponentUpgradePathMsg> var0, ResultCallback var1);

        public static native void SetDepressStateObserver(DecompressProgressObserver var0);
    }
}

