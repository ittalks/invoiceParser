package com.github.ittalks.invoice.net;

/**
 * Created by liuchunlong on 2017/7/19.
 */
@FunctionalInterface
public interface Error {
    void Error(Object... errors);
}
