/*
 * Decompiled with CFR 0.152.
 */
package dji.media.callback;

import dji.media.filelist.FileCacheRange;
import dji.sdk.keyvalue.value.media.MediaFile;

public interface IFileListCacheHolder {
    public boolean isFilter(MediaFile var1);

    public String getSectIdentifier(MediaFile var1);

    public void itemSetChanged();

    public void itemRangeChanged(FileCacheRange var1);

    public void itemRangeInsert(FileCacheRange var1);

    public void itemRangeRemoved(FileCacheRange var1);
}

