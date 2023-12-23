package voids;

import javax.swing.*;
import java.io.File;
/**
 * Выбор директории в которую будем копировать
 * @author Власов Григорий
 * @version 1.00
 */
public class processDestinationSelection {
    /**
     * @author Власов Григорий
     * @param sourceFile - исходный файл
     * аргументов нет
     */
    public processDestinationSelection(File sourceFile) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select destination directory");
            fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
            int result = fileChooser.showSaveDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File destDir = fileChooser.getSelectedFile();
                new copyFileToDestination(sourceFile, destDir);
            }
    }
}
