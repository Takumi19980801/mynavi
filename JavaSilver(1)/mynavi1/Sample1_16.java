package mynavi1;

import static java.time.DayOfWeek.*;

import java.time.LocalDate;

public class Sample1_16 {

	public static void main(String[] args) {
		//「2024-07-22→2024-07-26→TUESDAY」と変更される
		var today = LocalDate.now().with(TUESDAY).getDayOfWeek();
		switch(today) {
		case SUNDAY:
		case SATURDAY:
			System.out.println("weekend");
			break;
		case MONDAY:
		case FRIDAY: System.out.println("working");
		default:
			System.out.println("other");
		}
	}

}
