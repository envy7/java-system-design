package com.filesystem.model;

public abstract class UnixEntry implements Entry {
    protected String name;

    public UnixEntry(String name) {
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
