package classwork_44.programmer_and_technologies;

import java.util.List;
import java.util.Objects;

public class Programmer {

    private String nickName;
    private List<String> technology;

    public Programmer(String nickName, List<String> technology) {
        this.nickName = nickName;
        this.technology = technology;
    }

    public String getNickName() {
        return nickName;
    }

    public List<String> getTechnology() {
        return technology;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Programmer that)) return false;
        return Objects.equals(nickName, that.nickName) && Objects.equals(technology, that.technology);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nickName, technology);
    }

    @Override
    public String toString() {
        return "Programmer: " + nickName + ", technology: " + technology.toString();
    }
}
