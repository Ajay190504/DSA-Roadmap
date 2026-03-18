public class Reversed2DArray {
    public static void main(String[] args) {

        int[][] arr = {
                {1,2,3},
                {4,5,6}
        };

        int rows = arr.length;
        int cols = arr[0].length;

        for(int i=rows-1;i>=0;i--){
            for(int j=cols-1;j>=0;j--){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}