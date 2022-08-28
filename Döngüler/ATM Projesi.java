import java.util.Scanner;

class main{
    public static void main(String[] args) {
        
    Scanner input = new Scanner(System.in);

    String userName,password;

    int right = 3;
    int select;
    int balance = 1500;

    while(right > 0){
    System.out.print("Kullanıcı Adınız:");
    userName = input.nextLine();

    System.out.print("Şifreniz:");
    password = input.nextLine();

    if(userName.equals("patika") && password.equals("dev123")) {
        System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
        do {
           
            System.out.println("1 - Para Yatırma\n2 - Para Çekme\n3 - Bakiye Sorgula\n4 - Çıkış Yap");
            System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz:");
            select = input.nextInt();
            if(select == 1){
                System.out.print("Yatıracağınız Para miktarı:");
                int price = input.nextInt();
                balance += price;
            }else if(select == 2){
               System.out.println("Çekeceğiniz Para Miktarı");
               int price = input.nextInt();
               if(price > balance){
                System.out.println("Bakiye Yetersiz.");
               }else {
                balance -= price;
               }
            }else if(select == 3){
                System.out.println("Bakiyeniz : " + balance);
            }
        } while (select != 4);
        System.out.println("Tekrar Görüşmek Üzere");
        break;
     }else {
        right--;
        System.out.println("Hatalı Kullanıcı adı veya şifre.Tekrar deneyiniz.");
        if(right == 0){
            System.out.println("Hesabınız bloke olmuştur lütfen banka ile irtibata geçiniz.");
        }else{
            System.out.println("Kalan Hakkınız : " + right);
        }
        
        
        
     }
    }

  }
}

/*                           SWİTCH-CASE Lİ HALİ
 switch (select){
                case 1:
                    System.out.println("Yatıracağınız Para miktarı: ");
                    int price = input.nextInt();
                    balance += price;
                    System.out.print("Bakiyeniz "+ balance);
                    break;
                case 2:
                    System.out.println("Çekmek istediğiniz tutar: ");
                    int price = input.nextInt();
                    if(price > balance){
                        System.out.println("Yetersiz bakiye");
                    break;}
                    else {
                        balance -= price;
                        System.out.println("Bakiyeniz: " + balance);
                    }
                    break;

                case 3:
                        System.out.println("Mevcut Bakiyeniz: "+balance);
                    break;
                case 4:
                    System.out.println("İyi günler. Yine bekleriz...");
                    break;
            }




*/
