public class SecondSmallest {
    public static void main(String[] args) {

        int[] arr = {10,40,20,50,30};

        int smallest = arr[0];
        int second = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] < smallest){
                second = smallest;
                smallest = arr[i];
            }
            else if(arr[i] < second && arr[i] != smallest){
                second = arr[i];
            }
        }

        System.out.println("Second Smallest = " + second);
    }
}