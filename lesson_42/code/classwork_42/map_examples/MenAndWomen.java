package classwork_42.map_examples;

import java.util.HashMap;
import java.util.Map;

public class MenAndWomen {

    public static void main(String[] args) {

        // m - male, f - female

        Map<String, String> genderMap = new HashMap();

        genderMap.put("LK", "m");
        genderMap.put("AD", "m");
        genderMap.put("DM", "m");
        genderMap.put("GA", "f");
        genderMap.put("JR", "m");
        genderMap.put("OF", "f");
        genderMap.put("DV", "f");
        genderMap.put("GT", "f");

        //1 option - keys, keySet

        int men = 0;
        for (String name : genderMap.keySet()) {
            if (genderMap.get(name).equals("m")){
                men++;
            }
        }
        System.out.println("Men: " + men);
        int s = genderMap.size();
        int women = s - men;
        System.out.println("Women: " + women);

        //2 option - проходим по values, values()
        women = 0;
        men = 0;
        for (String value : genderMap.values()) {
            if(value.equals("f")){
                women++;
            }
        }
        System.out.println(women);

    }//end of main

}//end of class
