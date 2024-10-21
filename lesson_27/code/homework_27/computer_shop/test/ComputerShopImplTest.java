package homework_27.computer_shop.test;

import homework_27.computer_shop.dao.ComputerShopImpl;
import homework_27.computer_shop.model.Computer;
import homework_27.computer_shop.model.Laptop;
import homework_27.computer_shop.model.Smartphone;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputerShopImplTest {

    ComputerShopImpl computerShop;
    Computer[] computers;
    int size = 0;

    @BeforeEach
    void setUp() {
        computerShop = new ComputerShopImpl(7);
        computers = new Computer[6];
        computers[0] = new Computer(1_111_111_111_110L,"i7", 8,256,"Acer",1200);
        computers[1] = new Computer(1_111_111_111_111L,"i5", 16,512,"HP",1500);
        computers[2] = new Computer(1_111_111_111_112L,"AMD", 8,256,"NoName",2000, 0.3);
        computers[3] = new Laptop(1_111_111_111_113L,"M2",8,256,"MacBook",2200, 14, 1.5, 10, "blue");
        computers[4] = new Laptop(1_111_111_111_114L,"M3",16,128,"MacBook Air",2500, 15, 1.72, 10, "red", 0.25);
        computers[5] = new Smartphone(1_111_111_111_115L,"A1",128,256,"Samsung",1300, 9, 0.4, 12, "red", 111_111_111_111_110L);

        computerShop.fillComputerShop(computers);
    }

    @Test
    @DisplayName("Filling Shop with devices")
    void testFillComputerShop() {
        assertEquals(computers, computerShop.fillComputerShop(computers));
    }

    @Test
    @DisplayName("Adding device to Shop")
    void testAddComputer() {
        //no null adding
        assertFalse(computerShop.addComputer(null));
        //no duplicate adding
        assertFalse(computerShop.addComputer(computers[0]));
        //adding new item
        Computer newComputer = new Smartphone(1_111_111_111_116L,"A1",128,256,"Xiaomi",1100, 9, 0.4, 12, "blue", 111_111_111_111_111L);
        assertTrue(computerShop.addComputer(newComputer));
        assertEquals(7,computerShop.size());
        //adding one more item over capacity
        Computer oneMoreComputer = new Smartphone(1_111_111_111_119L,"A1",128,256,"Xiaomi",1100, 9, 0.4, 12, "blue", 111_111_111_111_112L);
        assertFalse(computerShop.addComputer(oneMoreComputer));
    }

    @Test
    @DisplayName("Printing Shop")
    void testPrintComputerShop() {
        computerShop.printComputerShop();
        System.out.println("=============================");
    }

    @Test
    @DisplayName("Searching for exact device by its bar code")
    void testFindComputer() {
        assertEquals(computers[0], computerShop.findComputer(1_111_111_111_110L));
        assertNull(computerShop.findComputer(1_111_111_111_119L));
    }

    @Test
    @DisplayName("Searching for devices with black friday discount")
    void testFindBlFrDiscount() {
        Computer[] tempComputers = new Computer[2];
        tempComputers[0] = new Computer(1_111_111_111_112L,"AMD", 8,256,"NoName",2000, 0.3);
        tempComputers[1] = new Laptop(1_111_111_111_114L,"M3",16,128,"MacBook Air",2500, 15, 1.72, 10, "red", 0.25);
        assertArrayEquals(tempComputers, computerShop.findBlFrDiscount());

    }

    @Test
    @DisplayName("Deleting device from Shop")
    void testRemoveComputer() {
        //remove existing element
        assertEquals(computers[0], computerShop.removeComputer(1_111_111_111_110L));
        assertEquals(5, computerShop.size());
        //remove absent element
        assertNull(computerShop.removeComputer(1_111_111_111_119L));
    }

    @Test
    @DisplayName("Updating device in Shop")
    void testUpdateComputer() {
        Computer newComputer = new Smartphone(1_111_111_111_116L,"A1",128,256,"Xiaomi",1100, 9, 0.4, 12, "blue", 111_111_111_111_111L);
        Computer oneMoreComputer = new Smartphone(1_111_111_111_116L,"A1",128,256,"Xiaomi",1050, 9, 0.4, 12, "yellow", 111_111_111_111_111L);
        computerShop.addComputer(newComputer);
        computerShop.printComputerShop();
        System.out.println("==============================");
        assertTrue(computerShop.updateComputer(oneMoreComputer));
        computerShop.printComputerShop();
    }

    @Test
    @DisplayName("Checking actual quantity of devices in Shop")
    void testSize() {
        assertEquals(6, computerShop.size());
    }
}