/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.Metadata
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.SourceDebugExtension
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.industry.pilot.mission;

import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 #2\u00020\u0001:\u0001#B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\u000eJ\u0006\u0010\u0010\u001a\u00020\u000eJ\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0003J6\u0010\u0014\u001a\u00020\u00152\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00172\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017J\u0006\u0010\u001a\u001a\u00020\u0015J\u000e\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0003J\u0006\u0010\u001d\u001a\u00020\u000eJ\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0003H\u0002J \u0010\u0014\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u00032\u000e\u0010\"\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0017H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\n\u001a\n \u000b*\u0004\u0018\u00010\u00030\u0003X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\f\u00a8\u0006$"}, d2={"Lcom/dji/industry/pilot/mission/KMZPathWrapper;", "", "dirPath", "", "name", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getDirPath", "()Ljava/lang/String;", "getName", "TAG", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "getClipKmzFile", "Ljava/io/File;", "getDsmResFolder", "getImageResFolder", "getAudioResFolder", "getWaylineFile", "copyClipKmzFile", "refreshRes", "", "imageFiles", "", "dsmFiles", "audioFiles", "clearCache", "unzipFullKmz", "kmzPath", "zipFullKmz", "checkKmzNeedUnzip", "", "origKmz", "storePath", "resFiles", "Factory", "aircraft_release"})
@SourceDebugExtension(value={"SMAP\nKMZPathWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KMZPathWrapper.kt\ncom/dji/industry/pilot/mission/KMZPathWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,227:1\n1557#2:228\n1628#2,3:229\n1863#2,2:234\n13402#3,2:232\n*S KotlinDebug\n*F\n+ 1 KMZPathWrapper.kt\ncom/dji/industry/pilot/mission/KMZPathWrapper\n*L\n165#1:228\n165#1:229,3\n172#1:234,2\n166#1:232,2\n*E\n"})
public final class KMZPathWrapper {
    @NotNull
    public static final Factory Factory = new Factory(null);
    @NotNull
    private final String dirPath;
    @NotNull
    private final String name;
    private String TAG;
    @NotNull
    private static final String KMZ_ROOT_PATH = "wpmz";
    @NotNull
    private static final String CACHE_PATH = "cache";
    @NotNull
    private static final String OUTPUT_KMZ_FILE = "output.kmz";
    @NotNull
    public static final String SUFFIX = ".kmz";
    @NotNull
    public static final String TEMPLATE_FILE = "template.kml";
    @NotNull
    public static final String WAYLINE_FILE = "waylines.wpml";
    @NotNull
    public static final String RES_IMAGE = "wpmz/res/image";
    @NotNull
    public static final String RES_DSM = "wpmz/res/dsm";
    @NotNull
    public static final String RES_AUDIO = "wpmz/res/audio";

    public KMZPathWrapper(@NotNull String string, @NotNull String string2) {
    }

    @NotNull
    public final String getDirPath() {
        return null;
    }

    @NotNull
    public final String getName() {
        return null;
    }

    @NotNull
    public final File getClipKmzFile() {
        return null;
    }

    @NotNull
    public final File getDsmResFolder() {
        return null;
    }

    @NotNull
    public final File getImageResFolder() {
        return null;
    }

    @NotNull
    public final File getAudioResFolder() {
        return null;
    }

    @NotNull
    public final File getWaylineFile() {
        return null;
    }

    @NotNull
    public final File copyClipKmzFile(@NotNull String string) {
        return null;
    }

    public final void refreshRes(@Nullable List<String> list, @Nullable List<String> list2, @Nullable List<String> list3) {
    }

    public final void clearCache() {
    }

    public final void unzipFullKmz(@NotNull String string) {
    }

    @NotNull
    public final File zipFullKmz() {
        return null;
    }

    private final boolean checkKmzNeedUnzip(String string) {
        return false;
    }

    private final void refreshRes(String string, List<String> list) {
    }

    @Metadata(mv={2, 1, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2={"Lcom/dji/industry/pilot/mission/KMZPathWrapper$Factory;", "", "<init>", "()V", "KMZ_ROOT_PATH", "", "CACHE_PATH", "OUTPUT_KMZ_FILE", "SUFFIX", "TEMPLATE_FILE", "WAYLINE_FILE", "RES_IMAGE", "RES_DSM", "RES_AUDIO", "create", "Lcom/dji/industry/pilot/mission/KMZPathWrapper;", "path", "name", "parse", "rootPath", "kmzPath", "aircraft_release"})
    public static final class Factory {
        private Factory() {
        }

        @NotNull
        public final KMZPathWrapper create(@NotNull String string, @NotNull String string2) {
            return null;
        }

        @NotNull
        public final KMZPathWrapper parse(@NotNull String string, @NotNull String string2) {
            return null;
        }

        private static final boolean parse$lambda$0(File file, String string) {
            return false;
        }

        public /* synthetic */ Factory(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }
}

