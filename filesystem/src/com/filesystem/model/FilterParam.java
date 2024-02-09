package com.filesystem.model;

public class FilterParam {
    private String name;
    private String extension;
    private int minSize;
    private int maxSize;
    private FilterParam(FilterParamBuilder builder) {
        this.name = builder.name;
        this.extension = builder.extension;
        this.minSize = builder.minSize;
        this.maxSize = builder.maxSize;
    };

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getMinSize() {
        return minSize;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public static class FilterParamBuilder {
        private String name;
        private String extension;
        private int minSize;
        private int maxSize;

        public FilterParamBuilder name(String name) {
            this.name = name;
            return this;
        }

        public FilterParamBuilder extension(String extension) {
            this.extension = extension;
            return this;
        }
        public FilterParamBuilder minSize(int minSize) {
            this.minSize = minSize;
            return this;
        }
        public FilterParamBuilder maxSize(int maxSize) {
            this.maxSize = maxSize;
            return this;
        }

        public FilterParam build() {
            if (name == null && extension == null && minSize == 0 && maxSize == 0) {
                throw new IllegalStateException("At least one parameter is required.");
            }
            return new FilterParam(this);
        }

    }
}
