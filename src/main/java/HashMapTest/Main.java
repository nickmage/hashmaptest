package HashMapTest;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        HashMap<Cat, CatHouse> map = new HashMap<>();
        Murka murka = new Murka();
        MurkaHouse murkaHouse = new MurkaHouse();
        Boris boris = new Boris();
        BorisHouse borisHouse = new BorisHouse();

        System.out.println("Key murka hash: " + murka.hashCode());
        System.out.println("Key boris hash: " + boris.hashCode());

        map.put(murka, murkaHouse);
        map.get(murka).info();

        map.put(boris, borisHouse);
        map.get(boris).info();

        System.out.println(map.size());

    }
}
