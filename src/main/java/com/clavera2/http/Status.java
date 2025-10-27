package com.clavera2.http;

public enum Status {
    Ok,
    BadRequest,
    UnAuthorized,
    Forbidden,
    NotFound;

    @Override
    public String toString() {
        switch (this) {
            case Ok:
                return "Ok";
            case BadRequest:
                return "BasRequest";
            case UnAuthorized:
                return "UnAuthorized";
            case Forbidden:
                return "Forbidden";
            case NotFound:
                return "NotFound";
            default:
                return "";
        }
    }
}
