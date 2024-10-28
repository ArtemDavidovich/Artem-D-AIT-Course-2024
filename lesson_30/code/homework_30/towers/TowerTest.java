package homework_30.towers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

class TowerTest {

    Tower[] towers;

    @BeforeEach
    void setUp() {
        towers = new Tower[] {
                new Tower("Berliner Fernsehturm", 1965, 368.03),
                new Tower("Tokyo Skytree", 2008, 634.0),
                new Tower("Eiffel Tower", 1887, 324.0),
                new Tower("CN Tower", 1973, 553.3),
                new Tower("Shanghai Tower", 2008, 632.0)
        };

    }

    //native sorting
    @Test
    @DisplayName("Native sorting (by height)")
    void testNativeSorting(){
        System.out.println("------------Print as it is--------------");
        printTower(towers);

        Arrays.sort(towers);

        System.out.println("------------Print after native sorting------------");
        printTower(towers);
    }

    //sorting by 2 fields
    @Test
    @DisplayName("Sorting by two criteria")
    void testSortByHeightAndYear(){
        Comparator<Tower> comparatorHeightAndYear = new Comparator<Tower>() {
            @Override
            public int compare(Tower t1, Tower t2) {
                int res = Double.compare(t1.getHeight(), t2.getHeight());
                return res != 0 ? res : t1.getYearOfConstruction() - t2.getYearOfConstruction();
            }
        };
        System.out.println("------------Print as it is--------------");
        printTower(towers);

        Arrays.sort(towers, comparatorHeightAndYear);

        System.out.println("------------Print after sorting by height and year of construction------------");
        printTower(towers);
    }

    //sorting by 3 fields
    @Test
    @DisplayName("Sorting by three criteria")
    void testSortByNameAndHeightAndYear(){
        Comparator<Tower> comparatorNameAndHeightAndYear = new Comparator<Tower>() {
            @Override
            public int compare(Tower t1, Tower t2) {
                int res = t1.getName().compareTo(t2.getName());
                int res2 = Double.compare(t1.getHeight(), t2.getHeight());
                return res != 0 ? res : res2 != 0 ? res2 : t1.getYearOfConstruction() - t2.getYearOfConstruction();
            }
        };
        System.out.println("------------Print as it is--------------");
        printTower(towers);

        Arrays.sort(towers, comparatorNameAndHeightAndYear);

        System.out.println("------------Print after sorting by name and height and year of construction------------");
        printTower(towers);
    }

    //binary search in array
    @Test
    @DisplayName("Checking binary search")
    void testBinarySearch(){
        System.out.println("------------Print as it is--------------");
        printTower(towers);

        Arrays.sort(towers, (t1, t2) -> t1.getName().compareTo(t2.getName()));

        System.out.println("------------Print after sorting by name------------");
        printTower(towers);

        //create pattern for search
        Tower pattern = new Tower("Eiffel Tower", 0,0);
        int index = Arrays.binarySearch(towers, pattern, (t1, t2) -> t1.getName().compareTo(t2.getName()));
        System.out.println("Index = " + index);
    }

    //printing array
    public void printTower(Object[] array){
        for(Object object : array){
            System.out.println(object);
        }
    }

}//end of class