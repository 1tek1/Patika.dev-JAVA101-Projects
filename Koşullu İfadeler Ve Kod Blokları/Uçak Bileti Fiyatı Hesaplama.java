import java.util.Scanner;
class main{
    public static void main(String[] args) {
        
        double mesafe,yas,yon,toplamUcret,normalTutar;
       
        Scanner input = new Scanner(System.in);
        
        System.out.print("Mesafeyi Km Türünden Giriniz:");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı Giriniz:");
        yas = input.nextDouble();

        System.out.print("Yolculuk Tipini Seçin \n1)Tek Yön\n2)Gidiş-Dönüş\n");
        yon = input.nextDouble();
 
       if(mesafe <= 0 || yas < 0 || yon > 2 || yon < 1){
        System.out.print("Hatalı Veri Girdiniz!");
       }
       normalTutar = mesafe * 0.10;
       
       if(yas<12){
        toplamUcret = normalTutar * 0.50;
       }
       else if(yas<24){
        toplamUcret = normalTutar * 0.90; 
       }
       else if(yas > 65){
        toplamUcret = normalTutar * 0.70;
       }else{
        toplamUcret = normalTutar ;
       }
       if(yon == 2){
        toplamUcret = (toplamUcret * 0.80) * 2;
       }
       System.out.print("Bilet Fiyatınız:"+toplamUcret+"TL");

    }
}