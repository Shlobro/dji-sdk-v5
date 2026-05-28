/*
 * Decompiled with CFR 0.152.
 */
package dji.upgrade.internal.model;

import dji.upgrade.component.firmware.model.ComponentType;

public class InternalUpgradeComponentType {
    public static final int AIRCRAFT = 0;
    public static final int REMOTE_CONTROLLER = 1;
    public static final int DATABASE = 2;
    public static final int BATTERY_BOX = 3;
    public static final int DRTK = 4;
    public static final int CAMERA = 5;
    public static final int GIMBAL = 6;
    public static final int ADAPTERS = 7;
    public static final int GLASSES = 8;
    public static final int DONGLE = 9;
    public static final int PAYLOAD = 12;
    public static final int RELAY = 11;
    public static final int PAYLOAD_APP = 13;
    public static final int PAYLOAD_AI_BOX = 14;
    public static final int UNKNOWN = 255;

    public static ComponentType getUpgradeComponentType(int n) {
        return null;
    }
}

