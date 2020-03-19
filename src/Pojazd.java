public class Pojazd {
    Pojazd(String marka, int liczbaKol){
        this.mark = marka;
        this.wheels = liczbaKol;
        System.out.println("Konstruktor klasy POJAZD");
    }
    String mark;
    int wheels;

    protected void odpal(){
        System.out.println("Pojazd odpalony!");
    }
}
