import java.util.Scanner;

public class test22 {
    public static String repeatLastNChars(String str, int n) {
        if (str == null || n <= 0) {
            return "";
        }

                String endPart = str.substring(str.length() - n);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(endPart);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter integer n: ");
        int n = sc.nextInt();

        System.out.println("Result: " + repeatLastNChars(str, n));
        sc.close();
    }
}