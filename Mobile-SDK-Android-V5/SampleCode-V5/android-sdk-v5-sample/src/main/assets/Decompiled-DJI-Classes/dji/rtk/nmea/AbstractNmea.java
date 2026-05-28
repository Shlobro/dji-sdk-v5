/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.nmea;

import dji.rtk.gnss.Datetime;
import java.util.ArrayList;

public class AbstractNmea {
    protected final ArrayList<NmeaField> _fields;
    public final String talker;
    public final String message;

    public AbstractNmea(String string2, String string3) {
    }

    public String toNmeaString() {
        return null;
    }

    public abstract class NmeaField {
        final /* synthetic */ AbstractNmea this$0;

        public abstract String toNmeaString();

        public NmeaField(AbstractNmea abstractNmea) {
        }
    }

    public class NmeaLatLonField
    extends NmeaValueField<Double> {
        private final char posChar;
        private final char negChar;
        private final String numFormat;
        final /* synthetic */ AbstractNmea this$0;

        public NmeaLatLonField(AbstractNmea abstractNmea, char c2, char c3, String string2) {
        }

        @Override
        public String toNmeaString() {
            return null;
        }

        @Override
        protected String valueToString(Double d2) {
            return null;
        }
    }

    public class NmeaDatetimeField
    extends NmeaValueField<Datetime> {
        private final String formatString;
        final /* synthetic */ AbstractNmea this$0;

        public NmeaDatetimeField(AbstractNmea abstractNmea, String string2) {
        }

        @Override
        protected String valueToString(Datetime datetime) {
            return null;
        }
    }

    public class NmeaFormatField<T>
    extends NmeaValueField<T> {
        private final String formatString;
        final /* synthetic */ AbstractNmea this$0;

        public NmeaFormatField(AbstractNmea abstractNmea, String string2) {
        }

        @Override
        public String valueToString(T t) {
            return null;
        }
    }

    public abstract class NmeaValueField<T>
    extends NmeaField {
        protected T value;
        final /* synthetic */ AbstractNmea this$0;

        public NmeaValueField(AbstractNmea abstractNmea) {
        }

        public T get() {
            return null;
        }

        public void set(T t) {
        }

        @Override
        public String toNmeaString() {
            return null;
        }

        protected abstract String valueToString(T var1);
    }

    public class NmeaConstField
    extends NmeaField {
        public final String constString;
        final /* synthetic */ AbstractNmea this$0;

        public NmeaConstField(AbstractNmea abstractNmea, String string2) {
        }

        @Override
        public String toNmeaString() {
            return null;
        }
    }
}

