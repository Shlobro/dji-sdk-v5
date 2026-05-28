/*
 * Decompiled with CFR 0.152.
 */
package dji.rtk.gnss;

import java.text.ParseException;

public final class Datetime {
    public static final String DEFAULT_FORMAT = "YYYY-MM-DD HH:mm:ss.ccc";
    public static final String DEFAULT_FORMAT_NOMS = "YYYY-MM-DD HH:mm:ss";
    public static final String XML_FORMAT = "YYYY-MM-DDTHH:mm:ss.ccczUU:uu";
    public static final String RFC_822_FORMAT = "WW, DD MMM YYYY HH:mm:ss \\G\\M\\T";
    public static final Field YEAR = Field.YEAR;
    public static final Field MONTH = Field.MONTH;
    public static final Field DAY_OF_MONTH = Field.DAY_OF_MONTH;
    public static final Field HOUR_OF_DAY = Field.HOUR_OF_DAY;
    public static final Field MINUTE = Field.MINUTE;
    public static final Field SECOND = Field.SECOND;
    public static final Field MILLISECOND = Field.MILLISECOND;
    public static final int NFIELDS = Field.values().length;
    private long time;
    private boolean timeActual;
    private boolean fieldsActual;
    private final int[] fields;
    public static final String[] MONTH_SHORT_NAMES = new String[]{"Nul", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public static final String[] MONTH_LONG_NAMES = new String[]{"Nulluary", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public static final String[] DOWSZ_SHORT_NAMES = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public static final String[] DOWSZ_LONG_NAMES = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public static final int[] DAYS_PER_MONTH = new int[]{-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, -1};
    public static final int[] DAYS_BEFORE_MONTH = new int[DAYS_PER_MONTH.length];
    public static final int FIRST_MONTH = 1;
    public static final int LAST_MONTH = 12;
    public static final int FIRST_DAY_OF_MONTH = 1;
    public static final int LEAP_DAY_MONTH = 2;
    public static final int SZ_SUNDAY = 0;
    public static final int SZ_MONDAY = 1;
    public static final int SZ_TUESDAY = 2;
    public static final int SZ_WEDNESDAY = 3;
    public static final int SZ_THURSDAY = 4;
    public static final int SZ_FRIDAY = 5;
    public static final int SZ_SATURDAY = 6;

    public static Datetime now() {
        return null;
    }

    public static String getMinSecMs(long l2) {
        return null;
    }

    public static int daysInYear(int n) {
        return 0;
    }

    public static String getTimePeriod(long l2, boolean bl, char c2, String string2, String string3, String string4, String string5) {
        return null;
    }

    public static String getTimePeriod(long l2, boolean bl) {
        return null;
    }

    public static String getTimePeriod(long l2) {
        return null;
    }

    public static Datetime safeParse(String string2, String string3) {
        return null;
    }

    public static Datetime parse(String string2, String string3) throws ParseException {
        return null;
    }

    public static boolean isLeapYear(int n) {
        return false;
    }

    public static int daysPerMonth(int n, int n2) {
        return 0;
    }

    private int daysPerMonth() {
        return 0;
    }

    public Datetime() {
    }

    public Datetime(long l2) {
    }

    public Datetime(int n, int n2, int n3) {
    }

    public Datetime(int n, int n2, int n3, int n4, int n5, int n6) {
    }

    public Datetime(int n, int n2, int n3, int n4, int n5, int n6, int n7) {
    }

    public long getTime() {
        return 0L;
    }

    public Datetime setTime(long l2) {
        return null;
    }

    public Datetime set(Field field, int n) {
        return null;
    }

    public int get(Field field) {
        return 0;
    }

    public Datetime addMillis(long l2) {
        return null;
    }

    public Datetime add(Field field, int n) {
        return null;
    }

    public void actualFields() {
    }

    public void actualTime() {
    }

    public Datetime duplicate() {
        return null;
    }

    public Datetime tomorrow() {
        return null;
    }

    public Datetime yesterday() {
        return null;
    }

    private void setFieldsFromTime() {
    }

    private void setTimeFromFields() {
    }

    public boolean before(Datetime datetime) {
        return false;
    }

    public boolean after(Datetime datetime) {
        return false;
    }

    public boolean same(Datetime datetime) {
        return false;
    }

    protected String formatWithTZ(String string2, int n) {
        return null;
    }

    public String format(String string2, int n, int n2) {
        return null;
    }

    public String format(String string2, int n) {
        return null;
    }

    public String format(String string2) {
        return null;
    }

    public String toString() {
        return null;
    }

    public int year() {
        return 0;
    }

    public int month() {
        return 0;
    }

    public int day() {
        return 0;
    }

    public int dayOfYear() {
        return 0;
    }

    public int dayOfWeekSZ() {
        return 0;
    }

    public int hour() {
        return 0;
    }

    public int hour24() {
        return 0;
    }

    public int hour12() {
        return 0;
    }

    public boolean isAM() {
        return false;
    }

    public boolean isPM() {
        return false;
    }

    public int min() {
        return 0;
    }

    public int sec() {
        return 0;
    }

    public int milli() {
        return 0;
    }

    public boolean equals(Object object) {
        return false;
    }

    public int hashCode() {
        return 0;
    }

    static {
        Datetime.DAYS_BEFORE_MONTH[0] = -1;
        Datetime.DAYS_BEFORE_MONTH[1] = 0;
        for (int i2 = 2; i2 < DAYS_BEFORE_MONTH.length; ++i2) {
            Datetime.DAYS_BEFORE_MONTH[i2] = DAYS_BEFORE_MONTH[i2 - 1] + DAYS_PER_MONTH[i2 - 1];
        }
    }

    public static final class Field
    extends Enum<Field> {
        public static final /* enum */ Field YEAR = new Field();
        public static final /* enum */ Field MONTH = new Field();
        public static final /* enum */ Field DAY_OF_MONTH = new Field();
        public static final /* enum */ Field HOUR_OF_DAY = new Field();
        public static final /* enum */ Field MINUTE = new Field();
        public static final /* enum */ Field SECOND = new Field();
        public static final /* enum */ Field MILLISECOND = new Field();
        private static final /* synthetic */ Field[] $VALUES;

        public static Field[] values() {
            return null;
        }

        public static Field valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ Field[] $values() {
            return null;
        }

        static {
            $VALUES = Field.$values();
        }
    }
}

