import java.util.Scanner;

class main{
    public static void main(String[] args) {
        int matematik,fizik,turkce,kimya,muzik;
        
        int ortalama;
        
        int dersSayi = 0;int toplamNot = 0;
        
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz:");
        matematik = input.nextInt();
        if(!(matematik < 0 || matematik > 100)) {
            toplamNot += matematik;
            dersSayi++;
        }

        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if(!(fizik < 0 || fizik > 100)) {
            toplamNot += fizik;
            dersSayi++;
        }

        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if(!(turkce < 0 || turkce > 100)) {
            toplamNot += turkce;
            dersSayi++;
        }

        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if(!(kimya < 0 || kimya > 100)) {
            toplamNot += kimya;
            dersSayi++;
        }

        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if(!(muzik < 0 || muzik > 100)) {
            toplamNot += muzik;
            dersSayi++;
        }

        ortalama = toplamNot / dersSayi;


        if(ortalama <= 55) {
            System.out.println("Sınıfta Kaldınız Seneye Görüşürüz :)");
        } else {
            System.out.println("Geçtiniz Tebrikler!");
        }

        System.out.println("Ortalamanız:" + ortalama);
    }
}