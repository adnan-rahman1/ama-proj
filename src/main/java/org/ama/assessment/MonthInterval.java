package org.ama.assessment;

import java.time.LocalDate;
import java.time.YearMonth;
import java.util.*;

public class MonthInterval {
	public static String[] generateMonthsInInterval(LocalDate startDate, LocalDate endDate) {
		HashMap<Integer, String> monthsHashMap = new HashMap<>();

        // ### TODO: add month names generation logic here ###
		YearMonth endMonth = YearMonth.from(endDate);
		for (YearMonth month = YearMonth.from(startDate); !month.isAfter(endMonth); month = month.plusMonths(1)) {
			if (!monthsHashMap.containsKey(month.getMonthValue())) {
				monthsHashMap.put(month.getMonthValue(), month.getMonth().toString().toLowerCase());
			}
		}
        // ##########################################

		return monthsHashMap.values().toArray(new String[0]);
	 }
}
