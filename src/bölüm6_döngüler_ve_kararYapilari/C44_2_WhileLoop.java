package bölüm6_döngüler_ve_kararYapilari;

import java.util.Scanner;

public class C44_2_WhileLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz");
        int sayi= scan.nextInt();
        int faktoriyel=1;
        while (sayi>=1){
            faktoriyel*=sayi;
            sayi--;

        }  System.out.println(faktoriyel);
    }
}
