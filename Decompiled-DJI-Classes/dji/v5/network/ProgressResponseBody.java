/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.NonNull
 *  okhttp3.MediaType
 *  okhttp3.ResponseBody
 *  okio.Buffer
 *  okio.BufferedSource
 *  okio.ForwardingSource
 *  okio.Okio
 *  okio.Source
 */
package dji.v5.network;

import androidx.annotation.NonNull;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

class ProgressResponseBody
extends ResponseBody {
    public final ResponseBody ut_a;
    public final InnerProgressListener ut_b;
    public BufferedSource ut_c;

    public ProgressResponseBody(ResponseBody responseBody, InnerProgressListener innerProgressListener) {
        this.ut_a = responseBody;
        this.ut_b = innerProgressListener;
    }

    public static /* synthetic */ ResponseBody ut_b(ProgressResponseBody progressResponseBody) {
        return progressResponseBody.ut_a;
    }

    public MediaType contentType() {
        return this.ut_a.contentType();
    }

    public long contentLength() {
        return this.ut_a.contentLength();
    }

    @NonNull
    public BufferedSource source() {
        if (this.ut_c == null) {
            BufferedSource bufferedSource = this.ut_a.source();
            this.ut_c = Okio.buffer((Source)new ForwardingSource((Source)bufferedSource){
                public long ut_a;
                {
                    this.ut_a = 0L;
                }

                public long read(Buffer buffer, long l) throws IOException {
                    long l2 = super.read(buffer, l);
                    long l3 = object.ut_a;
                    long l4 = l2 != -1L ? l2 : 0L;
                    object.ut_a = l3 + l4;
                    if (object.ProgressResponseBody.this.ut_b != null) {
                        1 v0 = object;
                        Object object = v0.ProgressResponseBody.this;
                        InnerProgressListener innerProgressListener = ((ProgressResponseBody)((Object)object)).ut_b;
                        l3 = v0.ut_a;
                        l4 = ((ProgressResponseBody)((Object)object)).ut_a.contentLength();
                        boolean bl = l2 == -1L;
                        innerProgressListener.update(l3, l4, bl);
                    }
                    return l2;
                }
            });
        }
        return this.ut_c;
    }

    public final Source ut_a(Source source) {
        return new /* invalid duplicate definition of identical inner class */;
    }

    public static interface InnerProgressListener {
        public void update(long var1, long var3, boolean var5);
    }
}

