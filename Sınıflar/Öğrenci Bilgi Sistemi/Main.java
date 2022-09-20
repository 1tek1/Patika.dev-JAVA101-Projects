public class Main {
    public static void main(String[] args) {

        Teacher T1 = new Teacher("ALİ KORU", "05057780274", "BIO");
        Teacher T2 = new Teacher("VELİ KORU", "05057780287", "FZK");
        Teacher T3 = new Teacher("EKREM KORU", "05544405806", "KMY");
        Teacher T4 = new Teacher("KEREM KORU", "05551049261", "MAT");

        Course BIO = new Course("BIYOLOJI", "101", "BIO");
        BIO.addTeacher(T1);
        Course FZK = new Course("FIZIK", "101", "FZK");
        FZK.addTeacher(T2);
        Course KMY = new Course("KIMYA", "101", "KMY");
        KMY.addTeacher(T3);
        Course MAT = new Course("MATEMATIK", "101", "MAT");
        MAT.addTeacher(T4);

        Student S1 = new Student("MEMO", "94", "10", BIO, MAT, FZK);
        Student S2 = new Student("ERDO", "99", "10", MAT, FZK, KMY);
        Student S3 = new Student("BILO", "124", "10", FZK, MAT, KMY);
        Student S4 = new Student("EGE", "86", "11", BIO, MAT, KMY);

        S2.addBulkExamNote(88,99,67);
        S2.isPass();
        
        System.out.println("==========================");
        
        S3.addBulkExamNote(55,69,99);
        S3.isPass();
        
    }
}