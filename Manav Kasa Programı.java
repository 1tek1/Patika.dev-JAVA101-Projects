import java.util.Scanner;
 class main {
    public static void main(String[] args) {
        double armut = 2.14,elma = 3.67,domates = 1.11,muz = 0.95,patlıcan = 5,toplam;
        double armutk,elmak,domatesk,muzk,patlıcank;
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Armut Kaç Kilo? ");
        armutk = input.nextDouble();
        
        System.out.print("Elma Kaç Kilo? ");
        elmak = input.nextDouble();
        
        System.out.print("Domates Kaç Kilo? ");
        domatesk = input.nextDouble();
        
        System.out.print("Muz Kaç Kilo? ");
        muzk = input.nextDouble();
        
        System.out.print("Patlıcan Kaç Kilo? ");
        patlıcank = input.nextDouble();
        toplam = armut*armutk + elma*elmak + domates*domatesk + muz*muzk + patlıcan*patlıcank;
        System.out.print("Toplam Tutar:"+toplam);
    }
 }