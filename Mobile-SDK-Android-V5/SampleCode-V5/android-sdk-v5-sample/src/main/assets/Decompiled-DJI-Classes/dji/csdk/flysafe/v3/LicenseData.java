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
package dji.csdk.flysafe.v3;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.WireField;
import dji.csdk.flysafe.v3.LicenseDataAntiInterference;
import dji.csdk.flysafe.v3.LicenseDataArea;
import dji.csdk.flysafe.v3.LicenseDataCircle;
import dji.csdk.flysafe.v3.LicenseDataCountry;
import dji.csdk.flysafe.v3.LicenseDataHeight;
import dji.csdk.flysafe.v3.LicenseDataPolygon;
import dji.csdk.flysafe.v3.LicenseDataPower;
import dji.csdk.flysafe.v3.LicenseDataRID;
import java.io.IOException;
import okio.ByteString;

public final class LicenseData
extends Message<LicenseData, Builder> {
    public static final ProtoAdapter<LicenseData> ADAPTER = new ProtoAdapter_LicenseData();
    private static final long serialVersionUID = 0L;
    @WireField(tag=1, adapter="dji.flysafe.v3.LicenseDataArea#ADAPTER")
    public final LicenseDataArea area;
    @WireField(tag=2, adapter="dji.flysafe.v3.LicenseDataCircle#ADAPTER")
    public final LicenseDataCircle circle;
    @WireField(tag=3, adapter="dji.flysafe.v3.LicenseDataCountry#ADAPTER")
    public final LicenseDataCountry country;
    @WireField(tag=4, adapter="dji.flysafe.v3.LicenseDataHeight#ADAPTER")
    public final LicenseDataHeight height;
    @WireField(tag=5, adapter="dji.flysafe.v3.LicenseDataPolygon#ADAPTER")
    public final LicenseDataPolygon polygon;
    @WireField(tag=6, adapter="dji.flysafe.v3.LicenseDataPower#ADAPTER")
    public final LicenseDataPower power;
    @WireField(tag=7, adapter="dji.flysafe.v3.LicenseDataRID#ADAPTER")
    public final LicenseDataRID rid;
    @WireField(tag=8, adapter="dji.flysafe.v3.LicenseDataAntiInterference#ADAPTER")
    public final LicenseDataAntiInterference anti_interference;

    public LicenseData(LicenseDataArea licenseDataArea, LicenseDataCircle licenseDataCircle, LicenseDataCountry licenseDataCountry, LicenseDataHeight licenseDataHeight, LicenseDataPolygon licenseDataPolygon, LicenseDataPower licenseDataPower, LicenseDataRID licenseDataRID, LicenseDataAntiInterference licenseDataAntiInterference) {
    }

    public LicenseData(LicenseDataArea licenseDataArea, LicenseDataCircle licenseDataCircle, LicenseDataCountry licenseDataCountry, LicenseDataHeight licenseDataHeight, LicenseDataPolygon licenseDataPolygon, LicenseDataPower licenseDataPower, LicenseDataRID licenseDataRID, LicenseDataAntiInterference licenseDataAntiInterference, ByteString byteString) {
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
    extends Message.Builder<LicenseData, Builder> {
        public LicenseDataArea area;
        public LicenseDataCircle circle;
        public LicenseDataCountry country;
        public LicenseDataHeight height;
        public LicenseDataPolygon polygon;
        public LicenseDataPower power;
        public LicenseDataRID rid;
        public LicenseDataAntiInterference anti_interference;

        public Builder area(LicenseDataArea licenseDataArea) {
            return null;
        }

        public Builder circle(LicenseDataCircle licenseDataCircle) {
            return null;
        }

        public Builder country(LicenseDataCountry licenseDataCountry) {
            return null;
        }

        public Builder height(LicenseDataHeight licenseDataHeight) {
            return null;
        }

        public Builder polygon(LicenseDataPolygon licenseDataPolygon) {
            return null;
        }

        public Builder power(LicenseDataPower licenseDataPower) {
            return null;
        }

        public Builder rid(LicenseDataRID licenseDataRID) {
            return null;
        }

        public Builder anti_interference(LicenseDataAntiInterference licenseDataAntiInterference) {
            return null;
        }

        public LicenseData build() {
            return null;
        }
    }

    private static final class ProtoAdapter_LicenseData
    extends ProtoAdapter<LicenseData> {
        ProtoAdapter_LicenseData() {
        }

        public int encodedSize(LicenseData licenseData) {
            return 0;
        }

        public void encode(ProtoWriter protoWriter, LicenseData licenseData) throws IOException {
        }

        public LicenseData decode(ProtoReader protoReader) throws IOException {
            return null;
        }

        public LicenseData redact(LicenseData licenseData) {
            return null;
        }
    }
}

