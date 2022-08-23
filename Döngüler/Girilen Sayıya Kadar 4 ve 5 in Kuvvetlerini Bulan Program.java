import java.util.Scanner;

class main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        System.out.print("Sınırı Giriniz:");
        int sayi=input.nextInt();

        System.out.print(sayi+" sayısından küçük dördün kuvvetleri: ");
        for (int i=1; i<=sayi; i*=4){
            System.out.print(i+ " ");
        }
        System.out.println("");
        System.out.print(sayi+" sayısından küçük beşin kuvvetleri: ");
        for (int i=1; i<=sayi; i*=5){
            System.out.print(i+ " ");
        }
    }
}