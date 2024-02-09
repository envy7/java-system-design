package com.filesystem.model;

public interface IFilter {
    boolean isValid(File file, FilterParam filterParam);
}
