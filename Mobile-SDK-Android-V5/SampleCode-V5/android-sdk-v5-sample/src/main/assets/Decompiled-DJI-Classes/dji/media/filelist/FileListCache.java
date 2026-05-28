/*
 * Decompiled with CFR 0.152.
 */
package dji.media.filelist;

import dji.media.callback.IFileListCacheHolder;
import dji.media.filelist.FileCacheItem;
import dji.media.filelist.FileCacheRange;
import dji.media.filelist.FileCacheSect;
import dji.sdk.keyvalue.value.file.FileCacheResponse;
import dji.sdk.keyvalue.value.file.FileLocationMsg;
import dji.sdk.keyvalue.value.media.MediaFile;
import java.util.List;
import java.util.Map;

public class FileListCache {
    private IFileListCacheHolder holder;
    private Map<Integer, FileCacheItem> cacheItemMap;
    private Map<String, FileCacheSect> cacheSectMap;
    private List<FileCacheSect> sects;
    private List<FileCacheItem> items;
    private int listen_id;
    private FileLocationMsg locationMsg;
    private List<MediaFile> metaFiles;

    public void setHolder(IFileListCacheHolder iFileListCacheHolder) {
    }

    public List<FileCacheItem> getItems() {
        return null;
    }

    public List<MediaFile> getMetaFiles() {
        return null;
    }

    public void performReload() {
    }

    public void performForceReload() {
    }

    private void performReload(boolean bl) {
    }

    public void performDelete(List<MediaFile> list) {
    }

    public void performTag(boolean bl, List<MediaFile> list) {
    }

    public void attach() {
    }

    public void detach() {
    }

    private void updateMeta(FileCacheResponse fileCacheResponse) {
    }

    private void reloadMediaFiles(List<MediaFile> list) {
    }

    private void updateMediaFiles(List<MediaFile> list) {
    }

    private void addMediaFiles(List<MediaFile> list) {
    }

    private void removeMediaFiles(List<MediaFile> list) {
    }

    private List<FileCacheItem> sectsToItems(List<FileCacheSect> list) {
        return null;
    }

    private FileCacheItem generateCacheItem(MediaFile mediaFile) {
        return null;
    }

    private void storeCacheItem(FileCacheItem fileCacheItem) {
    }

    private void removeCacheItem(FileCacheItem fileCacheItem) {
    }

    private void storeCacheSect(FileCacheSect fileCacheSect) {
    }

    private void removeCacheSect(FileCacheSect fileCacheSect) {
    }

    private FileCacheSect findLazySect(String string2) {
        return null;
    }

    private void compareItemList(List<FileCacheItem> list, List<FileCacheItem> list2, HolderInvoke holderInvoke) {
    }

    private void invokeRangeChange(FileCacheRange fileCacheRange, HolderInvoke holderInvoke) {
    }

    private static /* synthetic */ void lambda$invokeRangeChange$8(HolderInvoke holderInvoke, FileCacheRange fileCacheRange) {
    }

    private /* synthetic */ void lambda$removeMediaFiles$7(FileCacheRange fileCacheRange) {
    }

    private /* synthetic */ void lambda$addMediaFiles$6(FileCacheRange fileCacheRange) {
    }

    private /* synthetic */ void lambda$updateMediaFiles$5(FileCacheRange fileCacheRange) {
    }

    private /* synthetic */ void lambda$reloadMediaFiles$4() {
    }

    private /* synthetic */ void lambda$attach$3(int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$performTag$2(int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$performDelete$1(int n, byte[] byArray) {
    }

    private static /* synthetic */ void lambda$performReload$0(int n, byte[] byArray) {
    }

    private static interface HolderInvoke {
        public void run(FileCacheRange var1);
    }
}

