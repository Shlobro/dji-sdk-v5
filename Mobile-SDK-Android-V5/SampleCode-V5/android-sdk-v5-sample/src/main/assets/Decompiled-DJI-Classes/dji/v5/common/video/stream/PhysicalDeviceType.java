/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  androidx.annotation.Nullable
 */
package dji.v5.common.video.stream;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

@Deprecated
public class PhysicalDeviceType {
    private final String deviceType;
    private static final String FPV = "FPV";

    private PhysicalDeviceType(Builder builder) {
    }

    public String getDeviceType() {
        return null;
    }

    public static Builder builder() {
        return null;
    }

    @NonNull
    public String toString() {
        return null;
    }

    public int hashCode() {
        return 0;
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }

    /* synthetic */ PhysicalDeviceType(Builder builder, 1 var2_2) {
    }

    public static class Builder {
        private String physicalDeviceType;

        public Builder physicalDeviceType(String string2) {
            return null;
        }

        public PhysicalDeviceType build() {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }
    }
}

