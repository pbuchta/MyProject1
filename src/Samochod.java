public class Samochod extends Pojazd{
    Samochod(String markaS, int iloscKol, int drzwi){
        super(markaS, iloscKol);
        this.doors = drzwi;
        System.out.println("Konstruktor klasy SAMOCHOD");
    }
    int doors;

    boolean otwarty = false;
    void openClose(){
        otwarty = !otwarty;
        if(otwarty){
            System.out.println("Otwarte");
        }else{
            System.out.println("Zamknięte");
        }
    }

}
