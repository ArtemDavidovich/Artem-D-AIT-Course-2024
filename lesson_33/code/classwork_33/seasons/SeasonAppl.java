package classwork_33.seasons;

//Задать ENUM seasons - времена года (Summer, Autumn, Winter, Spring)
//Опробовать на нем методы:
//.values()
//.toString
//.ordinal()
//.valueOf()

public class SeasonAppl {

    public static void main(String[] args) {

        Season[] seasons = Season.values();
        System.out.println("------------values of Enum---------------");
        for (Season season : seasons) {
            System.out.println(season);
            System.out.println(season.getNumber() + " : " + season.getName());
        }

        System.out.println("-------------toString()---------------");
        System.out.println(Season.AUTUMN.toString());

        System.out.println("-------------ordinal()---------------");
        System.out.println(Season.AUTUMN.ordinal());

        System.out.println("-------------valueOf---------------");
        System.out.println(Season.valueOf("SPRING"));

    }//end of main

}//end of class
