package homework_43.students_marks;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Stream;

public class Students {

    private String name;
    private List<Integer> marks;

    public Students(String name, List<Integer> marks) {
        this.name = name;
        this.marks = marks;
    }

    public double getAverageGrade() {
        return marks.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    public void setMarks(List<Integer> marks) {
        this.marks = marks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Students students)) return false;
        return Objects.equals(name, students.name) && Objects.equals(marks, students.marks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, marks);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Students{");
        sb.append("name='").append(name).append('\'');
        sb.append(", marks=").append(marks);
        sb.append('}');
        return sb.toString();
    }
}
