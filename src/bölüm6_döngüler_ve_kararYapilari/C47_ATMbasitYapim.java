package bölüm6_döngüler_ve_kararYapilari;

import java.util.Scanner;

public class C47_ATMbasitYapim {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int bakiye=1000;
        String islemler = "1. Islem : Bakiye Ögrenme\n"+
                          "2. Islem : Para Cekme \n"+
                          "3. Islem :Para Yatirma\n"+
                          "Cikis yapmak icin Q ya basinz";
        System.out.println("***************");
        System.out.println(islemler);
        System.out.println("***************");
    }
}
