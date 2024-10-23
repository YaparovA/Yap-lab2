import java.util.Scanner;

public class InputCheck {
    public static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    public static int CycleInputInt(String text)
    {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        while (!InputCheck.isNumber(inputLine)) {
            System.out.println("\nВы можете вводить только целые числа");
            System.out.print(text);
            inputLine = in.nextLine();
        }
        return Integer.parseInt(inputLine);
    }

    public static double CycleInputDouble(String text)
    {
        Scanner in = new Scanner(System.in);
        String inputLine = in.nextLine();

        while (!InputCheck.isDouble(inputLine)) {
            System.out.println("\nВы можете вводить только числа");
            System.out.print(text);
            inputLine = in.nextLine();
        }
        return Double.parseDouble(inputLine);
    }
}
