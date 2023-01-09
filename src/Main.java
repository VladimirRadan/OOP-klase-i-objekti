import java.util.Scanner;

public class Main {

    static int x = 5;
    static Scanner scanner = new Scanner(System.in);

    public void mainIspis(){
        int x;
        //System.out.println(a);
    }

    public static void main(String[] args) {

        scanner.nextInt();

        x = 10;
        String a = "Pera";
        System.out.println(x);


        Student student = new Student(); //------> Student@1d251891
        student.ime = "Laza";
        student.prezime = "Lazic";
        student.godine = 20;


        Student student1 = new Student("John", "Smith", 21 );

        Student student2 = new Student("Jo", "Smith");

        Student student3 = new Student("Zika");

        //new Student("John", "Smith", 21 ).ispis();


        Student [] studenti = {student, student1, student2, student3};

        Student.godine = 18;

        for (int i = 0; i < studenti.length; i++) {
            System.out.println(studenti[i]);
        }

        Student.zbirDvaBroja(3, 5);

        student.zbirDvaBroja(3, 5);

        System.out.println(Utils.getRandomEmail());



//
//        System.out.println(student);
//        student.ispis();
//
//
//        //student.zbirDvaBroja(4, 9);
//        //student.ispis();
//
//        String ispis = student.ispis2() + " Ispis iz Main metode";
//        System.out.println(ispis);
//
//        boolean bul = 1>0 || 6<9 && 10 ==10;
//
//        int zbir = student.zbirDvaBroja2(10,4) + 650;
//        System.out.println(zbir);

    }



}