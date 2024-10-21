package homework_28.marathon.computer_shop.dao;

import homework_28.marathon.computer_shop.model.Computer;

public class ComputerShopImpl implements ComputerShop{

    private Computer[] computers;
    private int size;

    public ComputerShopImpl(int capacity){
        this.computers = new Computer[capacity];
        this.size = 0;
    }

    @Override
    public Computer[] fillComputerShop(Computer[] computers) {
        int count = 0;
        for (int i = 0; i < computers.length; i++) {
            if(!(computers[i] == null)){
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            addComputer(computers[i]);
        }
        return computers;
    }

    @Override
    public boolean addComputer(Computer computer) {
        if(computer == null) {
            return false;
        }
        if(findComputer(computer.getBarCode()) != null){
            return false;
        }
        if(size == computers.length){
            return false;
        }
        computers[size] = computer;
        size++;
        return true;
    }

    @Override
    public void printComputerShop() {
        for (int i = 0; i < size; i++) {
            System.out.println(computers[i]);
        }
    }

    @Override
    public Computer findComputer(long barCode) {
        for (int i = 0; i < size; i++) {
            if(computers[i].getBarCode() == barCode){
                return computers[i];
            }
        }
        return null;
    }

    @Override
    public Computer[] findBlFrDiscount() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(computers[i].getBlFrDiscount() > 0){
                count++;
            }
        }
        Computer[] tempComputers = new Computer[count];
        for (int i = 0, j = 0; i < size; i++) {
            if(computers[i].getBlFrDiscount() > 0){
                tempComputers[j] = computers[i];
                j++;
            }
        }
        if(tempComputers[0] != null) {
            return tempComputers;
        }
        return null;
    }

    @Override
    public Computer removeComputer(long barCode) {
        for (int i = 0; i < size; i++) {
            if(computers[i].getBarCode() == barCode){
                //putting copy of last element instead of victim
                Computer victim = computers[i];
                computers[i] = computers[size - 1];
                computers[size - 1] = null;
                //erasing last element of array
                size--;
                return victim;
            }
        }
        return null;
    }

    @Override
    public boolean updateComputer(Computer computer) {
        removeComputer(computer.getBarCode());
        addComputer(computer);
        for (int i = 0; i < size; i++) {
            if(computers[i] == computer){
                return true;
            }
        }
        return false;
    }

    @Override
    public int size() {
        return size;
    }

}//end of class
