/*
 * Decompiled with CFR 0.152.
 */
package dji.sdk.keyvalue.msdkkeyinfo;

import dji.sdk.keyvalue.key.MSDKKeyInfo;
import dji.sdk.keyvalue.value.KeyParam;
import dji.sdk.keyvalue.value.camera.CameraStorageInfo;
import dji.sdk.keyvalue.value.camera.CameraStorageInfos;
import dji.sdk.keyvalue.value.camera.CameraStorageLocation;
import dji.sdk.keyvalue.value.camera.CameraStorageState;
import dji.sdk.keyvalue.value.camera.CameraStorageStateMsg;
import dji.v5.common.callback.CommonCallbacks;
import java.util.List;

public class KeyCameraStorageInfo
extends MSDKKeyInfo<CameraStorageInfos> {
    @Override
    public CameraStorageInfos getValue(KeyParam keyParam) {
        return null;
    }

    @Override
    public void getValue(CommonCallbacks.CompletionCallbackWithParam<CameraStorageInfos> completionCallbackWithParam, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, CommonCallbacks.KeyListener<CameraStorageInfos> keyListener, KeyParam keyParam) {
    }

    @Override
    public void listen(Object object, boolean bl, CommonCallbacks.KeyListener<CameraStorageInfos> keyListener, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(Object object, KeyParam keyParam) {
    }

    @Override
    public void cancelListen(KeyParam keyParam) {
    }

    private CameraStorageInfos getCameraStorageInfos(CameraStorageStateMsg cameraStorageStateMsg, KeyParam keyParam) {
        return null;
    }

    private List<CameraStorageInfo> getCameraStorageInfoList(List<CameraStorageState> list, KeyParam keyParam) {
        return null;
    }

    private int getAvailablePhotoCount(KeyParam keyParam, CameraStorageLocation cameraStorageLocation) {
        return 0;
    }

    private int getAvailableVideoDuration(KeyParam keyParam, CameraStorageLocation cameraStorageLocation) {
        return 0;
    }

    private CameraStorageInfos getCameraStorageInfosForL1(int n, int n2, boolean bl, int n3, int n4) {
        return null;
    }

    private static boolean isL1Camera(int n) {
        return false;
    }

    private static boolean isPayloadCamera(int n) {
        return false;
    }

    private /* synthetic */ void lambda$listen$3(CommonCallbacks.KeyListener keyListener, KeyParam keyParam, CameraStorageStateMsg cameraStorageStateMsg, CameraStorageStateMsg cameraStorageStateMsg2) {
    }

    private static /* synthetic */ void lambda$listen$2(CommonCallbacks.KeyListener keyListener, CameraStorageInfos cameraStorageInfos) throws Throwable {
    }

    private static /* synthetic */ void lambda$getValue$1(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, Throwable throwable) throws Throwable {
    }

    private static /* synthetic */ void lambda$getValue$0(CommonCallbacks.CompletionCallbackWithParam completionCallbackWithParam, CameraStorageInfos cameraStorageInfos) throws Throwable {
    }

    static /* synthetic */ CameraStorageInfos access$000(KeyCameraStorageInfo keyCameraStorageInfo, CameraStorageStateMsg cameraStorageStateMsg, KeyParam keyParam) {
        return null;
    }
}

