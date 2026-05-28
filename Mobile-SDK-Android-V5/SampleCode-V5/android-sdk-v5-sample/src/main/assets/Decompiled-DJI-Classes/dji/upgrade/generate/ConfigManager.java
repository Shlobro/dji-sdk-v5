/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.generate;

import dji.jni.JNIProguardKeepTag;
import dji.upgrade.generate.UpgradeServerUrlMode;
import java.util.concurrent.atomic.AtomicBoolean;

public interface ConfigManager
extends JNIProguardKeepTag {
    public static void SetCountryCode(String string2) {
    }

    public static void SetUpgradeServerUrlMode(UpgradeServerUrlMode upgradeServerUrlMode) {
    }

    public static final class CppProxy
    implements ConfigManager {
        private final long nativeRef;
        private final AtomicBoolean destroyed;

        private CppProxy(long l2) {
        }

        private native void nativeDestroy(long var1);

        public void _djinni_private_destroy() {
        }

        protected void finalize() throws Throwable {
        }

        public static native void SetCountryCode(String var0);

        public static native void SetUpgradeServerUrlMode(UpgradeServerUrlMode var0);
    }
}

