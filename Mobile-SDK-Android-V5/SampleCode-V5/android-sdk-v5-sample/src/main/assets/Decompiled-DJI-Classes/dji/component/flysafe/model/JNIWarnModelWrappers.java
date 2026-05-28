/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import dji.component.flysafe.model.FlyfrbAreaJniElement;
import dji.csdk.flysafe.CDLWarningEventType;
import dji.csdk.flysafe.ShowCDLWarningContext;
import dji.csdk.flysafe.ShowTipsContext;
import dji.csdk.flysafe.ShowWarningContext;
import java.util.List;

@Keep
public class JNIWarnModelWrappers {
    private static final String TAG = "JNI warning wrappers-";

    @Keep
    public static class ShowTipsWrapper {
        public List<FlyfrbAreaJniElement> mWarnElements;
        public int mLimitHeight;
        public NormalTipsType mTipsType;

        public static ShowTipsWrapper convertFromJniModel(ShowTipsContext showTipsContext) {
            return null;
        }

        public String toString() {
            return null;
        }

        public static final class NormalTipsType
        extends Enum<NormalTipsType> {
            public static final /* enum */ NormalTipsType TakeOffWithLimitHeightWithoutGPS = new NormalTipsType(0);
            public static final /* enum */ NormalTipsType TakeOffUnderLimitHeightArea = new NormalTipsType(1);
            public static final /* enum */ NormalTipsType TakeOffUnderWarningArea = new NormalTipsType(2);
            public static final /* enum */ NormalTipsType CollisionWithLimitArea = new NormalTipsType(3);
            public static final /* enum */ NormalTipsType CollisionWithAuthAreaWithoutLicense = new NormalTipsType(4);
            public static final /* enum */ NormalTipsType CollisionWithLimitHeightArea = new NormalTipsType(5);
            public static final /* enum */ NormalTipsType CollisionWithGoHomeMode = new NormalTipsType(6);
            public static final /* enum */ NormalTipsType CollisionWithSmartMode = new NormalTipsType(7);
            public static final /* enum */ NormalTipsType CollisionWithSpecialUnlockArea = new NormalTipsType(8);
            public static final /* enum */ NormalTipsType EnterLimitHeightAreaUnderLimitHeight = new NormalTipsType(9);
            public static final /* enum */ NormalTipsType CollisionWithLimitHeightAreaSoonInWhiteListValidArea = new NormalTipsType(10);
            public static final /* enum */ NormalTipsType FlyingWithCEAreaNearby = new NormalTipsType(11);
            public static final /* enum */ NormalTipsType CollisionWithCEArea = new NormalTipsType(12);
            public static final /* enum */ NormalTipsType OTHER = new NormalTipsType(255);
            private final int value;
            private static volatile NormalTipsType[] sValues;
            private static final /* synthetic */ NormalTipsType[] $VALUES;

            public static NormalTipsType[] values() {
                return null;
            }

            public static NormalTipsType valueOf(String string) {
                return null;
            }

            private NormalTipsType(int n2) {
            }

            public int getValue() {
                return 0;
            }

            public static NormalTipsType fromValue(int n) {
                return null;
            }

            private static /* synthetic */ NormalTipsType[] $values() {
                return null;
            }

            static {
                $VALUES = NormalTipsType.$values();
                sValues = null;
            }
        }
    }

    @Keep
    public static class ShowCDLWarningWrapper
    extends ShowWrapperBase {
        public CDLWarningEventType mEventType;
        public int mCDTime;

        public static ShowCDLWarningWrapper convertFromJniModel(ShowCDLWarningContext showCDLWarningContext) {
            return null;
        }

        public static CDLWarningEventType convertFromJniType(CDLWarningEventType cDLWarningEventType) {
            return null;
        }

        public String toString() {
            return null;
        }
    }

    @Keep
    public static class ShowWarningWrapper
    extends ShowWrapperBase {
        public NewFlyFrbUIAction mWarnActionType;

        public static ShowWarningWrapper convertFromJniModel(ShowWarningContext showWarningContext) {
            return null;
        }

        public String toString() {
            return null;
        }
    }

    @Keep
    public static class ShowWrapperBase {
        public List<FlyfrbAreaJniElement> mWarnElements;
        public int mLimitHeight;
    }

