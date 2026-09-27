import java.util.Scanner;

public class test19{
    public static String repeatFirstTwo(String str) {
        int n = str.length();
        if (n == 0) return "";

        String front = (n >= 2) ? str.substring(0, 2) : str;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(front);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Result: " + repeatFirstTwo(str));
        sc.close();
    }
}