import java.util.Scanner;

class main{
    public static void main(String[] args) {
        int sayi,total = 0;

		Scanner input = new Scanner(System.in);


		do {
			System.out.print("Sayı Giriniz:");
			sayi = input.nextInt();
			if(sayi % 2 == 0 && sayi % 4 == 0) {
				total += sayi;			
		} 

        }while(sayi % 2 == 0);

		System.out.print("Toplam:" + total);

	}	
}
