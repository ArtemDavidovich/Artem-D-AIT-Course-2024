package homework_45.compare_file;

//Задание 1. В классе CompareFileAppl реализовать логику сравнения двух файлов в методе main. Имена файлов принимать через массив args. Два файла считаем одинаковыми, если у них одинаковая длина, и на тех же позициях стоят те же байты. Результат должен быть выведен на консоль в виде сообщения.

import java.io.FileInputStream;
import java.io.IOException;

public class CompareFileAppl {

    public static void main(String[] args) {

        //check number of arguments
        if(args.length != 2){
            System.out.println("Wrong number of arguments. Provide two file names to compare.");
            System.exit(0);
        }

        //print file names
        System.out.println("Source file: " + args[0]);
        System.out.println("Destination file: " + args[1]);

        System.out.println("---------Result of comparison-----------");

        try (FileInputStream finA = new FileInputStream(args[0]);
            FileInputStream finB = new FileInputStream(args[1])) {

            //checking the files' sizes
            if(finA.available() != finB.available()){
                System.out.println("Unsuccessful! Files have different size.");
                System.exit(0);
            }

            int a, b;

            //comparing files byte by byte
            while((a = finA.read()) != -1){
                b = finB.read();
                if (a != b){
                    System.out.println("Unsuccessful! Bytes in files differ.");
                    System.exit(0);
                }
            }

            System.out.println("Successful! Files are the same.");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }//end of main

}//end of class
