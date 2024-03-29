package org.ama.assessment;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.time.LocalDate;

import org.junit.Test;


public class MonthIntervalTest {
	@Test
	public void testJanuary2017ToMarch2017ReturnsJanuaryThroughMarch() {
		LocalDate january2017= LocalDate.parse("2017-01-01");
		LocalDate march2017 = LocalDate.parse("2017-03-01");

        String[] expectedMonthNames = new String[] {"january", "february", "march"};

		String[] monthNames = MonthInterval.generateMonthsInInterval(january2017, march2017);
        for (String monthName : monthNames) {
            System.out.println(monthName);
        }
        System.out.println();

		assertEquals(expectedMonthNames, monthNames);
	}

	@Test
	public void testDecember2017ToJanuary2018ReturnsDecemberThroughJanuary() {
		LocalDate december2017= LocalDate.parse("2017-12-01");
		LocalDate january2018 = LocalDate.parse("2018-01-01");
        String[] expectedMonthNames = new String[] {"january", "december"};

		String[] monthNames = MonthInterval.generateMonthsInInterval(december2017, january2018);
        for (String monthName : monthNames) {
            System.out.println(monthName);
        }
        System.out.println();

		assertEquals(expectedMonthNames, monthNames);
	}

	@Test
	public void testJanuary2017ToJanuary2018ReturnsJanuaryThroughDecember() {
		LocalDate january2017= LocalDate.parse("2017-01-01");
		LocalDate january2018 = LocalDate.parse("2018-03-01");
        String[] expectedMonthNames = new String[] {
            "january", "february", "march", "april", "may", "june",
            "july", "august", "september", "october", "november", "december"
        };

		String[] monthNames = MonthInterval.generateMonthsInInterval(january2017, january2018);
        for (String monthName : monthNames) {
            System.out.println(monthName);
        }
        System.out.println();

		assertEquals(expectedMonthNames, monthNames);
	}
}
