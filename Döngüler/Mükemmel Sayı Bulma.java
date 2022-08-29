import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int x , toplam = 0 ;

        System.out.print("Sayıyı Giriniz:");
        x = input.nextInt();

        for(int i = x-1 ; i >= 1 ; i--){

            if(x % i == 0){
                toplam += i;
            }

        }

        if(toplam == x){
            System.out.println(x + " sayısı Mükemmel sayıdır.");
        }else{
            System.out.println(x + " sayısı Mükemmel sayı değildir.");

        }
    }
}