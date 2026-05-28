/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  kotlin.Metadata
 *  kotlin.collections.CollectionsKt
 *  kotlin.jvm.internal.DefaultConstructorMarker
 *  kotlin.jvm.internal.Intrinsics
 *  kotlin.text.StringsKt
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package com.dji.wpmzsdk.common.utils.kml.converter;

import android.content.Context;
import com.dji.wpmzsdk.common.utils.FileUtils;
import com.dji.wpmzsdk.common.utils.KMLZipHelper;
import com.dji.wpmzsdk.common.utils.kml.EncryptUtil;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\t\u0018\u0000 $2\u00020\u0001:\u0001$B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003H\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0003J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0016\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0013J\u0006\u0010\u0018\u001a\u00020\u0013J \u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00032\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cH\u0002J6\u0010\u0019\u001a\u00020\u00102\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u001cJ\u000e\u0010 \u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rJ\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u0003J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0006\u001a\u00020\u0003X\u0082D\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006%"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/converter/KMZPathWrapper;", "", "dirPath", "", "name", "(Ljava/lang/String;Ljava/lang/String;)V", "TAG", "getDirPath", "()Ljava/lang/String;", "getName", "checkKmzNeedUnzip", "", "context", "Landroid/content/Context;", "origKmz", "clearCache", "", "clearOtherClipKmzFile", "copyClipKmzFile", "Ljava/io/File;", "getAudioResFolder", "getClipKmzFile", "getDsmResFolder", "getImageResFolder", "getWaylineFile", "refreshRes", "storePath", "resFiles", "", "imageFiles", "dsmFiles", "audioFiles", "repackClipKmzFile", "unzipFullKmz", "kmzPath", "zipFullKmz", "Factory", "wpmzsdk_release"})
public final class KMZPathWrapper {
    @NotNull
    public static final Factory Factory = new Factory(null);
    @NotNull
    private final String dirPath;
    @NotNull
    private final String name;
    @NotNull
    private final String TAG;
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

    public KMZPathWrapper(@NotNull String dirPath, @NotNull String name) {
        Intrinsics.checkNotNullParameter((Object)dirPath, (String)"dirPath");
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        this.dirPath = dirPath;
        this.name = name;
        this.TAG = "KMZPathWrapper";
        new File(this.dirPath).mkdirs();
    }

    @NotNull
    public final String getDirPath() {
        return this.dirPath;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final File getClipKmzFile() {
        return new File(this.dirPath, Intrinsics.stringPlus((String)this.name, (Object)SUFFIX));
    }

    @NotNull
    public final File getDsmResFolder() {
        return new File(this.dirPath, RES_DSM);
    }

    @NotNull
    public final File getImageResFolder() {
        return new File(this.dirPath, RES_IMAGE);
    }

    @NotNull
    public final File getAudioResFolder() {
        return new File(this.dirPath, RES_AUDIO);
    }

    @NotNull
    public final File getWaylineFile() {
        return new File(this.dirPath, "wpmz/waylines.wpml");
    }

    @NotNull
    public final File copyClipKmzFile(@NotNull String name) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        File localFile = this.getClipKmzFile();
        File cacheFolder = new File(this.dirPath, CACHE_PATH);
        cacheFolder.mkdirs();
        File renameFile = new File(cacheFolder, name);
        FileUtils.copyFileByChannel(localFile.getPath(), renameFile.getPath());
        return renameFile;
    }

    public final void repackClipKmzFile(@NotNull Context context) throws IOException {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        this.clearOtherClipKmzFile();
        File rootFolder = new File(this.dirPath, KMZ_ROOT_PATH);
        File outputFile = this.getClipKmzFile();
        outputFile.createNewFile();
        Object[] objectArray = new String[]{rootFolder.getPath()};
        KMLZipHelper.zipFiles(context, CollectionsKt.mutableListOf((Object[])objectArray), outputFile.getPath());
    }

    public final void refreshRes(@Nullable List<String> imageFiles, @Nullable List<String> dsmFiles, @Nullable List<String> audioFiles) {
        this.refreshRes(RES_IMAGE, imageFiles);
        this.refreshRes(RES_DSM, dsmFiles);
        this.refreshRes(RES_AUDIO, audioFiles);
    }

    public final void clearCache() {
        FileUtils.delFile(this.dirPath);
    }

    public final void clearOtherClipKmzFile() {
        File[] childFile = new File(this.dirPath).listFiles(KMZPathWrapper::clearOtherClipKmzFile$lambda-0);
        if (childFile != null && !(childFile.length == 0)) {
            File[] $this$forEach$iv = childFile;
            boolean $i$f$forEach = false;
            for (File element$iv : $this$forEach$iv) {
                File it = element$iv;
                boolean bl = false;
                it.delete();
            }
        }
    }

