import java.util.Scanner;

class main{
    public static void main(String[] args) {
    int year;

    Scanner input = new Scanner(System.in);

    System.out.print("Yıl Giriniz:");
    year = input.nextInt();

        if (year % 100 == 0) {
            if (year % 400 == 0){
                System.out.println(year + " Artık Yıldır!");
            } else{
                System.out.println(year + " Artık Yıl Değildir!");
            }
        }else{
            if (year % 4 == 0){
                System.out.println(year + " Artık Yıldır!");
            } else{
                System.out.println(year + " Artık Yıl Değildir!");
            }
        }
    }
}