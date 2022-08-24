import java.util.Scanner;

class main{
    public static void main(String[] args) {
       // C(n,r) = n! / (r! * (n-r)!)
        int ntotal=1,rtotal=1,nrtotal=1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("*** C(n,r) ***");
        
        System.out.print("n sayısını giriniz:");
        int n = input.nextInt();
        
        System.out.print("r sayısını giriniz:");
        int r = input.nextInt();
       
        for(int i = 1 ; i <= n ; i++){
           ntotal = ntotal * i;
        }

        for(int j = 1 ; j <= r ; j++){
           rtotal = rtotal * j;
        }

        int fark = n - r;

        for(int k = 1 ; k <= fark ; k++){
         nrtotal = nrtotal * k;
        }

        int co = (ntotal / (rtotal * nrtotal));

        System.out.print("C(" + n + "," + r + ") = " + co);
    }
}