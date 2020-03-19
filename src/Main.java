import java.lang.reflect.Array;
import java.util.*;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import java.util.Stack;

public class Main {
    public static void main(String[] args){

            ///ZCZYTYWANIE DANYCH WPISANYCH///

//        Scanner skaner = new Scanner(System.in);
//        System.out.println("Podaj pseudonim:");
//        String nick = skaner.next();
//        System.out.println("hi " + nick);


            ///RZUTOWANIE I KONWERSJA TYPU DANYCH///

//        float a = 7;
//        int b = (int)a;
//        String liczba = Integer.toString(b) + "abc";
//        int c =0;
//        try {
//            c = Integer.parseInt(liczba);
//            System.out.println(c + 2);
//        }
//        catch (Exception e){
//            System.out.println(e.toString());
//        }

            ///KLASY I OBIEKTY///

//        Czlowiek jan = new Czlowiek("Jan", "Kowalski", (short) 23);
//        jan.przedstawSie();
//        System.out.println(Czlowiek.liczebnosc);
//
//
//        Zwierze pies = new Zwierze();
//        pies.glos = "Woof";
//        pies.imie = "Azor";
//        pies.przedstawSie();
//        pies.dajGlos(2 );

            ///KLASY I OBIEKTY, KOPIOWANIE///

//        int liczba = 50;
//        System.out.println("Liczba przed: "+liczba);
//        zmien(liczba);
//        System.out.println("Liczba po: "+liczba);
//
//        Liczba oliczba = new Liczba();
//        zmien(oliczba);
//        System.out.println("oLiczba po: "+oliczba.liczba);


            ///KLASA MATH///

//       int a = -5;
//       int b = 11;
//        System.out.println(Math.max(a,b));
//        System.out.println(Math.min(a,b));
//        System.out.println(Math.abs(a));
//        System.out.println(Math.pow(a, 2));
//        System.out.println(Math.sqrt(4));
//        System.out.println(Math.round(6.4));
//        System.out.println(Math.ceil(6.4));
//        System.out.println(Math.floor(6.4));
//        System.out.println(Math.PI);
//        System.out.println(Math.E);
//        System.out.println(Math.random()+1);

        ///KOLEKCJE: LISTA///

//    Animal kot1 = new Animal("pat");
//    Animal kot2 = new Animal("fat");
//    Animal kot3 = new Animal("hat");
//
//        //ArrayList lista = new ArrayList();
//        ArrayList<Animal> listaG = new ArrayList<>();
////        lista.add(kot1);
////        lista.add(kot2);
////        lista.add(kot3);
//        listaG.add(kot1);
//        listaG.add(kot2);
//        listaG.add(kot3);
//        System.out.println("------");
//        for(Animal k:listaG){
//            System.out.println(k.imie);
//        }
//        System.out.println("------");
//        System.out.println(listaG.get(0));               //wynika roznica
//        System.out.println((listaG.get(0)).imie);
//        System.out.println(listaG.size());
//        System.out.println(listaG.contains(kot1));
//        System.out.println(listaG.contains(3));
//
//        listaG.remove(kot2);

        ///KOLEKCJE: MAP, SET///

//        LinkedList<String> lista = new LinkedList<>();
//        lista.add("Poznań");
//        lista.add("Warszawa");
//        lista.add("Kraków");
//        for(String e : lista){
//            System.out.println(e);
//        }
//        lista.clear();
//

//        ///HASHMAPA///


//        HashMap<Integer, String> mapa = new HashMap<>();
//        mapa.put(1, "Poniedziałek");
//        mapa.put(5, "Piątek");
//        mapa.put(7, "Niedziela");
//        System.out.println("--------");
//        System.out.println(mapa.get(5));
//
//        for(String e:mapa.values()){
//            System.out.println("---------");
//            System.out.println(e);
//        }
//

//        ///HASHSET///  dodawane są wartości unikatowe

//        HashSet<String> zbior = new HashSet<>();
//        zbior.add("Wawa");
//        zbior.add("Koziołki");
//        zbior.add("Swietochlowice");
//
//        System.out.println();
//        for (String e:zbior){
//            System.out.println(e);
//        }

        //////OPERACJE, SORTOWANIE/////////

//        ArrayList<String> lista = new ArrayList<>();
//        lista.add("Poznań");
//        lista.add("Warszawa");
//        lista.add("Gdańsk");
//        lista.add("Szczecin");
//        lista.add("Kraków");
//
//        System.out.println("-------");
//        for(String e:lista){
//            System.out.println(e);
//        }
//        Collections.sort(lista); ///sortowanie alfabetyczne
//        System.out.println("-------");
//        for(String e:lista){
//            System.out.println(e);
//        }
//        System.out.println("-------");
//        System.out.println(Collections.min(lista));
//
//        System.out.println("-------");
//        Collections.reverse(lista);///odwrotne sortowanie
//        for(String e:lista){
//            System.out.println(e);
//        }
//
//        System.out.println("-------");
//        Collections.shuffle(lista);///przetasowanie(losowe)
//        for(String e:lista){
//            System.out.println(e);
//        }

//        ArrayList<Animal> koty = new ArrayList<>();
//        Animal kot1 = new Animal("Filemon", 1);
//        Animal kot2 = new Animal("Lucy", 10);
//        Animal kot3 = new Animal("Sonia", 3);
//        Animal kot4 = new Animal("Buc", 6);
//
//        koty.add(kot1);
//        koty.add(kot2);
//        koty.add(kot3);
//        koty.add(kot4);
//
//        System.out.println("-----");
//        for(Animal kot:koty){
//            System.out.println(kot.imie + " "+kot.wiek+" lat.");
//        }
//
//        Collections.sort(koty);
//
//        System.out.println("-----");
//        for(Animal kot:koty){
//            System.out.println(kot.imie + " "+kot.wiek+" lat.");
//        }

//        /// KOLEJKA////

//        System.out.println("-----KOLEJKA-----\n");
//        Queue<String> kolejka = new ArrayDeque<>();
//        kolejka.add("Pierwszy");
//        kolejka.add("Drugi");
//        kolejka.add("Trzeci");
//
//        System.out.println(kolejka.remove()); ///wyświetla pierwszy element kolejki jednocześnie go usuwając z kolejki (tak jak na prawdę)
//        System.out.println(kolejka.poll()); ///wyświetla pierwszy element kolejki ALE nie wysypie nam programu jeśli w kolejce nie będzie już żadnych elementów, tylko wyświetli null
//        System.out.println(kolejka.peek()); ///wyświetla pierwszy element kolejki I NIE USUWA go z kolejki (podglądnięcie)
//        System.out.println(kolejka.poll());
//        System.out.println(kolejka.poll());


            /// STOS ////

//        System.out.println("\n-----STOS-----\n");
//        Stack<String> stos = new Stack<>();
//        stos.push("Pierwszy");
//        stos.push("Drugi");
//        stos.push("Trzeci");
//        System.out.println(stos.size());
//        System.out.println(stos.pop());
//        System.out.println(stos.pop());
//        System.out.println(stos.size());
//        System.out.println(stos.peek());
//
//            /// DZIEDZICZENIE - KONSTRUKTORY ///

//        System.out.println("AUDI");
//        Samochod audi = new Samochod("Audi", 4, 5);
//        System.out.println("FERRARI");
//        SportSamochod ferrari = new SportSamochod("Ferrari", 4,3);

            /// DZIEDZICZENIE - METODY, ABSTRACT ////

        // Cat kot = new Cat();
        ////        kot.dajGlos();
        ////        AnimalDziedziczenie pies = new Dog();
        ////        pies.dajGlos();
        ////        //AnimalDziedziczenie chomik = new AnimalDziedziczenie() - błąd/

            /// WYJĄTKI - TRY, CATCH, INSTANCEOF ///

//        Cat kot = new Cat();
//        kot.dajGlos();
//        AnimalDziedziczenie pies = new Dog();
//        pies.dajGlos();
//        System.out.println();
//        try {
//            ((Cat) pies).idz();
//            int a = 5/0;
//        }catch (ClassCastException e){
//            System.out.println("Ups! Coś poszło nie tak, sprawdź rzutowanie (" + e.getMessage()+")");
//        }catch (ArithmeticException e){
//            System.out.println("Błąd arytmetyczny (" + e.getMessage()+")");
//        }finally {
//            System.out.println("Wykonuje się i tak");
//        }

        ////////// INTERFEJSY /////////////

//        System.out.println(Poruszanie_interfejsy.nazwaInterfejsu);
//        Samochod_interfejsy car = new Samochod_interfejsy("BMW", 4);
//        car.naprzod();
//        car.skret();

        //////////// TYP ENUM ////////////

//        Samochod_enum bmw = new Samochod_enum(Marka.BMW, Kolory.ŻÓŁTY);
//        switch (bmw.kolor_samochodu){
//            case ŻÓŁTY:  //ale sztos, nie trzeba tego samego w każdym casie dawać tylko tak zostawić i break na końcu :O
//            case NIEBIESKI:
//            case CZERWONY:
//                System.out.println("Kolor: " + bmw.kolor_samochodu);
//                break;
//        }

        /////// KLASY ANONIMOWE I WEWNĘTRZNE ////////////

//        Animal_kl_anonimowe_i_wewn cat = new Animal_kl_anonimowe_i_wewn(){
//            @Override
//            void makeVoice() {
//                System.out.println("miał miał");
//            }
//
//            @Override
//            void eat() {
//                System.out.println("I'm eating in anonymous class!");
//            }
//        };
//
//        cat.makeVoice();
//        cat.eat();
//        Animal_kl_anonimowe_i_wewn cat2 = new Animal_kl_anonimowe_i_wewn();
//        cat2.makeVoice();
//        cat2.eat();
//        System.out.println("---------Klasy wewnętrzne, klasy w klasie---------" );
//        Animal_kl_anonimowe_i_wewn.Pet pet = cat.new Pet();
//        pet.name = "Ziomuś";
//        pet.getName();

        ////////// WIELOWĄTKOWOŚĆ ////////

//        //Calculations ob1 = new Calculations();
//        //Calculations ob2 = new Calculations();
//
//        //jeżeli robimy wielowątkowość na zasadzie zaimplementowania interfejsu Runnable
//        //bo np potrzebujemy dziedziczyć po innej ważniejszej klasie, to żeby teraz
//        //działało nam start() to musimy objekt ob1 utworzyć na klasie Thread
//
//        Thread ob1 = new Thread(new Calculations());
//        Thread ob2 = new Thread(new Calculations());
//
//        //tracimy wtedy możliwość uzyskania metod z klasy Calculations, niestety nie da się tego obejść
//        //w przypadku tworzenia wątków na interfejsie
//
//        ob1.start();
//        ob2.start();

        //////// EQUALS VS == //////////

//        Animal_equals a1 = new Animal_equals();
//        Animal_equals a2 = new Animal_equals();
//
//        a1.name = "Tom";
//        a2.name = "Tom";
//
//        System.out.println(a1.equals(a2));

        /////// StringBuilder - optymalizacja ///////

//        String s ="a";
//        int j=100000;
//
//        long start = System.currentTimeMillis();
//        for(int i=0; i<j; i++){
//            s += "a";
//        }
//        System.out.println(s);
//        System.out.println("Czas: "+(System.currentTimeMillis() - start));
//
//        StringBuilder sb = new StringBuilder();
//        start = System.currentTimeMillis();
//        for(int i=0; i<j; i++){
//            sb.append("a");
//        }
//        System.out.println(sb.toString());
//        System.out.println("Czas(sb): "+(System.currentTimeMillis() - start));

    }

        ///FUNKCJE DO "KLASY, OBIEKTY, KOPIOWANIE"///
//    public static void zmien(int liczba){
//        liczba = -1;
//    }
//    public static void zmien(Liczba oliczba){
//        oliczba.liczba=-1;
//    }
}
