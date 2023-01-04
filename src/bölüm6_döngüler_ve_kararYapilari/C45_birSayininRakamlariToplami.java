package bölüm6_döngüler_ve_kararYapilari;

import java.util.Scanner;

public class C45_birSayininRakamlariToplami{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayi girniz");
        int sayi= scan.nextInt();
        int toplam=0;
        do {

            toplam+=sayi%10;
       sayi/=10;

        }while(sayi>0 );
        System.out.println("girediginiz sayinin Rakamlari toplami= "+toplam);

    }
}
