package homework_20.min_max;

//Задание 3. Напишите приложение, которое выводит минимальные/максимальные числовые значения примитивных типов: byte, short, char, int, long, float, double Типы как объекты String должны браться из аргументов основной функции main. Если в аргументах нет какого-либо типа (не указан тип), приложение должно вывести максимальное/минимальное значения 7 типов (byte, int, short, long, char, float, double). Если аргументы содержат неправильный тип, приложение должно вывести сообщение: Неверный тип.

public class MinMax {

    public static void main(String[] args) {

        String[] str = {"byte", "short", "char", "int", "long", "float", "double"};

        String[] temp = new String[str.length]; //creating new array for elements keeping

        //looking through the array and defining if they were printed in the arguments
        for (int i = 0; i < str.length; i++) {
            if (args.length > i) {
                String res = (i < args.length) ? args[i] : "";;
                switch (res) {
                    case "byte" -> temp[i] = "byte: min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE;
                    case "short" -> temp[i] = "short: min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE;
                    case "char" -> temp[i] = "char: min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE;
                    case "int" -> temp[i] = "int: min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE;
                    case "long" -> temp[i] = "long: min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE;
                    case "float" -> temp[i] = "float: min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE;
                    case "double" -> temp[i] = "double: min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE;
                    default -> temp[i] = "Wrong type: " + res;
                }
            }
        }

        // Выводим результаты
        for (String print : temp) {
            System.out.println(print);
        }


    }//end of main

    //else {
    //                // if the type is missing we are printing it anyway
    //                temp[i] = str[i];
    //                switch (str[i]) {
    //                    case "byte" -> temp[i] += " min = " + Byte.MIN_VALUE + ", max = " + Byte.MAX_VALUE;
    //                    case "short" -> temp[i] += " min = " + Short.MIN_VALUE + ", max = " + Short.MAX_VALUE;
    //                    case "char" -> temp[i] += " min = " + (int) Character.MIN_VALUE + ", max = " + (int) Character.MAX_VALUE;
    //                    case "int" -> temp[i] += " min = " + Integer.MIN_VALUE + ", max = " + Integer.MAX_VALUE;
    //                    case "long" -> temp[i] += " min = " + Long.MIN_VALUE + ", max = " + Long.MAX_VALUE;
    //                    case "float" -> temp[i] += " min = " + Float.MIN_VALUE + ", max = " + Float.MAX_VALUE;
    //                    case "double" -> temp[i] += " min = " + Double.MIN_VALUE + ", max = " + Double.MAX_VALUE;
    //                }
    //            }

}//end of class
