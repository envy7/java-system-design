package com.unixfilesystem.model;

public abstract class Entry implements UnixEntry {
    protected String name;

    public Entry(String name) {
        this.name = name;
    }

    // Other possible members
    // createdAt, modifiedAt, user, group, permission
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
