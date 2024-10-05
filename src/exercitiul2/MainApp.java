package exercitiul2;

import java.io.*;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        PrintStream flux_out = new PrintStream ("out.txt");

        Scanner scanner = new Scanner(new File("D:\\Programare_java\\Laborator1\\src\\exercitiul2\\in.txt"));

        int x, suma = 0, minim = Integer.MAX_VALUE, maxim = Integer.MIN_VALUE, n = 0;
        float media;
        while (scanner.hasNextLine()) {
            x = scanner.nextInt();
            n++;
            suma += x;
            if(x < minim) minim = x;
            if(x > maxim) maxim = x;
        }
        media = (float) suma / n;

        flux_out.println("Suma: " + suma);
        flux_out.println("Media: " + media);
        flux_out.println("Minim: " + minim);
        flux_out.println("Maxim: " + maxim);

        scanner.close();
    }
}
