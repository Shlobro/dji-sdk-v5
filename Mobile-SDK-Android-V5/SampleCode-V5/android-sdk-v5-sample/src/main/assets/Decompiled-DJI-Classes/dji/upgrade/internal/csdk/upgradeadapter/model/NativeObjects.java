/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.upgrade.internal.csdk.upgradeadapter.model;

import androidx.annotation.Keep;
import java.util.ArrayList;
import java.util.HashMap;

@Keep
public class NativeObjects {
    public static final HashMap<UpgradeComponentProductType, ArrayList<UpgradeComponentProductType>> ExternalUpgradComponents = new HashMap<UpgradeComponentProductType, ArrayList<UpgradeComponentProductType>>(){};

    public static final String getUpgradeComponentComposeId(UpgradeComponentProductType upgradeComponentProductType, int n) {
        return null;
    }

    @Keep
    public static final class UpgradeComponentProductType
    extends Enum<UpgradeComponentProductType> {
        public static final /* enum */ UpgradeComponentProductType Unknown = new UpgradeComponentProductType(0);
        public static final /* enum */ UpgradeComponentProductType RCP4P = new UpgradeComponentProductType(1000);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicAir = new UpgradeComponentProductType(1100);
        public static final /* enum */ UpgradeComponentProductType AircraftP4P = new UpgradeComponentProductType(1101);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicPro2 = new UpgradeComponentProductType(1102);
        public static final /* enum */ UpgradeComponentProductType AircraftMavic2Enterprise = new UpgradeComponentProductType(1103);
        public static final /* enum */ UpgradeComponentProductType AircraftMavic2EnterpriseDualLight = new UpgradeComponentProductType(1104);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM160 = new UpgradeComponentProductType(1105);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM231 = new UpgradeComponentProductType(1106);
        public static final /* enum */ UpgradeComponentProductType AircraftPM430 = new UpgradeComponentProductType(1107);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM170 = new UpgradeComponentProductType(1108);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM161 = new UpgradeComponentProductType(1109);
        public static final /* enum */ UpgradeComponentProductType AircraftPM320 = new UpgradeComponentProductType(1110);
        public static final /* enum */ UpgradeComponentProductType AircraftAG501 = new UpgradeComponentProductType(1120);
        public static final /* enum */ UpgradeComponentProductType AircraftAG500 = new UpgradeComponentProductType(1121);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM260 = new UpgradeComponentProductType(1122);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM232 = new UpgradeComponentProductType(1123);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM1605 = new UpgradeComponentProductType(1124);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM169 = new UpgradeComponentProductType(1125);
        public static final /* enum */ UpgradeComponentProductType AircraftAG601 = new UpgradeComponentProductType(1126);
        public static final /* enum */ UpgradeComponentProductType AircraftAG600 = new UpgradeComponentProductType(1127);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM162 = new UpgradeComponentProductType(1128);
        public static final /* enum */ UpgradeComponentProductType AircraftWM630 = new UpgradeComponentProductType(1129);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM265E = new UpgradeComponentProductType(1130);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM265M = new UpgradeComponentProductType(1131);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM265T = new UpgradeComponentProductType(1132);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWA345E = new UpgradeComponentProductType(1133);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWA345T = new UpgradeComponentProductType(1134);
        public static final /* enum */ UpgradeComponentProductType AircraftPM431 = new UpgradeComponentProductType(1139);
        public static final /* enum */ UpgradeComponentProductType AircraftTA101 = new UpgradeComponentProductType(1141);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWA140 = new UpgradeComponentProductType(1142);
        public static final /* enum */ UpgradeComponentProductType AircraftMavicWM163 = new UpgradeComponentProductType(1143);
        public static final /* enum */ UpgradeComponentProductType AircraftEA220E = new UpgradeComponentProductType(1147);
        public static final /* enum */ UpgradeComponentProductType AircraftEA220T = new UpgradeComponentProductType(1148);
        public static final /* enum */ UpgradeComponentProductType AircraftEA230E = new UpgradeComponentProductType(1149);
        public static final /* enum */ UpgradeComponentProductType AircraftEA230T = new UpgradeComponentProductType(1150);
        public static final /* enum */ UpgradeComponentProductType AircraftPM440 = new UpgradeComponentProductType(1151);
        public static final /* enum */ UpgradeComponentProductType AircraftWM265EA = new UpgradeComponentProductType(1152);
        public static final /* enum */ UpgradeComponentProductType RCMavicAir = new UpgradeComponentProductType(1200);
        public static final /* enum */ UpgradeComponentProductType RCMavicPro2 = new UpgradeComponentProductType(1201);
        public static final /* enum */ UpgradeComponentProductType RCMavicPro2Pigeon = new UpgradeComponentProductType(1202);
        public static final /* enum */ UpgradeComponentProductType RCMavic2Enterprise = new UpgradeComponentProductType(1203);
        public static final /* enum */ UpgradeComponentProductType RCMavic2EnterprisePigeon = new UpgradeComponentProductType(1204);
        public static final /* enum */ UpgradeComponentProductType RCMavic2240RCSpringboardEnterprise = new UpgradeComponentProductType(1205);
        public static final /* enum */ UpgradeComponentProductType RCMavicWM160 = new UpgradeComponentProductType(1206);
        public static final /* enum */ UpgradeComponentProductType RCMavicWM231Pigeon = new UpgradeComponentProductType(1207);
        public static final /* enum */ UpgradeComponentProductType RCMavicWM231Sparrow = new UpgradeComponentProductType(1208);
        public static final /* enum */ UpgradeComponentProductType RCPM430 = new UpgradeComponentProductType(1209);
        public static final /* enum */ UpgradeComponentProductType RCRM500 = new UpgradeComponentProductType(1210);
        public static final /* enum */ UpgradeComponentProductType RCJS170 = new UpgradeComponentProductType(1211);
        public static final /* enum */ UpgradeComponentProductType RCSS170 = new UpgradeComponentProductType(1212);
        public static final /* enum */ UpgradeComponentProductType RCMavicWM161 = new UpgradeComponentProductType(1213);
        public static final /* enum */ UpgradeComponentProductType RCMavicWM231MUXD = new UpgradeComponentProductType(1214);
        public static final /* enum */ UpgradeComponentProductType RCAG501 = new UpgradeComponentProductType(1220);
        public static final /* enum */ UpgradeComponentProductType EA110 = new UpgradeComponentProductType(1221);
        public static final /* enum */ UpgradeComponentProductType RCRM510 = new UpgradeComponentProductType(1222);
        public static final /* enum */ UpgradeComponentProductType RCRM700 = new UpgradeComponentProductType(1223);
        public static final /* enum */ UpgradeComponentProductType RCRM330 = new UpgradeComponentProductType(1224);
        public static final /* enum */ UpgradeComponentProductType RCRM520 = new UpgradeComponentProductType(1225);
        public static final /* enum */ UpgradeComponentProductType RC151 = new UpgradeComponentProductType(1227);
        public static final /* enum */ UpgradeComponentProductType RC701 = new UpgradeComponentProductType(1229);
        public static final /* enum */ UpgradeComponentProductType CameraHASSELBLADMainBoard = new UpgradeComponentProductType(1300);
        public static final /* enum */ UpgradeComponentProductType CameraHASSELBLADLENS = new UpgradeComponentProductType(1301);
        public static final /* enum */ UpgradeComponentProductType CameraGD610 = new UpgradeComponentProductType(1302);
        public static final /* enum */ UpgradeComponentProductType EP600 = new UpgradeComponentProductType(1303);
        public static final /* enum */ UpgradeComponentProductType EP800 = new UpgradeComponentProductType(1304);
        public static final /* enum */ UpgradeComponentProductType CameraGD612 = new UpgradeComponentProductType(1305);
        public static final /* enum */ UpgradeComponentProductType CameraAC103 = new UpgradeComponentProductType(1320);
        public static final /* enum */ UpgradeComponentProductType CameraAC202 = new UpgradeComponentProductType(1321);
        public static final /* enum */ UpgradeComponentProductType CameraHG212 = new UpgradeComponentProductType(1322);
        public static final /* enum */ UpgradeComponentProductType EP400 = new UpgradeComponentProductType(1323);
        public static final /* enum */ UpgradeComponentProductType EP810 = new UpgradeComponentProductType(1324);
        public static final /* enum */ UpgradeComponentProductType EP300 = new UpgradeComponentProductType(1325);
        public static final /* enum */ UpgradeComponentProductType EA700 = new UpgradeComponentProductType(1326);
        public static final /* enum */ UpgradeComponentProductType EA700App = new UpgradeComponentProductType(1327);
        public static final /* enum */ UpgradeComponentProductType EP820 = new UpgradeComponentProductType(1328);
        public static final /* enum */ UpgradeComponentProductType MavicAirDBWithRC = new UpgradeComponentProductType(1401);
        public static final /* enum */ UpgradeComponentProductType MavicPro2SerialDB = new UpgradeComponentProductType(1402);
        public static final /* enum */ UpgradeComponentProductType WM160DBWithRC = new UpgradeComponentProductType(1403);
        public static final /* enum */ UpgradeComponentProductType PM430DBWithRC = new UpgradeComponentProductType(1404);
        public static final /* enum */ UpgradeComponentProductType WM231DBWithRC = new UpgradeComponentProductType(1405);
        public static final /* enum */ UpgradeComponentProductType WM161DBWithRC = new UpgradeComponentProductType(1406);
        public static final /* enum */ UpgradeComponentProductType WM170DBWihtGLS = new UpgradeComponentProductType(1407);
        public static final /* enum */ UpgradeComponentProductType WM232DBWithRC = new UpgradeComponentProductType(1408);
        public static final /* enum */ UpgradeComponentProductType WM260DBWithRC = new UpgradeComponentProductType(1409);
        public static final /* enum */ UpgradeComponentProductType WM162DBWithRC = new UpgradeComponentProductType(1410);
        public static final /* enum */ UpgradeComponentProductType PM320DBWithRC = new UpgradeComponentProductType(1411);
        public static final /* enum */ UpgradeComponentProductType WM630DBWithRC = new UpgradeComponentProductType(1412);
        public static final /* enum */ UpgradeComponentProductType WA140DBWithRC = new UpgradeComponentProductType(1416);
        public static final /* enum */ UpgradeComponentProductType WM163DBWithRC = new UpgradeComponentProductType(1480);
        public static final /* enum */ UpgradeComponentProductType DRTKPM430 = new UpgradeComponentProductType(1500);
        public static final /* enum */ UpgradeComponentProductType BatteryBoxPM430 = new UpgradeComponentProductType(1600);
        public static final /* enum */ UpgradeComponentProductType BatteryBoxAG501 = new UpgradeComponentProductType(1601);
        public static final /* enum */ UpgradeComponentProductType ChargerAG601 = new UpgradeComponentProductType(1602);
        public static final /* enum */ UpgradeComponentProductType BatteryBoxCH320 = new UpgradeComponentProductType(1603);
        public static final /* enum */ UpgradeComponentProductType BatteryBoxWM630 = new UpgradeComponentProductType(1604);
        public static final /* enum */ UpgradeComponentProductType BatteryBoxPM431 = new UpgradeComponentProductType(1606);
        public static final /* enum */ UpgradeComponentProductType BatteryBoxPM440 = new UpgradeComponentProductType(1607);
        public static final /* enum */ UpgradeComponentProductType GimbalGD620 = new UpgradeComponentProductType(1700);
        public static final /* enum */ UpgradeComponentProductType SkyPort2 = new UpgradeComponentProductType(1701);
        public static final /* enum */ UpgradeComponentProductType Glasses170 = new UpgradeComponentProductType(1800);
        public static final /* enum */ UpgradeComponentProductType GlassesZV900 = new UpgradeComponentProductType(1801);
        public static final /* enum */ UpgradeComponentProductType Rc4GDongle = new UpgradeComponentProductType(1900);
        public static final /* enum */ UpgradeComponentProductType Fc4GDongle = new UpgradeComponentProductType(1901);
        public static final /* enum */ UpgradeComponentProductType RelayEA600 = new UpgradeComponentProductType(2000);
        private int data;
        private static UpgradeComponentProductType[] mValues;
        private static final /* synthetic */ UpgradeComponentProductType[] $VALUES;

        public static UpgradeComponentProductType[] values() {
            return null;
        }

        public static UpgradeComponentProductType valueOf(String string2) {
            return null;
        }

        private UpgradeComponentProductType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static UpgradeComponentProductType[] getValues() {
            return null;
        }

        public static UpgradeComponentProductType find(int n) {
            return null;
        }

        public static int getUpgradeComponentTypeIntValue(UpgradeComponentProductType upgradeComponentProductType) {
            return 0;
        }

        private static /* synthetic */ UpgradeComponentProductType[] $values() {
            return null;
        }

        static {
            $VALUES = UpgradeComponentProductType.$values();
        }
    }

