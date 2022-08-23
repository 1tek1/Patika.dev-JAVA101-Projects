import java.util.Scanner;

class main{
    public static void main(String[] args) {
        int k ;
        Scanner inp = new Scanner(System.in);

        System.out.print("Sayı Giriniz:");
        k = inp.nextInt();

        for(int i = 1 ; i <= k ; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}