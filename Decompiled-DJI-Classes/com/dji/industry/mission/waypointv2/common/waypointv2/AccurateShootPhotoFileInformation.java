/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.squareup.wire.Message
 *  com.squareup.wire.Message$Builder
 *  com.squareup.wire.ProtoAdapter
 *  com.squareup.wire.ProtoReader
 *  com.squareup.wire.ProtoWriter
 *  com.squareup.wire.WireField
 *  okio.ByteString
 */
package com.dji.industry.mission.waypointv2.common.waypointv2;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import java.io.IOException;
import okio.ByteString;

public final class AccurateShootPhotoFileInformation
extends Message<AccurateShootPhotoFileInformation, Builder> {
    public static final ProtoAdapter<AccurateShootPhotoFileInformation> ADAPTER = new ProtoAdapter_AccurateShootPhotoFileInformation();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_FILE_NAME_LENGTH = 0;
    public static final Integer DEFAULT_FILE_SIZE = 0;
    public static final String DEFAULT_FILE_MD5 = "";
    public static final String DEFAULT_FILE_NAME = "";
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer file_name_length;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer file_size;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String file_md5;
    @WireField(tag=4, adapter="com.squareup.wire.ProtoAdapter#STRING")
    public final String file_name;

    public AccurateShootPhotoFileInformation(Integer n, Integer n2, String string, String string2) {
    }

    public AccurateShootPhotoFileInformation(Integer n, Integer n2, String string, String string2, ByteString byteString) {
    }

    public Builder newBuilder() {
        return null;
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

    public static final class Builder
    extends Message.Builder<AccurateShootPhotoFileInformation, Builder> {
        public Integer file_name_length;
        public Integer file_size;
        public String file_md5;
        public String file_name;

        public Builder file_name_length(Integer n) {
            return null;
        }

        public Builder file_size(Integer n) {
            return null;
        }

        public Builder file_md5(String string) {
            return null;
        }

        public Builder file_name(String string) {
            return null;
        }

        public AccurateShootPhotoFileInformation build() {
            return null;
        }
    }

    private static final class ProtoAdapter_AccurateShootPhotoFileInformation
    extends ProtoAdapter<AccurateShootPhotoFileInformation> {
        ProtoAdapter_AccurateShootPhotoFileInformation() {
        }

        public int encodedSize(AccurateShootPhotoFileInformation accurateShootPhotoFileInformation) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, AccurateShootPhotoFileInformation accurateShootPhotoFileInformation) throws IOException {
        }

        public AccurateShootPhotoFileInformation decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public AccurateShootPhotoFileInformation redact(AccurateShootPhotoFileInformation accurateShootPhotoFileInformation) {
            return null;
        }
    }
}

