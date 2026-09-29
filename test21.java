import java.util.Scanner;

public class test21{
    public static String removeFirstAndLast(String str) {
        if (str == null || str.length() <= 2) {
            return "";
        }
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Result: " + removeFirstAndLast(str));
        sc.close();
    }
}