import java.util.Scanner;

class main{
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı Girin:");
        heat = input.nextInt();

        if(heat < 5){
            System.out.println("Kayak Yapabilirsiniz");
        }else if(heat < 15){
            System.out.println("Sinemaya Gidebilirsiniz");
        }else if(heat < 25){
            System.out.println("Piknik Yapabilirsiniz");
        }else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }
    }
}