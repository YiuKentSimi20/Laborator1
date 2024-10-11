package Lab2.Lab2Ex1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\Programare_java\\PJ_Lab2\\src\\Lab2Ex1\\judete_in.txt"));

        String[] judete;
        judete = scanner.nextLine().split(",");
        scanner.close();

        Arrays.sort(judete);

        Scanner scanner2 = new Scanner(System.in);

        String judet_cautat;

        System.out.println("Introduceti judetul cautat: ");
        judet_cautat = scanner2.nextLine();
        int poz = Arrays.binarySearch(judete, judet_cautat);

        for(int i = 0; i < judete.length; i++){
            System.out.println(i + ". " + judete[i]);
        }

        System.out.println("Judetul " + judet_cautat + " se afla pe pozitia " + poz);

    }
}
