/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  kotlin.Unit
 */
package dji.v5.manager.aircraft.upgrade;

import androidx.annotation.NonNull;
import dji.upgrade.UpgradeError;
import dji.upgrade.component.firmware.UpgradeComponent;
import dji.upgrade.generate.ImageType;
import dji.v5.common.callback.CommonCallbacks;
import dji.v5.manager.aircraft.upgrade.model.ComponentType;
import dji.v5.manager.aircraft.upgrade.model.FirmwareInformation;
import dji.v5.manager.aircraft.upgrade.model.UpgradeableComponentState;
import java.util.ArrayList;
import kotlin.Unit;

public class UpgradeableComponent {
    private UpgradeComponent internalUpgradeComponent;
    private ComponentType componentType;
    private FirmwareInformation firmwareInformation;
    private FirmwareInformation latestFirmwareInformation;
    private UpgradeableComponentState state;

    public ComponentType getComponentType() {
        return null;
    }

    public UpgradeableComponentState getState() {
        return null;
    }

    public FirmwareInformation getFirmwareInformation() {
        return null;
    }

    public FirmwareInformation getLatestFirmwareInformation() {
        return null;
    }

    public UpgradeableComponent(@NonNull UpgradeComponent upgradeComponent) {
    }

    protected void fetchInfo(CommonCallbacks.CompletionCallbackWithParam<ComponentType> completionCallbackWithParam) {
    }

    private void fetchServerInfo(ImageType imageType, CommonCallbacks.CompletionCallbackWithParam<ComponentType> completionCallbackWithParam) {
    }

    private void fetchServerInfo(CommonCallbacks.CompletionCallbackWithParam<ComponentType> completionCallbackWithParam) {
    }

    protected UpgradeComponent getInternalUpgradeComponent() {
        return null;
    }

    private /* synthetic */ Unit lambda$fetchServerInfo$1(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, UpgradeError upgradeError, ArrayList arrayList) {
        return null;
    }

    private /* synthetic */ Unit lambda$fetchServerInfo$0(ImageType imageType, CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, UpgradeError upgradeError, ArrayList arrayList) {
        return null;
    }

    static /* synthetic */ FirmwareInformation access$000(UpgradeableComponent upgradeableComponent) {
        return null;
    }

    static /* synthetic */ void access$100(UpgradeableComponent upgradeableComponent, ImageType imageType, CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam) {
    }

    static /* synthetic */ void access$200(UpgradeableComponent upgradeableComponent, CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam) {
    }
}

