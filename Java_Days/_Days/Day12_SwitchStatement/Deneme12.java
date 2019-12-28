package Day12_SwitchStatement;

public class Deneme12 {

	public static void main(String[] args) {

		boolean A = true, B = !A;

		if (A) {

			if (B) {

				System.out.println("Monday");

			} else {

				System.out.println("Tuesday");

			}

		}

		else {

			if (A) {

				System.out.println("Thursday");

			} else {

				System.out.println("Friday");

			}

		}

	}

}
