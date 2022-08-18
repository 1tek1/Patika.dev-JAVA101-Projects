import java.util.Scanner;

class main {
     public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     double kilo,boy,indeks;
     
     System.out.print("Kilonuzu Giriniz:");
     kilo = input.nextDouble();
     
     System.out.print("Boyunuzu Metre Cinsinden Giriniz(araya nokta değil virgül koyun):");
     boy = input.nextDouble();
     
     indeks = kilo / (boy*boy);
     System.out.print("Vücut Kitle İndeksiniz:"+indeks);
    }
}