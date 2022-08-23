import java.util.Scanner;

class main{
    public static void main(String[] args) {
        
        int k,a = 0;
        int b = 0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Nereye kadar gitsin:");
        k = input.nextInt();
        
        for(int i = 0 ; i <= k ; i++){
            if( i % 3 == 0 && i % 4 == 0){
                a = a + i;
                b++;
            }
        }
        ortalama = a / (b-1) ;
        System.out.print("Ortalama:"+ortalama);
        input.close();
    }
}