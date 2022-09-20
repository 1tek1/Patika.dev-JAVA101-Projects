public class Teacher {

    //nitelikler
    String name;
    String mpno;
    String branch;

    //kurucu metot
    Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

    //davanıslar
    void info() {
        System.out.println("Ad - Soyad \t: " + this.name);
        System.out.println("Tel No     \t: " + this.mpno);
        System.out.println("Bransi     \t: " + this.branch);
    }


}