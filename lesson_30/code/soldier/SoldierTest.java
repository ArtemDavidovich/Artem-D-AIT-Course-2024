package soldier;

//- "John", 182, 82.3, 91
//- "Peter", 175, 77.1, 75
//- "Robin", 162, 55.1, 91
//- "Mary", 159, 55.1, 91
//- "Ann"", 162, 55, 88

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class SoldierTest {

    Soldier[] soldiers;

    @BeforeEach
    void setUp() {

        soldiers = new Soldier[] {
          new Soldier("John", 182, 82.3, 91),
          new Soldier("Peter", 175, 77.1, 75),
          new Soldier("John", 159, 55.1, 91),
          new Soldier("Mary", 159, 55.1, 91),
          new Soldier("Ann", 162, 55, 88)
        };
    }

    //- отсортировать солдат "естественным" образом - по росту
    @Test
    void testNativeSorting(){
        System.out.println("----------Print as is------------");
        printArray(soldiers);

        Arrays.sort(soldiers); //native, by default

        System.out.println("----------Print after native sorting------------");
        printArray(soldiers);
    }

    //- отсортировать по имени
    @Test
    void testSortByName(){
        Comparator<Soldier> comparatorByName = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {
                return - s1.getName().compareTo(s2.getName());
            }
        };
        System.out.println("----------Print as is------------");
        printArray(soldiers);

        Arrays.sort(soldiers, comparatorByName);

        System.out.println("----------Print after sorting by name------------");
        printArray(soldiers);
    }

    //- по весу
    @Test
    void testSortByWeight(){
        System.out.println("----------Print as is------------");
        printArray(soldiers);
        Arrays.sort(soldiers,(s1, s2) ->  Double.compare(s1.getWeight(), s2.getWeight()));
        System.out.println("----------Print after sorting by weight------------");
        printArray(soldiers);
    }

    //two and more factors for sorting
    @Test
    void testSortByNameAndHeight(){
        Comparator<Soldier> comparatorNameAndHeight = new Comparator<Soldier>() {
            @Override
            public int compare(Soldier s1, Soldier s2) {
                int res = s1.getName().compareTo(s2.getName());
                return res !=0 ? res : Integer.compare(s1.getHeight(), s2.getHeight());
            }
        } ;
        System.out.println("----------Print as is------------");
        printArray(soldiers);

        Arrays.sort(soldiers, comparatorNameAndHeight);

        System.out.println("----------Print after sorting by name and height------------");
        printArray(soldiers);

    }

    //- по значению profile (и росту)
    @Test
    void testSortSoldiersByProfile(){
        printArray(soldiers);
        Arrays.sort(soldiers, (s1, s2) -> {
            int res = -(s1.getProfile() - s2.getProfile()); // sort by Profile
            return res !=0 ? res : - s1.getHeight() + s2.getHeight();
        });
        System.out.println("-------------------------");
        printArray(soldiers);
    }

//- проверить работу метода binarySearch на массиве объектов
    @Test
    void testBinarySearch(){
        System.out.println("----------Print as is------------");
        printArray(soldiers);

        Arrays.sort(soldiers, (s1, s2) -> (s1.getProfile() - s2.getProfile()));

        System.out.println("----------Print after sorting by name and height------------");
        printArray(soldiers);

        //create pattern for search
        Soldier pattern = new Soldier(null,0,0,91);
        int index = Arrays.binarySearch(soldiers,pattern,(s1, s2) -> (s1.getProfile() - s2.getProfile()));
        System.out.println("Index = " + index);

    }

    public void printArray(Object[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }


    }

    @Test
    void testSortSoldiersByProfileHeightAndName(){

        System.out.println("----------------------Print as is----------------------");
        printArray(soldiers);

        Arrays.sort(soldiers, (s1, s2) -> {
            int res = s1.getProfile() - s2.getProfile();
            int res2 = s1.getHeight() - s2.getHeight();
            return (res !=0) ? res : (res2 != 0) ? res2 : s1.getName().compareTo(s2.getName());

        });
        System.out.println("----------------------Print after sorting by profile, height and name----------------------");
        printArray(soldiers);

    }

}//end of class