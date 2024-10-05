package exercitiul4;

import java.util.Random;

public class MainApp {
    public static void main(String[] args) {
        Random rand =new Random();
        int a = rand.nextInt(1,30);
        int b = rand.nextInt(1,30);

        System.out.println("Primul nr generat: " + a);
        System.out.println("Al doilea nr generat: " + b);


        while(a != b){
            if(a > b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        int cmmdc = a;
        System.out.println("cmmdc: " + cmmdc);
    }
}
