package exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar: ");
        int x = scanner.nextInt();
        int nr_divizori = 0;
        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                System.out.println(i);
                nr_divizori++;
            }
        }

        if(nr_divizori == 2){
            System.out.println("Numarul este prim");
        }
    }
}
