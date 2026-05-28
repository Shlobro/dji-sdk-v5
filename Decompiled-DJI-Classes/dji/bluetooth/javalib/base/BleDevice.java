/*
 * Decompiled with CFR 0.152.
 */
package dji.bluetooth.javalib.base;

import dji.bluetooth.javalib.base.BleState;

public class BleDevice
implements Comparable<BleDevice> {
    private String name;
    private String macAddress;
    private int rssi;
    private BleState state;
    private byte[] scanRecord;
    private boolean isConnectedInSystem;
    private int bleId;

    public BleDevice(String string2, String string3, int n, byte[] byArray, int n2) {
    }

    public BleDevice(String string2, String string3, boolean bl, int n, byte[] byArray, int n2) {
    }

    public boolean isConnectedInSystem() {
        return false;
    }

    public String getName() {
        return null;
    }

    public String getMacAddress() {
        return null;
    }

    public int getRssi() {
        return 0;
    }

    public void setState(BleState bleState) {
    }

    public BleState getState() {
        return null;
    }

    public byte[] getScanRecord() {
        return null;
    }

    public String getAddress() {
        return null;
    }

    public int getBleId() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    @Override
    public int compareTo(BleDevice bleDevice) {
        return 0;
    }
}

