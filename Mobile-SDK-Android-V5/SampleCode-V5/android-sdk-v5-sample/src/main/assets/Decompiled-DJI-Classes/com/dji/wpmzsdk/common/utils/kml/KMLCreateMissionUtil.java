/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  kotlin.Metadata
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.Regex
 *  kotlin.text.StringsKt
 *  org.dom4j.Document
 *  org.dom4j.Element
 *  org.dom4j.io.SAXReader
 *  org.jetbrains.annotations.NotNull
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.util.Log;
import com.dji.industry.pilot.missionflight.library.MissionImportParams;
import com.dji.wpmzsdk.common.utils.DJIGpsUtils;
import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.GpsUtils;
import com.dji.wpmzsdk.common.utils.kml.KMLException;
import com.dji.wpmzsdk.common.utils.kml.KMLValueConverter;
import com.dji.wpmzsdk.common.utils.kml.MappingUtils;
import com.dji.wpmzsdk.common.utils.kml.SettingUtils;
import com.dji.wpmzsdk.common.utils.kml.StripUtils;
import com.dji.wpmzsdk.common.utils.kml.data.MissionImportHeightMode;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.MissionInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.EdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.MappingMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripEdgePointModel;
import com.dji.wpmzsdk.common.utils.kml.model.StripMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0016\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002J\u0014\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0002J\u001a\u0010\u0018\u001a\u00020\u00192\b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001a\u001a\u00020\u0012H\u0002J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002J\u0018\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0004H\u0002J\u0018\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u0010H\u0002J$\u0010 \u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u001a\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0002\u00a8\u0006!"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/KMLCreateMissionUtil;", "", "()V", "createMappingMission", "Lcom/dji/wpmzsdk/common/utils/kml/model/MappingMissionModel;", "kml", "Lorg/dom4j/Document;", "name", "", "type", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionType;", "createMission", "params", "Lcom/dji/industry/pilot/missionflight/library/MissionImportParams;", "path", "createStripMission", "Lcom/dji/wpmzsdk/common/utils/kml/model/StripMissionModel;", "createWaypointMission", "Lcom/dji/wpmzsdk/common/utils/kml/model/WaypointMissionModel;", "heightMode", "Lcom/dji/wpmzsdk/common/utils/kml/data/MissionImportHeightMode;", "getWaylinePointsElement", "Lorg/dom4j/Element;", "element", "injectHeightMode", "", "waypointMissionModel", "isAbsoluteHeight", "", "parseMappingPointsData", "model", "parseStripPointsData", "parseWaylineData", "wpmzsdk_release"})
public final class KMLCreateMissionUtil {
    @NotNull
    public final Object createMission(@NotNull MissionImportParams params, @NotNull String path) {
        Cloneable cloneable;
        Intrinsics.checkNotNullParameter((Object)params, (String)"params");
        Intrinsics.checkNotNullParameter((Object)path, (String)"path");
        int suffixIndex = StringsKt.lastIndexOf$default((CharSequence)path, (char)'.', (int)0, (boolean)false, (int)6, null);
        if (suffixIndex < 0) {
            throw new KMLException("mission_kml_non_kml_file");
        }
        SAXReader saxReader = new SAXReader();
        String kmlPath = path;
        File f = new File(kmlPath);
        String string = kmlPath.substring(StringsKt.lastIndexOf$default((CharSequence)kmlPath, (char)'.', (int)0, (boolean)false, (int)6, null));
        Intrinsics.checkNotNullExpressionValue((Object)string, (String)"this as java.lang.String).substring(startIndex)");
        if (KMLValueConverter.equals(string, ".kml")) {
            CharSequence charSequence = f.getName();
            Intrinsics.checkNotNullExpressionValue((Object)charSequence, (String)"f.name");
            String string2 = f.getName();
            Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"f.name");
            String string3 = charSequence.substring(0, StringsKt.lastIndexOf$default((CharSequence)string2, (String)".", (int)0, (boolean)false, (int)6, null));
            Intrinsics.checkNotNullExpressionValue((Object)string3, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
            String name = string3;
            charSequence = name;
            string = new Regex("[ _`~!@#$%^&*()+=|{}':;',\\[\\]\\\\.<>/?~\uff01@#\uffe5%\u2026\u2026&*\uff08\uff09\"\u2014\u2014+|{}\u3010\u3011\u2018\uff1b\uff1a\u201d\u201c\u2019\u3002\uff0c\u3001\uff1f]|\n|\r|\t");
            string2 = "";
            name = string.replace(charSequence, string2);
            MissionType type = params.getMissionType();
            if (type == MissionType.Waypoint) {
                string = saxReader.read(f);
                Intrinsics.checkNotNullExpressionValue((Object)string, (String)"saxReader.read(f)");
                cloneable = this.createWaypointMission((Document)string, name, params.getHeightMode());
            } else if (type == MissionType.Strip) {
                string = saxReader.read(f);
                Intrinsics.checkNotNullExpressionValue((Object)string, (String)"saxReader.read(f)");
                cloneable = this.createStripMission((Document)string, name);
            } else {
                string = saxReader.read(f);
                Intrinsics.checkNotNullExpressionValue((Object)string, (String)"saxReader.read(f)");
                MissionType missionType = type;
                Intrinsics.checkNotNull((Object)((Object)missionType));
                cloneable = this.createMappingMission((Document)string, name, missionType);
            }
        } else {
            throw new KMLException("mission_kml_non_kml_file");
        }
        return cloneable;
    }

