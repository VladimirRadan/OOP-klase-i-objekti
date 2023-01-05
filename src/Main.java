import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String a = "Pera";


        Student student = new Student(); //------> Student@1d251891
        student.ime = "Laza";
        student.prezime = "Lazic";
        student.godine = 20;

        Student student1 = new Student("John", "Smith", 21 );

        Student student2 = new Student("Jo", "Smith");

        Student student3 = new Student("Zika");

        student.zbirDvaBroja(4, 9);




        student.ispis();



    }

}