    public final void unzipFullKmz(@NotNull Context context, @NotNull String kmzPath) {
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        Intrinsics.checkNotNullParameter((Object)kmzPath, (String)"kmzPath");
        if (!this.checkKmzNeedUnzip(context, kmzPath)) {
            return;
        }
        String string = KMLZipHelper.getSelectFilePath(context, kmzPath, TEMPLATE_FILE);
        if (string == null) {
            return;
        }
        String templateRelativePath = string;
        FileUtils.delFile(this.dirPath);
        new File(this.dirPath).mkdirs();
        File unzipFolder = new File(this.dirPath, "temp");
        KMLZipHelper.unZipFolder(context, kmzPath, unzipFolder.getPath(), false);
        File rootFolder = new File(this.dirPath, KMZ_ROOT_PATH);
        File file = new File(unzipFolder, templateRelativePath).getParentFile();
        if (file != null) {
            file.renameTo(rootFolder);
        }
        try {
            File waylineFile;
            List zipFiles = new ArrayList();
            File templateFile = new File(rootFolder, TEMPLATE_FILE);
            File cacheFolder = new File(this.dirPath, "cache/wpmz");
            cacheFolder.mkdirs();
            if (templateFile.exists()) {
                File copyTemp = new File(cacheFolder, TEMPLATE_FILE);
                FileUtils.copyFileByChannel(templateFile.getPath(), copyTemp.getPath());
            }
            if ((waylineFile = new File(rootFolder, WAYLINE_FILE)).exists()) {
                File copyWayline = new File(cacheFolder, WAYLINE_FILE);
                FileUtils.copyFileByChannel(waylineFile.getPath(), copyWayline.getPath());
            }
            if (templateFile.exists() || waylineFile.exists()) {
                String string2 = cacheFolder.getPath();
                Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"cacheFolder.path");
                zipFiles.add(string2);
                this.getClipKmzFile().createNewFile();
                KMLZipHelper.zipFiles(context, zipFiles, this.getClipKmzFile().getPath());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @NotNull
    public final File zipFullKmz(@NotNull Context context) {
        File file;
        Intrinsics.checkNotNullParameter((Object)context, (String)"context");
        try {
            KMLZipHelper.unZipFolder(context, this.getClipKmzFile().getPath(), this.dirPath, false);
            File rootFolder = new File(this.dirPath, KMZ_ROOT_PATH);
            File cacheFolder = new File(this.dirPath, CACHE_PATH);
            cacheFolder.mkdirs();
            File outputFile = new File(cacheFolder, OUTPUT_KMZ_FILE);
            outputFile.createNewFile();
            Object[] objectArray = new String[]{rootFolder.getPath()};
            KMLZipHelper.zipFiles(context, CollectionsKt.mutableListOf((Object[])objectArray), outputFile.getPath());
            file = outputFile;
        }
        catch (Exception e) {
            file = this.getClipKmzFile();
        }
        return file;
    }

    private final boolean checkKmzNeedUnzip(Context context, String origKmz) {
        File clipKmzFile = this.getClipKmzFile();
        if (clipKmzFile.exists() && clipKmzFile.length() > 0L) {
            File rootFolder = new File(this.dirPath, KMZ_ROOT_PATH);
            rootFolder.mkdirs();
            String origTemplateFilePath = new File(rootFolder, TEMPLATE_FILE).getPath();
            File cacheFolder = new File(this.dirPath, CACHE_PATH);
            cacheFolder.mkdirs();
            String clipTemplateFilePath = new File(cacheFolder, "template.kml.temp").getPath();
            File origTemplateFile = KMLZipHelper.unZipFile(context, origKmz, origTemplateFilePath, TEMPLATE_FILE);
            File clipTemplateFile = KMLZipHelper.unZipFile(context, clipKmzFile.getPath(), clipTemplateFilePath, TEMPLATE_FILE);
            if (origTemplateFile != null && clipTemplateFile != null) {
                return !Objects.equals(FileUtils.getFileMD5(origTemplateFile), FileUtils.getFileMD5(clipTemplateFile));
            }
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    private final void refreshRes(String storePath, List<String> resFiles) {
        File resDir = new File(this.dirPath, storePath);
        if (resFiles != null && !((Collection)resFiles).isEmpty()) {
            File it;
            void $this$mapTo$iv$iv;
            if (!resDir.exists()) {
                resDir.mkdirs();
            }
            Iterable $this$map$iv = resFiles;
            boolean $i$f$map = false;
            Iterable iterable = $this$map$iv;
            File[] destination$iv$iv = (File[])new ArrayList(CollectionsKt.collectionSizeOrDefault((Iterable)$this$map$iv, (int)10));
            int $i$f$mapTo = 0;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                String string = (String)item$iv$iv;
                File[] fileArray = destination$iv$iv;
                boolean bl = false;
                fileArray.add(new File((String)((Object)it)).getName());
            }
            List resFileNames = (List)destination$iv$iv;
            File[] fileArray = resDir.listFiles();
            if (fileArray != null) {
                File[] $this$forEach$iv = fileArray;
                boolean $i$f$forEach = false;
                for (File element$iv : $this$forEach$iv) {
                    it = element$iv;
                    boolean bl = false;
                    if (resFileNames.contains(it.getName())) continue;
                    it.delete();
                }
            }
            Iterable $this$forEach$iv = resFiles;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                String it2 = (String)element$iv;
                boolean bl = false;
                File src = new File(it2);
                File dst = new File(resDir, src.getName());
                if (dst.exists()) continue;
                FileUtils.copyFileByChannel(it2, dst.getPath());
            }
        } else if (resDir.exists()) {
            FileUtils.delFile(resDir);
        }
    }

    private static final boolean clearOtherClipKmzFile$lambda-0(File $noName_0, String name) {
        Intrinsics.checkNotNullParameter((Object)name, (String)"name");
        return StringsKt.endsWith$default((String)name, (String)SUFFIX, (boolean)false, (int)2, null);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 6, 0}, k=1, xi=48, d1={"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004J\u001e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2={"Lcom/dji/wpmzsdk/common/utils/kml/converter/KMZPathWrapper$Factory;", "", "()V", "CACHE_PATH", "", "KMZ_ROOT_PATH", "OUTPUT_KMZ_FILE", "RES_AUDIO", "RES_DSM", "RES_IMAGE", "SUFFIX", "TEMPLATE_FILE", "WAYLINE_FILE", "create", "Lcom/dji/wpmzsdk/common/utils/kml/converter/KMZPathWrapper;", "path", "name", "parse", "context", "Landroid/content/Context;", "rootPath", "kmzPath", "wpmzsdk_release"})
    public static final class Factory {
        private Factory() {
        }

        @NotNull
        public final KMZPathWrapper create(@NotNull String path, @NotNull String name) {
            Intrinsics.checkNotNullParameter((Object)path, (String)"path");
            Intrinsics.checkNotNullParameter((Object)name, (String)"name");
            File cachePath = new File(path);
            String string = cachePath.getPath();
            Intrinsics.checkNotNullExpressionValue((Object)string, (String)"cachePath.path");
            return new KMZPathWrapper(string, name);
        }

        @NotNull
        public final KMZPathWrapper parse(@NotNull Context context, @NotNull String rootPath, @NotNull String kmzPath) {
            KMZPathWrapper kMZPathWrapper;
            Intrinsics.checkNotNullParameter((Object)context, (String)"context");
            Intrinsics.checkNotNullParameter((Object)rootPath, (String)"rootPath");
            Intrinsics.checkNotNullParameter((Object)kmzPath, (String)"kmzPath");
            File file = new File(kmzPath);
            if (file.isFile()) {
                String string = file.getName();
                Intrinsics.checkNotNullExpressionValue((Object)string, (String)"file.name");
                String kmzName = StringsKt.replace$default((String)string, (String)KMZPathWrapper.SUFFIX, (String)"", (boolean)false, (int)4, null);
                String md5 = EncryptUtil.stringToMD5(kmzName);
                if (md5 == null) {
                    md5 = String.valueOf(Math.abs(kmzName.hashCode()));
                }
                File cachePath = new File(Intrinsics.stringPlus((String)rootPath, (Object)"/temp"), md5);
                String string2 = cachePath.getPath();
                Intrinsics.checkNotNullExpressionValue((Object)string2, (String)"cachePath.path");
                KMZPathWrapper pathWrapper = this.create(string2, kmzName);
                pathWrapper.unzipFullKmz(context, kmzPath);
                kMZPathWrapper = pathWrapper;
            } else {
                String kmzName = "";
                File[] childFile = file.listFiles(Factory::parse$lambda-0);
                if (childFile != null && !(childFile.length == 0)) {
                    String string = childFile[0].getName();
                    Intrinsics.checkNotNullExpressionValue((Object)string, (String)"childFile[0].name");
                    kmzName = StringsKt.replace$default((String)string, (String)KMZPathWrapper.SUFFIX, (String)"", (boolean)false, (int)4, null);
                }
                kMZPathWrapper = new KMZPathWrapper(kmzPath, kmzName);
            }
            return kMZPathWrapper;
        }

        private static final boolean parse$lambda-0(File $noName_0, String name) {
            Intrinsics.checkNotNullParameter((Object)name, (String)"name");
            return StringsKt.endsWith$default((String)name, (String)KMZPathWrapper.SUFFIX, (boolean)false, (int)2, null);
        }

        public /* synthetic */ Factory(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}

