import java.util.Scanner;
public class charExam1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] arr = {'A', 'v', 'i', 'h', 'a', 'y'};
        char toFind = 'C';
        System.out.println(indexOf(arr, toFind));
    }

    public static int indexOf(char[] arr, char toFind) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                index = i;
                break;
            }
        }
        return index;
    }
}
