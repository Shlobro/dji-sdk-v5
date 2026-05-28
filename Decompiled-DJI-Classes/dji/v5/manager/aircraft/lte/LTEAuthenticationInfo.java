/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.manager.aircraft.lte;

import androidx.annotation.Keep;

@Keep
public class LTEAuthenticationInfo {
    private final boolean isLTEAuthenticationAvailable;
    private final boolean isLTEAuthenticated;
    private final String LTEAuthenticatedPhoneAreaCode;
    private final String LTEAuthenticatedPhoneNumber;
    private final long LTELastAuthenticatedTime;
    private final long LTEAuthenticatedRemainingTime;

    private LTEAuthenticationInfo(Builder builder) {
    }

    public boolean isLTEAuthenticationAvailable() {
        return false;
    }

    public boolean isLTEAuthenticated() {
        return false;
    }

    public String getLTEAuthenticatedPhoneAreaCode() {
        return null;
    }

    public String getLTEAuthenticatedPhoneNumber() {
        return null;
    }

    public long getLTELastAuthenticatedTime() {
        return 0L;
    }

    public long getLTEAuthenticatedRemainingTime() {
        return 0L;
    }

    /* synthetic */ LTEAuthenticationInfo(Builder builder, 1 var2_2) {
    }

    public static final class Builder {
        private boolean isLTEAuthenticationAvailable;
        private boolean isLTEAuthenticated;
        private String LTEAuthenticatedPhoneAreaCode;
        private String LTEAuthenticatedPhoneNumber;
        private long LTELatestAuthenticatedTime;
        private long LTEAuthenticatedRemainTime;

        private Builder() {
        }

        public static Builder newBuilder() {
            return null;
        }

        public Builder isLTEAuthenticationAvailable(boolean bl) {
            return null;
        }

        public Builder isLTEAuthenticated(boolean bl) {
            return null;
        }

        public Builder LTEAuthenticatedPhoneAreaCode(String string2) {
            return null;
        }

        public Builder LTEAuthenticatedPhoneNumber(String string2) {
            return null;
        }

        public Builder LTELatestAuthenticatedTime(long l2) {
            return null;
        }

        public Builder LTEAuthenticatedRemainTime(long l2) {
            return null;
        }

        public LTEAuthenticationInfo build() {
            return null;
        }

        static /* synthetic */ boolean access$000(Builder builder) {
            return false;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ long access$300(Builder builder) {
            return 0L;
        }

        static /* synthetic */ long access$400(Builder builder) {
            return 0L;
        }

        static /* synthetic */ boolean access$500(Builder builder) {
            return false;
        }
    }
}