    private final WaypointMissionModel createWaypointMission(Document kml, String name, MissionImportHeightMode heightMode) {
        Element document = kml.getRootElement().element("Document");
        if (document == null || this.getWaylinePointsElement(document) == null) {
            throw new KMLException("mission_list_type_wrong");
        }
        String missionName = name;
        if (name.length() > 60) {
            String string = name.substring(0, 60);
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
            missionName = string;
        }
        WaypointMissionModel waypointMissionModel = SettingUtils.createWaypointMissionModel(missionName);
        MissionInfoModel missionInfoModel = waypointMissionModel.getMissionInfo();
        missionInfoModel.getExtInfo().setCreateByKml(true);
        Element waylineEle = this.getWaylinePointsElement(document);
        Intrinsics.checkNotNullExpressionValue((Object)waypointMissionModel, (String)"waypointMissionModel");
        this.parseWaylineData(waylineEle, waypointMissionModel, heightMode);
        this.injectHeightMode(heightMode, waypointMissionModel);
        return waypointMissionModel;
    }

    private final Element getWaylinePointsElement(Element element) {
        if (element == null) {
            return null;
        }
        for (Element placeMarker : element.elements()) {
            Element lineEle;
            if (!Intrinsics.areEqual((Object)placeMarker.getName(), (Object)"Placemark") || (lineEle = placeMarker.element("LineString")) == null) continue;
            return placeMarker;
        }
        return null;
    }

