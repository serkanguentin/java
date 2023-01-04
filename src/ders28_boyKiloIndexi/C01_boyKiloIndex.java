package ders28_boyKiloIndexi;

import java.util.Scanner;

public class C01_boyKiloIndex {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen kilonuzu giriniz");
        int kilo= scan.nextInt();
        System.out.println("lütfen boyunuzu giriniz :1.76");
        double boy= scan.nextDouble();

        System.out.println("Beden kütle indexsiniz : " + kilo/(boy*boy));

    }
}
