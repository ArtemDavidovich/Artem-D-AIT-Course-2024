package homework_35.event.test;

import homework_35.event.dao.EventCalendar;
import homework_35.event.dao.EventCalendarImpl;
import homework_35.event.model.Event;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class EventCalendarImplTest {

    Comparator<Event> comparator = Comparator.nullsLast((e1, e2) -> Integer.compare(e1.getId(), e2.getId()));

    Event[] events;
    EventCalendar eventCalendar;

    LocalDateTime now = LocalDateTime.now();

    @BeforeEach
    void setUp() {
        eventCalendar = new EventCalendarImpl(6);
        events = new Event[5];
        events[0] = new Event(1, "t1", "url1", now.plusDays(8));
        events[1] = new Event(2, "t2", "url2", now.plusDays(14));
        events[2] = new Event(3, "t3", "url3", now.plusDays(45));
        events[3] = new Event(4, "t4", "url4", now.plusDays(3));
        events[4] = new Event(5, "t5", "url5", now.plusDays(21));

        for (int i = 0; i < 5; i++) {
            eventCalendar.addEvent(events[i]);
        }
    }

    @Test
    @DisplayName("Checking adding to Calendar")
    void testAddEvent() {
        assertFalse(eventCalendar.addEvent(null));
        assertFalse(eventCalendar.addEvent(events[1]));
        Event newEvent = new Event(6, "t6", "url6", now.plusDays(22));
        assertTrue(eventCalendar.addEvent(newEvent));
        assertEquals(6, eventCalendar.size());
        Event newEvent2 = new Event(7, "t6", "url6", now.plusDays(22));
        assertFalse(eventCalendar.addEvent(newEvent2));
    }

    @Test
    @DisplayName("Checking printing Calendar")
    void testPrintEvent() {
        eventCalendar.printEvent();
    }

    @Test
    @DisplayName("Checking deleting from Calendar")
    void testRemoveEvent() {
        assertTrue(eventCalendar.removeEvent(events[0].getId()));
        assertEquals(4, eventCalendar.size());
        assertFalse(eventCalendar.removeEvent(9));
    }

    @Test
    @DisplayName("Checking updating event in Calendar")
    void testUpdateEvent() {
        Event newEvent = new Event(1, "t1", "newUrl", now.plusDays(8));
        assertTrue(eventCalendar.updateEvent(newEvent));
        assertEquals(newEvent, eventCalendar.findEvent(1));
    }

    @Test
    @DisplayName("Checking searching for Calendar")
    void testFindEvent() {
        assertEquals(events[0], eventCalendar.findEvent(1));
    }

    @Test
    @DisplayName("Checking size method (current quantity)")
    void testSize() {
        assertEquals(5, eventCalendar.size());
    }
}