    public static final class UpgradeComponentDynamicState
    extends Enum<UpgradeComponentDynamicState> {
        public static final /* enum */ UpgradeComponentDynamicState None = new UpgradeComponentDynamicState();
        public static final /* enum */ UpgradeComponentDynamicState Normal = new UpgradeComponentDynamicState();
        public static final /* enum */ UpgradeComponentDynamicState Removed = new UpgradeComponentDynamicState();
        public static final /* enum */ UpgradeComponentDynamicState Unknown = new UpgradeComponentDynamicState();
        private static final /* synthetic */ UpgradeComponentDynamicState[] $VALUES;

        public static UpgradeComponentDynamicState[] values() {
            return null;
        }

        public static UpgradeComponentDynamicState valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ UpgradeComponentDynamicState[] $values() {
            return null;
        }

        static {
            $VALUES = UpgradeComponentDynamicState.$values();
        }
    }

    public static final class UpgradeComponentChangeState
    extends Enum<UpgradeComponentChangeState> {
        public static final /* enum */ UpgradeComponentChangeState Add = new UpgradeComponentChangeState(1);
        public static final /* enum */ UpgradeComponentChangeState Remove = new UpgradeComponentChangeState(2);
        public static final /* enum */ UpgradeComponentChangeState Unknown = new UpgradeComponentChangeState(255);
        private int data;
        private static UpgradeComponentChangeState[] mValues;
        private static final /* synthetic */ UpgradeComponentChangeState[] $VALUES;

        public static UpgradeComponentChangeState[] values() {
            return null;
        }

        public static UpgradeComponentChangeState valueOf(String string2) {
            return null;
        }

        private UpgradeComponentChangeState(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static UpgradeComponentChangeState[] getValues() {
            return null;
        }

        public static UpgradeComponentChangeState find(int n) {
            return null;
        }

        private static /* synthetic */ UpgradeComponentChangeState[] $values() {
            return null;
        }

        static {
            $VALUES = UpgradeComponentChangeState.$values();
        }
    }

    public static final class ConsistentUpgradeResponseType
    extends Enum<ConsistentUpgradeResponseType> {
        public static final /* enum */ ConsistentUpgradeResponseType NotUpgrade = new ConsistentUpgradeResponseType(0);
        public static final /* enum */ ConsistentUpgradeResponseType StartUpgrade = new ConsistentUpgradeResponseType(1);
        public static final /* enum */ ConsistentUpgradeResponseType StartH22ForceUpgrade = new ConsistentUpgradeResponseType(2);
        public static final /* enum */ ConsistentUpgradeResponseType Unknown = new ConsistentUpgradeResponseType(255);
        private int data;
        private static final /* synthetic */ ConsistentUpgradeResponseType[] $VALUES;

        public static ConsistentUpgradeResponseType[] values() {
            return null;
        }

        public static ConsistentUpgradeResponseType valueOf(String string2) {
            return null;
        }

        private ConsistentUpgradeResponseType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ConsistentUpgradeResponseType find(int n) {
            return null;
        }

        private static /* synthetic */ ConsistentUpgradeResponseType[] $values() {
            return null;
        }

        static {
            $VALUES = ConsistentUpgradeResponseType.$values();
        }
    }

    public static final class ConsistentUpgradeRequestType
    extends Enum<ConsistentUpgradeRequestType> {
        public static final /* enum */ ConsistentUpgradeRequestType NeedConsistentUpgradeCanCanceled = new ConsistentUpgradeRequestType(0);
        public static final /* enum */ ConsistentUpgradeRequestType NeedForceConsistentUpgrade = new ConsistentUpgradeRequestType(1);
        public static final /* enum */ ConsistentUpgradeRequestType H22NeedForceUpgrade = new ConsistentUpgradeRequestType(2);
        public static final /* enum */ ConsistentUpgradeRequestType CHECKINGConsistentUpgrade = new ConsistentUpgradeRequestType(3);
        public static final /* enum */ ConsistentUpgradeRequestType ConsistentUpgradeCheckPass = new ConsistentUpgradeRequestType(4);
        public static final /* enum */ ConsistentUpgradeRequestType Unknown = new ConsistentUpgradeRequestType(255);
        private int data;
        private static final /* synthetic */ ConsistentUpgradeRequestType[] $VALUES;

        public static ConsistentUpgradeRequestType[] values() {
            return null;
        }

        public static ConsistentUpgradeRequestType valueOf(String string2) {
            return null;
        }

        private ConsistentUpgradeRequestType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ConsistentUpgradeRequestType find(int n) {
            return null;
        }

        private static /* synthetic */ ConsistentUpgradeRequestType[] $values() {
            return null;
        }

        static {
            $VALUES = ConsistentUpgradeRequestType.$values();
        }
    }

    public static final class UpgradeStatePushComponentType
    extends Enum<UpgradeStatePushComponentType> {
        public static final /* enum */ UpgradeStatePushComponentType RC = new UpgradeStatePushComponentType(0);
        public static final /* enum */ UpgradeStatePushComponentType Aircraft = new UpgradeStatePushComponentType(1);
        public static final /* enum */ UpgradeStatePushComponentType BatteryBox = new UpgradeStatePushComponentType(2);
        public static final /* enum */ UpgradeStatePushComponentType DRTK = new UpgradeStatePushComponentType(3);
        public static final /* enum */ UpgradeStatePushComponentType Camera = new UpgradeStatePushComponentType(4);
        public static final /* enum */ UpgradeStatePushComponentType Gimbal = new UpgradeStatePushComponentType(5);
        public static final /* enum */ UpgradeStatePushComponentType Adapters = new UpgradeStatePushComponentType(6);
        public static final /* enum */ UpgradeStatePushComponentType Glasses = new UpgradeStatePushComponentType(7);
        public static final /* enum */ UpgradeStatePushComponentType Dongle = new UpgradeStatePushComponentType(9);
        public static final /* enum */ UpgradeStatePushComponentType DataBase = new UpgradeStatePushComponentType(10);
        public static final /* enum */ UpgradeStatePushComponentType Unknown = new UpgradeStatePushComponentType(255);
        private int data;
        private static UpgradeStatePushComponentType[] mValues;
        private static final /* synthetic */ UpgradeStatePushComponentType[] $VALUES;

        public static UpgradeStatePushComponentType[] values() {
            return null;
        }

        public static UpgradeStatePushComponentType valueOf(String string2) {
            return null;
        }

        private UpgradeStatePushComponentType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static UpgradeStatePushComponentType[] getValues() {
            return null;
        }

        public static UpgradeStatePushComponentType find(int n) {
            return null;
        }

        private static /* synthetic */ UpgradeStatePushComponentType[] $values() {
            return null;
        }

        static {
            $VALUES = UpgradeStatePushComponentType.$values();
        }
    }

    public static final class ComponentVersionFetchState
    extends Enum<ComponentVersionFetchState> {
        public static final /* enum */ ComponentVersionFetchState Init = new ComponentVersionFetchState(0);
        public static final /* enum */ ComponentVersionFetchState FetchingVersion = new ComponentVersionFetchState(1);
        public static final /* enum */ ComponentVersionFetchState Success = new ComponentVersionFetchState(2);
        public static final /* enum */ ComponentVersionFetchState Failed = new ComponentVersionFetchState(3);
        private int data;
        private static ComponentVersionFetchState[] mValues;
        private static final /* synthetic */ ComponentVersionFetchState[] $VALUES;

        public static ComponentVersionFetchState[] values() {
            return null;
        }

        public static ComponentVersionFetchState valueOf(String string2) {
            return null;
        }

        private ComponentVersionFetchState(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ComponentVersionFetchState[] getValues() {
            return null;
        }

        public static ComponentVersionFetchState find(int n) {
            return null;
        }

        private static /* synthetic */ ComponentVersionFetchState[] $values() {
            return null;
        }

        static {
            $VALUES = ComponentVersionFetchState.$values();
        }
    }

    public static final class ComponentVersionCheckState
    extends Enum<ComponentVersionCheckState> {
        public static final /* enum */ ComponentVersionCheckState NeedUpgrade = new ComponentVersionCheckState(0);
        public static final /* enum */ ComponentVersionCheckState NeedForceUpgrade = new ComponentVersionCheckState(1);
        public static final /* enum */ ComponentVersionCheckState NoNeedUpgrade = new ComponentVersionCheckState(2);
        public static final /* enum */ ComponentVersionCheckState UnKnown = new ComponentVersionCheckState(255);
        private int data;
        private static ComponentVersionCheckState[] mValues;
        private static final /* synthetic */ ComponentVersionCheckState[] $VALUES;

        public static ComponentVersionCheckState[] values() {
            return null;
        }

        public static ComponentVersionCheckState valueOf(String string2) {
            return null;
        }

        private ComponentVersionCheckState(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static ComponentVersionCheckState[] getValues() {
            return null;
        }

        public static ComponentVersionCheckState find(int n) {
            return null;
        }

        private static /* synthetic */ ComponentVersionCheckState[] $values() {
            return null;
        }

        static {
            $VALUES = ComponentVersionCheckState.$values();
        }
    }

    public static final class FirmwareDecompressProcessState
    extends Enum<FirmwareDecompressProcessState> {
        public static final /* enum */ FirmwareDecompressProcessState Init = new FirmwareDecompressProcessState(0);
        public static final /* enum */ FirmwareDecompressProcessState Decompressing = new FirmwareDecompressProcessState(1);
        public static final /* enum */ FirmwareDecompressProcessState DecompressFailed = new FirmwareDecompressProcessState(2);
        public static final /* enum */ FirmwareDecompressProcessState DecompressSuccess = new FirmwareDecompressProcessState(3);
        private int data;
        private static FirmwareDecompressProcessState[] mValues;
        private static final /* synthetic */ FirmwareDecompressProcessState[] $VALUES;

        public static FirmwareDecompressProcessState[] values() {
            return null;
        }

        public static FirmwareDecompressProcessState valueOf(String string2) {
            return null;
        }

        private FirmwareDecompressProcessState(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static FirmwareDecompressProcessState[] getValues() {
            return null;
        }

        public static FirmwareDecompressProcessState find(int n) {
            return null;
        }

        private static /* synthetic */ FirmwareDecompressProcessState[] $values() {
            return null;
        }

        static {
            $VALUES = FirmwareDecompressProcessState.$values();
        }
    }

    public static final class FirmwareDownloadProcessState
    extends Enum<FirmwareDownloadProcessState> {
        public static final /* enum */ FirmwareDownloadProcessState Init = new FirmwareDownloadProcessState(0);
        public static final /* enum */ FirmwareDownloadProcessState Downloading = new FirmwareDownloadProcessState(1);
        public static final /* enum */ FirmwareDownloadProcessState DownloadFailed = new FirmwareDownloadProcessState(2);
        public static final /* enum */ FirmwareDownloadProcessState DownloadSuccess = new FirmwareDownloadProcessState(3);
        private int data;
        private static FirmwareDownloadProcessState[] mValues;
        private static final /* synthetic */ FirmwareDownloadProcessState[] $VALUES;

        public static FirmwareDownloadProcessState[] values() {
            return null;
        }

        public static FirmwareDownloadProcessState valueOf(String string2) {
            return null;
        }

        private FirmwareDownloadProcessState(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static FirmwareDownloadProcessState[] getValues() {
            return null;
        }

        public static FirmwareDownloadProcessState find(int n) {
            return null;
        }

        private static /* synthetic */ FirmwareDownloadProcessState[] $values() {
            return null;
        }

        static {
            $VALUES = FirmwareDownloadProcessState.$values();
        }
    }

    public static final class UpgradeProcessStartType
    extends Enum<UpgradeProcessStartType> {
        public static final /* enum */ UpgradeProcessStartType Normal = new UpgradeProcessStartType(0);
        public static final /* enum */ UpgradeProcessStartType Recover = new UpgradeProcessStartType(1);
        public static final /* enum */ UpgradeProcessStartType InConsistent = new UpgradeProcessStartType(2);
        public static final /* enum */ UpgradeProcessStartType ImageSwtich = new UpgradeProcessStartType(3);
        public static final /* enum */ UpgradeProcessStartType UnKnown = new UpgradeProcessStartType(255);
        private int data;
        private static UpgradeProcessStartType[] mValues;
        private static final /* synthetic */ UpgradeProcessStartType[] $VALUES;

        public static UpgradeProcessStartType[] values() {
            return null;
        }

        public static UpgradeProcessStartType valueOf(String string2) {
            return null;
        }

        private UpgradeProcessStartType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static UpgradeProcessStartType[] getValues() {
            return null;
        }

        public static UpgradeProcessStartType find(int n) {
            return null;
        }

        private static /* synthetic */ UpgradeProcessStartType[] $values() {
            return null;
        }

        static {
            $VALUES = UpgradeProcessStartType.$values();
        }
    }

    public static final class UpgradeProcessState
    extends Enum<UpgradeProcessState> {
        public static final /* enum */ UpgradeProcessState Init = new UpgradeProcessState(0);
        public static final /* enum */ UpgradeProcessState Transferring = new UpgradeProcessState(1);
        public static final /* enum */ UpgradeProcessState TransferFailed = new UpgradeProcessState(2);
        public static final /* enum */ UpgradeProcessState TransferSuccess = new UpgradeProcessState(3);
        public static final /* enum */ UpgradeProcessState Upgrading = new UpgradeProcessState(4);
        public static final /* enum */ UpgradeProcessState UpgradeFailed = new UpgradeProcessState(5);
        public static final /* enum */ UpgradeProcessState UpgradeSuccess = new UpgradeProcessState(6);
        public static final /* enum */ UpgradeProcessState TransferEnd = new UpgradeProcessState(15);
        private int data;
        private static UpgradeProcessState[] mValues;
        private static final /* synthetic */ UpgradeProcessState[] $VALUES;

        public static UpgradeProcessState[] values() {
            return null;
        }

        public static UpgradeProcessState valueOf(String string2) {
            return null;
        }

        private UpgradeProcessState(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static UpgradeProcessState[] getValues() {
            return null;
        }

        public static UpgradeProcessState find(int n) {
            return null;
        }

        private static /* synthetic */ UpgradeProcessState[] $values() {
            return null;
        }

        static {
            $VALUES = UpgradeProcessState.$values();
        }
    }

    public class UpgradeFirmwareSubModuleProgressMsg {
        public int moduleId;
        public int moduleType;
        public int moduleIndex;
        public int errorCode;
        public float progress;
        public String version;
        public int processState;
        final /* synthetic */ NativeObjects this$0;

        public UpgradeFirmwareSubModuleProgressMsg(NativeObjects nativeObjects) {
        }
    }

    @Keep
    public static interface NativeComponentCompletionCallback<T> {
        @Keep
        public void onResult(T var1, int var2);
    }

    @Keep
    public static interface NativeCompletionCallback<T> {
        @Keep
        public void onResult(T var1);
    }

    @Keep
    public static interface NativeCommonCallbackWith<T> {
        @Keep
        public void onSuccess(T var1);

        @Keep
        public void onFailure(int var1);
    }

    @Keep
    public static interface UpgradeComponentCheckCallbackHandle {
        @Keep
        public void onResult(int var1, int var2);
    }

    @Keep
    public static interface FetchReleaseNoteAndSizeCallback {
        @Keep
        public void onResult(String var1, String var2, String var3, String var4, long var5, int var7);
    }

    @Keep
    public static interface FetchReleaseNoteCallback {
        @Keep
        public void onResult(String var1, String var2, String var3, String var4, int var5);
    }

    @Keep
    public static interface UpgradeComponentCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5, String var6);
    }

    @Keep
    public static interface ConsistentUpgradeRequestCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5);
    }

    @Keep
    public static interface DataLinkReverseCallbackHandle {
        @Keep
        public void onCallback(boolean var1, long var2);
    }

    @Keep
    public static interface UpgradePushStateCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5, int var6, int var7, int var8, float var9, int var10, String var11);
    }

