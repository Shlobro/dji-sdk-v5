/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
package dji.sdk.texture.opengl;

import android.graphics.Bitmap;
import java.nio.ByteBuffer;

public class GLUnit {
    private static final String TAG = "GLUnit";

    private GLUnit() {
    }

    public static int genTexture(int n) {
        return 0;
    }

    public static int genTexture(int n, boolean bl) {
        return 0;
    }

    public static void destroyTexture(int n) {
    }

    public static FrameBufferTexturePair genFrameBufferTexture(int n, int n2) {
        return null;
    }

    public static FrameBufferTexturePair genFrameBufferTexture(int n, int n2, boolean bl) {
        return null;
    }

    public static void destroyFrameBuffer(int n) {
    }

    public static void readRGBAData(ByteBuffer byteBuffer, int n, int n2) {
    }

    public static void writeRGBAToFile(ByteBuffer byteBuffer, int n, int n2, String string) {
    }

    public static Bitmap readRGBAFromFile(String string) {
        return null;
    }

    public static class FrameBufferTexturePair {
        public int mFrameBuffer;
        public int mTexture;

        public FrameBufferTexturePair(int n, int n2) {
        }
    }
}

