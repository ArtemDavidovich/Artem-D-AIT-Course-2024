package homework_37.solar_system;

//Вывести список планет отсортированный по:
//
//порядку расположения в солнечной системе;
//алфавиту;
//массе;
//количеству спутников.

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlanetAppl {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();

        planets.add(new Planet("Venus", 108.2, 4.867e24, 0));
        planets.add(new Planet("Saturn", 1427, 5.683e26, 83));
        planets.add(new Planet("Earth", 149.6, 5.972e24, 1));
        planets.add(new Planet("Mercury", 57.9, 3.285e23, 0));
        planets.add(new Planet("Mars", 227.9, 6.39e23, 2));
        planets.add(new Planet("Jupiter", 778.5, 1.898e27, 79));
        planets.add(new Planet("Neptune", 4497.1, 1.024e26, 14));
        planets.add(new Planet("Uranus", 2871, 8.681e25, 27));

        //sorting by distance from sun
        planets.sort(Planet::compareTo);

        for (Planet planet : planets) {
            System.out.println(planet);
        }

        System.out.println("==================================");

        //sorting by alphabet
        Comparator<Planet> comparatorAlphabet = new Comparator<Planet>() {
            @Override
            public int compare(Planet p1, Planet p2) {
                return p1.getName().compareTo(p2.getName());
            }
        };

        planets.sort(comparatorAlphabet);

        for (Planet planet : planets) {
            System.out.println(planet);
        }

        System.out.println("==================================");

        //sorting by mass
        Comparator<Planet> comparatorMass = new Comparator<Planet>() {
            @Override
            public int compare(Planet p1, Planet p2) {
                return Double.compare(p1.getMass(), p2.getMass());
            }
        };

        planets.sort(comparatorMass);

        for (Planet planet : planets) {
            System.out.println(planet);
        }

        System.out.println("==================================");

        //sorting by number of moons
        Comparator<Planet> comparatorMoon = new Comparator<Planet>() {
            @Override
            public int compare(Planet p1, Planet p2) {
                return Integer.compare(p1.getNumberOfMoons(), p2.getNumberOfMoons());
            }
        };

        planets.sort(comparatorMoon);

        for (Planet planet : planets) {
            System.out.println(planet);
        }

    }//end of main

}//end of class
