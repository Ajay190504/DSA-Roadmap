public class PalindromeArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,2,1};

        boolean palindrome = true;

        for(int i=0;i<arr.length/2;i++){
            if(arr[i] != arr[arr.length-1-i]){
                palindrome = false;
                break;
            }
        }

        if(palindrome)
            System.out.println("Array is Palindrome");
        else
            System.out.println("Array is not Palindrome");
    }
}