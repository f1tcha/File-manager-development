package voids;

import javax.swing.*;
import java.io.File;
/**
 * Выбор фала для копирования
 * @author Власов Григорий
 * @version 1.00
 */
public class processFileSelection {
    /**
     * @author Власов Григорий
     * аргументов нет
     */
    public processFileSelection() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Select source file");
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File sourceFile = fileChooser.getSelectedFile();
            new processDestinationSelection(sourceFile);
        }
    }
}
