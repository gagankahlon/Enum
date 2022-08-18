import java.util.EnumSet;


public class EnumConcept {

	enum DaysOfWeek {

		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;

	}

	public static void main(String[] args) {

		// display all values

		EnumSet<DaysOfWeek> days = EnumSet.allOf(DaysOfWeek.class);
		System.out.println(days);

		// empty enum set

		EnumSet<DaysOfWeek> emptySet = EnumSet.noneOf(DaysOfWeek.class);

		System.out.println(emptySet);

		// range

		EnumSet<DaysOfWeek> range = EnumSet.range(DaysOfWeek.WEDNESDAY, DaysOfWeek.SATURDAY);
		System.out.println(range);

		// of method
		EnumSet<DaysOfWeek> ofMethod = EnumSet.of(DaysOfWeek.THURSDAY);
		System.out.println(ofMethod);

		EnumSet<DaysOfWeek> multipleEnum = EnumSet.of(DaysOfWeek.MONDAY, DaysOfWeek.FRIDAY);
		System.out.println(multipleEnum);

		// remove method

		EnumSet<DaysOfWeek> addAll1 = EnumSet.allOf(DaysOfWeek.class);
		System.out.println(addAll1);

		boolean b = addAll1.remove(DaysOfWeek.WEDNESDAY);
		System.out.println(b);

	}

}
