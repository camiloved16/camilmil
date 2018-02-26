
public class PrintDayInWord {

	public static void main(String[] args) {
		int number = 3;

		if (number == 1) {
			System.out.println("MONDAY");
		} else if (number == 2) {
			System.out.println("THURSDAY");
		} else if (number == 3) {
			System.out.println("WENDNSDAY");
		} else if (number == 4) {
			System.out.println("SATURDAY");
		} else if (number == 5) {
			System.out.println("SUNDAY");

		} else {
			System.out.println("Not a valid day");

		}

		switch (number) {
		case 1:
			System.out.println("MONDAY");
			break;
		case 2:
			System.out.println("THURSDAY");
			break;
		case 3:
			System.out.println("WENDNSDAY");
			break;
		case 4:
			System.out.println("SATURDAY");
			break;
		case 5:
			System.out.println("SUNDAY");
			break;
		default:
			System.out.println("Not a valid day");
		}
	}
}
