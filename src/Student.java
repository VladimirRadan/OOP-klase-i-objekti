public class Student {

    //polja
    String ime;
    String prezime;
    int godine;


    //konstruktori - mehanizam za kreioranje objekata
    public Student(){
        System.out.println("Poziv praznog konstruktora");
    }

    public Student(String i, String p, int g) {
        ime = i;
        prezime = p;
        godine = g;
        System.out.println("Poziv konstruktora sa 3 parametra");
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        System.out.println("Poziv konstruktora sa 2 parametra");
    }

    public Student(String ime) {
        this.ime = ime;
        System.out.println("Poziv konstruktora sa 1 parametrom");
    }

    //metode - ono sto objekat moze da radi, odnosno izvrsava
    public void ispis(){
        System.out.println("Ispis iz klase Student.");
    }


    public void zbirDvaBroja(int uy, int buuuuuuu){
        System.out.println(uy + buuuuuuu);
    }



}
