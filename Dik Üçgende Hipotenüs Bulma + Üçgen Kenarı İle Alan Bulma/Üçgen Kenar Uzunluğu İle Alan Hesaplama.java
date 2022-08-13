import java.util.Scanner;

class main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double kenar1,kenar2,kenar3,u,alan;
        
        System.out.print("1.Kenar Uzunluğunu Girin:");
        kenar1 = input.nextDouble();
        
        System.out.print("2.Kenar Uzunluğunu Girin:");
        kenar2 = input.nextDouble();
        
        System.out.print("3.Kenar Uzunluğunu Girin:");
        kenar3 = input.nextDouble();

        u = (kenar1+kenar2+kenar3)/2;
        alan = Math.sqrt((u * (u-kenar1) * (u-kenar2) * (u-kenar3)));
        System.out.print("Üçgenin Alanı:" + alan);
    }
}