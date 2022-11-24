import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String str1;
        String str2;
        System.out.println("Enter Your First String");
        str1=scanner.nextLine();
        System.out.println("Enter Your Second String");
        str2=scanner.nextLine();
        theLongestString(str1,str2);
    }
    public static void theLongestString(String str1, String str2){
        if(str1.length() > str2.length()){
            System.out.println(str1);}
        else if (str2.length() > str1.length()) {
            System.out.println(str2);}
        else{
            System.out.println("the Strings is qeuals");}
        }
    }
