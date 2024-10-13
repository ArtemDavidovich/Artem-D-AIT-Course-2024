package homework_22.address;

//Задача 3.(*) Создать класс Address, проверить:
//
//город с большой буквы
//индекс содержит 5 цифр
//предложите еще тесты

public class Address {

    private String city;
    private int index;
    private String street;
    private String houseNumber;

    //constructor
    public Address(String city, int index, String street, String houseNumber) {
        setCity(city);
        setIndex(index);
        setStreet(street);
        setHouseNumber(houseNumber);
    }

    //setters and getters
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if(isCityValid(city)){
            this.city = city;
        } else{
            System.out.println("Error! The city name '" + city + "' is invalid.");
        }
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        if(isIndexValid(index)){
            this.index = index;
        } else{
            System.out.println("Error! Index '" + index + "' is invalid.");
        }
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        if(isStreetValid(street)){
            this.street = street;
        } else{
            System.out.println("Error! The street name '" + street + "' is invalid.");
        }
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        if(isHouseNumberValid(houseNumber)){
            this.houseNumber = houseNumber;
        } else{
            System.out.println("Error! The house number '" + houseNumber + "' is invalid.");
        }
    }

    @Override
    public String toString() {
        return "Adress{" +
                "city='" + city + '\'' +
                ", index=" + index +
                ", street='" + street + '\'' +
                ", houseNumber=" + houseNumber + '\'' +
                '}';
    }

    //1.city starts from big letter
    //2.city name has more than one letter
    //3.has only letters, spaces or dashes

    public boolean isCityValid(String city){
        if(Character.isLowerCase(city.charAt(0))){
            return false;
        }
        if(city.length() < 2){
            return false;
        }
        for (int i = 0; i < city.length(); i++) {
            char ch = city.charAt(i);
            if(!(Character.isAlphabetic(ch) || ch == ' ' || ch == '-')){
                return false;
            }
        }
        return true;
    }

    //1.index has 5 digits

    public boolean isIndexValid(int index){
        Integer integer = index;
        String str = Integer.toString(integer);
        if(str.length() == 5){
            return true;
        }
        return false;
    }

    //1.street name starts from big letter
    //2.street name has only letters, ' ', '.', '-', apostrophe
    //3.street name has any variation of 'straße'

    public boolean isStreetValid(String street){
        if(Character.isLowerCase(street.charAt(0))){
            return false;
        }
        for (int i = 0; i < street.length(); i++) {
            char ch = street.charAt(i);
            if(!(Character.isAlphabetic(ch) || ch == ' ' || ch == '-' || ch == 39 || ch == '.')){
                return false;
            }
        }
        if(!(street.contains("straße") || street.contains("Straße") || street.contains("str.") || street.contains("Str."))){
            return false;
        }
        return true;
    }

    //1.house number has minimum 1 and maximum 3 digits
    //2.house number can't start from 0
    //3.house number can have only one letter and it should stay in the end

    public boolean isHouseNumberValid(String houseNumber){
        int count = 0;
        for (int i = 0; i < houseNumber.length(); i++) {
            char ch = houseNumber.charAt(i);
            if(Character.isDigit(ch)){
                count++;
            }
            if(count < 1 || count > 3){
                return false;
            }
        }
        if(houseNumber.charAt(0) == 48){
            return false;
        }
        boolean hasLetter = false;
        for (int i = 0; i < houseNumber.length(); i++) {
            char ch = houseNumber.charAt(i);
            if(Character.isAlphabetic(ch) && houseNumber.indexOf(ch) != houseNumber.length() - 1){
                return false;
            }
        }
        return true;
    }

}//end of class
