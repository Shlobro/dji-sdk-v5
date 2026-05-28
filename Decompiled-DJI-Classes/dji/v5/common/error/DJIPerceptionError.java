/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dji.v5.core.R$string
 */
package dji.v5.common.error;

import dji.v5.common.error.ErrorType;
import dji.v5.common.error.IErrorFactory;
import dji.v5.core.R;

public class DJIPerceptionError
extends IErrorFactory.DefaultErrorFactory {
    public static final String OVERALL_OBSTACLE_AVOIDANCE_DISABLED = "OVERALL_OBSTACLE_AVOIDANCE_DISABLED";
    public static final String BREAKING_DISTANCE_PARAMETER_ILLEGAL = "BREAKING_DISTANCE_PARAMETER_ILLEGAL";
    public static final String WARNING_DISTANCE_PARAMETER_ILLEGAL = "WARNING_DISTANCE_PARAMETER_ILLEGAL";
    public static final String OPERATION_NOT_SUPPORT = "OPERATION_NOT_SUPPORT";
    public static final String CURRENT_AIRCRAFT_NOT_SUPPORT = "CURRENT_AIRCRAFT_NOT_SUPPORT";
    public static final String MASTER_SWITCH_IS_NOT_SUPPORT = "MASTER_SWITCH_IS_NOT_SUPPORT";
    public static final DJIPerceptionError FACTORY = new DJIPerceptionError();

    @Override
    public IErrorFactory.InnerError findInnerError(String string2) {
        return null;
    }

    @Override
    public ErrorType errorType() {
        return null;
    }

    private static final class Error
    extends Enum<Error>
    implements IErrorFactory.InnerError {
        public static final /* enum */ Error OVERALL_OBSTACLE_AVOIDANCE_DISABLED = new Error("OVERALL_OBSTACLE_AVOIDANCE_DISABLED", "Overall obstacle avoidance disabled", R.string.dji_msdk_error_perception_overall_obstacle_avoidance_disabled);
        public static final /* enum */ Error BREAKING_DISTANCE_PARAMETER_ILLEGAL = new Error("BREAKING_DISTANCE_PARAMETER_ILLEGAL", "Illegal parameter", R.string.dji_msdk_error_perception_braking_distance_illegal);
        public static final /* enum */ Error WARNING_DISTANCE_PARAMETER_ILLEGAL = new Error("WARNING_DISTANCE_PARAMETER_ILLEGAL", "Illegal parameter", R.string.dji_msdk_error_perception_warining_distance_illegal);
        public static final /* enum */ Error OPERATION_NOT_SUPPORT = new Error("OPERATION_NOT_SUPPORT", "Operation is not support", R.string.dji_msdk_error_perception_operation_not_support);
        public static final /* enum */ Error MASTER_SWITCH_IS_NOT_SUPPORT = new Error("MASTER_SWITCH_IS_NOT_SUPPORT", "Master switch is not support", R.string.dji_msdk_error_perception_master_switch_not_support);
        public static final /* enum */ Error CURRENT_AIRCRAFT_NOT_SUPPORT = new Error("CURRENT_AIRCRAFT_NOT_SUPPORT", "Not supported by current aircraft", R.string.dji_msdk_error_perception_current_aircraft_not_support);
        private final String errorCode;
        private final String hint;
        private final int resId;
        private static Error[] mValues;
        private static final /* synthetic */ Error[] $VALUES;

        public static Error[] values() {
            return null;
        }

        public static Error valueOf(String string2) {
            return null;
        }

        @Override
        public String errorCode() {
            return null;
        }

        @Override
        public String hint() {
            return null;
        }

        @Override
        public int resID() {
            return 0;
        }

        private Error(String string3, String string4, int n2) {
        }

        private static Error[] getValues() {
            return null;
        }

        private static Error find(String string2) {
            return null;
        }

        static /* synthetic */ Error access$000(String string2) {
            return null;
        }

        private static /* synthetic */ Error[] $values() {
            return null;
        }

        static {
            $VALUES = Error.$values();
        }
    }
}

