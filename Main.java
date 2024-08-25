/*
Colin Passno
COP 3330C
6/26/2024

Exercise in Generics
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;
public class Main {
    public static void main(String[] args) {
        int buffer;

        //Task 1
        System.out.println("~~~~~~TASK 1~~~~~~");

        //Integer Array
        Integer[] arrayInt = {1, 2, 4, 8, 15, 16, 23, 42};
        Integer findInt = 23;
        System.out.println("***Int Array***");
        GenFun.List(arrayInt);
        buffer = GenFun.Find(arrayInt, findInt);
        GenFun.Say(findInt, buffer);

        //Double Array
        Double[] arrayDouble = {1.1, 2.2, 3.3, 4.4, 5.5, 6.6};
        Double findDouble = 3.3;
        System.out.println("\n***Double Array***");
        GenFun.List(arrayDouble);
        buffer = GenFun.Find(arrayDouble, findDouble);
        GenFun.Say(findDouble, buffer);

        //String Array
        String[] arrayStr = {"bacon", "eggs", "bread", "coffee"};
        String findStr = "eggs";
        System.out.println("\n***String Array***");
        GenFun.List(arrayStr);
        buffer = GenFun.Find(arrayStr, findStr);
        GenFun.Say(findStr, buffer);

        findStr = "spaghetti"; //let's run it again to show if what happens if a value isn't there
        buffer = GenFun.Find(arrayStr, findStr);
        GenFun.Say(findStr, buffer);

        //Task 2
        System.out.println("\n~~~~~~TASK 2~~~~~~");

        //create three planets
        System.out.println("Three planets");
        Planet lantea = new Planet("Lantea", new int[] {28,16,8,32,11,24,1}, "Tauri");
        Planet abydos = new Planet("Abydos", new int[] {3,8,6,11,21,30}, "Jaffa");
        Planet sr388 = new Planet("SR-388", new int[] {2,18,32,12,9,10}, "Chozo");

        //put planets into generic container
        GenCon planets = new GenCon();
        planets.add(lantea);
        planets.add(abydos);
        planets.add(sr388);

        planets.print(); //print container

        System.out.println("planet at index 1: " + planets.get(1)); //print again

        planets.remove(sr388); //remove a planet
        System.out.println("\nSR-388 was destroyed");
        System.out.println("Remaining planets:");//print again
        planets.print();

        System.out.println("\nThree teams"); //create three sgteams
        SGTeam sg1 = new SGTeam(1, new String[]{"O'neill","Carter","Jackson","Teal'c"}, true);
        SGTeam sg3 = new SGTeam(3, new String[]{"Kowalski","Feretti","Davis"}, false);
        SGTeam sg2 = new SGTeam(2, new String[]{"Archer","Cain","Figgis","kreiger","Tunt"}, true);

        //teams in container
        GenCon teams = new GenCon();
        teams.add(sg1);
        teams.add(sg3);
        teams.add(sg2);

        teams.print(); //print teams

        teams.sort(Comparator.comparing(SGTeam::getMany)); //sort teams by number of members
        System.out.println("\nTeams sorted by number of members: "); //print again
        teams.print();

        //Ships
        System.out.println("\nThree ships");
        Ship daedalus = new Ship("Daedalus", 500, 3.4);
        Ship atlantis = new Ship("Atlantis", 10000, 6.4);
        Ship hive = new Ship("Hive", 2500, 1.3);
        GenCon ships = new GenCon();
        ships.add(daedalus);
        ships.add(atlantis);
        ships.add(hive);
        System.out.println("There are " + ships.size() + " ships");
        ships.print();

        //add a new ship
        Ship aurora = new Ship("Aurora", 900, 5.0);
        ships.add(aurora);
        System.out.println("\nThere are now " + ships.size() + " ships");
        ships.print();
    }
}