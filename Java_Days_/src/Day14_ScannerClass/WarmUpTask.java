package Day14_ScannerClass;

public class WarmUpTask {

	public static void main(String[] args) {

		String dayOfTheWeek;
		dayOfTheWeek = "Wednesday";

		switch (dayOfTheWeek) {
		case "Monday":
		case "Tuesday":
			System.out.println("It is Java Class Day");
			break;
		case "Wednesday":
			System.out.println("It is SQL class day");
			break;
		case "Thursday":
		case "Friday":
			System.out.println("It is Java Class Day");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("There is no class");
		}

	}

}
