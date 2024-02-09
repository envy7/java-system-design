package com.filesystem.model;

import java.util.ArrayList;
import java.util.List;

public class Directory extends UnixEntry {

    private final List<UnixEntry> entries = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addEntry(UnixEntry unixEntry) {
        entries.add(unixEntry);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (UnixEntry unixEntry : entries) {
            total += unixEntry.getSize();
        }

        return total;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }
}
