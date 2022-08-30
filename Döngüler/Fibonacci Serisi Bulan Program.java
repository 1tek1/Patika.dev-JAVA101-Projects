import java.util.Scanner;
class main {
    public static void main(String[] args) {
        int n,n1,n2,n3;
        Scanner scr = new Scanner(System.in);

        System.out.print("Eleman sayısı : ");
        n = scr.nextInt();
        n1 = 0;
        n2 = 1;
        System.out.print(n1 + " ");
        System.out.print(n2 + " ");
        for (int i = 1 ; i < n - 1 ; i++){
            n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
        }
    }
}