package homework_35.event.dao;

import homework_35.event.model.Event;

import java.util.Arrays;
import java.util.Comparator;

public class EventCalendarImpl implements EventCalendar{

    Comparator<Event> comparator = Comparator.nullsLast((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));

    private Event[] events;
    private int size;

    public EventCalendarImpl(int quantity) {
        this.events = new Event[quantity];
    }

    @Override
    public boolean addEvent(Event event) {
        if(event == null || size == events.length || findEvent(event.getId()) != null) {
            return false;
        }
        events[size++] = event;
        Arrays.sort(events, comparator);
        return true;
    }

    @Override
    public void printEvent() {
        for (int i = 0; i < size; i++) {
            System.out.println(events[i]);
        }
    }

    @Override
    public boolean removeEvent(int id) {
        for (int i = 0; i < size; i++) {
            if(events[i].getId() == id){
                System.arraycopy(events, i + 1, events, i, size - i - 1);
                events[--size] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean updateEvent(Event event) {
        for (int i = 0; i < size; i++) {
            if(events[i].getId() == event.getId()){
                events[i] = event;
                return true;
            }
        }
        return false;
    }

    @Override
    public Event findEvent(int id) {
        for (int i = 0; i < size; i++) {
            if(events[i].getId() == id){
                return events[i];
            }
        }
        return null;
    }

    @Override
    public int size() {
        return size;
    }

}//end of class
