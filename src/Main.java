//Alan formülü: π * r * r
//Çevre formülü: 2 * π * r

import java.util.Scanner;

public class Main{
    public static void main(String[]args){

        int r;
        double pi=3.14, alan, cevre;

        Scanner inp= new Scanner(System.in);

        System.out.println("Yarı çap giriniz: ");
        r= inp.nextInt();

        alan= (pi*r*r);
        System.out.println("Alan: "+alan);

        cevre=(2*pi*r);
        System.out.println("Çevre: "+cevre);
    }
}