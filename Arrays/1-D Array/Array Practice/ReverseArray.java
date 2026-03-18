public class ReverseArray {
    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        System.out.println("Reversed Array:");

        int j=0;
        for(int i=arr.length-1;i>=0;i--){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
        }
    }
}