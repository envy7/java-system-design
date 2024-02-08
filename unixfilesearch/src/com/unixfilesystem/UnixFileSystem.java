package com.unixfilesystem;

import com.unixfilesystem.model.Directory;
import com.unixfilesystem.model.Entry;
import com.unixfilesystem.model.File;

public class UnixFileSystem {

    public static void main(String[] args) {
        File entry1 = new File("abc.txt", "hello".getBytes());
        File entry2 = new File("abc.png", "world".getBytes());
        Directory entry3 = new Directory("abc");

        entry3.addEntry(entry1);
        entry3.addEntry(entry2);

        System.out.println(entry1.getSize());
        System.out.println(entry2.getSize());
        System.out.println(entry3.getSize());

    }
}

