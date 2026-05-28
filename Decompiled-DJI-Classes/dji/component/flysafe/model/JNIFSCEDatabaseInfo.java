/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.component.flysafe.model;

import androidx.annotation.Keep;
import dji.jni.JNIProguardKeepTag;

@Keep
public class JNIFSCEDatabaseInfo
implements JNIProguardKeepTag {
    public boolean mDbExist;
    public String mMd5;
    public String mVersion;
    public long mTimestamp;
    public CEDatabaseType mType;
    public CEDatabasePosition mPosition;
    public long mDbSize;
    public String mSourceName;

    public JNIFSCEDatabaseInfo(boolean bl, String string, String string2, long l2, int n, int n2, long l3, String string3) {
    }

    public String toString() {
        return null;
    }

    public static final class CEDatabaseType
    extends Enum<CEDatabaseType> {
        public static final /* enum */ CEDatabaseType DJI = new CEDatabaseType(0);
        public static final /* enum */ CEDatabaseType IMPORT = new CEDatabaseType(1);
        public static final /* enum */ CEDatabaseType UNKNOWN = new CEDatabaseType(125);
        private int data;
        private static final /* synthetic */ CEDatabaseType[] $VALUES;

        public static CEDatabaseType[] values() {
            return null;
        }

        public static CEDatabaseType valueOf(String string) {
            return null;
        }

        private CEDatabaseType(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static CEDatabaseType find(int n) {
            return null;
        }

        private static /* synthetic */ CEDatabaseType[] $values() {
            return null;
        }

        static {
            $VALUES = CEDatabaseType.$values();
        }
    }

    public static final class CEDatabasePosition
    extends Enum<CEDatabasePosition> {
        public static final /* enum */ CEDatabasePosition APP = new CEDatabasePosition(0);
        public static final /* enum */ CEDatabasePosition AIRCRAFT = new CEDatabasePosition(1);
        public static final /* enum */ CEDatabasePosition SERVER = new CEDatabasePosition(2);
        public static final /* enum */ CEDatabasePosition UNKNOWN = new CEDatabasePosition(125);
        private int data;
        private static final /* synthetic */ CEDatabasePosition[] $VALUES;

        public static CEDatabasePosition[] values() {
            return null;
        }

        public static CEDatabasePosition valueOf(String string) {
            return null;
        }

        private CEDatabasePosition(int n2) {
        }

        public int value() {
            return 0;
        }

        public boolean _equals(int n) {
            return false;
        }

        public static CEDatabasePosition find(int n) {
            return null;
        }

        private static /* synthetic */ CEDatabasePosition[] $values() {
            return null;
        }

        static {
            $VALUES = CEDatabasePosition.$values();
        }
    }
}

