package homework_28.marathon.computer_shop.dao;

import homework_28.marathon.computer_shop.model.Computer;

public interface ComputerShop {

    Computer[] fillComputerShop(Computer[] computers);

    boolean addComputer(Computer computer);

    void printComputerShop();

    Computer findComputer(long barCode);

    Computer[] findBlFrDiscount();

    Computer removeComputer(long barCode);

    boolean updateComputer(Computer computer);

    int size();

}
