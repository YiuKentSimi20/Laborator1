package Lab1.exercitiul1;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("lungime=");
        int lungime = scanner.nextInt();
        System.out.print("latime=");
        int latime = scanner.nextInt();

        int perimetru = 2*(latime + lungime);
        int arie = latime*lungime;

        System.out.println("Perimetrul este " + perimetru);
        System.out.println("Aria este " + arie);

        scanner.close();
    }
}
