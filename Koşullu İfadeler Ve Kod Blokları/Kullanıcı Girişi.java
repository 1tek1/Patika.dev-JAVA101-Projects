import java.util.Scanner;

class main{
    public static void main(String[] args) {
        String userName,passWord,sifirla,newPassWord;
        Scanner input = new Scanner(System.in);
        // Kullanıcı adı:ekrem - Şifre:koru
        System.out.print("Kullanıcı Adınız:");
        userName = input.nextLine();

        System.out.print("Şifreniz:");
        passWord = input.nextLine();
        
        if (userName.equals("ekrem") && passWord.equals("koru")){
            System.out.println("Giriş Yapıldı");}
        
        else{
            System.out.print("Hatalı Giriş! Yeni şifre belirlemek isterseniz 1,istemezseniz 2 tuşlayın:");
            
            sifirla = input.nextLine();
            
            if(sifirla.equals("2")){   
                System.out.print("Giriş Sonlandırıldı");}
            
            else if(sifirla.equals("1")){
                System.out.print("Yeni Şifrenizi Girin:");
                newPassWord = input.nextLine();

                 if(newPassWord.equals("java")){
                    System.out.println("Eski şifreniz yazılamaz");}
                 
                 else{
                    System.out.println("Şifreniz yenilendi");}}

            else System.out.print("Hatalı seçim");
            }
            



    
 }
}