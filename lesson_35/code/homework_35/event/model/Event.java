package homework_35.event.model;

//Задача 3.(*) По аналогии с приложением Album начать делать приложение Event поля для Event (событие)
//
//id;
//title;
//url;
//data.

import java.time.LocalDateTime;
import java.util.Objects;

public class Event implements Comparable<Event>{

    private final int id;
    private String title;
    private String url;
    private LocalDateTime date;

    public Event(int id, String title, String url,  LocalDateTime date) {
        this.id = id;
        this.title = title;
        this.url = url;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Event event)) return false;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Event{");
        sb.append("id=").append(id);
        sb.append(", title='").append(title).append('\'');
        sb.append(", url='").append(url).append('\'');
        sb.append(", date=").append(date);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Event event) {
        return this.getDate().compareTo(event.getDate());
    }
}
