/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.javalib.base;

public class BleError {
    private BleCode code;
    private String description;

    public BleError(BleCode bleCode, String string2) {
    }

    public String toString() {
        return null;
    }

    public static final class BleCode
    extends Enum<BleCode> {
        public static final /* enum */ BleCode TIMEOUT = new BleCode();
        public static final /* enum */ BleCode GATT_EXCEPTION = new BleCode();
        public static final /* enum */ BleCode PARAM_INVALID = new BleCode();
        public static final /* enum */ BleCode INVALID_STATE = new BleCode();
        public static final /* enum */ BleCode SYSTEM_ERROR = new BleCode();
        public static final /* enum */ BleCode UNKNOWN = new BleCode();
        private static final /* synthetic */ BleCode[] $VALUES;

        public static BleCode[] values() {
            return null;
        }

        public static BleCode valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ BleCode[] $values() {
            return null;
        }

        static {
            $VALUES = BleCode.$values();
        }
    }
}

