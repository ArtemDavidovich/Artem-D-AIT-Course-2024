package homework_33.planner.test;

import homework_33.planner.dao.PlannerImpl;
import homework_33.planner.model.Action;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlannerImplTest {
    Action[] actions;
    PlannerImpl planner;

    @BeforeEach
    void setUp() {
        actions = Action.values();
        planner = new PlannerImpl();
    }

    @Test
    @DisplayName("Checking menu printing")
    void testPrintMenu() {
        planner.printMenu();
    }
}