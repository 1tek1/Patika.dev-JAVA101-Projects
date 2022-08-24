import java.util.Scanner;

class main{
    public static void main(String[] args) {
        // a üssü b (a^b)
        int a,b,total=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Üssü Alınacak Sayı:");
        a = input.nextInt();

        System.out.print("Üs Olacak Sayı:");
        b = input.nextInt();

        for(int i = 1 ; i <= b ; i++){
        
            total *= a;

        }

        System.out.println(a + "^" + b + " = " + total);
    }
}