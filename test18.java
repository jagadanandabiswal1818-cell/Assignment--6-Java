import java.util.Scanner;

public class test18 {
    public static String concatAndLower(String str1, String str2) {
        return (str1 + str2).toLowerCase();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

        String result = concatAndLower(s1, s2);
        System.out.println("Result: " + result);
        sc.close();
    }
}