/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.data;

import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.model.CameraType;
import com.dji.wpmzsdk.common.utils.kml.model.CameraUtil;
import com.dji.wpmzsdk.common.utils.kml.model.DroneCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.DroneHeightModel;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointDroneType;
import java.util.ArrayList;
import java.util.List;

public class DroneInfoModel
implements Cloneable {
    private Long id;
    private WaypointDroneType droneType;
    private List<DroneCameraModel> cameras = new ArrayList<DroneCameraModel>();
    private DroneHeightModel droneHeight = new DroneHeightModel();

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WaypointDroneType getDroneType() {
        return this.droneType;
    }

    public void setDroneType(WaypointDroneType droneType) {
        this.droneType = droneType;
    }

    public void setDroneCamera(List<DroneCameraModel> cameraList) {
        this.cameras.clear();
        if (cameraList != null) {
            this.cameras.addAll(cameraList);
        }
    }

    public DroneHeightModel getDroneHeight() {
        return this.droneHeight;
    }

    public void setDroneHeight(DroneHeightModel droneHeight) {
        this.droneHeight = droneHeight;
    }

    public List<DroneCameraModel> getCameras() {
        return this.cameras;
    }

    public DroneCameraModel getCamera(int index) {
        for (DroneCameraModel item : this.cameras) {
            if (item.getCameraIndex() != index) continue;
            return item;
        }
        return null;
    }

    public void changeCamera(int index, DroneCameraModel model) {
        for (DroneCameraModel item : this.cameras) {
            if (item.getCameraIndex() != index) continue;
            this.cameras.remove(item);
            break;
        }
        this.cameras.add(model);
    }

    public void switchCamera(int fromIndex, int toIndex) {
        for (DroneCameraModel item : this.cameras) {
            if (item.getCameraIndex() == fromIndex) {
                item.setCameraIndex(toIndex);
                continue;
            }
            if (item.getCameraIndex() != toIndex) continue;
            item.setCameraIndex(fromIndex);
        }
    }

    public void deleteCamera(int index) {
        for (DroneCameraModel item : this.cameras) {
            if (item.getCameraIndex() != index) continue;
            this.cameras.remove(item);
            break;
        }
    }

    public boolean hasEP800Camera() {
        for (DroneCameraModel item : this.cameras) {
            if (item.getPayloadCameraType() != PayloadCameraType.EP800.value()) continue;
            return true;
        }
        return false;
    }

    public boolean supportPreciseShot() {
        for (DroneCameraModel item : this.cameras) {
            if (!CameraUtil.isSupportPreciseShot(CameraType.find(item.getCameraType()))) continue;
            return true;
        }
        return false;
    }

    public DroneInfoModel clone() {
        DroneInfoModel model = null;
        try {
            model = (DroneInfoModel)super.clone();
        }
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        model.cameras = CollectionUtil.transform(this.cameras, DroneCameraModel::clone);
        if (this.droneHeight != null) {
            model.droneHeight = this.droneHeight.clone();
        }
        return model;
    }
}

