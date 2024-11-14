package homework_45.to_do_list.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Action implements Serializable {

    private int id;
    private String actionDescription;
    private LocalDate date;

    public Action(int id, String actionDescription, LocalDate date) {
        this.id = id;
        this.actionDescription = actionDescription;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getActionDescription() {
        return actionDescription;
    }

    public void setActionDescription(String actionDescription) {
        this.actionDescription = actionDescription;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Action action)) return false;
        return id == action.id && Objects.equals(actionDescription, action.actionDescription) && Objects.equals(date, action.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, actionDescription, date);
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = date.format(formatter);
        return String.format("%d. %s. %s\n", id, actionDescription, formattedDate);
    }
}
