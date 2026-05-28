/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.lib.codec.util;

public final class ParsableNalUnitBitArray {
    private byte[] data;
    private int byteLimit;
    private int byteOffset;
    private int bitOffset;

    public ParsableNalUnitBitArray(byte[] byArray, int n, int n2) {
    }

    public void reset(byte[] byArray, int n, int n2) {
    }

    public void skipBit() {
    }

    public void skipBits(int n) {
    }

    public boolean canReadBits(int n) {
        return false;
    }

    public boolean readBit() {
        return false;
    }

    public int readBits(int n) {
        return 0;
    }

    public boolean canReadExpGolombCodedNum() {
        return false;
    }

    public int readUnsignedExpGolombCodedInt() {
        return 0;
    }

    public int readSignedExpGolombCodedInt() {
        return 0;
    }

    private int readExpGolombCodeNum() {
        return 0;
    }

    private boolean shouldSkipByte(int n) {
        return false;
    }
}

