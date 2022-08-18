import java.util.Scanner;
class main {
    public static void main(String[] args) {
        int n1,n2,select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: ");
        n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Seçiminiz:");
        select = input.nextInt();

        switch(select){
            case 1: System.out.println("Toplama Sonuç: "+(n1+n2));
            break;
            case 2: System.out.println("Çıkarma Sonuç: "+(n1-n2));
            break;
            case 3: System.out.println("Çarpma Sonuç: "+(n1*n2));
            break;
            case 4: if(n2 != 0) System.out.println("Bölme Sonuç: "+(n1/n2));
                    else System.out.println("Hiçbir Sayı Sıfıra Bölünemez!");
            break;
            default:System.out.print("Hatalı Seçim Yaptınız Tekrar Deneyiniz!");
        }
    }
}