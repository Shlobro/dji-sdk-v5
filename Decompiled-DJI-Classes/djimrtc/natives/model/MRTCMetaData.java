/*
 * Decompiled with CFR 0.152.
 */
package djimrtc.natives.model;

public class MRTCMetaData {
    private final int msgIndex;
    private final String msgName;
    private final boolean isSupported;
    private final boolean isEnabled;
    private final byte[] data;

    public MRTCMetaData(Builder builder) {
    }

    public int getMsgIndex() {
        return 0;
    }

    public String getMsgName() {
        return null;
    }

    public boolean isSupported() {
        return false;
    }

    public boolean isEnabled() {
        return false;
    }

    public byte[] getData() {
        return null;
    }

    public static final class Builder {
        private int msgIndex;
        private String msgName;
        private boolean isSupported;
        private boolean isEnabled;
        private byte[] data;

        public Builder setMsgIndex(int n) {
            return null;
        }

        public Builder setMsgName(String string) {
            return null;
        }

        public Builder setSupported(boolean bl) {
            return null;
        }

        public Builder setEnabled(boolean bl) {
            return null;
        }

        public Builder setData(byte[] byArray) {
            return null;
        }

        public MRTCMetaData build() {
            return null;
        }

        static /* synthetic */ int access$000(Builder builder) {
            return 0;
        }

        static /* synthetic */ String access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ boolean access$200(Builder builder) {
            return false;
        }

        static /* synthetic */ boolean access$300(Builder builder) {
            return false;
        }

        static /* synthetic */ byte[] access$400(Builder builder) {
            return null;
        }
    }
}

