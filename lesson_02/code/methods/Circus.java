package methods;

public class Circus {

    public static void main(String[] args) {

        lightsOn();
        entertainer();
        lightsOff();

    } // end of main

    public static void lightsOn(){
        System.out.println("LIIIGHTS OOOOON!!!");
    } // end of lightsOn

    public static void entertainer(){
        jogger();
        clown();
        singer();
    } // end of entertainer

    public static void jogger(){
        System.out.println("I am jogging!");
    } // end of jogger

    public static void clown(){
        System.out.println("I am joking!");
    } // end of clown

    public static void singer(){
        System.out.println("I am singing!");
    } // end of singer

    public static void lightsOff(){
        System.out.println("LIIIGHTS OOOOOFF!");
    } // end of lightsOff





} // end of class