    private final void parseWaylineData(Element element, WaypointMissionModel waypointMissionModel, MissionImportHeightMode heightMode) {
        WaylineModel waylineModel = waypointMissionModel.getWayline();
        boolean isEgmHeight = heightMode == MissionImportHeightMode.EGM96;
        List<WaypointModel> points = waypointMissionModel.getWaypoints();
        Element element2 = element;
        Element element3 = element2 == null ? null : element2.element("LineString");
        if (element3 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element lineStringEle = element3;
        Element element4 = lineStringEle.element("coordinates");
        if (element4 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element coordinatesEle = element4;
        CharSequence charSequence = coordinatesEle.getTextTrim();
        Intrinsics.checkNotNullExpressionValue((Object)charSequence, (String)"coordinatesEle.textTrim");
        charSequence = charSequence;
        Regex regex = new Regex(" ");
        int n = 0;
        List locations = regex.split(charSequence, n);
        try {
            int n2 = 0;
            int n3 = locations.size();
            while (n2 < n3) {
                int i = n2++;
                WaypointModel point = SettingUtils.createWaypointModel();
                CharSequence charSequence2 = (CharSequence)locations.get(i);
                Regex regex2 = new Regex(",");
                int n4 = 0;
                List pointCoor = regex2.split(charSequence2, n4);
                double lng = KMLValueConverter.string2Double(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(0)))).toString());
                double lat = KMLValueConverter.string2Double(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(1)))).toString());
                float alt = KMLValueConverter.string2Float(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(2)))).toString());
                if (DJIGpsUtils.isAvailable(lat, lng)) {
                    point.setLatitude(lat);
                    point.setLongitude(lng);
                    if (alt >= -10000.0f && alt <= 10000.0f) {
                        if (heightMode == MissionImportHeightMode.EGM96) {
                            point.setAltitude(alt);
                            point.setWgs84Altitude((float)GpsUtils.wgs84Altitude(alt, lat, lng));
                            point.setUseWaylineAltitude(false);
                        } else if (heightMode == MissionImportHeightMode.WGS84) {
                            point.setWgs84Altitude(alt);
                            point.setAltitude((float)GpsUtils.egm96Altitude(alt, lat, lng));
                            point.setUseWaylineAltitude(false);
                        } else {
                            point.setAltitude(alt);
                            point.setUseWaylineAltitude(alt == 0.0f);
                        }
                    } else {
                        point.setAltitude(100.0f);
                    }
                }
                points.add(point);
            }
            waypointMissionModel.setWaypoints(points);
        }
        catch (NumberFormatException e) {
            Log.e((String)"KMLCreateMission", (String)"mission_list_points_loc_error");
        }
        MissionInfoModel infoModel = waypointMissionModel.getMissionInfo();
        Intrinsics.checkNotNullExpressionValue(points, (String)"points");
        if (!((Collection)points).isEmpty() && infoModel != null) {
            double latitude = points.get(0).getLatitude();
            double longitude = points.get(0).getLongitude();
            infoModel.setLatitude(latitude);
            infoModel.setLongitude(longitude);
            if (heightMode == MissionImportHeightMode.WGS84) {
                waylineModel.setAltitude((float)GpsUtils.egm96Altitude(waylineModel.getAltitude(), latitude, longitude));
            }
        }
    }

    private final void injectHeightMode(MissionImportHeightMode heightMode, WaypointMissionModel waypointMissionModel) {
        if (heightMode != null) {
            waypointMissionModel.getWayline().getDroneInfo().getDroneHeight().setUseAbsolute(this.isAbsoluteHeight(heightMode));
        }
    }

    private final boolean isAbsoluteHeight(MissionImportHeightMode heightMode) {
        boolean bl;
        switch (WhenMappings.$EnumSwitchMapping$0[heightMode.ordinal()]) {
            case 1: 
            case 2: {
                bl = true;
                break;
            }
            case 3: {
                bl = false;
                break;
            }
            default: {
                bl = false;
            }
        }
        return bl;
    }

    private final MappingMissionModel createMappingMission(Document kml, String name, MissionType type) {
        Element element = kml.getRootElement().element("Document");
        if (element == null) {
            throw new KMLException("mission_kml_invalid_format");
        }
        Element document = element;
        String missionName = name;
        if (name.length() > 60) {
            String string = name.substring(0, 60);
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
            missionName = string;
        }
        MappingCameraModel camera = MappingUtils.createMappingCameraModel(MappingCameraType.EP600_35MM);
        MappingMissionModel mappingMissionModel = MappingUtils.createMappingModel(missionName, type, camera, null);
        MissionInfoExtModel extraInfo = new MissionInfoExtModel();
        extraInfo.setCreateByKml(true);
        mappingMissionModel.getMissionInfo().setExtInfo(extraInfo);
        List docElement = document.elements();
        for (Element element2 : docElement) {
            if (!Intrinsics.areEqual((Object)element2.getName(), (Object)"Placemark")) continue;
            Intrinsics.checkNotNullExpressionValue((Object)element2, (String)"element");
            Intrinsics.checkNotNullExpressionValue((Object)mappingMissionModel, (String)"mappingMissionModel");
            this.parseMappingPointsData(element2, mappingMissionModel);
        }
        if (mappingMissionModel.getEdgePoints() == null || mappingMissionModel.getEdgePoints().isEmpty()) {
            throw new KMLException("mission_kml_invalid_format");
        }
        Intrinsics.checkNotNullExpressionValue((Object)mappingMissionModel, (String)"mappingMissionModel");
        return mappingMissionModel;
    }

    private final void parseMappingPointsData(Element element, MappingMissionModel model) {
        Element element2 = element.element("Polygon");
        if (element2 == null) {
            throw new KMLException("mission_list_type_wrong");
        }
        Element polygonEle = element2;
        Element element3 = polygonEle.element("outerBoundaryIs");
        if (element3 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element outerBoundaryEle = element3;
        Element element4 = outerBoundaryEle.element("LinearRing");
        if (element4 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element linearRingEle = element4;
        Element element5 = linearRingEle.element("coordinates");
        if (element5 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element coordinatesEle = element5;
        List points = new ArrayList();
        CharSequence charSequence = coordinatesEle.getTextTrim();
        Intrinsics.checkNotNullExpressionValue((Object)charSequence, (String)"coordinatesEle.textTrim");
        charSequence = charSequence;
        Regex regex = new Regex(" ");
        int n = 0;
        List locations = regex.split(charSequence, n);
        try {
            Iterable $this$forEach$iv = locations;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                String location = (String)element$iv;
                boolean bl = false;
                EdgePointModel point = new EdgePointModel();
                CharSequence charSequence2 = location;
                Regex regex2 = new Regex(",");
                int n2 = 0;
                List pointCoor = regex2.split(charSequence2, n2);
                double lng = KMLValueConverter.string2Double(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(0)))).toString());
                double lat = KMLValueConverter.string2Double(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(1)))).toString());
                if (!DJIGpsUtils.isAvailable(lat, lng)) continue;
                point.setLatitude(lat);
                point.setLongitude(lng);
                points.add(point);
            }
            model.setEdgePoints(points);
        }
        catch (NumberFormatException e) {
            Log.e((String)"KMLCreateMission", (String)"EDGE_POINTS_LOCATION params is illegal.");
        }
        MissionInfoModel missionInfoModel = model.getMissionInfo();
        Intrinsics.checkNotNullExpressionValue((Object)missionInfoModel, (String)"model.missionInfo");
        MissionInfoModel infoModel = missionInfoModel;
        if (!((Collection)points).isEmpty()) {
            Object e = points.get(0);
            Intrinsics.checkNotNull(e);
            infoModel.setLatitude(((EdgePointModel)e).getLatitude());
            Object e2 = points.get(0);
            Intrinsics.checkNotNull(e2);
            infoModel.setLongitude(((EdgePointModel)e2).getLongitude());
        }
    }

    private final StripMissionModel createStripMission(Document kml, String name) {
        Element element = kml.getRootElement().element("Document");
        if (element == null) {
            throw new KMLException("mission_kml_invalid_format");
        }
        Element document = element;
        String missionName = name;
        if (name.length() > 60) {
            String string = name.substring(0, 60);
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"this as java.lang.String\u2026ing(startIndex, endIndex)");
            missionName = string;
        }
        MappingCameraModel camera = StripUtils.createStripCameraModel(MappingCameraType.EP600_35MM);
        StripMissionModel stripMissionModel = StripUtils.createStripModel(missionName, MissionType.Strip, camera);
        MissionInfoExtModel extraInfo = new MissionInfoExtModel();
        extraInfo.setCreateByKml(true);
        stripMissionModel.getMissionInfo().setExtInfo(extraInfo);
        List docElement = document.elements();
        for (Element element2 : docElement) {
            Element type;
            if (Intrinsics.areEqual((Object)element2.getName(), (Object)"Placemark")) {
                Intrinsics.checkNotNullExpressionValue((Object)element2, (String)"element");
                Intrinsics.checkNotNullExpressionValue((Object)stripMissionModel, (String)"stripMissionModel");
                this.parseStripPointsData(element2, stripMissionModel);
                continue;
            }
            if (!Intrinsics.areEqual((Object)element2.getName(), (Object)"ExtendedData") || (type = element2.element("type")) == null || KMLValueConverter.getMissionType(type.getTextTrim()) == MissionType.Strip) continue;
            throw new KMLException("mission_list_type_wrong");
        }
        if (stripMissionModel.getEdgePoints() == null || stripMissionModel.getEdgePoints().isEmpty()) {
            throw new KMLException("mission_kml_invalid_format");
        }
        Intrinsics.checkNotNullExpressionValue((Object)stripMissionModel, (String)"stripMissionModel");
        return stripMissionModel;
    }

    private final void parseStripPointsData(Element element, StripMissionModel model) {
        Element element2 = element.element("LineString");
        if (element2 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element lineStringEle = element2;
        Element element3 = lineStringEle.element("coordinates");
        if (element3 == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element coordinatesEle = element3;
        List edgePoints = new ArrayList();
        CharSequence charSequence = coordinatesEle.getTextTrim();
        Intrinsics.checkNotNullExpressionValue((Object)charSequence, (String)"coordinatesEle.textTrim");
        charSequence = charSequence;
        Regex regex = new Regex(" ");
        int n = 0;
        List locations = regex.split(charSequence, n);
        try {
            Iterable $this$forEach$iv = locations;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                String location = (String)element$iv;
                boolean bl = false;
                StripEdgePointModel point = new StripEdgePointModel();
                CharSequence charSequence2 = location;
                Regex regex2 = new Regex(",");
                int n2 = 0;
                List pointCoor = regex2.split(charSequence2, n2);
                double lng = KMLValueConverter.string2Double(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(0)))).toString());
                double lat = KMLValueConverter.string2Double(((Object)StringsKt.trim((CharSequence)((String)pointCoor.get(1)))).toString());
                if (!DJIGpsUtils.isAvailable(lat, lng)) continue;
                point.setLatitude(lat);
                point.setLongitude(lng);
                edgePoints.add(point);
            }
            model.setEdgePoints(edgePoints);
        }
        catch (NumberFormatException e) {
            Log.e((String)"KMLCreateMission", (String)"mission_list_points_loc_error");
        }
        MissionInfoModel infoModel = model.getMissionInfo();
        if (CollectionUtil.isNotEmpty(edgePoints) && infoModel != null) {
            Object e = edgePoints.get(0);
            Intrinsics.checkNotNull(e);
            infoModel.setLatitude(((StripEdgePointModel)e).getLatitude());
            Object e2 = edgePoints.get(0);
            Intrinsics.checkNotNull(e2);
            infoModel.setLongitude(((StripEdgePointModel)e2).getLongitude());
        }
    }

    @Metadata(mv={1, 6, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[MissionImportHeightMode.values().length];
            nArray[MissionImportHeightMode.WGS84.ordinal()] = 1;
            nArray[MissionImportHeightMode.EGM96.ordinal()] = 2;
            nArray[MissionImportHeightMode.RELATIVE.ordinal()] = 3;
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

