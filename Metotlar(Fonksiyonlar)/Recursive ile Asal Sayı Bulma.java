import java.util.Scanner;

class main {

    

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz :  ");
        
        int sayi = input.nextInt();
        
        if(asalSayiBulma(sayi, 2))
        System.out.println(sayi + " Asal");
        
        else
        System.out.println(sayi + " Asal Değil");
        
        
        
    }
    static boolean asalSayiBulma(int sayi,int i){
        
        if (i == sayi) {
            return true;
            
        } else if (sayi % i == 0) {
            return false;
            
        }

        return asalSayiBulma(sayi , i + 1);

    }
}