package com.filesystem.service;

import com.filesystem.model.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UnixFileFilter implements FileFilter {

    private final List<IFilter> filters = new ArrayList<>();

    public UnixFileFilter() {
        filters.add(new NameFilter());
    }
    @Override
    public List<File> search(Directory directory, FilterParam filterParam) {
        List<File> files = new ArrayList<>();
        Queue<Directory> queue = new LinkedList<>();
        queue.add(directory);

        while (!queue.isEmpty()) {
            Directory dir = queue.poll();

            for (UnixEntry entry: dir.getEntries()) {
                if (entry.isDirectory()) {
                    queue.add((Directory) entry);
                }
                else {
                    File file = (File) entry;
                    if (isValid(file, filterParam)) {
                        files.add(file);
                    }
                }
            }
        }

        return files;
    }

    public boolean isValid(File file, FilterParam filterParam) {
        for (IFilter filter : filters) {
            if (!filter.isValid(file, filterParam)) {
                return false;
            }
        }

        return true;
    }
}
