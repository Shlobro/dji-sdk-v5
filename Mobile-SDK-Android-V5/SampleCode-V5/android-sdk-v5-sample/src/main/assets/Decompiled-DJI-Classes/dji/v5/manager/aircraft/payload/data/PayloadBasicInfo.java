/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.aircraft.payload.data;

import dji.sdk.keyvalue.value.payload.PayloadProductPhaseType;
import dji.sdk.keyvalue.value.payload.PayloadType;

public class PayloadBasicInfo {
    private PayloadType payloadType;
    private boolean isConnected;
    private int uploadBandwidth;
    private String payloadProductName;
    private PayloadProductPhaseType payloadProductPhaseType;
    private boolean isFeatureOpened;
    private String firmwareVersion;
    private String serialNumber;

    public String getSerialNumber() {
        return null;
    }

    public PayloadType getPayloadType() {
        return null;
    }

    public boolean isConnected() {
        return false;
    }

    public int getUploadBandwidth() {
        return 0;
    }

    public String getPayloadProductName() {
        return null;
    }

    public PayloadProductPhaseType getPayloadProductPhaseType() {
        return null;
    }

    public boolean isFeatureOpened() {
        return false;
    }

    public String getFirmwareVersion() {
        return null;
    }

    public String toString() {
        return null;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }
}

