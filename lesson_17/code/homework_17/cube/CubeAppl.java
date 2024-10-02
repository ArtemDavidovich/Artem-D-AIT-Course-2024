package homework_17.cube;

import homework_17.cube.model.Cube;

public class CubeAppl {

    public static void main(String[] args) {

        Cube cube1 = new Cube(3.1);
        Cube cube2 = new Cube(7);
        Cube cube3 = new Cube(12.5);

        Cube[] cubes = new Cube[3];

        cubes[0] = cube1;
        cubes[1] = cube2;
        cubes[2] = cube3;

        for (int i = 0; i < cubes.length; i++) {
            cubes[i].display();
            System.out.printf("perimeter = %.2f", cubes[i].p());
            System.out.println();
            System.out.printf("area = %.2f", cubes[i].s());
            System.out.println();
            System.out.printf("volume = %.2f", cubes[i].v());
            System.out.println();
            System.out.println();
        }

    }//end of main

}//end of class
