package homework_33.week_day.test;

import homework_33.week_day.model.WeekDay;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WeekDayTest {

    WeekDay[] weekDays;
    WeekDay w;

    @BeforeEach
    void setUp() {
        weekDays = WeekDay.values();
    }

    @Test
    @DisplayName("Checking day-of-the-week definition method")
    void testPlusDay() {
        w = WeekDay.MON;
        int n = 10;
        assertEquals(WeekDay.THU, w.plusDay(n));
    }
}