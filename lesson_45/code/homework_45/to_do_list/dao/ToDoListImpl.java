package homework_45.to_do_list.dao;

import homework_45.to_do_list.model.Action;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ToDoListImpl implements ToDoList{

    @Override
    public void addActionToFile(Action action) {
        try (FileOutputStream fout = new FileOutputStream("to_do_list.txt", true)) {
            String str = action.toString();
            fout.write(str.getBytes());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clearFile() {
        try (FileOutputStream fout = new FileOutputStream("to_do_list.txt")) {
            //File opening without inputting new data just makes the file clear
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printFile() {
        try (FileInputStream fin = new FileInputStream("to_do_list.txt")) {
            int l = fin.available();
            for (int i = 0; i < l; i++) {
              char y = (char) fin.read();
                System.out.print(y);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}//end of class
