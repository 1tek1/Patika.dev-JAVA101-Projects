import java.util.Scanner;

class main{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz:");
        int x = input.nextInt();
        
        for ( int a = 1 ; a <= x ; a++) {
           for ( int b = 1 ; b <= (x - a) ; b++) {
               System.out.print(" ");
               
           }
           for ( int c = 1 ; c <= (2 * a) - 1 ; c++) {
               System.out.print("*");
               
           }
           System.out.println(" ");
           
        }
        for ( int a = 1 ; a < x ; a++) {
           for (int  b = 1 ; b <= a ; b++) {
               System.out.print(" ");
               
           }
           for ( int c = 1 ; c <= ( 2 * (x - a) - 1) ; c++) {
               System.out.print("*");
               
           }
           System.out.println(" ");
    }
 }
}