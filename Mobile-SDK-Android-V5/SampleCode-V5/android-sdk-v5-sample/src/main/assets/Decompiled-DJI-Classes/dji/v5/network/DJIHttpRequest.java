/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 */
package dji.v5.network;

import androidx.annotation.Keep;
import dji.v5.common.ldm.LDMExemptModule;
import dji.v5.network.MediaType;
import java.util.Map;

@Keep
public class DJIHttpRequest {
    private final String url;
    private final Map<String, String> params;
    private final LDMExemptModule ldmExemptModule;
    private final RequestType requestType;
    private final String body;
    private final MediaType mediaType;
    private final Map<String, String> headers;

    public String toString() {
        return null;
    }

    public String getUrl() {
        return null;
    }

    public Map<String, String> getParams() {
        return null;
    }

    public LDMExemptModule getLdmExemptModule() {
        return null;
    }

    public RequestType getRequestType() {
        return null;
    }

    public String getBody() {
        return null;
    }

    public MediaType getMediaType() {
        return null;
    }

    public Map<String, String> getHeaders() {
        return null;
    }

    private DJIHttpRequest(Builder builder) {
    }

    /* synthetic */ DJIHttpRequest(Builder builder, 1 var2_2) {
    }

    @Keep
    public static class Builder {
        private String url;
        private Map<String, String> params;
        private LDMExemptModule ldmExemptModule;
        private RequestType requestType;
        private String body;
        private MediaType mediaType;
        private Map<String, String> headers;

        private Builder() {
        }

        public Builder url(String string2) {
            return null;
        }

        public Builder params(Map<String, String> map) {
            return null;
        }

        public Builder ldmExemptModule(LDMExemptModule lDMExemptModule) {
            return null;
        }

        public Builder requestType(RequestType requestType) {
            return null;
        }

        public Builder body(String string2) {
            return null;
        }

        public String toString() {
            return null;
        }

        public Builder mediaType(MediaType mediaType) {
            return null;
        }

        public Builder headers(Map<String, String> map) {
            return null;
        }

        public DJIHttpRequest build() {
            return null;
        }

        public static Builder newBuilder() {
            return null;
        }

        static /* synthetic */ String access$000(Builder builder) {
            return null;
        }

        static /* synthetic */ Map access$100(Builder builder) {
            return null;
        }

        static /* synthetic */ LDMExemptModule access$200(Builder builder) {
            return null;
        }

        static /* synthetic */ RequestType access$300(Builder builder) {
            return null;
        }

        static /* synthetic */ String access$400(Builder builder) {
            return null;
        }

        static /* synthetic */ MediaType access$500(Builder builder) {
            return null;
        }

        static /* synthetic */ Map access$600(Builder builder) {
            return null;
        }
    }

    @Keep
    public static final class RequestType
    extends Enum<RequestType> {
        public static final /* enum */ RequestType GET = new RequestType();
        public static final /* enum */ RequestType POST_ON_BODY = new RequestType();
        public static final /* enum */ RequestType POST_ON_PARAM = new RequestType();
        private static final /* synthetic */ RequestType[] $VALUES;

        public static RequestType[] values() {
            return null;
        }

        public static RequestType valueOf(String string2) {
            return null;
        }

        private static /* synthetic */ RequestType[] $values() {
            return null;
        }

        static {
            $VALUES = RequestType.$values();
        }
    }
}