    @Keep
    public static interface DeviceVersionCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, String var5);
    }

    @Keep
    public static interface LastestFirmwareInformationCallbackHandle {
        @Keep
        public void onCallback(int var1, String var2, String var3, String var4, String var5, long var6, boolean var8);
    }

    @Keep
    public static interface ServerVersionsCallbackHandle {
        @Keep
        public void onCallback(int var1, String[] var2);
    }

    @Keep
    public static interface DownloadProcessCallbackHandle {
        @Keep
        public void onCallback(int var1, int var2, float var3, int var4, String var5);
    }

    @Keep
    public static interface ComponentUpgradeStateCallback {
        @Keep
        public void onCallback(int var1, int var2, String var3, int var4);
    }

    @Keep
    public static interface UpgradeSubModulesFirmwareInformationHandle {
        @Keep
        public void onCallback(int var1, String[] var2);
    }

    @Keep
    public static interface UpgradeSubModulesProcessCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, String[] var5);
    }

    @Keep
    public static interface DecompressProgressCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5, float var6, int var7);
    }

    @Keep
    public static interface UpgradeProcessCallbackHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, float var11, float var12, int var13, String var14);
    }

    @Keep
    public static interface ComponentUpgradeStateCheckHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5, int var6);
    }

    @Keep
    public static interface ComponentVersionCheckHandle {
        @Keep
        public void onCallback(long var1, int var3, int var4, int var5, String var6, String var7, int var8, int var9);
    }
}

