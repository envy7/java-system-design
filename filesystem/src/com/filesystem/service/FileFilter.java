package com.filesystem.service;

import com.filesystem.model.Directory;
import com.filesystem.model.File;
import com.filesystem.model.FilterParam;

import java.util.List;

public interface FileFilter {
    List<File> search(Directory directory, FilterParam filterParam);
}
