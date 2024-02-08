package com.unixfilesystem.model;

import java.util.ArrayList;
import java.util.List;

public class Directory extends Entry {

    private final List<Entry> entries = new ArrayList<>();

    public Directory(String name) {
        super(name);
    }

    public void addEntry(Entry entry) {
        entries.add(entry);
    }

    @Override
    public int getSize() {
        int total = 0;
        for (Entry entry: entries) {
            total += entry.getSize();
        }

        return total;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }
}
