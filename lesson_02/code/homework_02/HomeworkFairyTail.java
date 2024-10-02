package homework_02;

public class HomeworkFairyTail {

    public static void main(String[] args) {

        System.out.println("Посадил дед репку — выросла репка большая, пребольшая.");
        dedka();

    } // end of main

    public static void dedka(){
        System.out.println("Стал дед репку из земли тащить: тянет-потянет, вытащить не может.");
        System.out.println("Позвал дед на помощь бабку.");
        babka();
    } // end of dedka

    public static void babka(){
        System.out.println("Бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
        System.out.println("Позвала бабка внучку.");
        vnuchka();
    } // end of babka

    public static void vnuchka(){
        System.out.println("Внучка за бабку, бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
        System.out.println("Кликнула внучка Жучку.");
        zhuchka();
    } // end of vnuchka

    public static void zhuchka(){
        System.out.println("Жучка за внучку, внучка за бабку, бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
        System.out.println("Кликнула Жучка кошку.");
        koshka();
    } // end of zhuchka

    public static void koshka(){
        System.out.println("Кошка за Жучку, Жучка за внучку, внучка за бабку, бабка за дедку, дедка за репку: тянут-потянут, вытянуть не могут.");
        System.out.println("Кликнула кошка мышку.");
        myshka();
    } // end of koshka

    public static void myshka(){
        System.out.println("Мышка за кошку, кошка за Жучку, Жучка за внучку, внучка за бабку, бабка за дедку, дедка за репку тянут-потянут — вытащили репку!");
    } // end of myshka





} // end of class
