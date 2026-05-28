/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.upgrade;

import androidx.annotation.Keep;
import dji.jni.JNIProguardKeepTag;

@Keep
public class UpgradeError
implements JNIProguardKeepTag {
    public static final UpgradeError NO_ERROR = new UpgradeError("no error", 0);
    public static final UpgradeError COMMON_EXECUTION_FAILED = new UpgradeError("The execution could not be executed.");
    public static final UpgradeError COMMON_DISCONNECTED = new UpgradeError("Disconnected");
    public static final UpgradeError COMPONENT_NOT_FOUND = new UpgradeError("\u5347\u7ea7\u7684\u6a21\u5757\u4e0d\u5728\u4f4d, \u6ca1\u6709\u627e\u5230", -1);
    public static final UpgradeError PROCESSER_START_FAILED = new UpgradeError("\u5f00\u59cb\u5347\u7ea7\u6d41\u7a0b\u5931\u8d25\uff0c\u56fa\u4ef6\u6587\u4ef6\u8def\u5f84\u672a\u627e\u5230\uff0c\u6ca1\u6709\u914d\u7f6e\u597d\u6587\u4ef6\u8def\u5f84", -2);
    public static final UpgradeError CFG_PARSE_FAILED = new UpgradeError("\u56fa\u4ef6\u7684CFG\u6587\u4ef6\u89e3\u6790\u5931\u8d25", -3);
    public static final UpgradeError VERSION_NOT_FETCHED_YET = new UpgradeError("\u670d\u52a1\u5668\u7248\u672c\u5217\u8868\u8fd8\u6ca1\u6709\u62c9\u53d6\u5230", -4);
    public static final UpgradeError FIRMWARE_DOWNLOADED = new UpgradeError("\u56fa\u4ef6\u5df2\u7ecf\u4e0b\u8f7d\u8fc7\uff0c\u4e0d\u9700\u8981\u91cd\u590d\u4e0b\u8f7d!", -5);
    public static final UpgradeError FETCH_DOWNLOAD_INFO_FAILED = new UpgradeError("\u62c9\u53d6\u56fa\u4ef6\u7248\u672c\u4fe1\u606f\u5931\u8d25", -6);
    public static final UpgradeError UNKNOWN_COMPONENT = new UpgradeError("\u672a\u77e5\u7684\u5347\u7ea7\u6a21\u5757", -7);
    public static final UpgradeError CANNOT_FETCH_SERVER_VERSION = new UpgradeError("\u670d\u52a1\u5668\u6307\u5b9a\u7248\u672c\u7684cfg\u4fe1\u606f\u6ca1\u6709\u62c9\u53d6\u5230", -8);
    public static final UpgradeError INVALID_TOKEN = new UpgradeError("\u7528\u6237\u767b\u9646token\u4e0d\u5408\u6cd5", -9);
    public static final UpgradeError FIRMWARE_DOWNLOAD_CANCELED = new UpgradeError("\u56fa\u4ef6\u4e0b\u8f7d\u6d41\u7a0b\u88ab\u53d6\u6d88", -10);
    public static final UpgradeError FETCH_FILE_SIZE_INFO_FAILED = new UpgradeError("\u62c9\u53d6\u56fa\u4ef6\u6587\u4ef6\u5927\u5c0f\u5931\u8d25\uff01", -11);
    public static final UpgradeError FETCH_SUCCESS_BUT_NO_RECORDS = new UpgradeError("\u62c9\u53d6\u56fa\u4ef6\u5217\u8868\u6210\u529f\u4f46\u6ca1\u6709\u8bb0\u5f55\uff01", -12);
    public static final UpgradeError VERSION_NOT_EXISTED_IN_SERVER = new UpgradeError("\u8be5\u7248\u672c\u5728\u670d\u52a1\u5668\u4e2d\u4e0d\u5b58\u5728", -13);
    public static final UpgradeError CFG_NOT_DOWNLOADED_YET = new UpgradeError("cfg\u6587\u4ef6\u672a\u4e0b\u8f7d\uff01", -21);
    public static final UpgradeError MULTI_COMPONENT_CONFIG_FAILED = new UpgradeError("\u591a\u6a21\u5757\u4e00\u952e\u5347\u7ea7\u914d\u7f6e\u5931\u8d25", -22);
    public static final UpgradeError COMPONENT_ID_NOT_FOUND = new UpgradeError("\u8bbe\u5907\u5df2\u65ad\u8fde", -23);
    public static final UpgradeError INVALID_INTERFACE_PARAM = new UpgradeError("\u63a5\u53e3\u53c2\u6570\u4e0d\u5408\u6cd5", -24);
    public static final UpgradeError DEVICE_CFG_NOT_FETCHED_YET = new UpgradeError("\u8bbe\u5907\u7684cfg\u6587\u4ef6\u8fd8\u672a\u83b7\u53d6\u5230", -25);
    public static final UpgradeError IMAGE_TYPE_NOT_FETCHED_YET = new UpgradeError("\u8bbe\u5907\u7684image type\u8fd8\u672a\u83b7\u53d6\u5230", -26);
    public static final UpgradeError UPGRADE_SDK_INVALID_STATE = new UpgradeError("\u5347\u7ea7\u72b6\u6001\u4e0d\u5408\u6cd5", -27);
    public static final UpgradeError OPEN_APP_UPGRADE_PATH_FAILED = new UpgradeError("\u83b7\u53d6APP\u672c\u5730\u7248\u672c:\u5347\u7ea7\u6587\u4ef6\u8def\u5f84\u4e0d\u5b58\u5728", -28);
    public static final UpgradeError APP_VERSION_LIST_NULL = new UpgradeError("\u83b7\u53d6APP\u672c\u5730\u7248\u672c:\u7248\u672c\u5217\u8868\u4e3a\u7a7a", -29);
    public static final UpgradeError FETCH_SERVER_API_FAILED = new UpgradeError("\u83b7\u53d6\u670d\u52a1\u5668API\u5931\u8d25", -30);
    public static final UpgradeError FETCH_CONFIG_FILE_FAILED = new UpgradeError("\u83b7\u53d6\u4fdd\u5b58config\u6587\u4ef6\u5931\u8d25", -31);
    public static final UpgradeError UPGRADE_STATE_CHANGE_ERROR = new UpgradeError("\u5347\u7ea7\u5e93\u72b6\u6001\u673a\u8df3\u8f6c\u9519\u8bef", -32);
    public static final UpgradeError COMPONENT_NOT_SUPPORT_MULTI_IMAGE = new UpgradeError("component\u4e0d\u652f\u6301\u591aimage", -33);
    public static final UpgradeError INVALID_UPGRADE_CONDITION = new UpgradeError("\u5347\u7ea7\u6761\u4ef6\u4e0d\u5408\u6cd5", -34);
    public static final UpgradeError CANNOT_GET_ROLE = new UpgradeError("\u83b7\u53d6\u89d2\u8272\u5931\u8d25", -35);
    public static final UpgradeError WORKER_ERROR = new UpgradeError("\u5347\u7ea7\u4e3b\u7ebf\u7a0b\u5f02\u5e38", -38);
    public static final UpgradeError MAKE_DIRECTORY_FAILED = new UpgradeError("\u521b\u5efa\u5347\u7ea7\u6587\u4ef6\u4fdd\u5b58\u8def\u5f84\u5931\u8d25", -39);
    public static final UpgradeError CFG_DATA_EXCEPTION = new UpgradeError("\u914d\u7f6e\u6587\u4ef6\u5f02\u5e38", -40);
    public static final UpgradeError SEND_PACK_TIMEOUT = new UpgradeError("\u62c9\u53d6\u56fa\u4ef6cfg\u6587\u4ef6\u4fe1\u606f\u53d1\u5305\u8d85\u65f6", -1000);
    public static final UpgradeError INVALID_PACK_RET_CODE = new UpgradeError("\u62c9\u53d6\u56fa\u4ef6cfg\u6587\u4ef6\u4fe1\u606f\u5931\u8d25\uff0c\u6536\u5230\u4e00\u4e9b\u672a\u5b9a\u4e49\u7684ret code\u3002", -1001);
    public static final UpgradeError CANNOT_FETCH_DEVICE_VERSION = new UpgradeError("\u62c9\u53d6\u4e0d\u5230\u8bbe\u5907\u7684\u7248\u672c\u53f7\u3002", -1002);
    public static final UpgradeError CFG_FILE_ERROR = new UpgradeError("CFG\u6587\u4ef6\u9519\u8bef\u3002", -1003);
    public static final UpgradeError GET_VERSION_ERROR = new UpgradeError("\u83b7\u53d6\u7248\u672c\u53f7\u5931\u8d25\u3002", -1004);
    public static final UpgradeError GET_VERSION_PACK_SIZE_ERROR = new UpgradeError("\u62c9\u53d6\u56fa\u4ef6\u7684\u7248\u672c\u4fe1\u606f\u8fd4\u56de\u7684\u6570\u636e\u5305\u5927\u5c0f\u9519\u8bef", -1005);
    public static final UpgradeError RC_DISCONNECT = new UpgradeError("\u9065\u63a7\u5668\u65ad\u8054", -1006);
    public static final UpgradeError FC_DISCONNECT = new UpgradeError("\u98de\u673a\u65ad\u8054", -1007);
    public static final UpgradeError CFG_CHECK_FAILED = new UpgradeError("\u56fa\u4ef6\u68c0\u67e5cfg\u6587\u4ef6\u5931\u8d25\uff0c\u53ea\u9002\u7528\u4e8e160\u548c161", -1008);
    public static final UpgradeError BATTERY_STATE_INVALID = new UpgradeError("\u7535\u6c60\u7535\u91cf\u5f02\u5e38", -1100);
    public static final UpgradeError BATTERY_RC_LOW_ELECTRICITY = new UpgradeError("\u9065\u63a7\u5668\u7535\u91cf\u8fc7\u4f4e", -1101);
    public static final UpgradeError BATTERY_AIRCRAFT_LOW_ELECTRICITY = new UpgradeError("\u98de\u673a\u7535\u91cf\u8fc7\u4f4e", -1102);
    public static final UpgradeError BATTERY_GLASSES_LOW_ELECTRICITY = new UpgradeError("\u773c\u955c\u7535\u91cf\u8fc7\u4f4e", -1103);
    public static final UpgradeError BATTERY_NOT_DJI_BATTERY = new UpgradeError("\u4e0d\u662f\u5927\u7586\u7535\u6c60", -1104);
    public static final UpgradeError BATTERY_IS_CHECKING = new UpgradeError("\u7535\u6c60\u6b63\u5728\u5347\u7ea7\u4e2d", -1105);
    public static final UpgradeError BATTERY_RC_INTERNAL_LOW_ELECTRICITY = new UpgradeError("\u9065\u63a7\u5668\u5185\u7f6e\u7535\u6c60\u7535\u91cf\u8fc7\u4f4e", -1106);
    public static final UpgradeError BATTERY_CAMERA_LOW_ELECTRICITY = new UpgradeError("\u76f8\u673a\u7535\u91cf\u8fc7\u4f4e", -1107);
    public static final UpgradeError INVALID_DOWNLOAD_INFO = new UpgradeError("\u5f00\u59cb\u4e0b\u8f7d\u9519\u8bef\u3002", -2000);
    public static final UpgradeError LAST_DOWNLOAD_NOT_END = new UpgradeError("\u5f53\u524d\u6b63\u5728\u4e0b\u8f7d\uff01", -2001);
    public static final UpgradeError NO_NETWORK = new UpgradeError("\u5f53\u524d\u6ca1\u6709\u8fde\u63a5\u7f51\u7edc", -2002);
    public static final UpgradeError DOWNLOAD_FAILED = new UpgradeError("\u56fa\u4ef6\u4e0b\u8f7d\u5931\u8d25", -2003);
    public static final UpgradeError STOP_DOWNLOAD_FAILED = new UpgradeError("\u505c\u6b62\u4e0b\u8f7d\u5931\u8d25", -2004);
    public static final UpgradeError INVALID_DOWNLOAD_STATE = new UpgradeError("\u672a\u77e5\u4e0b\u8f7d\u9519\u8bef", -2005);
    public static final UpgradeError INVALID_TRANSFER_STATE = new UpgradeError("\u4f20\u8f93\u5931\u8d25\uff0c\u5f53\u524d\u5347\u7ea7\u6a21\u5757\u5185\u90e8\u72b6\u6001\u673a\u5f02\u5e38\uff01", -3000);
    public static final UpgradeError FIRMWARE_DATA_CHECK_FAILED = new UpgradeError("\u5347\u7ea7\u68c0\u67e5\u5f53\u524d\u6587\u4ef6\u6570\u636e\u90fd\u6b63\u5e38\u5931\u8d25\uff01", -3001);
    public static final UpgradeError ENTER_LOADER_FAILED = new UpgradeError("\u5f00\u59cb\u5347\u7ea7\u5931\u8d25\uff0c\u8fdb\u5165Loader\u5931\u8d25\uff0c\u8bf7\u91cd\u542f\u98de\u673a\u548c\u9065\u63a7\u5668\uff01", -3002);
    public static final UpgradeError RECEIVE_FIRMWARE_REQ_FAILED = new UpgradeError("\u4f20\u8f93\u8fc7\u7a0b\u4e2d\uff0c\u8bf7\u6c42\u98de\u673a\u63a5\u53d7\u6587\u4ef6\u5931\u8d25", -3003);
    public static final UpgradeError VERIFY_FAILED = new UpgradeError("\u6587\u4ef6\u6821\u9a8c\u5931\u8d25!", -3004);
    public static final UpgradeError FIRMWARE_TRANSFER_FAILED = new UpgradeError("\u56fa\u4ef6\u4f20\u8f93\u5931\u8d25\uff01", -3005);
    public static final UpgradeError TRANSFER_CANCELED = new UpgradeError("\u56fa\u4ef6\u4f20\u8f93\u88ab\u53d6\u6d88\uff01", -3006);
    public static final UpgradeError FIRMWARE_TRANSFER_TIME_OUT = new UpgradeError("\u4f20\u8f93\u8fc7\u7a0b\u4e2d\u53d1\u9001\u6570\u636e\u5305\u8d85\u65f6\uff0c\u94fe\u8def\u4e22\u5305\u4e25\u91cd\uff01\uff01", -3007);
    public static final UpgradeError PRODUCT_DISCONNECTED_WHEN_TRANSFERRING = new UpgradeError("\u56fa\u4ef6\u4f20\u8f93\u53d6\u6d88\uff0c\u8bbe\u5907\u5df2\u7ecf\u65ad\u8fde", -3008);
    public static final UpgradeError FIRMWARE_NOT_DOWNLOADED = new UpgradeError("\u56fa\u4ef6\u6ca1\u6709\u4e0b\u8f7d\uff0c\u65e0\u6cd5\u8fdb\u884c\u5347\u7ea7!", -3009);
    public static final UpgradeError EnterLoaderTimeout = new UpgradeError("\u5f00\u59cb\u5347\u7ea7\u5931\u8d25\uff0c\u8fdb\u5165Loader\u8d85\u65f6\uff0c\u5f53\u524d\u94fe\u8def\u4e0d\u7a33\u5b9a!", -3010);
    public static final UpgradeError ReceiveFirmwareReqTimeout = new UpgradeError("\u4f20\u8f93\u8fc7\u7a0b\u4e2d\uff0c\u8bf7\u6c42\u5f00\u59cb\u4f20\u8f93\u6587\u4ef6\u8d85\u65f6\uff0c\u5f53\u524d\u94fe\u8def\u4e0d\u7a33\u5b9a\uff01", -3011);
    public static final UpgradeError CHECK_FAILED = new UpgradeError("\u4f20\u8f93\u8fc7\u7a0b\u4e2d\uff0c\u6587\u4ef6\u4f20\u8f93\u5b8c\u6210\u540e\u8fdb\u884c\u68c0\u67e5\u5931\u8d25!", -3012);
    public static final UpgradeError ENTER_LOADER_FAILED_LOW_BATTERY = new UpgradeError("\u8fdb\u5165Loader\u5931\u8d25\uff0c\u7535\u6c60\u7535\u91cf\u4f4e\uff01", -3013);
    public static final UpgradeError ENTER_LOADER_FAILED_LINK_REVERSE_FAILED = new UpgradeError("\u8fdb\u5165Loader\u5931\u8d25, \u94fe\u8def\u7ffb\u8f6c\u5931\u8d25!", -3014);
    public static final UpgradeError MULTI_COMPONENTS_NO_COMPONENT = new UpgradeError("Upgrade multi components but not set component list", -3015);
    public static final UpgradeError TRIGGER_IMAGE_SWITCH_FAILED = new UpgradeError("\u89e6\u53d1\u56fa\u4ef6\u5207\u6362\uff08\u65e0\u4f20\u8f93\uff09\u547d\u4ee4\uff0c\u56fa\u4ef6\u8fd4\u56de\u5931\u8d25\u9519\u8bef", -3017);
    public static final UpgradeError FETCH_IMAGE_INFORMATIONS_FAILED = new UpgradeError("\u83b7\u53d6\u8bbe\u5907\u7684image\u4fe1\u606f\u5931\u8d25", -3018);
    public static final UpgradeError NO_CONSISTENT_UPGRADE_REQUEST = new UpgradeError("\u5728\u5f53\u524d\u65e0\u4e00\u81f4\u6027\u5347\u7ea7\u8bf7\u6c42\u7684\u60c5\u51b5\u4e0b\uff0c\u89e6\u53d1\u4e00\u81f4\u6027\u5347\u7ea7\uff0c\u76f4\u63a5\u8fd4\u56de\u5931\u8d25", -3020);
    public static final UpgradeError NO_IMAGE_SWITCH_REQUEST = new UpgradeError("\u5728\u5f53\u524d\u65e0image\u5207\u6362\u8bf7\u6c42\u7684\u60c5\u51b5\u4e0b\uff0c\u53d6\u6d88\uff0c\u76f4\u63a5\u8fd4\u56de\u5931\u8d25", -3021);
    public static final UpgradeError START_DATALINK_RECERSE_FAILED = new UpgradeError("\u7ffb\u8f6c\u5230\u4e0a\u4f20\u6a21\u5f0f\u5931\u8d25", -3100);
    public static final UpgradeError STOP_DATALINK_RECERSE_FAILED = new UpgradeError("\u7ffb\u8f6c\u5230\u6b63\u5e38\u6a21\u5f0f\u5931\u8d25", -3101);
    public static final UpgradeError UPGRADE_NO_POWER = new UpgradeError("\u7535\u91cf\u4e0d\u8db3\u56fa\u4ef6\u4e0d\u5141\u8bb8\u5347\u7ea7", -3102);
    public static final UpgradeError UPGRADE_OVER_MEMORY = new UpgradeError("\u56fa\u4ef6\u68c0\u67e5\u8d85\u51fa\u5185\u5b58\uff0c\u4e0d\u5141\u8bb8\u5347\u7ea7", -3103);
    public static final UpgradeError LAST_UPGRADE_NOT_END = new UpgradeError("\u4e0a\u6b21\u5347\u7ea7\u672a\u7ed3\u675f\uff0c\u4e0d\u518d\u6b21\u53d1\u8d77\u5347\u7ea7", -3110);
    public static final UpgradeError UPGRADE_END_FAILED = new UpgradeError("Upgrade end failed", -4000);
    public static final UpgradeError FIRMWARE_ERROR = new UpgradeError("\u56fa\u4ef6\u9519\u8bef", -4001);
    public static final UpgradeError SAME_VERSION = new UpgradeError("\u7248\u672c\u4e00\u81f4", -4002);
    public static final UpgradeError USER_CANCEL = new UpgradeError("\u7528\u6237\u53d6\u6d88", -4003);
    public static final UpgradeError TIME_OUT = new UpgradeError("\u7b49\u5f85\u8d85\u65f6\u53d6\u6d88", -4004);
    public static final UpgradeError MOTOR_RUNNING = new UpgradeError("\u7535\u673a\u8d77\u8f6c", -4005);
    public static final UpgradeError FIRMWARE_NOT_MATCH = new UpgradeError("\u56fa\u4ef6\u4e0d\u5339\u914d", -4006);
    public static final UpgradeError INVALIDATE_ROLL_BACK = new UpgradeError("\u975e\u6cd5\u964d\u7ea7", -4007);
    public static final UpgradeError AIR_DATA_LINK_ERROR = new UpgradeError("\u5929\u7a7a\u7aef\u6570\u636e\u94fe\u8def\u4e0d\u901a", -4008);
    public static final UpgradeError AIR_SDR_ERROR = new UpgradeError("\u5929\u7a7a\u7aefSDR\u6545\u969c", -4009);
    public static final UpgradeError GROUND_SDR_ERROR = new UpgradeError("\u5730\u9762\u7aefSDR\u6545\u969c", -4010);
    public static final UpgradeError TRANSFER_ERROR = new UpgradeError("\u56fa\u4ef6\u4f20\u8f93\u9519\u8bef", -4011);
    public static final UpgradeError AIR_CONTROL_LINK_ERROR = new UpgradeError("\u5929\u7a7a\u7aef\u63a7\u5236\u94fe\u8def\u4e0d\u901a", -4012);
    public static final UpgradeError AIR_FIRMWARE_PACK_ERROR = new UpgradeError("\u5929\u7a7a\u7aef\u56fa\u4ef6\u6253\u5305\u9519\u8bef", -4013);
    public static final UpgradeError NOT_FIND_CONFIG_FILE = new UpgradeError("\u627e\u4e0d\u5230\u5347\u7ea7\u914d\u7f6e\u6587\u4ef6", -4014);
    public static final UpgradeError GLASS_FIMRWARE_PACK_ERROR = new UpgradeError("\u773c\u955c\u7aef\u56fa\u4ef6\u9519\u8bef", -4015);
    public static final UpgradeError GROUND_DISCON_GLASS_FIR_TIME = new UpgradeError("\u5730\u9762\u7aef\u548c\u773c\u955c\u7aef\u5929\u5730\u53cd\u8f6c\u540e\u5931\u8054", -4016);
    public static final UpgradeError GROUND_DISCON_GLASS_SEC_TIME = new UpgradeError("\u5730\u9762\u7aef\u548c\u773c\u955c\u7aef\u5929\u5730\u53cd\u8f6c2\u6b21\u540e\u5931\u8054", -4017);
    public static final UpgradeError GROUND_TO_GLASS_ERROR = new UpgradeError("\u5730\u9762\u7aef\u5411\u773c\u955c\u7aef\u4f20\u8f93\u56fa\u4ef6\u5931\u8d25", -4018);
    public static final UpgradeError FIRMWARE_PACK_EXTRACT_ERROR = new UpgradeError("\u5927\u5305\u89e3\u538b\u7f29\u51fa\u9519", -4019);
    public static final UpgradeError RECOVER_UPGRADE_FAILED = new UpgradeError("\u6062\u590d\u6027\u5347\u7ea7\u5931\u8d25", -4020);
    public static final UpgradeError CONSISTENT_UPGRADE_FAILED = new UpgradeError("\u4e00\u81f4\u6027\u5347\u7ea7\u5931\u8d25", -4021);
    public static final UpgradeError RECOVER_UPGRADE_SUCCESS = new UpgradeError("\u6062\u590d\u6027\u5347\u7ea7\u6210\u529f", -4022);
    public static final UpgradeError CONSISTENT_UPGRADE_SUCCESS = new UpgradeError("\u4e00\u81f4\u6027\u5347\u7ea7\u6210\u529f", -4023);
    public static final UpgradeError UPGRADE_SUCCESS_UPDATE_CACHE_FAILED = new UpgradeError("\u56fa\u4ef6\u5347\u7ea7\u6210\u529f\uff0c\u66f4\u65b0\u7248\u672c\u7f13\u5b58\u5931\u8d25", -4024);
    public static final UpgradeError SUB_DEVICE_UPGRADE_FAILED = new UpgradeError("\u5b50\u8bbe\u5907\u5347\u7ea7\u5931\u8d25", -4032);
    public static final UpgradeError TRIGGER_UPGRADE_FAILED = new UpgradeError("\u65b0\u5347\u7ea7\u65b9\u6848\uff1a\u4f20\u5b8c\u5305\u540e\uff0c\u89e6\u53d1\u5347\u7ea7\u51fa\u9519", -4100);
    public static final UpgradeError COPY_FILE_FAILED = new UpgradeError("\u65b0\u5347\u7ea7\u65b9\u6848\uff1a\u4e0d\u9700\u8981\u4f20\u5305\u65f6\u7684\u5347\u7ea7\uff0c\u62f7\u8d1d\u6587\u4ef6\u5931\u8d25", -4101);
    public static final UpgradeError UPGRADE_REGISTER_DISCONNECT_AFTER_UPGRADE_SUCCESS = new UpgradeError("\u5347\u7ea7\u6210\u529f\uff0c\u4f46\u5347\u7ea7\u6ce8\u518c\u5fc3\u8df3\u65ad\u5f00", -4102);
    public static final UpgradeError TRIGGER_UPGRADE_TIMEOUT = new UpgradeError("\u65b0\u5347\u7ea7\u65b9\u6848\uff1a\u4f20\u5b8c\u5305\u540e\uff0c\u89e6\u53d1\u5347\u7ea7\u8d85\u65f6", -4103);
    public static final UpgradeError UPGRADE_PUSH_PROGRESS_TIMEOUT = new UpgradeError("\u5347\u7ea7\u8fdb\u5ea6\u63a8\u9001\u8d85\u65f6", -4104);
    public static final UpgradeError APP_SPACE_NOT_ENOUGH = new UpgradeError("\u5e94\u7528\u7a7a\u95f4\u4e0d\u8db3", -4046);
    public static final UpgradeError PARSE_APPS_JSON_ERROR = new UpgradeError("\u89e3\u6790\u5e94\u7528\u5217\u8868\u5931\u8d25", -4047);
    public static final UpgradeError STOP_APP_SERVICE_ERROR = new UpgradeError("\u505c\u6b62\u5e94\u7528\u5217\u8868\u5931\u8d25", -4048);
    public static final UpgradeError SET_PERMISSIONS_ERROR = new UpgradeError("\u8bbe\u7f6e\u5e94\u7528\u6743\u9650\u5931\u8d25", -4049);
    public static final UpgradeError START_APP_SERVICE_ERROR = new UpgradeError("\u542f\u52a8\u5e94\u7528\u670d\u52a1\u5931\u8d25", -4050);
    public static final UpgradeError VERIFY_APP_INFO_ERROR = new UpgradeError("\u6821\u9a8c\u5e94\u7528\u4fe1\u606f\u5931\u8d25", -4051);
    public static final UpgradeError UPDATE_APPS_LIST_ERROR = new UpgradeError("\u66f4\u65b0\u5e94\u7528\u5217\u8868\u5931\u8d25", -4052);
    public static final UpgradeError OperationInvalid = new UpgradeError("\u547d\u4ee4\u65e0\u6548", -5000);
    public static final UpgradeError OperationTimeout = new UpgradeError("\u547d\u4ee4\u6267\u884c\u8d85\u65f6", -5001);
    public static final UpgradeError OverMemory = new UpgradeError("\u8d85\u51fa\u5185\u5b58", -5002);
    public static final UpgradeError InvalidParam = new UpgradeError("\u975e\u6cd5\u53c2\u6570", -5003);
    public static final UpgradeError InvalidState = new UpgradeError("\u72b6\u6001\u65e0\u6548", -5004);
    public static final UpgradeError TimeNotSync = new UpgradeError("\u65f6\u95f4\u4e0d\u540c\u6b65", -5005);
    public static final UpgradeError SetParamFailed = new UpgradeError("\u8bbe\u7f6e\u53c2\u6570\u5931\u8d25", -5006);
    public static final UpgradeError GetParamFailed = new UpgradeError("\u83b7\u53d6\u53c2\u6570\u5931\u8d25", -5007);
    public static final UpgradeError NoSDCard = new UpgradeError("\u672a\u63d2\u5165SD Card", -5008);
    public static final UpgradeError SDCardFull = new UpgradeError("SD Card\u6ee1", -5009);
    public static final UpgradeError SDCardError = new UpgradeError("SD Card\u9519\u8bef", -5010);
    public static final UpgradeError CriticalError = new UpgradeError("\u4e25\u91cd\u9519\u8bef", -5011);
    public static final UpgradeError SensorError = new UpgradeError("\u4f20\u611f\u5668\u9519\u8bef", -5012);
    public static final UpgradeError ParamLengthInvalid = new UpgradeError("\u53c2\u6570\u957f\u5ea6\u9519\u8bef", -5013);
    public static final UpgradeError PackIndexInvalid = new UpgradeError("\u5305\u4e71\u5e8f", -5014);
    public static final UpgradeError ExceedFlash = new UpgradeError("\u56fa\u4ef6\u8d85\u51faflash\u7684\u5185\u5b58\u8303\u56f4", -5015);
    public static final UpgradeError FirmwareCheckFailed = new UpgradeError("\u56fa\u4ef6\u68c0\u67e5\u5931\u8d25", -5016);
    public static final UpgradeError EraseFlashFailed = new UpgradeError("\u64e6\u9664flash\u5931\u8d25", -5017);
    public static final UpgradeError FlashProgramError = new UpgradeError("\u56fa\u4ef6\u70e7\u5199\u5931\u8d25", -5018);
    public static final UpgradeError UpgradeStateError = new UpgradeError("\u56fa\u4ef6\u5347\u7ea7\u72b6\u6001\u9519\u8bef", -5019);
    public static final UpgradeError FirmwareTypeError = new UpgradeError("\u5347\u7ea7\u4f7f\u7528\u534f\u8bae\u7c7b\u578b\u65e0\u6548", -5020);
    public static final UpgradeError HardwareError = new UpgradeError("\u786c\u4ef6\u9519\u8bef", -5021);
    public static final UpgradeError CheckConnectionError = new UpgradeError("\u68c0\u67e5\u8fde\u63a5\u9519\u8bef", -5022);
    public static final UpgradeError CheckSecDebugFailed = new UpgradeError("\u5b89\u5168\u8c03\u8bd5\u5df2\u5173\u95ed\uff0c\u4e0d\u652f\u6301\u5c0f\u5305\u5347\u7ea7", -5023);
    public static final UpgradeError BootNotReady = new UpgradeError("CAM APP\u6536\u52300x7\u547d\u4ee4\uff0c\u68c0\u6d4b\u5f53\u524dUVA\u7cfb\u7edf\u8fd8\u6ca1\u6709boot \u597d\uff0c\u4e0d\u80fd\u652f\u6301\u5347\u7ea7\u7ed9\u7684\u9519\u8bef\u7801", -5024);
    public static final UpgradeError NotSupportSDCardUpgrade = new UpgradeError("CAM_APP\u6536\u52300X8\uff0c\u68c0\u67e5\u53d1\u73b0\u4e0d\u652f\u6301SD\u5361\u5347\u7ea7\u7684\u9519\u8bef\u7801", -5025);
    public static final UpgradeError CfgFileWriteFailed = new UpgradeError("\u5b58\u50a8\u5927\u5305CFG\u6587\u4ef6\u5230B:\u5931\u8d25\uff0c\u53cd\u9988\u552e\u540e\uff0c\u5e94\u8be5\u662fB\uff1a\u6587\u4ef6\u7cfb\u7edf\u5f02\u5e38", -5026);
    public static final UpgradeError CfgFileCreateFailed = new UpgradeError("\u521b\u5efaCFG\u6587\u4ef6\u5931\u8d25\uff0c\u53cd\u9988\u552e\u540e\uff0c\u5e94\u8be5\u662fB\uff1a\u6587\u4ef6\u7cfb\u7edf\u5f02\u5e38", -5027);
    public static final UpgradeError GlassesConnectedNotAllowUpgrade = new UpgradeError("\u98de\u673a\u8fde\u63a5\u7740\u773c\u955c\uff0c\u5347\u7ea7\u4e2d\u5fc3\u4e0d\u5141\u8bb8\u5347\u7ea7", -5028);
    public static final UpgradeError DeviceTemperatureInvalid = new UpgradeError("\u8bbe\u5907\u6e29\u5ea6\u5f02\u5e38", -5029);
    public static final UpgradeError UpgradeFilePathError = new UpgradeError("\u5347\u7ea7\u5305\u8def\u5f84\u9519\u8bef", -5030);
    public static final UpgradeError UAVDisconnected = new UpgradeError("\u98de\u673a\u5df2\u65ad\u8fde", -5031);
    public static final UpgradeError FirmwareFlashErasing = new UpgradeError("\u56fa\u4ef6flash\u64e6\u9664\u4e2d", -5032);
    public static final UpgradeError ComponentAndPackageNotMatch = new UpgradeError("\u79bb\u7ebf\u5347\u7ea7\uff0c\u6307\u5b9acomponent\u4e0e\u5927\u5305\u6587\u4ef6\u4e0d\u5339\u914d", -5033);
    public static final UpgradeError FIRMWARE_VERSION_TOO_OLD = new UpgradeError("\u63d0\u4f9b\u7248\u672c\u592a\u8001\uff0c\u4e0d\u5141\u8bb8\u5347\u7ea7", -5034);
    public static final UpgradeError NOT_SUPPORT_UPGRADE = new UpgradeError("\u4e0d\u652f\u6301\u5347\u7ea7", -5035);
    public static final UpgradeError RED_3_3_CHECK_ERROR = new UpgradeError("Red3.3\u68c0\u67e5\u51fa\u9519", -5036);
    public static final UpgradeError UpgradeCurrentModuleError = new UpgradeError("\u5347\u7ea7\u5f53\u524d\u6a21\u5757\u5931\u8d25\u3002", -6000);
    public static final UpgradeError CurrentModuleDisconnect = new UpgradeError("\u5347\u7ea7\u5f53\u524d\u6a21\u5757\u65ad\u5f00\u8fde\u63a5", -6001);
    public static final UpgradeError CurrentModuleFirmwareError = new UpgradeError("\u66f4\u65b0\u5f53\u524d\u6a21\u5757\u56fa\u4ef6\u9519\u8bef", -6002);
    public static final UpgradeError CurrentModuleEnterLoaderFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u8fdb\u5165loader\u5931\u8d25", -6003);
    public static final UpgradeError RequestModuleReceiveFileFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u8bf7\u6c42\u63a5\u53d7\u6587\u4ef6\u5931\u8d25", -6004);
    public static final UpgradeError TransformModuleV1DataFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u8bf7\u6c42V1\u4f20\u8f93\u6570\u636e\u5931\u8d25", -6005);
    public static final UpgradeError TransformModuleFTPDataFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u8bf7\u6c42FTP\u4f20\u8f93\u6587\u4ef6\u5931\u8d25", -6007);
    public static final UpgradeError CurrentModuleHardwareError = new UpgradeError("\u5f53\u524d\u6a21\u5757\u786c\u4ef6\u9519\u8bef", -6008);
    public static final UpgradeError CurrentModuleWriteFirmwareFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u5237\u5165\u786c\u4ef6\u9519\u8bef", -6009);
    public static final UpgradeError CurrentModuleLoadFirmwareToMemoryFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u52a0\u8f7d\u5230\u5185\u5b58\u5931\u8d25", -6010);
    public static final UpgradeError CurrentModuleAccessFileSystemFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u8bbf\u95ee\u6587\u4ef6\u7cfb\u7edf\u5931\u8d25", -6011);
    public static final UpgradeError CurrentModuleWriteFileFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u5199\u6587\u4ef6\u5931\u8d25", -6012);
    public static final UpgradeError CurrentModuleExtraFileFailed = new UpgradeError("\u5f53\u524d\u6a21\u5757\u52a0\u8f7d\u5230\u5185\u5b58\u5931\u8d25", -6013);
    public static final UpgradeError RCEnterLoaderInvalidParam = new UpgradeError("\u8fdb\u5165loader\u53c2\u6570\u9519\u8bef", -7000);
    public static final UpgradeError RCEnterLoaderInvalidState = new UpgradeError("\u8fdb\u5165loader\u9065\u63a7\u5668\u72b6\u6001\u9519\u8bef", -7001);
    public static final UpgradeError RCEnterLoaderMotorIsOn = new UpgradeError("\u8fdb\u5165loader\u5df2\u7ecf\u8d77\u6d46", -7002);
    public static final UpgradeError RCEnterLoaderLowBattery = new UpgradeError("\u9065\u63a7\u5668\u7535\u6c60\u7535\u91cf\u4f4e", -7003);
    public static final UpgradeError RCRequestSendFileInvalidParam = new UpgradeError("\u8bf7\u6c42\u4f20\u8f93\u6587\u4ef6\u53c2\u6570\u9519\u8bef", -7004);
    public static final UpgradeError RCRequestSendFileInvalidState = new UpgradeError("\u8bf7\u6c42\u4f20\u8f93\u6587\u4ef6\u9519\u8bef\u72b6\u6001\u9519\u8bef", -7005);
    public static final UpgradeError RCRequestSendFileOpenFileFailed = new UpgradeError("\u8bf7\u6c42\u4f20\u8f93\u6587\u4ef6\u6253\u5f00\u6587\u4ef6\u9519\u8bef", -7006);
    public static final UpgradeError RCTransformFileInvalidParam = new UpgradeError("\u4f20\u8f93\u6587\u4ef6\u53c2\u6570\u9519\u8bef", -7007);
    public static final UpgradeError RCTransformFileInvalidState = new UpgradeError("\u4f20\u8f93\u6587\u4ef6\u72b6\u6001\u9519\u8bef", -7008);
    public static final UpgradeError RCTransformWriteFileInvalid = new UpgradeError("\u4f20\u8f93\u5199\u6587\u4ef6\u9519\u8bef", -7009);
    public static final UpgradeError RCTransformIndexInvalid = new UpgradeError("\u9519\u8bef\u7684\u6587\u4ef6pack\u5e8f\u53f7", -7010);
    public static final UpgradeError RCTransformPackIndexOverRange = new UpgradeError("\u6587\u4ef6pack\u5e8f\u53f7\u8d85\u8fc7\u6700\u5927\u7684\u5305\u5e8f\u53f7", -7011);
    public static final UpgradeError RCFileVerifyInvalidParam = new UpgradeError("\u6587\u4ef6\u68c0\u9a8c\u53c2\u6570\u9519\u8bef", -7012);
    public static final UpgradeError RCFileVerifyInvalidState = new UpgradeError("\u6587\u4ef6\u68c0\u9a8c\u72b6\u6001\u9519\u8bef", -7013);
    public static final UpgradeError RCMD5Invalid = new UpgradeError("\u6587\u4ef6\u68c0\u9a8cMD5\u9519\u8bef", -7014);
    public static final UpgradeError RCWaitForUpgradePush = new UpgradeError("\u6587\u4ef6\u68c0\u9a8c\u7b49\u5f85client\u56fa\u4ef6\u63a8\u9001\u8d85\u65f6\u3002", -7015);
    public static final UpgradeError RCFileParsingFailed = new UpgradeError("\u6587\u4ef6\u89e3\u6790\u5931\u8d25", -8000);
    public static final UpgradeError RCFlashEraseFailed = new UpgradeError("Flash\u64e6\u9664\u5931\u8d25", -8001);
    public static final UpgradeError RCFlashWriteFailed = new UpgradeError("Flash\u5199\u5931\u8d25", -8002);
    public static final UpgradeError RCFileVerifyFailed = new UpgradeError("\u6587\u4ef6\u6821\u9a8c\u5931\u8d25", -8003);
    public static final UpgradeError RCMCUCommunication = new UpgradeError("MCU\u65e0\u6cd5\u901a\u4fe1", -8004);
    public static final UpgradeError RCMCUEnterLoaderFailed = new UpgradeError("MCU\u8fdb\u5165loader\u5931\u8d25", -8005);
    public static final UpgradeError RCMCUStartReceiveFileFailed = new UpgradeError("MCU\u5f00\u59cb\u63a5\u6536\u6587\u4ef6\u5931\u8d25", -8006);
    public static final UpgradeError RCMCURecvFileFailed = new UpgradeError(" MCU\u63a5\u6536\u6587\u4ef6\u5931\u8d25", -8007);
    public static final UpgradeError RCMCUWriteFirmwareFailed = new UpgradeError("MCU\u5199\u56fa\u4ef6\u5931\u8d25", -8008);
    public static final UpgradeError AIRCRAFT_NEED_DIRECT_CONNECTED = new UpgradeError("\u8981\u76f4\u8fde\u98de\u673a\u624d\u5141\u8bb8\u5347\u7ea7!", -11000);
    public static final UpgradeError UPGRADE_COMPONENT_NOT_RECOGNISED = new UpgradeError("\u6ca1\u6709\u8bc6\u522b\u5230\u5f53\u524d\u5347\u7ea7\u7684\u7ec4\u4ef6!", -11001);
    public static final UpgradeError CONSISTENT_UPGRADE_STATE_ERROR = new UpgradeError("\u4e0d\u80fd\u6267\u884c\u4e00\u81f4\u6027\u5347\u7ea7\uff0c\u6761\u4ef6\u4e0d\u6ee1\u8db3, \u5f53\u524d\u4e0d\u9700\u8981\u6267\u884c\u4e00\u81f4\u6027\u5347\u7ea7\u6216\u8005\u98de\u673a\u5df2\u7ecf\u6253\u6868!", -11002);
    public static final UpgradeError DATA_BASE_COMMON_ERROR = new UpgradeError("Database upgrade common error", -15000);
    public static final UpgradeError DEVICE_REGISTER_LOST = new UpgradeError("\u8bbe\u5907\u6ce8\u518c\u5f02\u5e38\u65ad\u5f00\uff0c\u8bf7\u91cd\u542f\u8bbe\u5907", -20001);
    public static final UpgradeError TRANSFER_REGISTER_LOST = new UpgradeError("\u4f20\u8f93\u6ce8\u518c\u5f02\u5e38\u65ad\u5f00\uff0c\u8bf7\u91cd\u542f\u8bbe\u5907", -20002);
    public static final UpgradeError NO_NEED_DONWLOAD_FILE_TO_UPGRADE = new UpgradeError("dongle\u81ea\u5347\u7ea7\u4e0d\u9700\u8981\u4e0b\u8f7d\u56fa\u4ef6", -20003);
    public static final UpgradeError DONGLE_NO_SIM_CARD = new UpgradeError("dongle\u6ca1\u6709\u63d2\u5165sim\u5361", -20004);
    public static final UpgradeError DONGLE_NETWORK_ERROR = new UpgradeError("dongle\u7f51\u7edc\u5f02\u5e38", -20005);
    public static final UpgradeError DONGLE_FETCH_RELEASE_NOTE_FAILED = new UpgradeError("\u83b7\u53d6release\u4fe1\u606f\u5931\u8d25", -20006);
    private int errorCode;
    private String desc;

    protected UpgradeError(String string2) {
    }

    private UpgradeError(String string2, int n) {
    }

    public static UpgradeError getUpgradeErrorByCode(int n) {
        return null;
    }

    public static UpgradeError getDatabaseUpgradeErrorByCode(int n) {
        return null;
    }

    public int getErrorCode() {
        return 0;
    }

    public String getDescription() {
        return null;
    }

    public String toString() {
        return null;
    }
}

