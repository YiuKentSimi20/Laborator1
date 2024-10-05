package exercitiul5;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(20);
        System.out.println("Numarul generat: " + x);

        int a = 1, b = 1, aux;

        while(b < x){
            aux = a + b;
            a = b;
            b = aux;
        }

        if(x == b){
            System.out.println("Numarul generat apartine sirului Fibbonacci");
        }
        else System.out.println("Numarul generat NU apartine sirului Fibbonacci");
    }
}
