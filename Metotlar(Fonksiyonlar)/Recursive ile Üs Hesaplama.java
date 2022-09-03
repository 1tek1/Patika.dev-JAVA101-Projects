import java.util.Scanner;

class main {

    static int usAlma(int taban, int us) {
        if (us == 0){
            return 1;
        }
            
            return taban * usAlma(taban, us - 1);
        
           
    }

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Tabanı Girin : ");
        int taban = input.nextInt();
        
        System.out.print("Üssü Girin : ");
        int us = input.nextInt();

        System.out.println("Sonuç : " + usAlma(taban,us));

    }
}