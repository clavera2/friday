package com.clavera2.http;

import java.util.Map;
import java.util.HashMap;

public class HttpRequest {
    private static final String VERSION = "1.0";

    private Method method;
    private final Map<String, String> headers;
    private String body;

    private HttpRequest(RequestBuilder builder) {
        method = builder.getMethod();
        headers = builder.getHeaders();
        body = builder.getBody();
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass().equals(this.getClass())) {
            HttpRequest req = (HttpRequest) other;
            return method.equals(req.method) &&
            headers.equals(req.headers) && 
            body.equals(req.body);
        } 
        return false;
    }

    public static class RequestBuilder {
        private Method method;
        private Map<String, String> headers;
        private StringBuilder body;
        
        public RequestBuilder() {
            headers = new HashMap<>();
            body = new StringBuilder();
        }

        public RequestBuilder setMethod(Method method) {
            this.method = method;
            return this;
        }

        public RequestBuilder setHeader(String key, String value) {
            headers.put(key, value);
            return this;
        }

        public RequestBuilder setBody(String str) {
            body.append(str);
            return this;
        }

        public HttpRequest build() {
            if (method == null) method = Method.GET; // GET by default;
            return new HttpRequest(this);
        }

        public Method getMethod() {
            return method;
        }

        public String getBody() {
            return body.toString();
        }

        public Map<String, String> getHeaders() { return headers; }
    }
}
