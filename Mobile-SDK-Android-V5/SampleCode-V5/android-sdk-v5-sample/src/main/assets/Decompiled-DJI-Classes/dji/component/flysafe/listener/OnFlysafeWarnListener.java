/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Nullable
 */
package dji.component.flysafe.listener;

import androidx.annotation.Nullable;
import dji.component.flysafe.model.FlyfrbStepInfo;
import dji.component.flysafe.model.JNIWarnModelWrappers;
import dji.csdk.flysafe.NFZType;
import dji.csdk.flysafe.RTHTipsEventType;
import dji.jni.JNIProguardKeepTag;

public interface OnFlysafeWarnListener
extends JNIProguardKeepTag {
    public void onNormalAlert(JNIWarnModelWrappers.ShowWarningWrapper var1);

    public void onNormalTip(JNIWarnModelWrappers.ShowTipsWrapper var1);

    public void onCDLandWarning(JNIWarnModelWrappers.ShowCDLWarningWrapper var1);

    public void onShowNFZType(@Nullable NFZType var1);

    public void notifyRTHType(RTHTipsEventType var1);

    public void OnChinaAirportStateChanged(JNIWarnModelWrappers.AirportWarningAreaTakeoffState var1);

    public void OnTFRStepChanged(FlyfrbStepInfo var1);

    public static class OnFlysafeWarnListenerAdapter
    implements OnFlysafeWarnListener {
        @Override
        public void onNormalAlert(JNIWarnModelWrappers.ShowWarningWrapper showWarningWrapper) {
        }

        @Override
        public void onNormalTip(JNIWarnModelWrappers.ShowTipsWrapper showTipsWrapper) {
        }

        @Override
        public void onCDLandWarning(JNIWarnModelWrappers.ShowCDLWarningWrapper showCDLWarningWrapper) {
        }

        @Override
        public void onShowNFZType(@Nullable NFZType nFZType) {
        }

        @Override
        public void OnChinaAirportStateChanged(JNIWarnModelWrappers.AirportWarningAreaTakeoffState airportWarningAreaTakeoffState) {
        }

        @Override
        public void OnTFRStepChanged(FlyfrbStepInfo flyfrbStepInfo) {
        }

        @Override
        public void notifyRTHType(RTHTipsEventType rTHTipsEventType) {
        }
    }
}

