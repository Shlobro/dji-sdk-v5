/*
 * Decompiled with CFR 0.152.
 */
package dji.v5.common.video.stream;

import dji.v5.common.KeepProguard;
import dji.v5.common.video.stream.PhysicalDeviceCategory;
import dji.v5.common.video.stream.PhysicalDevicePosition;
import dji.v5.common.video.stream.PhysicalDeviceType;

@Deprecated
public class StreamSource
implements KeepProguard {
    private final PhysicalDeviceCategory physicalDeviceCategory;
    private final PhysicalDevicePosition physicalDevicePosition;
    private final PhysicalDeviceType physicalDeviceType;
    private final int streamId;

    public static Builder builder() {
        return null;
    }

    public StreamSource(Builder builder) {
    }

    public PhysicalDeviceCategory getPhysicalDeviceCategory() {
        return null;
    }

    public PhysicalDeviceType getPhysicalDeviceType() {
        return null;
    }

    public PhysicalDevicePosition getPhysicalDevicePosition() {
        return null;
    }

    public int getStreamId() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return null;
    }

    public static class Builder {
        private PhysicalDeviceCategory physicalDeviceCategory;
        private PhysicalDeviceType physicalDeviceType;
        private PhysicalDevicePosition physicalDevicePosition;
        private int streamId;

        public Builder setPhysicalDeviceCategory(PhysicalDeviceCategory physicalDeviceCategory) {
            return null;
        }

        public Builder setPhysicalDevicePosition(PhysicalDevicePosition physicalDevicePosition) {
            return null;
        }

        public Builder setPhysicalDeviceType(PhysicalDeviceType physicalDeviceType) {
            return null;
        }

        public Builder setStreamId(int n) {
            return null;
        }

        public StreamSource build() {
            return null;
        }

        static /* synthetic */ PhysicalDeviceCategory access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ PhysicalDevicePosition access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ PhysicalDeviceType access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ int access$300(Builder builder) {
            return 0;
        }
    }
}

