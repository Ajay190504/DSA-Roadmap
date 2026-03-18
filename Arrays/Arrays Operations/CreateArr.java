// Creating array and printing the elements of the array
public class CreateArr {
    public static void main(String[] args) {
        
        //Creating an array of size 5
        int[] arr = new int[5];

        //Storing values in the array
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //Printing the elements of the array
        System.out.println("The elements of the array are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}