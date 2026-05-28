/*
 * Decompiled with CFR 0.152.
 */
package dji.component.flysafe.dbupgrade.listener;

public interface DJIDataUpgradeListener {
    public void onStart();

    public void onDownload(int var1);

    public void onDownloadOver();

    public void onUpgradeStart();

    public void onUpgrade(int var1);

    public void onFail(DataFailReason var1);

    public void onSuccess();

    public static final class DataFailReason
    extends Enum<DataFailReason> {
        public static final /* enum */ DataFailReason DownloadErr = new DataFailReason();
        public static final /* enum */ DataFailReason NetWorkErr = new DataFailReason();
        public static final /* enum */ DataFailReason SignErr = new DataFailReason();
        public static final /* enum */ DataFailReason Upload = new DataFailReason();
        public static final /* enum */ DataFailReason LowPower = new DataFailReason();
        public static final /* enum */ DataFailReason NotSupport = new DataFailReason();
        public static final /* enum */ DataFailReason UploadOverErr = new DataFailReason();
        public static final /* enum */ DataFailReason NotConnectUav = new DataFailReason();
        public static final /* enum */ DataFailReason MOTOR_ON = new DataFailReason();
        public static final /* enum */ DataFailReason PathNotAvailable = new DataFailReason();
        public static final /* enum */ DataFailReason ALL_FLOW_TIMEOUT = new DataFailReason();
        public static final /* enum */ DataFailReason LOCAL_DB_REPLACE_FAIL = new DataFailReason();
        public static final /* enum */ DataFailReason NONE = new DataFailReason();
        private static final /* synthetic */ DataFailReason[] $VALUES;

        public static DataFailReason[] values() {
            return null;
        }

        public static DataFailReason valueOf(String string) {
            return null;
        }

        private static /* synthetic */ DataFailReason[] $values() {
            return null;
        }

        static {
            $VALUES = DataFailReason.$values();
        }
    }
}

