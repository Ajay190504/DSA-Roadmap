public class Copy2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        int[][] copy = new int[arr.length][arr[0].length];

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                copy[i][j] = arr[i][j];
            }
        }

        System.out.println("Copied successfully");
    }
}