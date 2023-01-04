package bölüm6_döngüler_ve_kararYapilari;

public class C46_Continue {
    public static void main(String[] args) {
        int i=0;
        while (i<10){
            if (i==3||i==5){
              i++;
              continue;
            }
            System.out.println("i= "+i);
            i++;
        }
    }
}
