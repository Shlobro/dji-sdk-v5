/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.v5.inner.analytics.event.eventd;

import androidx.annotation.Nullable;
import dji.v5.common.KeepProguard;

public class EventValue
implements KeepProguard {
    private String app_name;
    private String action;

    public EventValue() {
    }

    public boolean equals(@Nullable Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public EventValue(Builder builder) {
    }

    public String getApp_name() {
        return null;
    }

    public String getAction() {
        return null;
    }

    public static class Builder {
        private String app_name;
        private String action;

        public Builder appName(String string) {
            return null;
        }

        public Builder action(String string) {
            return null;
        }

        public EventValue build() {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }
    }
}

