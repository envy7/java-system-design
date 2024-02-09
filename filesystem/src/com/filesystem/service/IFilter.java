package com.filesystem.service;

import com.filesystem.model.File;
import com.filesystem.model.FilterParam;

public interface IFilter {
    boolean isValid(File file, FilterParam filterParam);
}
