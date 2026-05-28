/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.livestream.settings;

import androidx.annotation.NonNull;

public class RtspSettings {
    private String userName;
    private String password;
    private int port;

    private RtspSettings(Builder builder) {
    }

    public String getUserName() {
        return null;
    }

    public String getPassword() {
        return null;
    }

    public int getPort() {
        return 0;
    }

    @NonNull
    public String toString() {
        return null;
    }

    /* synthetic */ RtspSettings(Builder builder, 1 var2_2) {
    }

    public static class Builder {
        private String userName;
        private String password;
        private int port;

        public Builder setUserName(String string2) {
            return null;
        }

        public Builder setPassWord(String string2) {
            return null;
        }

        public Builder setPort(int n) {
            return null;
        }

        public RtspSettings build() {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }
    }
}

