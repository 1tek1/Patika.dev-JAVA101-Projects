import java.util.Scanner;

class notOrtalamasi {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        int math, physics, chemical, turkish, history, music;

        
        System.out.print("Matematik notunu giriniz: ");
        math = input.nextInt();

        System.out.print("Fizik notunu giriniz: ");
        physics = input.nextInt();

        System.out.print("Kimya notunu giriniz: ");
        chemical = input.nextInt();

        System.out.print("Türkçe notunu giriniz: ");
        turkish = input.nextInt();

        System.out.print("Tarih notunu giriniz: ");
        history = input.nextInt();

        System.out.print("Müzik notunu giriniz: ");
        music = input.nextInt();

        
        double ortalama = (math + physics + chemical + turkish + history + music) / 6;

        
        System.out.println("Ortalama: " + ortalama);
        System.out.println(ortalama > 60 ? "Sınıfı Geçti" : "Sıfta Kaldı");

    }
}