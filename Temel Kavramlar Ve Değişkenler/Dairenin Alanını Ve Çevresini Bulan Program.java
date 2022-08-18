import java.util.Scanner;

class main {
public static void main(String[] args) {
        int r,aci;
        double pi = 3.14;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Yarıçapı girin:");
        r = input.nextInt();
        
        System.out.print("Açıyı girin:");
        aci = input.nextInt();
        
        double alan = (pi * r * r * aci) / 360;
        double cevre = 2 * pi * r;
        
        System.out.println("Dairenin Çevresi:"+cevre);
        System.out.print("Dairenin veya Diliminin Alanı:"+alan);
    }
}