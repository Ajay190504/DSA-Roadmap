public class Palindrome2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2},
                {2,1}
        };

        int[] temp = new int[4];
        int k=0;

        for(int i=0;i<arr.length;i++)
            for(int j=0;j<arr[i].length;j++)
                temp[k++] = arr[i][j];

        boolean palindrome = true;

        int start=0;
        int end=temp.length-1;

        while(start<end){

            if(temp[start]!=temp[end]){
                palindrome=false;
                break;
            }

            start++;
            end--;
        }

        System.out.println("Palindrome = "+palindrome);
    }
}