public class Student {

    //polja - instancne varijable
    String ime;
    String prezime;
    String indexNum;
    static int godine;

    //konstruktori - mehanizam za kreioranje objekata
    public Student(){
        //System.out.println("Poziv praznog konstruktora");
    }

    public Student(String i, String p, int g) {
        ime = i;
        prezime = p;
        godine = g;
        //System.out.println("Poziv konstruktora sa 3 parametra");
    }

    public Student(String ime, String prezime) {
        this.ime = ime;
        this.prezime = prezime;
        //System.out.println("Poziv konstruktora sa 2 parametra");
    }

    public Student(String ime) {
        this.ime = ime;
        //System.out.println("Poziv konstruktora sa 1 parametrom");
    }

    //metode - ono sto objekat moze da radi, odnosno izvrsava
    public void ispis(){
        String lokalnoIme = "Zika";
        System.out.println("Student{" + "ime='" + this.ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", indexNum='" + indexNum + '\'' +
                '}');
    }

    public String ispis2(){
        return "Student{" + "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", indexNum='" + indexNum + '\'' +
                '}';
    }


    @Override
    public String toString() {
        return "Student{" +
                "ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                ", godine=" + godine +
                ", indexNum='" + indexNum + '\'' +
                '}';
    }



    public static void zbirDvaBroja(int uy, int buuuuuuu){
        System.out.println(uy + buuuuuuu);
    }

    public static int zbirDvaBroja2(String t1, String t2){
        int rezultat = Integer.parseInt(t1) +Integer.parseInt(t2);
        return rezultat;
    }


}
