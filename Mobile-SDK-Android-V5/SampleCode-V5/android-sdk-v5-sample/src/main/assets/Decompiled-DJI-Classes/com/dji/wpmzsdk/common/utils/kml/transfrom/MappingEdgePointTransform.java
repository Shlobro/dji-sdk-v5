/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.EdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import java.util.ArrayList;
import java.util.List;

public class MappingEdgePointTransform
implements ModelTransform<List<EdgePointModel>, List<WaylineLocationCoordinate3D>> {
    @Override
    public List<WaylineLocationCoordinate3D> transFrom(List<EdgePointModel> points) {
        ArrayList<WaylineLocationCoordinate3D> edgePoint = new ArrayList<WaylineLocationCoordinate3D>();
        for (EdgePointModel item : points) {
            WaylineLocationCoordinate3D location = new WaylineLocationCoordinate3D();
            location.setLatitude(item.getLatitude());
            location.setLongitude(item.getLongitude());
            edgePoint.add(location);
        }
        return edgePoint;
    }

    @Override
    public List<EdgePointModel> transTo(List<WaylineLocationCoordinate3D> points) {
        ArrayList<EdgePointModel> edgePointModels = new ArrayList<EdgePointModel>();
        for (WaylineLocationCoordinate3D item : points) {
            EdgePointModel edgePoint = new EdgePointModel();
            edgePoint.setLatitude(item.getLatitude());
            edgePoint.setLongitude(item.getLongitude());
            edgePointModels.add(edgePoint);
        }
        return edgePointModels;
    }
}

