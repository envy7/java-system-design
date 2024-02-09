package com.filesystem.service;

import com.filesystem.model.File;
import com.filesystem.model.FilterParam;

public class NameFilter implements IFilter {
    @Override
    public boolean isValid(File file, FilterParam filterParam) {
        if (filterParam.getName() == null) {
            return true;
        }
        return (file.getName().split("\\.")[0]).equals(filterParam.getName());
    }
}
