public class MinInArray {
    public static void main(String[] args) {

        int[] arr = {5,20,10,40,15};

        int min = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println("Minimum = " + min);
    }
}