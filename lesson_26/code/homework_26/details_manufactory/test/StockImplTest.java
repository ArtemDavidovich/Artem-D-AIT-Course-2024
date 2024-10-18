package homework_26.details_manufactory.test;

import homework_26.details_manufactory.dao.Stock;
import homework_26.details_manufactory.dao.StockImpl;
import homework_26.details_manufactory.model.Detail;
import homework_26.details_manufactory.model.Gear;
import homework_26.details_manufactory.model.Lever;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockImplTest {

    Stock stock;
    Detail[] details;

    @BeforeEach
    void setUp() {
        stock = new StockImpl(5);
        details = new Detail[4];
        details[0] = new Gear(1_111_111_111_110L, 2.5,"M1", "V1",0.2,0.5,10);
        details[1] = new Gear(1_111_111_111_111L, 3.5,"M1", "V2",0.5,1.5,18);
        details[2] = new Lever(1_111_111_111_112L, 5.1,"M2", "V3",0.2,5.5);
        details[3] = new Lever(1_111_111_111_113L, 5.5,"M2", "V2",0.2,6.5);

        for (int i = 0; i < 4; i++) {
            stock.addDetail(details[i]);
        }
    }

    @Test
    @DisplayName("Adding detail to Stock")
    void addDetail() {
        //no null adding
        assertFalse(stock.addDetail(null));
        //no duplicate adding
        assertFalse(stock.addDetail(details[0]));
        //adding new document
        Detail newDetail = new Gear(1_111_111_111_114L, 3.0,"M3", "V2",0.35,0.6,12);
        assertTrue(stock.addDetail(newDetail));
        assertEquals(5, stock.quantity());
        //adding one more document over capacity
        Detail oneMoreDetail = new Lever(1_111_111_111_115L, 5.5,"M2", "V2",0.2,6.5);
        assertFalse(stock.addDetail(oneMoreDetail));
    }

    @Test
    @DisplayName("Searching for exact detail by its barCode")
    void findDetail() {
        assertEquals(details[0], stock.findDetail(1_111_111_111_110L));
        assertNull(stock.findDetail(1_111_111_111_119L));
    }

    @Test
    @DisplayName("Updating one of the details in Stock")
    void updateDetail() {
        Detail newDetail = new Gear(1_111_111_111_111L, 3.5,"M1", "V4",0.5,1.5,18);
        assertEquals(newDetail, stock.updateDetail(newDetail,1_111_111_111_111L));
    }

    @Test
    @DisplayName("Deleting detail from Stock")
    void removeDetail() {
        assertEquals(details[0], stock.removeDetail(1_111_111_111_110L));
        assertEquals(3, stock.quantity());
    }

    @Test
    @DisplayName("Calculating total weight of details in Stock")
    void totalWeight() {
        double res = 0;
        for (int i = 0; i < stock.quantity(); i++) {
            res += details[i].getWeight();
        }
        assertEquals(res, stock.totalWeight(details));
    }

    @Test
    @DisplayName("Calculating average weight of details in Stock")
    void averageWeight() {
        double res = 0;
        for (int i = 0; i < stock.quantity(); i++) {
            res += details[i].getWeight();
        }
        res /= stock.quantity();
        assertEquals(res, stock.totalWeight(details));
    }

    @Test
    @DisplayName("Checking actual size of Stock")
    void testQuantity(){
        assertEquals(4, stock.quantity());
    }
}