package com.decorator;

/**
 * 装饰类：拓展原始类InputStream的功能
 */
public class BufferedInputStream extends InputStream {
    private InputStream is;

    public BufferedInputStream(InputStream is) {
        this.is = is;
    }


    @Override
    public int read() {
        System.out.println("提供8KB的缓冲区，提高读数据性能");
        return is.read();
    }

    @Override
    public int read(byte[] buffer) {
        System.out.println("提供8KB的缓冲区，提高读数据性能");
        return is.read(buffer);
    }
}
