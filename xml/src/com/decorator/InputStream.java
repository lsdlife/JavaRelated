package com.decorator;

/**
 * 共同父类
 */
public abstract class InputStream {
    public abstract int read();
    public abstract int read(byte[] buffer);
}
