public class MaxInArray {
    public static void main(String[] args) {

        int[] arr = {5,20,10,40,15};

        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
    }
}