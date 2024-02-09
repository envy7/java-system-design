package com.filesystem.model;

public class NameFilter implements IFilter {
    @Override
    public boolean isValid(File file, FilterParam filterParam) {
        if (filterParam.getName() == null) {
            return true;
        }
        return file.getName().equals(filterParam.getName());
    }
}
