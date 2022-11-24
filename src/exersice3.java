import java.util.Scanner;
public class exersice3 {
    public static void main(String[] args) {
        System.out.println(ifEquals());
    }
    public static boolean ifEquals() {
        Scanner scanner = new Scanner(System.in);
        String str1;
        String str2;
        char check1;
        char check2;
        boolean answer = false;
        System.out.println("Enter Your First String");
        str1 = scanner.nextLine();
        System.out.println("Enter Your Second String");
        str2 = scanner.nextLine();
        if (str1.length() == str2.length()) {
            for (int i = 0; i < str1.length(); i++) {
                for (int j = 0; j < str2.length(); j++) {
                    check1 = str1.charAt(i);
                    check2 = str2.charAt(j);
                    if (check1 == check2) {
                        answer = true;
                    }
                }
            }
        }
        return answer;
    }
}
