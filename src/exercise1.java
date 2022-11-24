import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args){
        System.out.println(showFullName());
    }
    public static String showFullName(){
        Scanner scanner=new Scanner(System.in);
        String firstName;
        String lastName;
        String fullName;
        System.out.println("Enter Your First Name");
        firstName=scanner.nextLine();
        System.out.println("Enter Your Last Name");
        lastName=scanner.nextLine();
        fullName = firstName+" "+lastName;
        return fullName;
    }
}
