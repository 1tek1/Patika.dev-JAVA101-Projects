import java.util.Scanner;

class Main {
 public static void main(String[] args) {
    double kdvsizTutar,kdvTutar,kdvliTutar,kdvOran;
    Scanner input = new Scanner(System.in);
    System.out.println("KDV siz tutarı giriniz :");
    kdvsizTutar = input.nextDouble();
    
    kdvOran = (kdvsizTutar <= 1000 && kdvsizTutar > 0) ? 0.18 : 0.08;
    kdvTutar = kdvsizTutar * kdvOran;
    kdvliTutar = kdvsizTutar + kdvTutar;
    
    
    
    System.out.println("KDV siz tutar:" + kdvsizTutar);
    System.out.println("KDV oranı:"+ kdvOran);
    System.out.println("KDV tutarı:"+ kdvTutar);
    System.out.println("KDV Lİ tutar:" + kdvliTutar);

}
}