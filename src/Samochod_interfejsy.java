public class Samochod_interfejsy extends Pojazd_interfejsy implements Poruszanie_interfejsy {
    Samochod_interfejsy(String nazwa, int ilosc_kol) {
        super(nazwa);
        this.ilosc_kol = ilosc_kol;
    }
    int ilosc_kol;

    @Override
    public void naprzod() {
        System.out.println("Naprzód!");
    }

    @Override
    public void skret() {
        System.out.println("Skręt!");
    }
}
