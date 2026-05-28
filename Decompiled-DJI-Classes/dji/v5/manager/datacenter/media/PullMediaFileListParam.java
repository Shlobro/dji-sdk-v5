/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 */
package dji.v5.manager.datacenter.media;

import androidx.annotation.NonNull;
import dji.sdk.keyvalue.value.file.FileListRequestTimeOrderType;
import dji.v5.manager.datacenter.media.MediaFileFilter;

public class PullMediaFileListParam {
    private MediaFileFilter filter;
    private int mediaFileIndex;
    private int count;
    private FileListRequestTimeOrderType orderType;

    public MediaFileFilter getFilter() {
        return null;
    }

    public int getMediaFileIndex() {
        return 0;
    }

    public FileListRequestTimeOrderType getOrderType() {
        return null;
    }

    public int getCount() {
        return 0;
    }

    public PullMediaFileListParam(Builder builder) {
    }

    @NonNull
    public String toString() {
        return null;
    }

    public static final class Builder {
        private MediaFileFilter filter;
        private int mediaFileIndex;
        private int count;
        private FileListRequestTimeOrderType orderType;

        public Builder filter(MediaFileFilter mediaFileFilter) {
            return null;
        }

        public Builder mediaFileIndex(int n) {
            return null;
        }

        public Builder count(int n) {
            return null;
        }

        public Builder orderType(FileListRequestTimeOrderType fileListRequestTimeOrderType) {
            return null;
        }

        public PullMediaFileListParam build() {
            return null;
        }

        static /* synthetic */ MediaFileFilter access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$100(Builder builder) {
            return 0;
        }

        static /* synthetic */ int access$200(Builder builder) {
            return 0;
        }

        static /* synthetic */ FileListRequestTimeOrderType access$300(Builder builder) {
            return null;
        }
    }
}

