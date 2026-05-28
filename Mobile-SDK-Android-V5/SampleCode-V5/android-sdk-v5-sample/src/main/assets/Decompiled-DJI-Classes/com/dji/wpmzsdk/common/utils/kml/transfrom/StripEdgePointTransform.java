/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.transfrom;

import com.dji.wpmzsdk.common.utils.kml.model.StripEdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.transfrom.ModelTransform;
import dji.sdk.wpmz.value.mission.WaylineLocationCoordinate3D;
import java.util.ArrayList;
import java.util.List;

public class StripEdgePointTransform
implements ModelTransform<List<StripEdgePointModel>, List<WaylineLocationCoordinate3D>> {
    @Override
    public List<WaylineLocationCoordinate3D> transFrom(List<StripEdgePointModel> points) {
        ArrayList<WaylineLocationCoordinate3D> edgePoint = new ArrayList<WaylineLocationCoordinate3D>();
        for (StripEdgePointModel item : points) {
            WaylineLocationCoordinate3D location = new WaylineLocationCoordinate3D();
            location.setLatitude(item.getLatitude());
            location.setLongitude(item.getLongitude());
            edgePoint.add(location);
        }
        return edgePoint;
    }

    @Override
    public List<StripEdgePointModel> transTo(List<WaylineLocationCoordinate3D> points) {
        ArrayList<StripEdgePointModel> edgePointModels = new ArrayList<StripEdgePointModel>();
        for (WaylineLocationCoordinate3D item : points) {
            StripEdgePointModel edgePoint = new StripEdgePointModel();
            edgePoint.setLatitude(item.getLatitude());
            edgePoint.setLongitude(item.getLongitude());
            edgePointModels.add(edgePoint);
        }
        return edgePointModels;
    }
}

