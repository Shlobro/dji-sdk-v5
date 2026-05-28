/*
 * Decompiled with CFR 0.152.
 */
package dji.util;

import dji.rtk.CoordinateSystem;
import dji.rtk.callback.RTKCoordinateSystemCallback;
import dji.rtk.callback.RTKNetworkServiceRTKParamCallback;
import dji.sdk.common.DJIErrorCodeCallback;
import dji.sdk.errorcode.DJIErrorCode;
import dji.sdk.keyvalue.value.rtkbasestation.NetworkRTKParam;

public class CallbackUtil {
    public static void invokeDJIErrorCodeCallback(DJIErrorCodeCallback dJIErrorCodeCallback, DJIErrorCode dJIErrorCode) {
    }

    public static void invokeRTKNetworkServiceRTKParamCallbackOnFailure(RTKNetworkServiceRTKParamCallback rTKNetworkServiceRTKParamCallback, DJIErrorCode dJIErrorCode) {
    }

    public static void invokeRTKNetworkServiceRTKParamCallbackOnSuccess(RTKNetworkServiceRTKParamCallback rTKNetworkServiceRTKParamCallback, NetworkRTKParam networkRTKParam) {
    }

    public static void invokeRTKCoordinateSystemCallbackOnFailure(RTKCoordinateSystemCallback rTKCoordinateSystemCallback, DJIErrorCode dJIErrorCode) {
    }

    public static void invokeRTKCoordinateSystemCallbackOnSuccess(RTKCoordinateSystemCallback rTKCoordinateSystemCallback, CoordinateSystem coordinateSystem) {
    }
}

