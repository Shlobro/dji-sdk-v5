/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.nmea;

import dji.rtk.nmea.AbstractNmea;

public class NmeaGga
extends AbstractNmea {
    public final AbstractNmea.NmeaDatetimeField utcOfPosition;
    public final AbstractNmea.NmeaLatLonField lat;
    public final AbstractNmea.NmeaLatLonField lon;
    public final AbstractNmea.NmeaFormatField<Integer> quality;
    public final AbstractNmea.NmeaFormatField<Integer> numSats;
    public final AbstractNmea.NmeaFormatField<Double> hdop;
    public final AbstractNmea.NmeaFormatField<Double> antennaAltitude;
    public final AbstractNmea.NmeaConstField unitsOfAntennaAltitude;
    public final AbstractNmea.NmeaFormatField<Double> geoidalSeparation;
    public final AbstractNmea.NmeaConstField unitsOfGeoidalSeparation;
    public final AbstractNmea.NmeaFormatField<Double> ageOfDgpsData;
    public final AbstractNmea.NmeaFormatField<Integer> diffStationId;

    public NmeaGga(String string2) {
    }

    public NmeaGga() {
    }
}

