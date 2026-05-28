/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package dji.v5.common.utils;

import android.content.Context;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;

public class GeoidManager {
    private static final String TAG = GeoidManager.class.getSimpleName();
    private RandomAccessFile mRandomAccessFile;
    private MappedByteBuffer mMappedByteBuffer;
    private final byte[] mBuffer;
    private static final int MINIMUM_SIZE = 5;

    private GeoidManager() {
    }

    public static GeoidManager getInstance() {
        return null;
    }

    public void init(Context context) {
    }

    private void closeGeoid() throws IOException {
    }

    public void openGeoid96M150(String string2) {
    }

    private short fGet2b(int n) {
        return 0;
    }

    private double interpb(double[] dArray, double d2, double d3) {
        return 0.0;
    }

    public double geoidhEgm96(double d2, double d3) {
        return 0.0;
    }

    private int toUnsignedInt(byte by) {
        return 0;
    }

    public int getMinimumSize() {
        return 0;
    }

    private /* synthetic */ void lambda$init$0(Context context) {
    }

    /* synthetic */ GeoidManager(1 var1_1) {
    }

    private static class Holder {
        private static final GeoidManager INSTANCE = new GeoidManager(null);

        private Holder() {
        }

        static /* synthetic */ GeoidManager access$100() {
            return null;
        }
    }
}

