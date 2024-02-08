package com.unixfilesystem.model;

public interface UnixEntry {

    String getName();

    void setName(String name);

    int getSize();

    boolean isDirectory();
}
