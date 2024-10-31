package homework_35.event.dao;

import homework_35.event.model.Event;

public interface EventCalendar {

    boolean addEvent(Event event);

    void printEvent();

    boolean removeEvent(int id);

    boolean updateEvent(Event event);

    Event findEvent(int id);

    int size();





}
