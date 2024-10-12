package Lab2.Lab2Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("D:\\Programare_java\\PJ_Lab2\\src\\Lab2Ex2\\cantec_in.txt"));
        Scanner terminal_scanner = new Scanner(System.in);
        PrintStream flux_out = new PrintStream("cantec_out.txt");
        int n = 0;
        //String line;
        while(scanner.hasNextLine()) {
            scanner.nextLine();
            n++;
        }
        scanner.close();
        Scanner scanner2 = new Scanner(new File("D:\\Programare_java\\PJ_Lab2\\src\\Lab2Ex2\\cantec_in.txt"));
        String[] cantec = new String[n];

        for(int i = 0; i < cantec.length; i++)
            cantec[i] = scanner2.nextLine();

        System.out.println("Introduceti secventa de final dorita:");
        String ending_seq = terminal_scanner.nextLine();

        Random rand = new Random();
        float random_nr;
        String[] verse;
        String vocals = "aeiouAEIOU";
        int vocal_count;

        for(int i = 0; i < cantec.length; i++)
        {
            vocal_count = 0;
            random_nr = rand.nextFloat(0, 1);
            //System.out.println(random_nr);

            if(random_nr < 0.1)
                cantec[i] = cantec[i].toUpperCase();

            verse = cantec[i].split(" ");
            flux_out.print(cantec[i] + " " + verse.length + " ");

            for(int j = 0; j < cantec[i].length(); j++)
                if(vocals.indexOf(cantec[i].charAt(j)) != -1)
                    vocal_count++;

            flux_out.print(vocal_count);

            if(cantec[i].endsWith(ending_seq))
                flux_out.print(" *");

            flux_out.println();

        }
        flux_out.close();
        scanner.close();
    }
}