    public static final class AirportWarningAreaTakeoffState
    extends Enum<AirportWarningAreaTakeoffState> {
        public static final /* enum */ AirportWarningAreaTakeoffState INSIDE = new AirportWarningAreaTakeoffState(0);
        public static final /* enum */ AirportWarningAreaTakeoffState OUTSIDE = new AirportWarningAreaTakeoffState(1);
        private int mValue;
        private static final /* synthetic */ AirportWarningAreaTakeoffState[] $VALUES;

        public static AirportWarningAreaTakeoffState[] values() {
            return null;
        }

        public static AirportWarningAreaTakeoffState valueOf(String string) {
            return null;
        }

        private AirportWarningAreaTakeoffState(int n2) {
        }

        public int getValue() {
            return 0;
        }

        public static AirportWarningAreaTakeoffState find(int n) {
            return null;
        }

        private static /* synthetic */ AirportWarningAreaTakeoffState[] $values() {
            return null;
        }

        static {
            $VALUES = AirportWarningAreaTakeoffState.$values();
        }
    }

    public static final class NewFlyFrbUIAction
    extends Enum<NewFlyFrbUIAction> {
        public static final /* enum */ NewFlyFrbUIAction WARN_IN_LIMIT = new NewFlyFrbUIAction(0);
        public static final /* enum */ NewFlyFrbUIAction WARN_SEEM_IN_LIMIT = new NewFlyFrbUIAction(1);
        public static final /* enum */ NewFlyFrbUIAction OUTSIDE_WHITE_LIST_AREA = new NewFlyFrbUIAction(2);
        public static final /* enum */ NewFlyFrbUIAction SEEM_IN_AUTHORIZE_HAS_NO_LICENSE = new NewFlyFrbUIAction(3);
        public static final /* enum */ NewFlyFrbUIAction IN_AUTHORIZE_HAS_NO_LICENSE = new NewFlyFrbUIAction(4);
        public static final /* enum */ NewFlyFrbUIAction IN_AUTHORIZE_HAS_LICENSE = new NewFlyFrbUIAction(5);
        public static final /* enum */ NewFlyFrbUIAction NEAR_SPECIAL_WARNING = new NewFlyFrbUIAction(6);
        public static final /* enum */ NewFlyFrbUIAction NEAR_LIMIT = new NewFlyFrbUIAction(7);
        public static final /* enum */ NewFlyFrbUIAction NEAR_LIMIT_HEIGHT = new NewFlyFrbUIAction(8);
        public static final /* enum */ NewFlyFrbUIAction NEAR_AUTHORIZE_HAS_NO_LICENSE = new NewFlyFrbUIAction(9);
        public static final /* enum */ NewFlyFrbUIAction NEAR_AUTHORIZE_HAS_LICENSE = new NewFlyFrbUIAction(10);
        public static final /* enum */ NewFlyFrbUIAction NEAR_MULTI_LIMIT_TYPE = new NewFlyFrbUIAction(11);
        public static final /* enum */ NewFlyFrbUIAction FLY_TOUCH_AUTHORIZE_HAS_LICENSE = new NewFlyFrbUIAction(12);
        public static final /* enum */ NewFlyFrbUIAction WARN_UAV_SEEM_IN_LIMIT = new NewFlyFrbUIAction(13);
        public static final /* enum */ NewFlyFrbUIAction HAVE_ONE_HOUR_WILL_APPLY_TFRS = new NewFlyFrbUIAction(14);
        public static final /* enum */ NewFlyFrbUIAction TAKEOFF_WITH_CE_AREA_NEARBY = new NewFlyFrbUIAction(15);
        public static final /* enum */ NewFlyFrbUIAction TAKEOFF_IN_CE_AREA = new NewFlyFrbUIAction(16);
        public static final /* enum */ NewFlyFrbUIAction ACTION_UNKNOWN = new NewFlyFrbUIAction(255);
        private int mValue;
        private static volatile NewFlyFrbUIAction[] sValues;
        private static final /* synthetic */ NewFlyFrbUIAction[] $VALUES;

        public static NewFlyFrbUIAction[] values() {
            return null;
        }

        public static NewFlyFrbUIAction valueOf(String string) {
            return null;
        }

        private NewFlyFrbUIAction(int n2) {
        }

        public int getValue() {
            return 0;
        }

        public static NewFlyFrbUIAction ofValue(int n) {
            return null;
        }

        private static /* synthetic */ NewFlyFrbUIAction[] $values() {
            return null;
        }

        static {
            $VALUES = NewFlyFrbUIAction.$values();
            sValues = null;
        }
    }
}

