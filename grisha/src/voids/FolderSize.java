package voids;
import org.apache.log4j.Logger;

import java.io.*;
/**
 * Вывод всех файлов и их размеры из начальной директории
 * @author Власов Григорий
 * @version 1.00
 */

public class FolderSize {
    /** Поле логгера */
    public static final Logger log1 = Logger.getLogger(FolderSize.class);
    /**
     * @author Власов Григорий
     * @param file1 - исходный файл
     */
    public FolderSize(File file1) {
        System.out.println("------------------------------------------------------------");
        String path_file = file1.getPath();
        path_file = path_file.replace(file1.getName(), "");
        File folder = new File(path_file);
        System.out.println("source file directory: " + path_file);
        System.out.println("------------------------------------------------------------");
        System.out.println("files in directory:");
        log1.info("files in directory:");
        long totalSize = 0;
        if (folder.isDirectory()) {
            File[] files = folder.listFiles();
            for (File file : files) {
                if (file.isFile()) {
                    long fileSize = file.length();
                    System.out.println(file.getName() + " - " + fileSize + " bytes");
                    log1.info(file.getName() + " - " + fileSize + " bytes");
                    totalSize += fileSize;
                }
            }
            System.out.println("Total size of source directory: " + totalSize + " bytes");
            log1.info("Total size of source directory: " + totalSize + " bytes");
        }
    }
}
