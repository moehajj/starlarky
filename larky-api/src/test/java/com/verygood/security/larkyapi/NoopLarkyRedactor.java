package com.verygood.security.larkyapi;

//public class NoopLarkyRedactor {
public class NoopLarkyRedactor implements LarkyRedactor {
    @Override
    public Object get(Object value, Object storage) {
        return value;
    }

    @Override
    public Object put(Object value, Object storage, Object format) {
        return value;
    }
}