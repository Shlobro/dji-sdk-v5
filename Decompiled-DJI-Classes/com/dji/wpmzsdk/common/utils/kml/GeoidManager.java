/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.dji.wpmzsdk.common.utils.kml;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class GeoidManager {
    private static final String TAG = GeoidManager.class.getSimpleName();
    private RandomAccessFile mRandomAccessFile;
    private MappedByteBuffer mMappedByteBuffer;
    private final byte[] mBuffer = new byte[2];
    private static final int MINIMUM_SIZE = 5;

    private GeoidManager() {
    }

    public static GeoidManager getInstance() {
        return Holder.INSTANCE;
    }

    private void closeGeoid() throws IOException {
        if (this.mRandomAccessFile != null) {
            this.mRandomAccessFile.close();
        }
        this.mRandomAccessFile = null;
        if (this.mMappedByteBuffer != null) {
            this.mMappedByteBuffer.clear();
        }
    }

    public void openGeoid96M150(String path) {
        try {
            this.closeGeoid();
            this.mRandomAccessFile = new RandomAccessFile(new File(path), "r");
            FileChannel fileChannel = this.mRandomAccessFile.getChannel();
            this.mMappedByteBuffer = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, fileChannel.size());
        }
        catch (Exception e) {
            Log.e((String)TAG, (String)("openGeoid96M150 error: " + e.getMessage()));
            e.printStackTrace();
        }
    }

    private short fGet2b(int offset) {
        this.mMappedByteBuffer.position(offset);
        this.mMappedByteBuffer.get(this.mBuffer);
        return (short)((this.toUnsignedInt(this.mBuffer[0]) << 8) + this.toUnsignedInt(this.mBuffer[1]));
    }

    private double interpb(double[] y, double a, double b) {
        if (y == null || y.length != 4) {
            return 2000.0;
        }
        return y[0] * (1.0 - a) * (1.0 - b) + y[1] * a * (1.0 - b) + y[2] * (1.0 - a) * b + y[3] * a * b;
    }

    public double geoidhEgm96(double lat, double lon) {
        try {
            double lon0 = 0.0;
            double lat0 = 90.0;
            double dlon = 0.25;
            double dlat = -0.25;
            int nlon = 1440;
            int nlat = 721;
            double[] y = new double[4];
            if (this.mRandomAccessFile == null || this.mMappedByteBuffer == null) {
                return 0.0;
            }
            double a = (lon - 0.0) / 0.25;
            double b = (lat - 90.0) / -0.25;
            int i1 = (int)a;
            a -= (double)i1;
            int i2 = i1 < 1439 ? i1 + 1 : 0;
            int j1 = (int)b;
            b -= (double)j1;
            int j2 = j1 < 720 ? j1 + 1 : j1;
            y[0] = (double)this.fGet2b(2 * (i1 + j1 * 1440)) * 0.01;
            y[1] = (double)this.fGet2b(2 * (i2 + j1 * 1440)) * 0.01;
            y[2] = (double)this.fGet2b(2 * (i1 + j2 * 1440)) * 0.01;
            y[3] = (double)this.fGet2b(2 * (i2 + j2 * 1440)) * 0.01;
            double geoidH = this.interpb(y, a, b);
            if (Math.abs(geoidH) > 200.0) {
                geoidH = 0.0;
            }
            return geoidH;
        }
        catch (Exception e) {
            Log.e((String)TAG, (String)("geoidhEgm96 error: " + e.getMessage()));
            e.printStackTrace();
            return 0.0;
        }
    }

    private int toUnsignedInt(byte b) {
        return b & 0xFF;
    }

    public int getMinimumSize() {
        return 5;
    }

    private static class Holder {
        private static final GeoidManager INSTANCE = new GeoidManager();

        private Holder() {
        }
    }
}

