package com.filesystem;

import com.filesystem.model.Directory;
import com.filesystem.model.File;
import com.filesystem.model.FilterParam;
import com.filesystem.service.FileFilter;
import com.filesystem.service.UnixFileFilter;

import java.util.List;

public class FileSystem {

    private final FileFilter filefilter = new UnixFileFilter();
    public static void main(String[] args) {
        FileSystem fileSystem = new FileSystem();

        File file1 = new File("abc.txt", "hello".getBytes());
        File file2 = new File("abc.png", "world".getBytes());
        File file3 = new File("bcd.txt", "how".getBytes());
        File file4 = new File("def.png", "are".getBytes());
        File file5 = new File("egh.txt", "you".getBytes());
        File file6 = new File("ghi.png", "sup".getBytes());

        Directory dir1 = new Directory("abc");
        Directory dir2 = new Directory("bcd");

        dir1.addEntry(file1);
        dir1.addEntry(file2);
        dir1.addEntry(file3);

        dir2.addEntry(file4);
        dir2.addEntry(file5);
        dir2.addEntry(file6);

        FilterParam filterParam = new FilterParam.FilterParamBuilder().name("abc").build();

        List<File> filteredFiles = fileSystem.filefilter.search(dir1, filterParam);
        for (File file : filteredFiles) {
            System.out.println(file.getName());
        }
    }
}

// one model class for params
// one model class for implementing the various filters along with an interface
// class with method that is called with a directory and the params and it returns a list of files matching the filters
