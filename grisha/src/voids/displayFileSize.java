package voids;

import org.apache.log4j.Logger;

import java.io.File;
/**
 * Вывод размера файла
 * @author Власов Григорий
 * @version 1.00
 */
public class displayFileSize {
    /** Поле логгера */
    public static final Logger log2 = Logger.getLogger(main.class);
    /**
     * @author Власов Григорий
     * @param file - исходный файл
     * аргументов нет
     */
    public displayFileSize(File file) {

        long fileSize = file.length();
        System.out.println("------------------------------------------------------------");
        System.out.println("File size: " + fileSize + " bytes");
        log2.info("File size: " + fileSize + " bytes");
        new FolderSize(file);
    }
}
