/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.view.View
 */
package com.dji.flysafe.mapkit.core.core.models;

import android.graphics.Bitmap;
import android.view.View;

public final class DJIBitmapDescriptor {
    private static final String TAG = "DJIBitmapDescriptor";
    private String id;
    private Type mType;
    private Bitmap mBitmap;
    private String mPathString;
    private int mResourceId;
    private View mView;

    DJIBitmapDescriptor(Bitmap bitmap) {
    }

    DJIBitmapDescriptor(String string, Type type) {
    }

    DJIBitmapDescriptor(int n) {
    }

    DJIBitmapDescriptor(View view) {
    }

    public Bitmap getBitmap() {
        return null;
    }

    public void updateBitmap(Bitmap bitmap) {
    }

    public void setId(String string) {
    }

    public String getId() {
        return null;
    }

    public Type getType() {
        return null;
    }

    public String getPath() {
        return null;
    }

    public int getResourceId() {
        return 0;
    }

    public View getView() {
        return null;
    }

    public static final class Type
    extends Enum<Type> {
        public static final /* enum */ Type BITMAP = new Type();
        public static final /* enum */ Type PATH_ABSOLUTE = new Type();
        public static final /* enum */ Type PATH_ASSET = new Type();
        public static final /* enum */ Type PATH_FILEINPUT = new Type();
        public static final /* enum */ Type RESOURCE_ID = new Type();
        public static final /* enum */ Type View = new Type();
        private static final /* synthetic */ Type[] $VALUES;

        public static Type[] values() {
            return null;
        }

        public static Type valueOf(String string) {
            return null;
        }

        private static /* synthetic */ Type[] $values() {
            return null;
        }

        static {
            $VALUES = Type.$values();
        }
    }
}

