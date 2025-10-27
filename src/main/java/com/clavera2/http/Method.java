package com.clavera2.http;

public enum Method {
    GET,
    PUT,
    POST,
    PATCH,
    DELETE;

    public String toString() {
        switch (this) {
            case GET:
                return "GET";
            case PUT:
                return "PUT";
            case PATCH:
                return "PATCH";
            case POST:
                return "POST";
            case DELETE:
                return "DELETE";
            default:
                return "";
        }
    }
}
