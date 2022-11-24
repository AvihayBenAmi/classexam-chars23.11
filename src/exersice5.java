import java.util.Scanner;
public class exersice5 {
    public static void main(String []args){
        System.out.println(StrongPassword());
    }
    public static boolean StrongPassword(){
        String insertedPassword;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Your Password");
        insertedPassword = scanner.nextLine();
        char[] numbers = {'1','2','3','4','5','6','7','8','9','0'};
        char[] symbols = {'%','$','_'};
        char temp1;
        char temp2;
        int checkNumbers=0;
        int checkSymbols=0;
        int passwordLength=insertedPassword.length();
        boolean answer=false;
        if((passwordLength>=8)&&(passwordLength<=10)){
            for(int i=0; i<=insertedPassword.length()-1;i++){
                temp1=insertedPassword.charAt(i);
                for(int j=0; j<=numbers.length-1;j++){
                if(numbers[j]==temp1){
                    checkNumbers++;}}
                    for(int k=0; k<=symbols.length-1;k++){
                    if(symbols[k]==temp1){
                        checkSymbols++;}}
            }
                }
        if((checkNumbers>=1)&&(checkSymbols>=1)){
            answer=true;}
        return answer;

    }
        }


