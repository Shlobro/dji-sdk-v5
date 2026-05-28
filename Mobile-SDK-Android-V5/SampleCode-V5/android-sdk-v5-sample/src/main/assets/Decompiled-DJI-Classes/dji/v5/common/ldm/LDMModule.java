/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.common.ldm;

import androidx.annotation.NonNull;
import dji.v5.common.ldm.LDMExemptModule;

@Deprecated
public class LDMModule {
    private boolean enabled;
    private LDMExemptModule moduleType;

    private LDMModule(@NonNull Builder builder) {
    }

    public boolean isEnabled() {
        return false;
    }

    public void setEnabled(boolean bl) {
    }

    public LDMExemptModule getModuleType() {
        return null;
    }

    public void setModuleType(LDMExemptModule lDMExemptModule) {
    }

    /* synthetic */ LDMModule(Builder builder, 1 var2_2) {
    }

    public static class Builder {
        private boolean enabled;
        private LDMExemptModule moduleType;

        public Builder enabled(boolean bl) {
            return null;
        }

        public Builder moduleType(LDMExemptModule lDMExemptModule) {
            return null;
        }

        public LDMModule build() {
            return null;
        }

        static /* synthetic */ boolean access$000(Builder builder) {
            return false;
        }

        static /* synthetic */ LDMExemptModule access$100(Builder builder) {
            return null;
        }
    }
}

