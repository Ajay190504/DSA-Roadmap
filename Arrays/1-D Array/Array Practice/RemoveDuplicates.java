public class RemoveDuplicates {

    public static void main(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40, 30};
        int[] temp = new int[arr.length];

        int size = 0;   // number of unique elements stored in temp array

        for(int i = 0; i < arr.length; i++) {

            boolean isDuplicate = false;

            // check if element already stored in temp array or not
            for(int j = 0; j < size; j++) {
                if(arr[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }

            // store only unique elements in temp array
            if(!isDuplicate) {
                temp[size] = arr[i];
                size++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for(int i = 0; i < size; i++) {
            System.out.print(temp[i] + " ");
        }
    }
}