import java.util.Scanner;

public class ConsoleAC {
	 
	private static Scanner sc = new Scanner(System.in);
	
	public static void printToConsole(String str) {
		System.out.println(str);
	}
	
	public static String getString(String prompt) {
		System.out.print(prompt);
		String s = sc.next();
		sc.nextLine();
		return s;
	}
	
	public static String validateEntry(Scanner sc, String prompt, String a, String b) {
		String entry = "";
		boolean isValid = false;

		while (!isValid) {
			entry = "";
			System.out.print(prompt);
			entry = sc.nextLine();
			if (entry.equals("")) {
				System.out.println("Error! This entry is required. Try again.");
			} else if (!entry.equalsIgnoreCase(a) && !entry.equalsIgnoreCase(b)) {
				System.out.println("Error! Entry must be \"" + a + "\" or \"" + b + "\". Try again.");
			} else {
				isValid = true;
			}
		}
		return entry;
	}

    public static double getDouble(String prompt) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            System.out.print(prompt);
            if (sc.hasNextDouble()) {
                d = sc.nextDouble();
                isValid = true;
            } else {
                System.out.println("Error! Invalid number. Try again.");
            }
            sc.nextLine();  // discard any other data entered on the line
        }
        return d;
    }

    public static double getDouble(String prompt, double min, double max) {
        double d = 0;
        boolean isValid = false;
        while (!isValid) {
            d = getDouble(prompt);
            if (d <= min) {
                System.out.println(
                        "Error! Number must be greater than " + min + ".");
            } else if (d >= max) {
                System.out.println(
                        "Error! Number must be less than " + max + ".");
            } else {
                isValid = true;
            }
        }
        return d;
    }
	

}	
	
