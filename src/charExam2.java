public class charExam2 {
    public static void main(String []args){
        char[] arr = {'A','v', 'i', 'h', 'a', 'C'};
        System.out.println(hasDuplicate(arr));
    }

    public static boolean hasDuplicate (char[] arr){
        boolean answer = false;
        for(int i=0; i< arr.length; i++){
            for(int j = i+1; j< arr.length; j++){
            if(arr[i]==arr[j]){
                answer = true;
                break;}}}
        return answer;
    }
}



