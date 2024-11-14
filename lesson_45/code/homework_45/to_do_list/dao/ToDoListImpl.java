package homework_45.to_do_list.dao;

import homework_45.to_do_list.model.Action;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class ToDoListImpl implements ToDoList{

    @Override
    public void addActionToFile(Set<Action> actions) {
        try (ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream("to_do_list.dat", true))) {
            oos.writeObject(actions);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void clearFile() {
        try (FileOutputStream fout = new FileOutputStream("to_do_list.dat")) {
            //File opening without inputting new data just makes the file clear
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void printFile() {
        try (ObjectInputStream ois = new ObjectInputStream (new FileInputStream("to_do_list.dat"))) {
            Set<Action> actionSet = new HashSet<>();
            actionSet = (Set<Action>) ois.readObject();
                System.out.print(actionSet);
            } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}//end of class
