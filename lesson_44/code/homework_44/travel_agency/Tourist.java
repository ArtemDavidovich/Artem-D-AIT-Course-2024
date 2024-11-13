package homework_44.travel_agency;

import java.util.List;
import java.util.Objects;

public class Tourist {

    private String name;
    private List<String> countries;

    public Tourist(String name, List<String> countries) {
        this.name = name;
        this.countries = countries;
    }

    public String getName() {
        return name;
    }

    public List<String> getCountries() {
        return countries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tourist that)) return false;
        return Objects.equals(name, that.name) && Objects.equals(countries, that.countries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, countries);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tourist{");
        sb.append("name='").append(name).append('\'');
        sb.append(", countries=").append(countries);
        sb.append('}');
        return sb.toString();
    }

}//end of class
