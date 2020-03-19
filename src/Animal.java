class Animal implements Comparable<Animal> {
    Animal(String imie, int wiek){
        this.imie = imie;
        this.wiek = wiek;
    }
    public String imie;
    public int wiek;

    @Override
    public int compareTo(Animal o) {
        if(this.imie.compareTo(o.imie)!=0){
            return this.imie.compareTo(o.imie);
        }
        return this.wiek - o.wiek;
    }
//@Override
//public int compareTo(Animal o) {
//    return 0;
//}
}
