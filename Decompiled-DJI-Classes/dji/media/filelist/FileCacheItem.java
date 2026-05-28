/*
 * Decompiled with CFR 0.152.
 */
package dji.media.filelist;

import dji.sdk.keyvalue.value.media.MediaFile;

public class FileCacheItem
extends MediaFile {
    public static int FILE_TYPE = 0;
    public static int SECT_TYPE = 1;
    private String identifier;

    FileCacheItem(String string2) {
    }

    public int getItemType() {
        return 0;
    }

    public String getIdentifier() {
        return null;
    }

    public void update(MediaFile mediaFile) {
    }
}

