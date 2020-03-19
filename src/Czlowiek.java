public class Czlowiek {
    Czlowiek(String imie, String nazwisko, short wiek){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        liczebnosc++;
    }
    String imie;
    String nazwisko;
    short wiek;
    static int liczebnosc = 0;
    void przedstawSie(){
        System.out.println("Jestem "+imie+" "+nazwisko+", mam "+wiek+" lata.");
    }
}
