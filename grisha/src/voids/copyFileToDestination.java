package voids;

import org.apache.log4j.Logger;

import java.io.*;
/**
 * Класс копирование файла в выбранную директорию
 * @author Власов Григорий
 * @version 1.00
 */
public class copyFileToDestination {
    /** Поле логгера */
    public static final Logger logFile = Logger.getLogger(copyFileToDestination.class);
    /**
     * @author Власов Григорий
     * @param sourceFile - исходный файл
     * @param destDir - конечная директория
     * @exception copyFileToDestination - если файл скопирован нкоректно, то используеться обработка исключений IOExeption
     */
    public copyFileToDestination(File sourceFile, File destDir) {
        System.out.println("------------------------------------------------------------");
        System.out.println("copied to: " + destDir.getPath());
        String path_file = sourceFile.getPath();
        path_file = path_file.replace(sourceFile.getName(), "");
        File destFile = new File(destDir.getPath() + "/" + sourceFile.getName());
        String fileName = new String(sourceFile.getName());
        String destinationDirectory = new String(destDir.getPath());
        String sourceDirectory = new String(path_file);
        logFile.info("Copying file:" + fileName+ " from: "+ sourceDirectory +" to: "+destinationDirectory);
        try (FileInputStream fis = new FileInputStream(sourceFile);
             FileOutputStream fos = new FileOutputStream(destFile)) {

            byte[] buffer = new byte[1024];
            int length;
            while ((length = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, length);
            }
            System.out.println("------------------------------------------------------------");
            System.out.println("File copied successfully!");
            logFile.debug("File copied successfully");
            new displayFileSize(sourceFile);
        } catch (IOException e) {
            e.printStackTrace();
            logFile.error("File Not Found", e);
        }
    }
}
