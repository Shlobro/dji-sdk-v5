/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  androidx.annotation.NonNull
 */
package dji.v5.utils.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;

public class ParcelableUtil {
    private ParcelableUtil() {
    }

    public static byte[] parcelable2ByteArray(@NonNull Parcelable parcelable) {
        return null;
    }

    public static String parcelable2String(Parcelable parcelable) {
        return null;
    }

    public static <T> T byteArray2Parcelable(byte[] byArray, @NonNull Parcelable.Creator<T> creator) {
        return null;
    }

    public static <T> T string2Parcelable(String string2, Parcelable.Creator<T> creator) {
        return null;
    }

    @NonNull
    private static Parcel unmarshall(byte[] byArray) {
        return null;
    }
}

