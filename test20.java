import java.util.Scanner;

public class test20 {
    public static String getFirstHalf(String str) {
        if (str == null || str.length() % 2 != 0) {
            return null;
        }
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = getFirstHalf(str);
        System.out.println("Result: " + result);
        sc.close();
    }
}