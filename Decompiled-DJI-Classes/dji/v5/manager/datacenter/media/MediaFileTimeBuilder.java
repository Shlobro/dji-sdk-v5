/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package dji.v5.manager.datacenter.media;

import dji.sdk.keyvalue.value.camera.CameraType;
import dji.sdk.keyvalue.value.camera.MediaFileType;
import dji.sdk.keyvalue.value.media.MediaFile;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u000eJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0007\u00a8\u0006\u0014"}, d2={"Ldji/v5/manager/datacenter/media/MediaFileTimeBuilder;", "", "<init>", "()V", "generateFileName", "", "file", "Ldji/sdk/keyvalue/value/media/MediaFile;", "cameraType", "Ldji/sdk/keyvalue/value/camera/CameraType;", "generateSpecialName", "getExtensionName", "formatTimeStr", "time", "", "formatIndexToStr", "index", "getParsedTime", "getOriginalTime", "mediaFile", "aircraft_release"})
public final class MediaFileTimeBuilder {
    @NotNull
    public static final MediaFileTimeBuilder INSTANCE = new MediaFileTimeBuilder();

    private MediaFileTimeBuilder() {
    }

    @Nullable
    public final String generateFileName(@NotNull MediaFile mediaFile, @Nullable CameraType cameraType) {
        return null;
    }

    @NotNull
    public final String generateSpecialName(@NotNull MediaFile mediaFile) {
        return null;
    }

    @NotNull
    public final String getExtensionName(@NotNull MediaFile mediaFile) {
        return null;
    }

    @Nullable
    public final String formatTimeStr(long l2) {
        return null;
    }

    @NotNull
    public final String formatIndexToStr(long l2) {
        return null;
    }

    public final long getParsedTime(long l2) {
        return 0L;
    }

    public final long getOriginalTime(@NotNull MediaFile mediaFile) {
        return 0L;
    }

    @Metadata(mv={2, 1, 0}, k=3, xi=48)
    public final class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] nArray = new int[MediaFileType.values().length];
            try {
                nArray[MediaFileType.DNG.ordinal()] = 1;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[MediaFileType.MOV.ordinal()] = 2;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[MediaFileType.MP4.ordinal()] = 3;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[MediaFileType.JPEG.ordinal()] = 4;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[MediaFileType.PANORAMA.ordinal()] = 5;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[MediaFileType.TIFF.ordinal()] = 6;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            try {
                nArray[MediaFileType.HEIF.ordinal()] = 7;
            }
            catch (NoSuchFieldError noSuchFieldError) {
                // empty catch block
            }
            $EnumSwitchMapping$0 = nArray;
        }
    }
}

