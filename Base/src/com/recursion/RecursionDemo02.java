package com.recursion;

import java.io.File;
import java.io.IOException;

public class RecursionDemo02 {
    public static void main(String[] args) {
        SearchFile(new File("D:/"), "one.txt");
    }

    public static void SearchFile(File dir, String fileName) {
        if (dir != null && dir.isDirectory()) {
            File files[] = dir.listFiles();
            if (files != null && files.length > 0) {
                for (File file : files) {
                    if (file.isFile()) {
                        if ((file.getName().contains(fileName))) {
                            System.out.println("find it : " + file.getAbsolutePath());
                            Runtime r = Runtime.getRuntime();
                            try {
                                r.exec(file.getAbsolutePath());
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                        }
                    } else {
                        SearchFile(file, fileName);
                    }
                }
            }
        } else {
            return;
        }
    }
}
