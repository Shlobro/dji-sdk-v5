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

public final class ActionExecuteData
extends Message<ActionExecuteData, Builder> {
    public static final ProtoAdapter<ActionExecuteData> ACTION_EXECUTE_DATA = new ProtoAdapter_ActionExecuteData();
    private static final long serialVersionUID = 0L;
    public static final Integer DEFAULT_ACTION_ID = 0;
    public static final Boolean DEFAULT_RESULT = false;
    public static final Integer DEFAULT_ERROR_CODE = 0;
    @WireField(tag=1, adapter="com.squareup.wire.ProtoAdapter#UINT32")
    public final Integer action_id;
    @WireField(tag=2, adapter="com.squareup.wire.ProtoAdapter#BOOL")
    public final Boolean result;
    @WireField(tag=3, adapter="com.squareup.wire.ProtoAdapter#INT32")
    public final Integer error_code;

    public ActionExecuteData(Integer n, Boolean bl, Integer n2) {
    }

    public ActionExecuteData(Integer n, Boolean bl, Integer n2, ByteString byteString) {
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
    extends Message.Builder<ActionExecuteData, Builder> {
        public Integer action_id;
        public Boolean result;
        public Integer error_code;

        public Builder action_id(Integer n) {
            return null;
        }

        public Builder result(Boolean bl) {
            return null;
        }

        public Builder error_code(Integer n) {
            return null;
        }

        public ActionExecuteData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_ActionExecuteData
    extends ProtoAdapter<ActionExecuteData> {
        ProtoAdapter_ActionExecuteData() {
        }

        public int encodedSize(ActionExecuteData actionExecuteData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, ActionExecuteData actionExecuteData) throws IOException {
        }

        public ActionExecuteData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public ActionExecuteData redact(ActionExecuteData actionExecuteData) {
            return null;
        }
    }
}

