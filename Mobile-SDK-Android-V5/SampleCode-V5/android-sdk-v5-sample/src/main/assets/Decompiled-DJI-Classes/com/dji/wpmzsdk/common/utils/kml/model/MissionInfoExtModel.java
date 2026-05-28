/*
 * Decompiled with CFR 0.152.
 */
package com.dji.wpmzsdk.common.utils.kml.model;

import com.dji.wpmzsdk.common.utils.kml.mission.MissionCreateType;

public class MissionInfoExtModel {
    private int createType;
    private boolean createByKml;
    private boolean terraMapping;
    private int terraCameraType;

    public MissionCreateType getCreateType() {
        return MissionCreateType.find(this.createType);
    }

    public void setCreateType(MissionCreateType type) {
        this.createType = type.getValue();
    }

    public void setCreateType(int createType) {
        this.createType = createType;
    }

    public boolean isCreateByKml() {
        return this.createByKml;
    }

    public void setCreateByKml(boolean createByKml) {
        this.createByKml = createByKml;
    }

    public boolean isTerraMapping() {
        return this.terraMapping;
    }

    public void setTerraMapping(boolean terraMapping) {
        this.terraMapping = terraMapping;
    }

    public int getTerraCameraType() {
        return this.terraCameraType;
    }

    public void setTerraCameraType(int terraCameraType) {
        this.terraCameraType = terraCameraType;
    }
}

