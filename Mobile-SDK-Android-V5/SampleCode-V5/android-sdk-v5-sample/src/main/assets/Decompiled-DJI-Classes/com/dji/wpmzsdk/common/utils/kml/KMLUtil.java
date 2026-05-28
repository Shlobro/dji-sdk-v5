/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.util.Log
 *  org.dom4j.Attribute
 *  org.dom4j.Document
 *  org.dom4j.DocumentException
 *  org.dom4j.Element
 *  org.dom4j.io.SAXReader
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.dji.industry.pilot.data.cache.model.EdgePointModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingCameraModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.MappingWaylineModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripMissionModelGreenDao;
import com.dji.industry.pilot.data.cache.model.StripWaylineModelGreenDao;
import com.dji.industry.pilot.data.cache.model.WaypointActionModelGreenDao;
import com.dji.industry.pilot.missionflight.library.MissionImportParams;
import com.dji.wpmzsdk.common.utils.DJIGpsUtils;
import com.dji.wpmzsdk.common.utils.FileUtils;
import com.dji.wpmzsdk.common.utils.KMLZipHelper;
import com.dji.wpmzsdk.common.utils.PPalGenerator;
import com.dji.wpmzsdk.common.utils.kml.CollectionUtil;
import com.dji.wpmzsdk.common.utils.kml.GpsUtils;
import com.dji.wpmzsdk.common.utils.kml.KMLException;
import com.dji.wpmzsdk.common.utils.kml.KMLFileParseInfo;
import com.dji.wpmzsdk.common.utils.kml.KMLMappingGreenDaoCreateUtilKt;
import com.dji.wpmzsdk.common.utils.kml.KMLStripGreenDaoCreateUtilKt;
import com.dji.wpmzsdk.common.utils.kml.KMLValueConverter;
import com.dji.wpmzsdk.common.utils.kml.KMLWaypointEntityCreateUtilKt;
import com.dji.wpmzsdk.common.utils.kml.MappingUtils;
import com.dji.wpmzsdk.common.utils.kml.NumberUtils;
import com.dji.wpmzsdk.common.utils.kml.converter.KMZPathWrapper;
import com.dji.wpmzsdk.common.utils.kml.converter.MissionGreenDaoTransform;
import com.dji.wpmzsdk.common.utils.kml.converter.WaylineConverter;
import com.dji.wpmzsdk.common.utils.kml.data.DroneInfoModel;
import com.dji.wpmzsdk.common.utils.kml.data.MissionImportHeightMode;
import com.dji.wpmzsdk.common.utils.kml.data.MissionType;
import com.dji.wpmzsdk.common.utils.kml.mission.RTKReferenceStationSource;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionGotoWaypointMode;
import com.dji.wpmzsdk.common.utils.kml.mission.WaypointMissionHeadingMode;
import com.dji.wpmzsdk.common.utils.kml.model.DroneCameraModel;
import com.dji.wpmzsdk.common.utils.kml.model.DroneHeightModel;
import com.dji.wpmzsdk.common.utils.kml.model.MappingCameraType;
import com.dji.wpmzsdk.common.utils.kml.model.MappingMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoExtModel;
import com.dji.wpmzsdk.common.utils.kml.model.MissionInfoModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadConfigInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.PayloadInfoModel;
import com.dji.wpmzsdk.common.utils.kml.model.PreciseShotInfo;
import com.dji.wpmzsdk.common.utils.kml.model.StripMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaylineModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointActionType;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointMissionModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModel;
import com.dji.wpmzsdk.common.utils.kml.model.WaypointModelGreenDao;
import com.dji.wpmzsdk.common.utils.kml.transfrom.MissionTransformData;
import dji.sdk.wpmz.jni.JNIWPMZManager;
import dji.sdk.wpmz.value.mission.Wayline;
import dji.sdk.wpmz.value.mission.WaylineExecuteMissionConfig;
import dji.sdk.wpmz.value.mission.WaylineTemplate;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class KMLUtil {
    private static final String TAG = "KMLUtil";
    public static final float MAX_SPEED = 15.0f;
    public static final int MIN_HEADING = -180;
    public static final int MAX_HEADING = 180;
    public static final String VERSION = "1.0.4";
    private static Context context;
    public static final String CACHE_PATH = "/sdcard/DJI/com.dji.wpmzsdk/CACHE_IMAGE";
    public static final String PATH = "/sdcard/DJI/com.dji.wpmzsdk/KML";
    public static final String ILLEGAL_EX = "[ _`~!@#$%^&*()+=|{}':;',\\[\\]\\\\.<>/?~\uff01@#\uffe5%\u2026\u2026&*\uff08\uff09\"\u2014\u2014+|{}\u3010\u3011\u2018\uff1b\uff1a\u201d\u201c\u2019\u3002\uff0c\u3001\uff1f]|\n|\r|\t";
    public static final Pattern ILLEGAL_PATTERN;

    public static KMLFileParseInfo getKMLType(String path) {
        if (KMLValueConverter.equals(path.substring(path.lastIndexOf(46)), ".kml")) {
            return KMLUtil.parseKMLFile(path);
        }
        if (KMLValueConverter.equals(path.substring(path.lastIndexOf(46)), ".zip")) {
            return new KMLFileParseInfo(KMLFileParseInfo.KMLFileType.MISSION);
        }
        return new KMLFileParseInfo(KMLFileParseInfo.KMLFileType.UNKNOWN);
    }

    public static void setContext(Context ctx) {
        context = ctx;
    }

    private static KMLFileParseInfo parseKMLFile(String path) {
        Document kmlDocument;
        SAXReader saxReader = new SAXReader();
        File file = new File(path);
        try {
            kmlDocument = saxReader.read(file);
        }
        catch (DocumentException e) {
            return new KMLFileParseInfo(KMLFileParseInfo.KMLFileType.UNKNOWN);
        }
        Element document = kmlDocument.getRootElement().element("Document");
        if (document == null) {
            return new KMLFileParseInfo(KMLFileParseInfo.KMLFileType.UNKNOWN);
        }
        List docElement = document.elements();
        for (Element element : docElement) {
            Element type;
            if (!element.getName().equals("ExtendedData") || (type = element.element("type")) == null || KMLValueConverter.getMissionType(type.getTextTrim()) == null) continue;
            KMLFileParseInfo parseInfo = new KMLFileParseInfo(KMLFileParseInfo.KMLFileType.MISSION);
            parseInfo.setMissionType(Objects.requireNonNull(KMLValueConverter.getMissionType(type.getTextTrim())));
            return parseInfo;
        }
        return new KMLFileParseInfo(KMLFileParseInfo.KMLFileType.ORIGINAL);
    }

    public static Object importMission(MissionImportParams params, String path) throws KMLException, DocumentException {
        int suffixIndex = path.lastIndexOf(46);
        if (suffixIndex < 0) {
            throw new KMLException("mission_kml_non_kml_file");
        }
        SAXReader saxReader = new SAXReader();
        File f = new File(path);
        if (KMLValueConverter.equals(path.substring(path.lastIndexOf(46)), ".zip")) {
            File[] files;
            File tempUnzipPath = new File(f.getParent(), "KMLTempFiles");
            if (tempUnzipPath.exists()) {
                FileUtils.delFile(tempUnzipPath);
            }
            tempUnzipPath.mkdirs();
            KMLZipHelper.unZipFolder(context, path, tempUnzipPath.getAbsolutePath(), true);
            for (File file : files = tempUnzipPath.listFiles()) {
                if (file.getName().endsWith(".kml")) {
                    f = file;
                    path = f.getAbsolutePath();
                    continue;
                }
                if (!file.getName().endsWith("jpg")) continue;
                String dir = FileUtils.getDJIDirPath(context) + "/CACHE_PATH";
                File newFile = new File(dir, file.getName());
                try {
                    if (newFile.exists()) {
                        newFile.createNewFile();
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
                FileUtils.moveFile(file, newFile);
            }
        }
        if (KMLValueConverter.equals(path.substring(path.lastIndexOf(46)), ".kml")) {
            String name = f.getName().substring(0, f.getName().lastIndexOf("."));
            name = name.replaceAll(ILLEGAL_EX, "");
            MissionType type = params.getMissionType();
            if (type == MissionType.Waypoint) {
                return KMLUtil.parseWaypointKML(saxReader.read(f), name, params.getHeightMode());
            }
            if (type == MissionType.Strip) {
                return KMLUtil.parseStripKML(saxReader.read(f), name);
            }
            return KMLUtil.parseMappingKML(saxReader.read(f), name, type);
        }
        throw new KMLException("mission_kml_non_kml_file");
    }

    public static void saveKMLImportMission(Object missionModel, String currentPath) {
        KMZPathWrapper pathWrapper;
        MissionGreenDaoTransform waylineConverter = new MissionGreenDaoTransform();
        MissionTransformData transformData = waylineConverter.generateGreenDaoMissionWayline(missionModel);
        List<WaylineTemplate> templateList = transformData.getTemplates();
        WaylineExecuteMissionConfig executeMissionConfig = transformData.getExecuteMissionConfig();
        PPalGenerator generator = new PPalGenerator();
        PPalGenerator.PPALParam param = new PPalGenerator.PPALParam(transformData.getMission(), transformData.getMissionConfig(), transformData.getExecuteMissionConfig(), templateList);
        List<Wayline> waylines = generator.getWaylines(param);
        if (currentPath != null && !currentPath.isEmpty() && new File(currentPath).isDirectory()) {
            pathWrapper = KMZPathWrapper.Factory.create(currentPath, KMLUtil.getName(currentPath));
            pathWrapper.clearOtherClipKmzFile();
        } else {
            String innerPath = "OutPath";
            String dir = FileUtils.getDJIDirPath(context) + "/KMZ";
            pathWrapper = KMZPathWrapper.Factory.create(dir + "/" + innerPath, KMLUtil.getName(currentPath));
        }
        JNIWPMZManager.generateKMZFile(VERSION, transformData.getMission(), transformData.getMissionConfig(), templateList, waylines, executeMissionConfig, new ArrayList<String>(), new ArrayList<String>(), pathWrapper.getClipKmzFile().getPath());
    }

    public static String getName(String pathandname) {
        int start = pathandname.lastIndexOf("/");
        int end = pathandname.lastIndexOf(".");
        if (start != -1 && end != -1) {
            return pathandname.substring(start + 1, end);
        }
        return "unknown";
    }

    public static void saveLocalMission(Object missionModel, String kmlPath) {
        WaylineConverter waylineConverter = new WaylineConverter();
        if (missionModel instanceof MappingMissionModel) {
            MappingMissionModel mappingMissionModel = (MappingMissionModel)missionModel;
            MissionTransformData transformData = waylineConverter.generateKMLWayline(missionModel);
            mappingMissionModel.setTransformData(transformData);
            KMLUtil.updateMappingMission(mappingMissionModel);
        } else if (missionModel instanceof StripMissionModel) {
            StripMissionModel stripMissionModel = (StripMissionModel)missionModel;
            MissionTransformData transformData = waylineConverter.generateKMLWayline(missionModel);
            stripMissionModel.setTransformData(transformData);
            KMLUtil.updateStripMission(stripMissionModel);
        } else {
            WaypointMissionModel waypointMissionModel = (WaypointMissionModel)missionModel;
            MissionTransformData transformData = waylineConverter.generateKMLWayline(missionModel);
            waypointMissionModel.setTransformData(transformData);
            KMLUtil.updateWaypointMission(waypointMissionModel, kmlPath);
        }
    }

    private static void updateWaypointMission(WaypointMissionModel waypointMissionModel, String currentPath) {
        MissionTransformData transformData = waypointMissionModel.getTransformData();
        String localPath = KMLUtil.generateWPMZFile(waypointMissionModel.getMissionInfo().getName(), currentPath, transformData, KMLUtil.getWaypointPrecisePhotos(waypointMissionModel), new ArrayList<String>(), new ArrayList<String>());
        Log.d((String)TAG, (String)("final path is " + localPath));
    }

    public static void updateMappingMission(MappingMissionModel mappingMissionModel) {
        ArrayList<String> dsmFiles = new ArrayList<String>();
        if (mappingMissionModel.getMappingWayline().getDsmPath() != null) {
            dsmFiles.addAll(mappingMissionModel.getMappingWayline().getDsmPath());
        }
        MissionTransformData transformData = mappingMissionModel.getTransformData();
        String currentPath = mappingMissionModel.getMissionInfo().getLocalWPMZPath();
        String localPath = KMLUtil.generateWPMZFile(mappingMissionModel.getMissionInfo().getName(), currentPath, transformData, new ArrayList<String>(), dsmFiles, new ArrayList<String>());
        Log.d((String)TAG, (String)("final path is " + localPath));
    }

    public static void updateStripMission(StripMissionModel stripMissionModel) {
        MissionTransformData templateData = stripMissionModel.getTransformData();
        ArrayList<String> dsmFiles = new ArrayList<String>();
        if (stripMissionModel.getStripWayline().getStripDsmPath() != null) {
            dsmFiles.addAll(stripMissionModel.getStripWayline().getStripDsmPath());
        }
        String currentPath = stripMissionModel.getMissionInfo().getLocalWPMZPath();
        String localPath = KMLUtil.generateWPMZFile(stripMissionModel.getMissionInfo().getName(), currentPath, templateData, new ArrayList<String>(), dsmFiles, new ArrayList<String>());
        Log.d((String)TAG, (String)("final path is " + localPath));
    }

    private static List<String> getWaypointPrecisePhotos(WaypointMissionModel model) {
        List<WaypointModel> waypoints = model.getWaypoints();
        ArrayList<String> images = new ArrayList<String>();
        for (WaypointModel item : waypoints) {
            List<WaypointActionModel> actions = item.getActions();
            if (actions == null) continue;
            for (WaypointActionModel actionItem : actions) {
                PreciseShotInfo preciseInfo = actionItem.getPreciseShotInfo();
                if (preciseInfo == null || preciseInfo.getCacheFilePath() == null) continue;
                images.add(new File(preciseInfo.getCacheFilePath(), preciseInfo.getCacheFileName()).getAbsolutePath());
            }
        }
        return images;
    }

    public static String generateWPMZFile(String name, String currentPath, MissionTransformData data, List<String> precisePhotoPath, List<String> dsmPath, List<String> audioFilePath) {
        KMZPathWrapper pathWrapper;
        if (currentPath != null && !currentPath.isEmpty() && new File(currentPath).isDirectory()) {
            pathWrapper = KMZPathWrapper.Factory.create(currentPath, name);
            pathWrapper.clearOtherClipKmzFile();
        } else {
            String innerPath = "OutPath";
            String dir = FileUtils.getDJIDirPath(context) + "/KMZ";
            pathWrapper = KMZPathWrapper.Factory.create(dir + "/" + innerPath, name);
        }
        pathWrapper.refreshRes(precisePhotoPath, dsmPath, audioFilePath);
        JNIWPMZManager.generateKMZFile(VERSION, data.getMission(), data.getMissionConfig(), data.getTemplates(), data.getWayline(), data.getExecuteMissionConfig(), precisePhotoPath, dsmPath, currentPath);
        return pathWrapper.getDirPath();
    }

    public static WaypointMissionModelGreenDao parseWaypointKML(Document kml, String name, MissionImportHeightMode heightMode) throws KMLException {
        Element document = kml.getRootElement().element("Document");
        if (document == null || KMLUtil.getWaylinePointsElement(document) == null) {
            throw new KMLException("mission_list_type_wrong");
        }
        if (name.length() > 60) {
            name = name.substring(0, 60);
        }
        WaypointMissionModelGreenDao waypointMissionModel = KMLWaypointEntityCreateUtilKt.createWaypointMissionModel(name);
        MissionInfoModelGreenDao missionInfoModel = waypointMissionModel.getMissionInfo();
        missionInfoModel.getExtInfo().setCreateByKml(true);
        List<WaypointModelGreenDao> waypointModels = waypointMissionModel.getWaypoints();
        WaylineModelGreenDao waylineModel = waypointMissionModel.getWayline();
        List docElements = document.elements();
        for (Element element : docElements) {
            switch (element.getName()) {
                case "ExtendedData": {
                    Element type = element.element("type");
                    if (type != null && KMLValueConverter.getMissionType(type.getTextTrim()) != MissionType.Waypoint) {
                        throw new KMLException("mission_list_type_wrong");
                    }
                    KMLUtil.parseMissionInfoExtendedData(element, missionInfoModel);
                    break;
                }
                case "Placemark": {
                    Element placeMarkDesc = element.element("description");
                    if (placeMarkDesc == null || TextUtils.isEmpty((CharSequence)placeMarkDesc.getTextTrim()) || !placeMarkDesc.getTextTrim().equals("Poi")) break;
                    KMLUtil.parsePoiData(element, waylineModel);
                    break;
                }
                case "Folder": {
                    KMLUtil.parsePointsData(element, waypointModels);
                    break;
                }
            }
        }
        Element waylineEle = KMLUtil.getWaylinePointsElement(document);
        KMLUtil.parseWaylineData(waylineEle, waypointMissionModel, heightMode);
        if (!DJIGpsUtils.isAvailable(waylineModel.getPoiLatitude(), waylineModel.getPoiLongitude()) && waylineModel.getHeadingMode() == WaypointMissionHeadingMode.TOWARD_POINT_OF_INTEREST) {
            waylineModel.setHeadingMode(WaypointMissionHeadingMode.AUTO);
        }
        KMLUtil.injectHeightMode(heightMode, waypointMissionModel);
        return waypointMissionModel;
    }

    private static void injectHeightMode(MissionImportHeightMode heightMode, WaypointMissionModelGreenDao waypointMissionModel) {
        if (heightMode != null) {
            waypointMissionModel.getWayline().getDroneInfo().getDroneHeight().setUseAbsolute(KMLUtil.isAbsoluteHeight(heightMode));
        }
    }

    private static boolean isAbsoluteHeight(MissionImportHeightMode heightMode) {
        switch (heightMode) {
            case WGS84: 
            case EGM96: {
                return true;
            }
        }
        return false;
    }

    private static Element getWaylinePointsElement(Element element) {
        if (element == null) {
            return null;
        }
        for (Element placeMarker : element.elements()) {
            Element lineEle;
            if (!placeMarker.getName().equals("Placemark") || (lineEle = placeMarker.element("LineString")) == null) continue;
            return placeMarker;
        }
        return null;
    }

    private static StripMissionModelGreenDao parseStripKML(Document kml, String name) throws KMLException {
        Element document = kml.getRootElement().element("Document");
        if (document == null) {
            throw new KMLException("mission_kml_invalid_format");
        }
        if (name.length() > 60) {
            name = name.substring(0, 60);
        }
        MappingCameraModelGreenDao camera = KMLUtil.createMappingCameraModel(MappingCameraType.EP600_35MM);
        StripMissionModelGreenDao stripMissionModel = KMLStripGreenDaoCreateUtilKt.createStripModel(name, MissionType.Strip, camera);
        MissionInfoExtModel extraInfo = new MissionInfoExtModel();
        extraInfo.setCreateByKml(true);
        stripMissionModel.getMissionInfo().setExtInfo(extraInfo);
        List docElement = document.elements();
        for (Element element : docElement) {
            Element type;
            if (element.getName().equals("Placemark")) {
                KMLUtil.parseFieldData(element, stripMissionModel);
                KMLUtil.parseFieldPointsData(element, stripMissionModel);
                continue;
            }
            if (!element.getName().equals("ExtendedData") || (type = element.element("type")) == null || KMLValueConverter.getMissionType(type.getTextTrim()) == MissionType.Strip) continue;
            throw new KMLException("mission_list_type_wrong");
        }
        return stripMissionModel;
    }

    private static MappingMissionModelGreenDao parseMappingKML(Document kml, String name, MissionType missionType) throws KMLException {
        Element document = kml.getRootElement().element("Document");
        if (document == null) {
            throw new KMLException("mission_kml_invalid_format");
        }
        if (name.length() > 60) {
            name = name.substring(0, 60);
        }
        MappingCameraModelGreenDao camera = KMLUtil.createMappingCameraModel(MappingCameraType.EP600_35MM);
        MappingMissionModelGreenDao mappingMissionModel = KMLMappingGreenDaoCreateUtilKt.createMappingModel(name, missionType, camera);
        MissionInfoExtModel extraInfo = new MissionInfoExtModel();
        extraInfo.setCreateByKml(true);
        mappingMissionModel.getMissionInfo().setExtInfo(extraInfo);
        List docElement = document.elements();
        for (Element element : docElement) {
            Element type;
            if (element.getName().equals("Placemark")) {
                KMLUtil.parseFieldData(element, mappingMissionModel);
                KMLUtil.parseFieldPointsData(element, mappingMissionModel);
                continue;
            }
            if (!element.getName().equals("ExtendedData") || (type = element.element("type")) == null || KMLValueConverter.getMissionType(type.getTextTrim()) == missionType) continue;
            throw new KMLException("mission_list_type_wrong");
        }
        return mappingMissionModel;
    }

    private static void parseMissionInfoExtendedData(Element element, MissionInfoModelGreenDao infoModel) {
        if (element == null) {
            return;
        }
        for (Element extendedData : element.elements()) {
            if (extendedData.getName().equals("type")) {
                infoModel.setType(KMLValueConverter.getMissionType(extendedData.getTextTrim()));
                continue;
            }
            if (!"stationType".equals(extendedData.getName())) continue;
            String value = extendedData.getTextTrim();
            int v = NumberUtils.parseInt(value, RTKReferenceStationSource.NONE.value());
            infoModel.setRtkStation(RTKReferenceStationSource.find(v));
        }
    }

    private static void parseWaylineData(Element element, WaypointMissionModelGreenDao waypointMissionModel, MissionImportHeightMode heightMode) throws KMLException {
        boolean isEgmHeight;
        WaylineModelGreenDao waylineModel = waypointMissionModel.getWayline();
        Element extendedEle = element.element("ExtendedData");
        boolean hasWaylineAltitude = false;
        boolean bl = isEgmHeight = heightMode == MissionImportHeightMode.EGM96;
        if (extendedEle != null && waylineModel != null) {
            block28: for (Element extendedData : extendedEle.elements()) {
                switch (extendedData.getName()) {
                    case "altitude": {
                        try {
                            float altitude = KMLValueConverter.string2Float(extendedData.getTextTrim());
                            if (altitude >= -10000.0f && altitude <= 10000.0f) {
                                waylineModel.setAltitude(altitude);
                            }
                        }
                        catch (NumberFormatException e) {
                            Log.e((String)TAG, (String)e.getMessage());
                        }
                        hasWaylineAltitude = true;
                        break;
                    }
                    case "autoFlightSpeed": {
                        try {
                            float speed = KMLValueConverter.string2Float(extendedData.getTextTrim());
                            if (!(speed >= 1.0f) || !(speed <= 15.0f)) continue block28;
                            waylineModel.setAutoFlightSpeed(speed);
                        }
                        catch (NumberFormatException e) {
                            Log.e((String)TAG, (String)e.getMessage());
                        }
                        break;
                    }
                    case "actionOnFinish": {
                        waylineModel.setActionOnFinish(KMLValueConverter.getActionOnFinish(extendedData.getTextTrim()));
                        break;
                    }
                    case "headingMode": {
                        waylineModel.setHeadingMode(KMLValueConverter.getHeadingMode(extendedData.getTextTrim()));
                        break;
                    }
                    case "gimbalPitchMode": {
                        waylineModel.setGimbalPitchRotationEnable(KMLValueConverter.getGimbalPitchMode(extendedData.getTextTrim()));
                        break;
                    }
                    case "waypointType": {
                        waylineModel.setWaypointType(KMLValueConverter.getWaypointType(extendedData.getTextTrim()));
                        break;
                    }
                    case "powerSaveMode": {
                        waylineModel.setGotoFirstPointMode(Boolean.parseBoolean(extendedData.getTextTrim()) ? WaypointMissionGotoWaypointMode.GotoWaypointPointToPoint : WaypointMissionGotoWaypointMode.GotoWaypointSafely);
                        break;
                    }
                    case "flightCali": {
                        waylineModel.setFlightCali(Boolean.parseBoolean(extendedData.getTextTrim()));
                        break;
                    }
                    case "droneInfo": {
                        KMLUtil.parseDroneInfo(extendedData, waylineModel.getDroneInfo());
                        break;
                    }
                }
            }
        }
        List<WaypointModelGreenDao> points = waypointMissionModel.getWaypoints();
        Element lineStringEle = element.element("LineString");
        if (lineStringEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element coordinatesEle = lineStringEle.element("coordinates");
        if (coordinatesEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        boolean hasPoint = !points.isEmpty();
        String[] locations = coordinatesEle.getTextTrim().split(" ");
        try {
            for (int i = 0; i < locations.length; ++i) {
                WaypointModelGreenDao point = hasPoint ? points.get(i) : KMLWaypointEntityCreateUtilKt.createWaypointModel();
                String[] pointCoor = locations[i].split(",");
                double lng = KMLValueConverter.string2Double(pointCoor[0].trim());
                double lat = KMLValueConverter.string2Double(pointCoor[1].trim());
                float alt = KMLValueConverter.string2Float(pointCoor[2].trim());
                if (DJIGpsUtils.isAvailable(lat, lng)) {
                    point.setLatitude(lat);
                    point.setLongitude(lng);
                    if (alt >= -10000.0f && alt <= 10000.0f) {
                        if (isEgmHeight) {
                            alt = (float)GpsUtils.wgs84Altitude(alt, lat, lng);
                        }
                        point.setAltitude(alt);
                        if (!hasWaylineAltitude) {
                            point.setUseWaylineAltitude(alt == 0.0f);
                        }
                    } else {
                        point.setAltitude(100.0f);
                    }
                }
                if (hasPoint) continue;
                points.add(point);
            }
            waypointMissionModel.setWaypoints(points);
        }
        catch (NumberFormatException e) {
            Log.e((String)TAG, (String)"mission_list_points_loc_error");
        }
        MissionInfoModelGreenDao infoModel = waypointMissionModel.getMissionInfo();
        if (CollectionUtil.isNotEmpty(points) && infoModel != null) {
            double latitude = points.get(0).getLatitude();
            infoModel.setLatitude(latitude);
            double longitude = points.get(0).getLongitude();
            infoModel.setLongitude(longitude);
            if (isEgmHeight) {
                waylineModel.setAltitude((float)GpsUtils.wgs84Altitude(waylineModel.getAltitude(), latitude, longitude));
            }
        }
    }

    private static void parseDroneInfo(Element element, DroneInfoModel droneInfoModel) {
        for (Element itemElement : element.elements()) {
            switch (itemElement.getName()) {
                case "droneType": {
                    droneInfoModel.setDroneType(KMLValueConverter.getDroneType(itemElement.getTextTrim()));
                    break;
                }
                case "droneCameras": {
                    droneInfoModel.setDroneCamera(KMLUtil.parseDroneCameras(itemElement));
                    break;
                }
                case "droneHeight": {
                    droneInfoModel.setDroneHeight(KMLUtil.parseDroneHeightMode(itemElement));
                    break;
                }
            }
        }
        KMLUtil.parsePayloadInfos(element, droneInfoModel);
    }

    private static List<DroneCameraModel> parseDroneCameras(Element element) {
        ArrayList<DroneCameraModel> cameraModels = new ArrayList<DroneCameraModel>();
        for (Element itemElement : element.elements()) {
            if (!itemElement.getName().equals("camera")) continue;
            DroneCameraModel cameraModel = new DroneCameraModel();
            for (Element cameraElement : itemElement.elements()) {
                switch (cameraElement.getName()) {
                    case "cameraIndex": {
                        cameraModel.setCameraIndex(KMLValueConverter.string2Int(cameraElement.getTextTrim()));
                        break;
                    }
                    case "cameraName": {
                        cameraModel.setCameraName(cameraElement.getTextTrim());
                        break;
                    }
                    case "cameraType": {
                        cameraModel.setCameraType(KMLValueConverter.string2Int(cameraElement.getTextTrim()));
                        break;
                    }
                    case "payloadCameraType": {
                        cameraModel.setPayloadCameraType(KMLValueConverter.string2Int(cameraElement.getTextTrim()));
                        break;
                    }
                    case "payloadCameraConfigInfo": {
                        cameraModel.setPayloadConfigInfo(KMLUtil.parsePayloadCameraConfig(cameraElement));
                        break;
                    }
                }
            }
            cameraModels.add(cameraModel);
        }
        return cameraModels;
    }

    private static void setPayloadCameraInfo(DroneInfoModel droneInfoModel, PayloadInfoModel payloadInfoModel) {
        List<DroneCameraModel> droneCameras = droneInfoModel.getCameras();
        for (DroneCameraModel item : droneCameras) {
            if (!item.isPSDKCamera() || item.getPayloadInfo() != null) continue;
            item.setPayloadInfo(payloadInfoModel);
            break;
        }
    }

    private static void parsePayloadInfos(Element element, DroneInfoModel droneInfoModel) {
        for (Element itemElement : element.elements()) {
            switch (itemElement.getName()) {
                case "payloadWidget": {
                    PayloadInfoModel payloadInfoModel = KMLUtil.parsePayloadInfo(itemElement);
                    KMLUtil.setPayloadCameraInfo(droneInfoModel, payloadInfoModel);
                    break;
                }
            }
        }
    }

    private static PayloadInfoModel parsePayloadInfo(Element element) {
        PayloadInfoModel payloadInfo = new PayloadInfoModel();
        ArrayList<PayloadInfoModel.PayloadWidgetInfo> widgetInfos = new ArrayList<PayloadInfoModel.PayloadWidgetInfo>();
        payloadInfo.setWidgetModels(widgetInfos);
        for (Element itemElement : element.elements()) {
            switch (itemElement.getName()) {
                case "payloadName": {
                    payloadInfo.setName(itemElement.getTextTrim());
                    break;
                }
                case "payloadWidgetInfo": {
                    widgetInfos.add(KMLUtil.parsePayloadWidget(itemElement));
                    break;
                }
            }
        }
        return payloadInfo;
    }

    private static PayloadInfoModel.PayloadWidgetInfo parsePayloadWidget(Element element) {
        PayloadInfoModel.PayloadWidgetInfo widgetInfo = new PayloadInfoModel.PayloadWidgetInfo();
        for (Element itemElement : element.elements()) {
            switch (itemElement.getName()) {
                case "name": {
                    widgetInfo.setName(itemElement.getTextTrim());
                    break;
                }
                case "index": {
                    widgetInfo.setIndex(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "type": {
                    widgetInfo.setType(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "value": {
                    widgetInfo.setValue(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "minValue": {
                    widgetInfo.setMinValue(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "maxValue": {
                    widgetInfo.setMaxValue(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
            }
        }
        return widgetInfo;
    }

    private static PayloadConfigInfoModel parsePayloadCameraConfig(Element element) {
        PayloadConfigInfoModel infoModel = new PayloadConfigInfoModel();
        for (Element itemElement : element.elements()) {
            switch (itemElement.getName()) {
                case "dewarping": {
                    infoModel.setEnableDewarp(Boolean.parseBoolean(itemElement.getTextTrim()));
                    break;
                }
                case "meteringMode": {
                    infoModel.setMeteringMode(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "lidarEchoMode": {
                    infoModel.setEchoMode(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "LidarNeedVariegationMode": {
                    infoModel.setNeedVariegation(Boolean.parseBoolean(itemElement.getTextTrim()));
                    break;
                }
                case "lidarScanMode": {
                    infoModel.setScanMode(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
                case "lidarSampleRateMode": {
                    infoModel.setSampleRate(KMLValueConverter.string2Int(itemElement.getTextTrim()));
                    break;
                }
            }
        }
        return infoModel;
    }

    private static DroneHeightModel parseDroneHeightMode(Element element) {
        DroneHeightModel droneHeightModel = new DroneHeightModel();
        for (Element itemElement : element.elements()) {
            switch (itemElement.getName()) {
                case "useAbsolute": {
                    droneHeightModel.setUseAbsolute(Boolean.parseBoolean(itemElement.getTextTrim()));
                    break;
                }
                case "hasTakeoffHeight": {
                    droneHeightModel.setHasTakeoffHeight(Boolean.parseBoolean(itemElement.getTextTrim()));
                    break;
                }
                case "takeoffHeight": {
                    droneHeightModel.setTakeoffHeight(KMLValueConverter.string2Float(itemElement.getTextTrim()));
                }
            }
        }
        return droneHeightModel;
    }

    private static List<PreciseShotInfo> parsePreciseShotInfo(Element element) {
        ArrayList<PreciseShotInfo> shotInfos = new ArrayList<PreciseShotInfo>();
        for (Element itemElement : element.elements()) {
            if (!itemElement.getName().equals("preciseInfo")) continue;
            PreciseShotInfo shotInfo = new PreciseShotInfo();
            String dir = FileUtils.getDJIDirPath(context) + "/CACHE_PATH";
            shotInfo.setCacheFilePath(dir);
            for (Element shotInfoElement : itemElement.elements()) {
                switch (shotInfoElement.getName()) {
                    case "imageWidth": {
                        shotInfo.setImageWidth(KMLValueConverter.string2Int(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "imageHeight": {
                        shotInfo.setImageHeight(KMLValueConverter.string2Int(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cropX": {
                        shotInfo.setCropPosX(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cropY": {
                        shotInfo.setCropPosY(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cropAngle": {
                        shotInfo.setCropAngle(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cropWidth": {
                        shotInfo.setCropWidth(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cropHeight": {
                        shotInfo.setCropHeight(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "focalDistance": {
                        shotInfo.setFocalDistance((double)KMLValueConverter.string2Int(shotInfoElement.getTextTrim()) / 10.0);
                        break;
                    }
                    case "afPosition": {
                        shotInfo.setAfPosition(KMLValueConverter.string2Int(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "gimbalPitch": {
                        shotInfo.setGimbalPitch(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "gimbalRoll": {
                        shotInfo.setGimbalRoll(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "gimbalYaw": {
                        shotInfo.setGimbalYaw(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cameraType": {
                        shotInfo.setCameraType(KMLValueConverter.string2Int(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cameraIndex": {
                        shotInfo.setCameraIndex(KMLValueConverter.string2Int(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "gimbalPort": {
                        shotInfo.setGimbalPort(KMLValueConverter.string2Int(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "fileSize": {
                        shotInfo.setFileSize(Long.parseLong(shotInfoElement.getTextTrim()));
                        break;
                    }
                    case "cacheFileName": {
                        shotInfo.setCacheFileName(shotInfoElement.getTextTrim());
                        break;
                    }
                    case "droneYaw": {
                        shotInfo.setDroneYaw(KMLValueConverter.string2Float(shotInfoElement.getTextTrim()));
                        break;
                    }
                }
            }
            shotInfos.add(shotInfo);
        }
        return shotInfos;
    }

    private static void parsePoiData(Element element, WaylineModelGreenDao waylineModel) {
        String[] coordinates;
        Element poiCoor;
        if (element == null) {
            return;
        }
        Element poiPoint = element.element("Point");
        if (!(poiPoint == null || (poiCoor = poiPoint.element("coordinates")) == null || TextUtils.isEmpty((CharSequence)poiCoor.getTextTrim()) || (coordinates = poiCoor.getTextTrim().split(",")).length != 3 && coordinates.length != 2)) {
            try {
                double longitude = KMLValueConverter.string2Double(coordinates[0]);
                double latitude = KMLValueConverter.string2Double(coordinates[1]);
                if (DJIGpsUtils.isAvailable(latitude, longitude)) {
                    waylineModel.setPoiLongitude(longitude);
                    waylineModel.setPoiLatitude(latitude);
                }
            }
            catch (NumberFormatException e) {
                Log.e((String)TAG, (String)e.getMessage());
            }
        }
    }

    private static void parsePointsData(Element element, List<WaypointModelGreenDao> waypointModels) {
        for (Element placeMark : element.elements()) {
            Element pointDesc;
            if (!placeMark.getName().equals("Placemark") || (pointDesc = placeMark.element("description")) == null || TextUtils.isEmpty((CharSequence)pointDesc.getTextTrim()) || !pointDesc.getTextTrim().equals("Waypoint")) continue;
            WaypointModelGreenDao waypointModel = KMLWaypointEntityCreateUtilKt.createWaypointModel();
            List<WaypointActionModelGreenDao> actionModels = waypointModel.getActions();
            Element pointExtended = placeMark.element("ExtendedData");
            if (pointExtended == null) continue;
            block37: for (Element extendedData : pointExtended.elements()) {
                switch (extendedData.getName()) {
                    case "useWaylineAltitude": {
                        waypointModel.setUseWaylineAltitude(Boolean.parseBoolean(extendedData.getTextTrim()));
                        break;
                    }
                    case "heading": {
                        try {
                            int heading = KMLValueConverter.string2Int(extendedData.getTextTrim());
                            if (heading < -180 || heading > 180) continue block37;
                            waypointModel.setHeading(heading);
                        }
                        catch (NumberFormatException e) {
                            Log.e((String)TAG, (String)e.getMessage());
                        }
                        break;
                    }
                    case "turnMode": {
                        waypointModel.setTurnMode(KMLValueConverter.getWaypointTurnMode(extendedData.getTextTrim()));
                        break;
                    }
                    case "gimbalPitch": {
                        try {
                            float gimbalPitch = KMLValueConverter.string2Float(extendedData.getTextTrim());
                            waypointModel.setGimbalPitch(gimbalPitch);
                        }
                        catch (NumberFormatException e) {
                            Log.e((String)TAG, (String)e.getMessage());
                        }
                        break;
                    }
                    case "useWaylineSpeed": {
                        waypointModel.setUseWaylineSpeed(Boolean.parseBoolean(extendedData.getTextTrim()));
                        break;
                    }
                    case "speed": {
                        waypointModel.setSpeed(KMLValueConverter.string2Float(extendedData.getTextTrim()));
                        break;
                    }
                    case "useWaylineHeadingMode": {
                        waypointModel.setUseWaylineHeadMode(Boolean.parseBoolean(extendedData.getTextTrim()));
                        break;
                    }
                    case "useWaylinePointType": {
                        waypointModel.setUseWaylinePointType(Boolean.parseBoolean(extendedData.getTextTrim()));
                        break;
                    }
                    case "pointType": {
                        waypointModel.setWaypointType(KMLValueConverter.getWaypointType(extendedData.getTextTrim()));
                        break;
                    }
                    case "cornerRadius": {
                        waypointModel.setCornerRadius(KMLValueConverter.string2Float(extendedData.getTextTrim()));
                        break;
                    }
                    case "headingMode": {
                        waypointModel.setHeadingMode(KMLValueConverter.getHeadingMode(extendedData.getTextTrim()));
                        break;
                    }
                    case "preciseShotInfo": {
                        waypointModel.setPreciseShotInfo(KMLUtil.parsePreciseShotInfo(extendedData));
                        break;
                    }
                    case "actions": {
                        Attribute param = extendedData.attribute("param");
                        Attribute accuracy = extendedData.attribute("accuracy");
                        Attribute cameraIndex = extendedData.attribute("cameraIndex");
                        Attribute payloadType = extendedData.attribute("payloadType");
                        Attribute payloadIndex = extendedData.attribute("payloadIndex");
                        Attribute preciseInfoName = extendedData.attribute("preciseInfoName");
                        Attribute cameraPathName = extendedData.attribute("mediaPathName");
                        WaypointActionType actionType = KMLValueConverter.getActionType(extendedData.getTextTrim());
                        WaypointActionModelGreenDao actionModel = new WaypointActionModelGreenDao();
                        if (actionType == null) break;
                        if (accuracy != null) {
                            actionModel.setAccuracy(KMLValueConverter.string2Int(accuracy.getValue()));
                        }
                        if (cameraIndex != null) {
                            actionModel.setCameraIndex(KMLValueConverter.string2Int(cameraIndex.getValue()));
                        }
                        boolean isValid = true;
                        if (param != null) {
                            int value = 0;
                            try {
                                value = KMLValueConverter.string2Int(param.getValue());
                            }
                            catch (NumberFormatException ex) {
                                isValid = false;
                            }
                            if (isValid) {
                                actionModel.setParam(value);
                                if (actionType == WaypointActionType.STAY) {
                                    isValid = value >= 0 && value <= 30000;
                                } else if (actionType == WaypointActionType.ROTATE_AIRCRAFT) {
                                    isValid = value >= -180 && value <= 180;
                                } else if (actionType == WaypointActionType.GIMBAL_PITCH) {
                                    boolean bl = isValid = actionModel.getRealParam() >= -120.0f && actionModel.getRealParam() <= 120.0f;
                                }
                            }
                        }
                        if (payloadIndex != null) {
                            actionModel.setPayloadIndex(KMLValueConverter.string2Int(payloadIndex.getValue()));
                        }
                        if (payloadType != null) {
                            actionModel.setPayloadType(KMLValueConverter.string2Int(payloadType.getValue()));
                        }
                        if (preciseInfoName != null) {
                            actionModel.setPreciseInfoName(preciseInfoName.getValue());
                        }
                        if (cameraPathName != null) {
                            actionModel.setMediaPathName(cameraPathName.getValue());
                        }
                        if (!isValid) continue block37;
                        actionModel.setActionType(actionType);
                        actionModels.add(actionModel);
                        break;
                    }
                }
            }
            waypointModels.add(waypointModel);
        }
    }

    private static void parseFieldData(Element placemark, StripMissionModelGreenDao model) {
        if (placemark == null) {
            return;
        }
        Element extendedDataEle = placemark.element("ExtendedData");
        if (extendedDataEle != null) {
            StripWaylineModelGreenDao waylineModel = model.getStripWayline();
            Element altEle = extendedDataEle.element("altitude");
            if (altEle != null) {
                try {
                    int alt = KMLValueConverter.string2Int(altEle.getTextTrim());
                    if (alt >= -10000 && alt <= 10000) {
                        waylineModel.setAltitude(alt);
                    }
                }
                catch (NumberFormatException e) {
                    Log.e((String)TAG, (String)"ALTITUDE param is illegal.");
                }
            }
            KMLUtil.parseCameraData(extendedDataEle, waylineModel);
            KMLUtil.parseStripBasicData(extendedDataEle, waylineModel);
        }
    }

    private static void parseFieldData(Element placemark, MappingMissionModelGreenDao model) {
        if (placemark == null) {
            return;
        }
        Element extendedDataEle = placemark.element("ExtendedData");
        if (extendedDataEle != null) {
            MappingWaylineModelGreenDao waylineModel = model.getMappingWayline();
            Element altEle = extendedDataEle.element("altitude");
            if (altEle != null) {
                try {
                    int alt = KMLValueConverter.string2Int(altEle.getTextTrim());
                    if (alt >= -10000 && alt <= 10000) {
                        waylineModel.setAltitude(alt);
                    }
                }
                catch (NumberFormatException e) {
                    Log.e((String)TAG, (String)"ALTITUDE param is illegal.");
                }
            }
            KMLUtil.parseCameraData(extendedDataEle, waylineModel);
            if (waylineModel.getType() == MissionType.Mapping3D) {
                KMLUtil.parse3DData(extendedDataEle, waylineModel);
            }
            KMLUtil.parseMappingBasicData(extendedDataEle, waylineModel);
        }
    }

    private static void parseFieldPointsData(Element element, StripMissionModelGreenDao model) throws KMLException {
        Element lineStringEle = element.element("LineString");
        if (lineStringEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element coordinatesEle = lineStringEle.element("coordinates");
        if (coordinatesEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        ArrayList<EdgePointModelGreenDao> edgePoints = new ArrayList<EdgePointModelGreenDao>();
        String[] locations = coordinatesEle.getTextTrim().split(" ");
        try {
            for (int i = 0; i < locations.length; ++i) {
                EdgePointModelGreenDao point = new EdgePointModelGreenDao();
                String[] pointCoor = locations[i].split(",");
                double lng = KMLValueConverter.string2Double(pointCoor[0].trim());
                double lat = KMLValueConverter.string2Double(pointCoor[1].trim());
                if (!DJIGpsUtils.isAvailable(lat, lng)) continue;
                point.setLatitude(lat);
                point.setLongitude(lng);
                edgePoints.add(point);
            }
            model.setEdgePoints(edgePoints);
        }
        catch (NumberFormatException e) {
            Log.e((String)TAG, (String)"mission_list_points_loc_error");
        }
        MissionInfoModelGreenDao infoModel = model.getMissionInfo();
        if (CollectionUtil.isNotEmpty(edgePoints) && infoModel != null) {
            infoModel.setLatitude(((EdgePointModelGreenDao)edgePoints.get(0)).getLatitude());
            infoModel.setLongitude(((EdgePointModelGreenDao)edgePoints.get(0)).getLongitude());
        }
    }

    private static void parseFieldPointsData(Element element, MappingMissionModelGreenDao model) throws KMLException {
        Element polygonEle = element.element("Polygon");
        if (polygonEle == null) {
            throw new KMLException("mission_list_type_wrong");
        }
        Element outerBoundaryEle = polygonEle.element("outerBoundaryIs");
        if (outerBoundaryEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element linearRingEle = outerBoundaryEle.element("LinearRing");
        if (linearRingEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        Element coordinatesEle = linearRingEle.element("coordinates");
        if (coordinatesEle == null) {
            throw new KMLException("mission_list_points_loc_error");
        }
        ArrayList<EdgePointModelGreenDao> points = new ArrayList<EdgePointModelGreenDao>();
        String[] locations = coordinatesEle.getTextTrim().split(" ");
        try {
            for (int i = 0; i < locations.length - 1; ++i) {
                EdgePointModelGreenDao point = new EdgePointModelGreenDao();
                String[] pointCoor = locations[i].split(",");
                double lng = KMLValueConverter.string2Double(pointCoor[0].trim());
                double lat = KMLValueConverter.string2Double(pointCoor[1].trim());
                if (!DJIGpsUtils.isAvailable(lat, lng)) continue;
                point.setLatitude(lat);
                point.setLongitude(lng);
                points.add(point);
            }
            model.setEdgePoints(points);
        }
        catch (NumberFormatException e) {
            Log.e((String)TAG, (String)"EDGE_POINTS_LOCATION params is illegal.");
        }
        MissionInfoModelGreenDao infoModel = model.getMissionInfo();
        if (CollectionUtil.isNotEmpty(points) && infoModel != null) {
            infoModel.setLatitude(((EdgePointModelGreenDao)points.get(0)).getLatitude());
            infoModel.setLongitude(((EdgePointModelGreenDao)points.get(0)).getLongitude());
        }
    }

    private static void parseStripBasicData(Element element, StripWaylineModelGreenDao waylineModel) {
        block78: for (Element ele : element.elements()) {
            switch (ele.getName()) {
                case "overlapH": {
                    try {
                        int overlapH = KMLValueConverter.string2Int(ele.getTextTrim());
                        if (overlapH < 10 || overlapH > 90) continue block78;
                        waylineModel.setOverlapH(overlapH);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("OVERLAP_H param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "overlapW": {
                    try {
                        int overlapW = KMLValueConverter.string2Int(ele.getTextTrim());
                        if (overlapW < 10 || overlapW > 90) continue block78;
                        waylineModel.setOverlapW(overlapW);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("OVERLAP_W param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "autoFlightSpeed": {
                    try {
                        float speed = KMLValueConverter.string2Float(ele.getTextTrim());
                        if (!(speed >= 1.0f) || !(speed <= 15.0f)) continue block78;
                        waylineModel.setSpeed(speed);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("SPEED param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "takeoffSpeed": {
                    try {
                        float speed = KMLValueConverter.string2Float(ele.getTextTrim());
                        if (!(speed >= 1.0f) || !(speed <= 15.0f)) continue block78;
                        waylineModel.setTakeoffSpeed(speed);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("SPEED param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "actionOnFinish": {
                    waylineModel.setActionOnFinish(KMLValueConverter.getActionOnFinish(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("actionOnFinish" + ele.getTextTrim()));
                    break;
                }
                case "photoMode": {
                    try {
                        int photoMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setPhotoMode(photoMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("photoMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "leftExtandDistance": {
                    try {
                        int leftExtandDistance = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setLeftExtend(leftExtandDistance);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("leftExtandDistance" + ele.getTextTrim()));
                    }
                    break;
                }
                case "rightExtandDistance": {
                    try {
                        int rightExtandDistance = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setRightExtend(rightExtandDistance);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("rightExtandDistance" + ele.getTextTrim()));
                    }
                    break;
                }
                case "cutDistance": {
                    try {
                        int cutDistance = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setCutLength(cutDistance);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("cutDistance" + ele.getTextTrim()));
                    }
                    break;
                }
                case "includeCenterLine": {
                    try {
                        int includeCenterLine = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setHasCenterLine(includeCenterLine == 1);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("includeCenterLine" + ele.getTextTrim()));
                    }
                    break;
                }
                case "planMode": {
                    try {
                        int planMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setPlanMode(planMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("planMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "dewarping": {
                    waylineModel.setEnableDewarping(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("dewarping" + ele.getTextTrim()));
                    break;
                }
                case "enableSingleLine": {
                    waylineModel.setEnableSingleLine(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("enableSingleLine" + ele.getTextTrim()));
                    break;
                }
                case "focusMode": {
                    try {
                        int focusMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setFocusMode(focusMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("focusMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "lidarEchoMode": {
                    try {
                        int echoMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setEchoMode(echoMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("lidarEchoMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "lidarSampleRateMode": {
                    try {
                        int sampleRateMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setSampleRate(sampleRateMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("lidarSampleRateMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "lidarScanMode": {
                    try {
                        int scanMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setScanMode(scanMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("lidarScanMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "LidarNeedVariegationMode": {
                    waylineModel.setNeedVariegation(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("LidarNeedVariegationMode" + ele.getTextTrim()));
                    break;
                }
                case "mappingAltitudeMode": {
                    try {
                        int altitudeMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setAltitudeMode(altitudeMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("mappingAltitudeMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "relativeDistance": {
                    try {
                        int relativeDistance = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setRelativeDistance(relativeDistance);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("relativeDistance" + ele.getTextTrim()));
                    }
                    break;
                }
                case "enableCalibrate": {
                    waylineModel.setEnableCalibrate(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("enableCalibrate" + ele.getTextTrim()));
                    break;
                }
            }
        }
    }

    private static void parseMappingBasicData(Element element, MappingWaylineModelGreenDao waylineModel) {
        block72: for (Element ele : element.elements()) {
            switch (ele.getName()) {
                case "direction": {
                    try {
                        int direction = KMLValueConverter.string2Int(ele.getTextTrim());
                        if (direction < 0 || direction > 359) continue block72;
                        waylineModel.setDirection(direction);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("DIRECTION param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "margin": {
                    try {
                        float max;
                        float margin = KMLValueConverter.string2Float(ele.getTextTrim());
                        if (!(margin >= -(max = (float)waylineModel.getAltitude() * 1.0f)) || !(margin <= max)) continue block72;
                        waylineModel.setMargin(margin);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("MARGIN param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "overlapH": {
                    try {
                        int overlapH = KMLValueConverter.string2Int(ele.getTextTrim());
                        if (overlapH < 10 || overlapH > 90) continue block72;
                        waylineModel.setOverlapH(overlapH);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("OVERLAP_H param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "overlapW": {
                    try {
                        int overlapW = KMLValueConverter.string2Int(ele.getTextTrim());
                        if (overlapW < 10 || overlapW > 90) continue block72;
                        waylineModel.setOverlapW(overlapW);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("OVERLAP_W param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "autoFlightSpeed": {
                    try {
                        float speed = KMLValueConverter.string2Float(ele.getTextTrim());
                        if (!(speed >= 1.0f) || !(speed <= 15.0f)) continue block72;
                        waylineModel.setSpeed(speed);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("SPEED param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "takeoffSpeed": {
                    try {
                        float speed = KMLValueConverter.string2Float(ele.getTextTrim());
                        if (!(speed >= 1.0f) || !(speed <= 15.0f)) continue block72;
                        waylineModel.setTakeoffSpeed(speed);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("SPEED param is illegal." + ele.getTextTrim()));
                    }
                    break;
                }
                case "actionOnFinish": {
                    waylineModel.setActionOnFinish(KMLValueConverter.getActionOnFinish(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("actionOnFinish" + ele.getTextTrim()));
                    break;
                }
                case "elevationOptimize": {
                    waylineModel.setElevationOptimize(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("elevationOptimize" + ele.getTextTrim()));
                    break;
                }
                case "enableFiveWayPose": {
                    waylineModel.setFiveWayPose(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("enableFiveWayPose" + ele.getTextTrim()));
                    break;
                }
                case "fiveWayPoseWithGimbalPitch": {
                    try {
                        int fiveWayPoseWithGimbalPitch = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setFiveWayPoseWithGimbalPitch(fiveWayPoseWithGimbalPitch);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("fiveWayPoseWithGimbalPitch" + ele.getTextTrim()));
                    }
                    break;
                }
                case "photoMode": {
                    try {
                        int photoMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setPhotoMode(photoMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("photoMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "dewarping": {
                    waylineModel.setEnableDewarping(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("dewarping" + ele.getTextTrim()));
                    break;
                }
                case "focusMode": {
                    try {
                        int focusMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setFocusMode(focusMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("focusMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "lidarEchoMode": {
                    try {
                        int echoMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setEchoMode(echoMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("lidarEchoMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "lidarSampleRateMode": {
                    try {
                        int sampleRateMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setSampleRate(sampleRateMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("lidarSampleRateMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "lidarScanMode": {
                    try {
                        int scanMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setScanMode(scanMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("lidarScanMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "LidarNeedVariegationMode": {
                    waylineModel.setNeedVariegation(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("LidarNeedVariegationMode" + ele.getTextTrim()));
                    break;
                }
                case "mappingAltitudeMode": {
                    try {
                        int altitudeMode = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setAltitudeMode(altitudeMode);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("mappingAltitudeMode" + ele.getTextTrim()));
                    }
                    break;
                }
                case "relativeDistance": {
                    try {
                        int relativeDistance = KMLValueConverter.string2Int(ele.getTextTrim());
                        waylineModel.setRelativeDistance(relativeDistance);
                    }
                    catch (NumberFormatException ex) {
                        Log.e((String)TAG, (String)("relativeDistance" + ele.getTextTrim()));
                    }
                    break;
                }
                case "enableCalibrate": {
                    waylineModel.setEnableCalibrate(Boolean.parseBoolean(ele.getTextTrim()));
                    Log.e((String)TAG, (String)("enableCalibrate" + ele.getTextTrim()));
                }
            }
        }
    }

    private static void parseCameraData(Element element, StripWaylineModelGreenDao waylineModel) {
        Element cameraEle = element.element("cameraType");
        if (cameraEle != null && KMLValueConverter.isKnownCamera(cameraEle.getTextTrim()) && MappingCameraType.find(cameraEle.getTextTrim()) != MappingCameraType.OTHER) {
            waylineModel.setCamera(KMLUtil.createMappingCameraModel(MappingCameraType.find(cameraEle.getTextTrim())));
        } else {
            MappingCameraModelGreenDao cameraModel = new MappingCameraModelGreenDao();
            cameraModel.setName(MappingCameraType.OTHER.getNameStr());
            cameraModel.setSensorHeight(10.0f);
            cameraModel.setSensorWidth(10.0f);
            cameraModel.setImageHeight(3000);
            cameraModel.setImageWidth(3000);
            cameraModel.setFocalLength(10.0f);
            cameraModel.setShotInterval(2.5f);
            try {
                Element shotIntervalEle;
                Element imageHEle;
                Element imageWEle;
                Element sensorWEle;
                Element sensorHEle;
                Element focalLengthEle = element.element("focalLength");
                if (focalLengthEle != null) {
                    cameraModel.setFocalLength(KMLValueConverter.string2Float(focalLengthEle.getTextTrim()));
                }
                if ((sensorHEle = element.element("sensorH")) != null) {
                    cameraModel.setSensorHeight(KMLValueConverter.string2Float(sensorHEle.getTextTrim()));
                }
                if ((sensorWEle = element.element("sensorW")) != null) {
                    cameraModel.setSensorWidth(KMLValueConverter.string2Float(sensorWEle.getTextTrim()));
                }
                if ((imageWEle = element.element("imageW")) != null) {
                    cameraModel.setImageWidth(KMLValueConverter.string2Int(imageWEle.getTextTrim()));
                }
                if ((imageHEle = element.element("imageH")) != null) {
                    cameraModel.setImageHeight(KMLValueConverter.string2Int(imageHEle.getTextTrim()));
                }
                if ((shotIntervalEle = element.element("shotInterval")) != null) {
                    cameraModel.setShotInterval(KMLValueConverter.string2Float(shotIntervalEle.getTextTrim()));
                }
                waylineModel.setCamera(cameraModel);
            }
            catch (NumberFormatException e) {
                Log.e((String)TAG, (String)"CAMERA params is illegal.");
            }
        }
    }

    private static void parseCameraData(Element element, MappingWaylineModelGreenDao waylineModel) {
        Element cameraEle = element.element("cameraType");
        if (cameraEle != null && KMLValueConverter.isKnownCamera(cameraEle.getTextTrim()) && MappingCameraType.find(cameraEle.getTextTrim()) != MappingCameraType.OTHER) {
            waylineModel.setCamera(KMLUtil.createMappingCameraModel(MappingCameraType.find(cameraEle.getTextTrim())));
        } else {
            MappingCameraModelGreenDao cameraModel = new MappingCameraModelGreenDao();
            cameraModel.setName("Custom Camera");
            cameraModel.setSensorHeight(10.0f);
            cameraModel.setSensorWidth(10.0f);
            cameraModel.setImageHeight(3000);
            cameraModel.setImageWidth(3000);
            cameraModel.setFocalLength(10.0f);
            cameraModel.setShotInterval(2.5f);
            try {
                Element shotIntervalEle;
                Element imageHEle;
                Element imageWEle;
                Element sensorWEle;
                Element sensorHEle;
                Element focalLengthEle = element.element("focalLength");
                if (focalLengthEle != null) {
                    cameraModel.setFocalLength(KMLValueConverter.string2Float(focalLengthEle.getTextTrim()));
                }
                if ((sensorHEle = element.element("sensorH")) != null) {
                    cameraModel.setSensorHeight(KMLValueConverter.string2Float(sensorHEle.getTextTrim()));
                }
                if ((sensorWEle = element.element("sensorW")) != null) {
                    cameraModel.setSensorWidth(KMLValueConverter.string2Float(sensorWEle.getTextTrim()));
                }
                if ((imageWEle = element.element("imageW")) != null) {
                    cameraModel.setImageWidth(KMLValueConverter.string2Int(imageWEle.getTextTrim()));
                }
                if ((imageHEle = element.element("imageH")) != null) {
                    cameraModel.setImageHeight(KMLValueConverter.string2Int(imageHEle.getTextTrim()));
                }
                if ((shotIntervalEle = element.element("shotInterval")) != null) {
                    cameraModel.setShotInterval(KMLValueConverter.string2Float(shotIntervalEle.getTextTrim()));
                }
                waylineModel.setCamera(cameraModel);
            }
            catch (NumberFormatException e) {
                Log.e((String)TAG, (String)"CAMERA params is illegal.");
            }
        }
    }

    private static MappingCameraModelGreenDao createMappingCameraModel(MappingCameraType cameraType) {
        if (cameraType != MappingCameraType.OTHER) {
            MappingCameraModelGreenDao cameraModel = new MappingCameraModelGreenDao();
            cameraModel.setName(cameraType.getNameStr());
            cameraModel.setSensorWidth(cameraType.getSensorW());
            cameraModel.setSensorHeight(cameraType.getSensorH());
            cameraModel.setFocalLength(cameraType.getFocalLength());
            cameraModel.setImageHeight(cameraType.getImageHeight());
            cameraModel.setImageWidth(cameraType.getImageWidth());
            cameraModel.setShotInterval(MappingUtils.getCameraShotInterval(cameraType, false));
            return cameraModel;
        }
        return null;
    }

    private static void parse3DData(Element element, MappingWaylineModelGreenDao waylineModel) {
        Element inclineOverlapHEle;
        Element inclineOverlapWEle;
        Element inclineSpeedEle;
        Element gimbalPitchEle = element.element("gimbalPitch");
        if (gimbalPitchEle != null) {
            try {
                int gimbalPitch = KMLValueConverter.string2Int(gimbalPitchEle.getTextTrim());
                if (gimbalPitch >= -85 && gimbalPitch <= -40) {
                    waylineModel.setGimbalPitch(gimbalPitch);
                }
            }
            catch (NumberFormatException ex) {
                Log.e((String)TAG, (String)("DIRECTION param is illegal." + gimbalPitchEle.getTextTrim()));
            }
        }
        if ((inclineSpeedEle = element.element("inclineSpeed")) != null) {
            try {
                float inclineSpeed = KMLValueConverter.string2Float(inclineSpeedEle.getTextTrim());
                if (inclineSpeed >= 1.0f && inclineSpeed <= 15.0f) {
                    waylineModel.setInclineSpeed(inclineSpeed);
                }
            }
            catch (NumberFormatException ex) {
                Log.e((String)TAG, (String)("INCLINE_SPEED param is illegal." + inclineSpeedEle.getTextTrim()));
            }
        }
        if ((inclineOverlapWEle = element.element("inclineOverlapW")) != null) {
            try {
                int inclineOverlapW = KMLValueConverter.string2Int(inclineOverlapWEle.getTextTrim());
                if (inclineOverlapW >= 10 && inclineOverlapW <= 90) {
                    waylineModel.setInclineOverlapW(inclineOverlapW);
                }
            }
            catch (NumberFormatException ex) {
                Log.e((String)TAG, (String)("INCLINE_OVERLAP_W param is illegal." + inclineOverlapWEle.getTextTrim()));
            }
        }
        if ((inclineOverlapHEle = element.element("inclineOverlapH")) != null) {
            try {
                int inclineOverlapH = KMLValueConverter.string2Int(inclineOverlapHEle.getTextTrim());
                if (inclineOverlapH >= 10 && inclineOverlapH <= 90) {
                    waylineModel.setInclineOverlapH(inclineOverlapH);
                }
            }
            catch (NumberFormatException ex) {
                Log.e((String)TAG, (String)("INCLINE_OVERLAP_H param is illegal." + inclineOverlapHEle.getTextTrim()));
            }
        }
    }

    static {
        ILLEGAL_PATTERN = Pattern.compile(ILLEGAL_EX);
    }
}

