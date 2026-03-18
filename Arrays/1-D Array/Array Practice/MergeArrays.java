public class MergeArrays {
    public static void main(String[] args) {

        int[] arr1 = {10,20,30};
        int[] arr2 = {40,50,60};

        int[] mergedArr = new int[arr1.length + arr2.length];

        for(int i=0;i<arr1.length;i++){
            mergedArr[i] = arr1[i];
        }

        for(int i=0;i<arr2.length;i++){
            mergedArr[arr1.length + i] = arr2[i];
        }

        System.out.println("Merged Array:");

        for(int i=0;i<mergedArr.length;i++){
            System.out.println(mergedArr[i]);
        }
    }
}s