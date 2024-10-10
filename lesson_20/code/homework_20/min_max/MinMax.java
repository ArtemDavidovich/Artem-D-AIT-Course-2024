package homework_20.min_max;

//Задание 3. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MinMax {

    public static void main(String[] args) {

        //defining all correct seven types and putting them into a set
        String[] types = {"byte", "short", "char", "int", "long", "float", "double"};
        Set<String> typesSet = new HashSet<>(Arrays.asList(types));
        //The Arrays.asList() method converts the array into a list. The HashSet<>(...) constructor converts the list into a set (Set<String>). A set is a collection that does not allow duplicates. Each element in the set is unique.

        Set<String> finalTypes = new HashSet<>(); //creating a new set for types that are in the arguments and are correct

        for(String arg : args){
            if(typesSet.contains(arg)){
                finalTypes.add(arg); //if the type is correct, we add it to the final set
            } else {
                System.out.println("Wrong type: " + arg); //if the type is incorrect, we print a "wrong" message
            }
        }

        for(String missing : typesSet){
            if (!finalTypes.contains(missing)){
                finalTypes.add(missing); //adding the missing types to the final set
            }
        }

        //printing the minimum amd maximum values for our final types
        for (String res : finalTypes) {
                switch (res) {
                    case "byte" -> System.out.println("byte: min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE);
                    case "short" -> System.out.println("short: min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE);
                    case "char" -> System.out.println("char: min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE);
                    case "int" -> System.out.println("int: min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE);
                    case "long" -> System.out.println("long: min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE);
                    case "float" -> System.out.println("float: min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE);
                    case "double" -> System.out.println("double: min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE);
                }

        }

    }//end of main

}//end of class

