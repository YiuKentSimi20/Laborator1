package Lab2.Lab2Ex3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\Programare_java\\PJ_Lab2\\src\\Lab2Ex3\\ex3_in.txt"));
        StringBuilder text = new StringBuilder(scanner.nextLine());
        StringBuilder text_inserat = new StringBuilder(scanner.nextLine());
        int poz_ins = scanner.nextInt();
        System.out.println("text initial: " + text.toString());
        System.out.println("text inserat: " + text_inserat.toString());

        text.insert(poz_ins, text_inserat);
        System.out.println("text after insertion: " + text.toString());

        int poz_del = scanner.nextInt();
        int nr_del = scanner.nextInt();

        text.delete(poz_del, poz_del + nr_del);
        System.out.println("text after deletion: " + text.toString());
        scanner.close();
    }
}
