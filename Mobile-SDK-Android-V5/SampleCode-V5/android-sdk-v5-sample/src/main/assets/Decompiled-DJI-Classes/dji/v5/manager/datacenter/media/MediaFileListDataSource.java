/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.manager.datacenter.media;

import dji.sdk.keyvalue.value.camera.CameraStorageLocation;
import dji.sdk.keyvalue.value.common.ComponentIndexType;

public class MediaFileListDataSource {
    private CameraStorageLocation location;
    private ComponentIndexType componentIndexType;

    public MediaFileListDataSource(Builder builder) {
    }

    public CameraStorageLocation getStorageLocation() {
        return null;
    }

    public void setStorageLocation(CameraStorageLocation cameraStorageLocation) {
    }

    public ComponentIndexType getComponentIndexType() {
        return null;
    }

    public void setComponentIndexType(ComponentIndexType componentIndexType) {
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public static class Builder {
        private CameraStorageLocation location;
        private ComponentIndexType indexType;

        public Builder setLocation(CameraStorageLocation cameraStorageLocation) {
            return null;
        }

        public Builder setIndexType(ComponentIndexType componentIndexType) {
            return null;
        }

        public MediaFileListDataSource build() {
            return null;
        }

        static /* synthetic */ CameraStorageLocation access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ ComponentIndexType access$100(Builder builder) {
            return null;
        }
    }
}

