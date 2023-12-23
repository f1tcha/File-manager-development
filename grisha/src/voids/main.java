package voids;

import org.apache.log4j.Logger;

import java.util.Scanner;

/**
 * Класс основной программы
 * @author Власов Григорий
 * @version 1.00
 * @since 11
 */
public class main {
    /** Поле логгера */
    public static final Logger log = Logger.getLogger(main.class);
    /**
     * @author Власов Григорий
     * аргументов нет
     */
    public static void main(String[] args) {
        int key = 1;
        log.info("Start app");
        Scanner in = new Scanner(System.in);
        while (key == 1){
            new processFileSelection();
            System.out.println("------------------------------------------------------------");
            System.out.println("1 - continue\n2 - exit");
            key = in.nextInt();
            System.out.println("------------------------------------------------------------");
        }
        in.close();
        log.info("Finish app");
    }
}
