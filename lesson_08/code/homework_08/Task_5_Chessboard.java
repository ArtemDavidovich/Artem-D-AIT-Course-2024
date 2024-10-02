package homework_08;

//Task 5. (*) Print 8x8 chessboard onto your screen. 0 - white cell, 1 - black.
//The top left cell should be 0, the bottom left cell should be 1.

public class Task_5_Chessboard {

    public static void main(String[] args) {

        //initial data for cycle loop
        int a = 1, b = 1, c = 1;
        int x = 0;
        int y = 0;

        while(a < 9){
            while(b < 9){ //printing the line starting with 0
                x = 0;
                y = 0;
                    while (b < 9 && x == 0) {
                        System.out.print(x + " | ");
                        x++;
                        y++;
                        b++;
                        while (b < 9 && y == 1) {
                            System.out.print(x + " | ");
                            y--;
                            x--;
                            b++;
                        }//end of while y

                    }//end of while x

            } //end of while b

            a++; //increasing the number of lines
            System.out.println(); //jumping to the next line

            while(c < 9){ //printing the line starting with 1
                x = 1;
                y = 1;
                while (c < 9 && y == 1) {
                    System.out.print(y + " | ");
                    x--;
                    y--;
                    c++;
                    while (c < 9 && x == 0) {
                        System.out.print(y + " | ");
                        y++;
                        x++;
                        c++;
                    }//end of while y

                }//end of while x

            } //end of while b

            b = 1;
            c = 1;
            a++; //increasing the number of lines
            System.out.println();  //jumping to the next line

        } //end of while a

    }//end of main

}//end of class
