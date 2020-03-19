public class Zwierze {
    String imie;
    String glos;

    public void dajGlos(int x){
        for(int i=0; i<x; i++){
            System.out.println(glos);
        }
    }

    public void przedstawSie(){
        System.out.println("Jestem "+imie);
    }
}
