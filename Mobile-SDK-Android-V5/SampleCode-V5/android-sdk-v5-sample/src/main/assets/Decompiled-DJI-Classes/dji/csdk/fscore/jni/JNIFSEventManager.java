/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  androidx.annotation.Keep
 */
package dji.csdk.fscore.jni;

import android.content.Context;
import androidx.annotation.Keep;
import com.dji.flysafe.mapkit.core.core.models.DJILatLng;
import com.dji.flysafe.util.ContextUtil;
import dji.component.flysafe.listener.OnDeviceIDChangeListener;
import dji.csdk.fscore.jni.IJNICommonEnum;
import java.util.concurrent.atomic.AtomicInteger;

@Keep
public class JNIFSEventManager {
    private static final String TAG = "JNIFSEventManager";
    private static final DJILatLng DEFAULT_INVALID_COORD = new DJILatLng(0.0, 0.0);
    private Context mContext;
    private AtomicInteger mCurDeviceId;
    private DJILatLng mCurUavLoc;
    private boolean isMotorUp;
    private boolean isHas1860Db;
    private boolean isSupportV3TFRUpdate;
    private int TFRDataType;
    private String mCurFlycSn;
    private OnDeviceIDChangeListener onDeviceIDChangeListener;
    private final Object lockDeviceIDListener;

    public static JNIFSEventManager getInstance() {
        return null;
    }

    private JNIFSEventManager(Context context) {
    }

    public DJILatLng getCurUavLoc() {
        return null;
    }

    private boolean isCurDeviceIdValid() {
        return false;
    }

    private void onConnectLoseResetData() {
    }

    public int getCurrentDeviceId() {
        return 0;
    }

    public void setCurrentDeviceId(int n) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void setDeivceIDChangeListener(OnDeviceIDChangeListener onDeviceIDChangeListener) {
    }

    private static native void native_updateDeviceState(JNIDeviceEvent var0, int var1);

    public static native void native_updateSystemState(JNISystemEvent var0);

    private static native int native_registerDevice();

    private static native void native_unregisterDevice(int var0);

    private static native void native_pushFlyForbidStatus(int var0, byte[] var1, int var2);

    private static native void native_pushWhiteListState(int var0, byte[] var1, int var2);

    private static native void native_setUploadGPSAndUserIDEnabled(int var0, boolean var1);

    public void setUploadGPSAndUserIDEnabled(boolean bl) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private /* synthetic */ void lambda$setCurrentDeviceId$0(int n) {
    }

    /* synthetic */ JNIFSEventManager(Context context, 1 var2_2) {
    }

    @Keep
    private static class LazyHolder {
        private static final JNIFSEventManager INSTANCE = new JNIFSEventManager(ContextUtil.getContext(), null);

        private LazyHolder() {
        }

        static /* synthetic */ JNIFSEventManager access$100() {
            return null;
        }
    }

    @Keep
    public static final class JNIDeviceEvent
    extends Enum<JNIDeviceEvent>
    implements IJNICommonEnum {
        public static final /* enum */ JNIDeviceEvent DeviceConnectedStateChange = new JNIDeviceEvent(0);
        public static final /* enum */ JNIDeviceEvent DeviceLocationChange = new JNIDeviceEvent(1);
        public static final /* enum */ JNIDeviceEvent DeviceRCModeStateChange = new JNIDeviceEvent(2);
        public static final /* enum */ JNIDeviceEvent DeviceSerialNumberChange = new JNIDeviceEvent(3);
        public static final /* enum */ JNIDeviceEvent DeviceMotorOnStateChange = new JNIDeviceEvent(4);
        public static final /* enum */ JNIDeviceEvent DeviceSupportDynamicDBStateChange = new JNIDeviceEvent(5);
        public static final /* enum */ JNIDeviceEvent DeviceUseDJIFlightDBStateChange = new JNIDeviceEvent(6);
        public static final /* enum */ JNIDeviceEvent DeviceTakeOffFailedInFlyLimitZone = new JNIDeviceEvent(7);
        public static final /* enum */ JNIDeviceEvent DeviceUnlockAreaIdsStateChange = new JNIDeviceEvent(8);
        public static final /* enum */ JNIDeviceEvent DeviceMCProtocolVersionChange = new JNIDeviceEvent(9);
        public static final /* enum */ JNIDeviceEvent DeviceModeStateChange = new JNIDeviceEvent(10);
        public static final /* enum */ JNIDeviceEvent DeviceLicenseUnlockStateChange = new JNIDeviceEvent(11);
        public static final /* enum */ JNIDeviceEvent DeviceGEOSupportChange = new JNIDeviceEvent(12);
        public static final /* enum */ JNIDeviceEvent DeviceTFRDataTypeChange = new JNIDeviceEvent(13);
        int mValue;
        private static final /* synthetic */ JNIDeviceEvent[] $VALUES;

        public static JNIDeviceEvent[] values() {
            return null;
        }

        public static JNIDeviceEvent valueOf(String string) {
            return null;
        }

        private JNIDeviceEvent(int n2) {
        }

        @Override
        public int getValue() {
            return 0;
        }

        private static /* synthetic */ JNIDeviceEvent[] $values() {
            return null;
        }

        static {
            $VALUES = JNIDeviceEvent.$values();
        }
    }

    @Keep
    public static final class JNISystemEvent
    extends Enum<JNISystemEvent>
    implements IJNICommonEnum {
        public static final /* enum */ JNISystemEvent NetworkingChanged = new JNISystemEvent(0);
        public static final /* enum */ JNISystemEvent PhoneLocationChanged = new JNISystemEvent(1);
        public static final /* enum */ JNISystemEvent AccountChanged = new JNISystemEvent(2);
        public static final /* enum */ JNISystemEvent CountryCodeChanged = new JNISystemEvent(3);
        public static final /* enum */ JNISystemEvent ProductChanged = new JNISystemEvent(4);
        int mValue;
        private static final /* synthetic */ JNISystemEvent[] $VALUES;

        public static JNISystemEvent[] values() {
            return null;
        }

        public static JNISystemEvent valueOf(String string) {
            return null;
        }

        private JNISystemEvent(int n2) {
        }

        @Override
        public int getValue() {
            return 0;
        }

        private static /* synthetic */ JNISystemEvent[] $values() {
            return null;
        }

        static {
            $VALUES = JNISystemEvent.$values();
        }
    }

    public static interface OnDeviceUnregisterListener {
        public void onUnregisterFinished(boolean var1);
    }

    public static interface OnDeviceRegisterListener {
        public void onRegisterFinished(int var1);
    }
}

