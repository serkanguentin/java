package bölüm6_döngüler_ve_kararYapilari;

import java.util.Scanner;

public class C43_forDöngüsüFaktroriyel { public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("bir sayi girniz");
    int fakt=1;
    int sayi= scan.nextInt();
    for (int i = 1; i <=sayi ; i++) {
        fakt*=i;

    }        System.out.println("faktoriyel "+fakt);

}
}
