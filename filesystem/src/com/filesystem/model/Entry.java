package com.filesystem.model;

public interface Entry {

    String getName();

    void setName(String name);

    int getSize();

    boolean isDirectory();
}
