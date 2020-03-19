public class Dog extends AnimalDziedziczenie {
    @Override
    public void dajGlos() {
        System.out.println("Woof Woof");
    }

    @Override
    public void idz() {
        System.out.println("Idę sobie(pies)");
    }
}
