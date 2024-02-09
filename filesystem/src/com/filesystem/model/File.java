package com.filesystem.model;

public class File extends UnixEntry {

    private byte[] content;

    public File(String name, byte[] content) {
        super(name);
        this.content = content;
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public int getSize() {
        return content.length;
    }

    public String getExtention() {
        return this.name.split("\\.")[1];
    }

}
