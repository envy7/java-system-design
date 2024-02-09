package com.filesystem.service;

import com.filesystem.model.*;

import java.util.ArrayList;
import java.util.List;

public class UnixFileFilter implements FileFilter {

    private final List<IFilter> filters = new ArrayList<>();

    public UnixFileFilter() {
        filters.add(new NameFilter());
    }
    @Override
    public List<File> search(Directory directory, FilterParam filterParam) {
        
    }
}
