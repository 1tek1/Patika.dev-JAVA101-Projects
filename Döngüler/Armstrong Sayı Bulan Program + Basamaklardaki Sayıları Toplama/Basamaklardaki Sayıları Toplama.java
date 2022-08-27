import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");

        int number = input.nextInt();

        int basSayi = 0,toplam = 0;

        while(number != 0)
        {
            toplam +=  (number % 10);
            number /= 10;
            basSayi++;
        }
        System.out.println("Basamak sayısı:" + basSayi);
        System.out.println("Basamak sayılar toplamı:" + toplam);
    }
}