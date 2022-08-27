import java.util.Scanner;

class main{
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    
    System.out.print("Sayı Giriniz:");
    int number = input.nextInt();

    int numberCounter = 0; 
    int tempNumber = number;
    int basValue;
    int result = 0;
    int basPow;
    //basamak sayısını bulduk
    while (tempNumber != 0) {
        tempNumber /= 10;
        numberCounter++;
    }
    //sayı değerlerini bulduk
    tempNumber = number;
    while(tempNumber != 0){
     basValue = tempNumber % 10;
       basPow = 1;
       for(int i = 1 ; i <= numberCounter ; i++){
        basPow *= basValue;
       }
       
       result += basPow;

       tempNumber /= 10;
    }

    if(result == number){
        System.out.print(number+" sayısı bir Armstrong sayıdır.");
    }else {
        System.out.print(number+" sayısı bir Armstrong sayı değildir.");
    }

    


    }
}