import java.util.Scanner;

 class main  {
 public static void main(String[] args) {
     int a,b;
     double c;
     Scanner input = new Scanner(System.in);
     
     System.out.print("1.Kenarı Girin: ");
     a = input.nextInt();
     
     System.out.print("2.Kenarı Girin: ");
     b = input.nextInt();
     
     c = Math.sqrt( (a*a) + (b*b) ) ;
     System.out.print("Hipotenüs:" + c );
    }
}