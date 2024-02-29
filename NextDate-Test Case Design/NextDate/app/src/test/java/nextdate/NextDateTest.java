package nextdate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class NextDateTest {

    @ParameterizedTest
    @CsvSource({
            // D1, M1, Y1: TRUE
            "1, 1, 2001, 2001-01-02",
            // D1, M1, Y2: TRUE
            "1, 1, 2024, 2024-01-02",
            // D1, M1, Y3: FALSE
            "1, 1, 2300, Invalid date",
            // D1, M2, Y1: TRUE
            "1, 4, 2001, 2001-04-02",
            // D1, M2, Y2: TRUE
            "1, 4, 2024, 2024-04-02",
            // D1, M2, Y3: FALSE
            "1, 4, 2300, Invalid date",
            // D1, M3, Y1: TRUE
            "1, 2, 2001, 2001-02-02",
            // D1, M3, Y2: TRUE
            "1, 2, 2024, 2024-02-02",
            // D1, M3, Y3: FALSE
            "1, 2, 2300, Invalid date",
            // D1, M4, Y1: FALSE
            "1, 0, 2001, Invalid date",
            // D1, M4, Y2: FALSE
            "1, 0, 2024, Invalid date",
            // D1, M4, Y3: FALSE
            "1, 0, 2300, Invalid date",
            // D2, M1, Y1: TRUE
            "29, 1, 2001, 2001-01-30",
            // D2, M1, Y2: TRUE
            "29, 1, 2024, 2024-01-30",
            // D2, M1, Y3: FALSE
            "29, 1, 2300, Invalid date",
            // D2, M2, Y1: TRUE
            "29, 4, 2001, 2001-04-30",
            // D2, M2, Y2: TRUE
            "29, 4, 2024, 2024-04-30",
            // D2, M2, Y3: FALSE
            "29, 4, 2300, Invalid date",
            // D2, M3, Y1: FALSE
            "29, 2, 2001, Invalid date",
            // D2, M3, Y2: TRUE
            "29, 3, 2024, 2024-03-30",
            // D2, M3, Y3: FALSE
            "29, 3, 2300, Invalid date",
            // D2, M4, Y1: FALSE
            "29, 0, 2001, Invalid date",
            // D2, M4, Y2: FALSE
            "29, 0, 2024, Invalid date",
            // D2, M4, Y3: FALSE
            "29, 0, 2300, Invalid date",
            // D3, M1, Y1: TRUE
            "30, 1, 2001, 2001-01-31",
            // D3, M1, Y2: TRUE
            "30, 1, 2024, 2024-01-31",
            // D3, M1, Y3: FALSE
            "30, 1, 2300, Invalid date",
            // D3, M2, Y1: TRUE
            "30, 4, 2001, 2001-05-01",
            // D3, M2, Y2: TRUE
            "30, 4, 2024, 2024-05-01",
            // D3, M2, Y3: FALSE
            "30, 4, 2300, Invalid date",
            // D3, M3, Y1: FALSE
            "30, 2, 2001, Invalid date",
            // D3, M3, Y2: FALSE
            "30, 2, 2024, Invalid date",
            // D3, M3, Y3: FALSE
            "30, 2, 2300, Invalid date",
            // D3, M4, Y1: FALSE
            "30, 0, 2001, Invalid date",
            // D3, M4, Y2: FALSE
            "30, 0, 2024, Invalid date",
            // D3, M4, Y3: FALSE
            "30, 0, 2300, Invalid date",
            // D4, M1, Y1: TRUE
            "31, 1, 2001, 2001-02-01",
            // D4, M1, Y2: TRUE
            "31, 1, 2024, 2024-02-01",
            // D4, M1, Y3: FALSE
            "31, 1, 2300, Invalid date",
            // D4, M2, Y1: FALSE
            "31, 4, 2001, Invalid date",
            // D4, M2, Y2: FALSE
            "31, 4, 2024, Invalid date",
            // D4, M2, Y3: FALSE
            "31, 4, 2300, Invalid date",
            // D4, M3, Y1: FALSE
            "31, 2, 2001, Invalid date",
            // D4, M3, Y2: FALSE
            "31, 2, 2024, Invalid date",
            // D4, M3, Y3: FALSE
            "31, 2, 2300, Invalid date",
            // D4, M4, Y1: FALSE
            "31, 0, 2001, Invalid date",
            // D4, M4, Y2: FALSE
            "31, 0, 2024, Invalid date",
            // D4, M4, Y3: FALSE
            "31, 0, 2300, Invalid date",
            // D5, M1, Y1: FALSE
            "0, 1, 2001, Invalid date",
            // D5, M1, Y2: FALSE
            "0, 1, 2024, Invalid date",
            // D5, M1, Y3: FALSE
            "0, 1, 2300, Invalid date",
            // D5, M2, Y1: FALSE
            "0, 4, 2001, Invalid date",
            // D5, M2, Y2: FALSE
            "0, 4, 2024, Invalid date",
            // D5, M2, Y3: FALSE
            "0, 4, 2300, Invalid date",
            // D5, M3, Y1: FALSE
            "0, 2, 2001, Invalid date",
            // D5, M3, Y2: FALSE
            "0, 2, 2024, Invalid date",
            // D5, M3, Y3: FALSE
            "0, 2, 2300, Invalid date",
            // D5, M4, Y1: FALSE
            "0, 0, 2001, Invalid date",
            // D5, M4, Y2: FALSE
            "0, 0, 2024, Invalid date",
            // D5, M4, Y3: FALSE
            "0, 0, 2300, Invalid date",
    })
    public void testNextDate(int day, int month, int year, String expectedNextDate) {
        assertEquals(expectedNextDate, NextDate.getNextDate(year, month, day));
    }
}
